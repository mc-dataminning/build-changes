import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class acx {
   private static final int a = 2097152;
   private final ua b;
   private final byte[] c;
   private final List<acx.a> d;

   public acx(dsn $$0) {
      this.b = new ua();

      for (Entry<dvz.a, dvz> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uh($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new vu(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<in, dnm> $$2 : $$0.G().entrySet()) {
         this.d.add(acx.a.a($$2.getValue()));
      }
   }

   public acx(wf $$0, int $$1, int $$2) {
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
            this.d = acx.a.b.decode($$0);
         }
      }
   }

   public void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      acx.a.b.encode($$0, this.d);
   }

   private static int a(dsn $$0) {
      int $$1 = 0;

      for (dso $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(vu $$0, dsn $$1) {
      for (dso $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<acx.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(acx.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      in.a $$5 = new in.a();

      for (acx.a $$6 : this.d) {
         int $$7 = $$3 + jp.b($$6.c >> 4);
         int $$8 = $$4 + jp.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public vu a() {
      return new vu(Unpooled.wrappedBuffer(this.c));
   }

   public ua b() {
      return this.b;
   }

   static class a {
      public static final ys<wf, acx.a> a = ys.a(acx.a::a, acx.a::new);
      public static final ys<wf, List<acx.a>> b = a.a(yq.a());
      final int c;
      final int d;
      final dno<?> e;
      @Nullable
      final ua f;

      private a(int $$0, int $$1, dno<?> $$2, @Nullable ua $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(wf $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = yq.a(le.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(wf $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         yq.a(le.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static acx.a a(dnm $$0) {
         ua $$1 = $$0.a($$0.i().H_());
         in $$2 = $$0.az_();
         int $$3 = jp.b($$2.u()) << 4 | jp.b($$2.w());
         return new acx.a($$3, $$2.v(), $$0.r(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(in var1, dno<?> var2, @Nullable ua var3);
   }
}
