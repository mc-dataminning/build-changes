import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acy {
   private static final int a = 2097152;
   private final tx b;
   private final byte[] c;
   private final List<acy.a> d;

   public acy(dun $$0) {
      this.b = new tx();

      for (Entry<dxz.a, dxz> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new ue($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vr(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<ja, dpn> $$2 : $$0.G().entrySet()) {
         this.d.add(acy.a.a($$2.getValue()));
      }
   }

   public acy(wf $$0, int $$1, int $$2) {
      this.b = $$0.o();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.l();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = acy.a.b.decode($$0);
         }
      }
   }

   public void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acy.a.b.encode($$0, this.d);
   }

   private static int a(dun $$0) {
      int $$1 = 0;

      for (duo $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vr $$0, dun $$1) {
      for (duo $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acy.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acy.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      ja.a $$5 = new ja.a();

      for (acy.a $$6 : this.d) {
         int $$7 = $$3 + kc.b($$6.c >> 4);
         int $$8 = $$4 + kc.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vr a() {
      return new vr(Unpooled.wrappedBuffer(this.c));
   }

   public tx b() {
      return this.b;
   }

   static class a {
      public static final ys<wf, acy.a> a = ys.a(acy.a::a, acy.a::new);
      public static final ys<wf, List<acy.a>> b = a.a(yq.a());
      final int c;
      final int d;
      final dpp<?> e;
      @Nullable
      final tx f;

      private a(int $$0, int $$1, dpp<?> $$2, @Nullable tx $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wf $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yq.a(lr.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wf $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yq.a(lr.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acy.a a(dpn $$0) {
         tx $$1 = $$0.a($$0.i().H_());
         ja $$2 = $$0.az_();
         int $$3 = kc.b($$2.u()) << 4 | kc.b($$2.w());
         return new acy.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(ja var1, dpp<?> var2, @Nullable tx var3);
   }
}
