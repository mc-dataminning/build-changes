import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class abq {
   private static final int a = 2097152;
   private final sw b;
   private final byte[] c;
   private final List<abq.a> d;

   public abq(dnm $$0) {
      this.b = new sw();

      for (Entry<dqo.a, dqo> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new td($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new uq(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<hz, dit> $$2 : $$0.G().entrySet()) {
         this.d.add(abq.a.a($$2.getValue()));
      }
   }

   public abq(vb $$0, int $$1, int $$2) {
      this.b = $$0.q();
      if (this.b == null) {
         throw new RuntimeException("Can't read heightmap in packet for [" + $$1 + ", " + $$2 + "]");
      } else {
         int $$3 = $$0.n();
         if ($$3 > 2097152) {
            throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
         } else {
            this.c = new byte[$$3];
            $$0.b(this.c);
            this.d = abq.a.b.decode($$0);
         }
      }
   }

   public void a(vb $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      abq.a.b.encode($$0, this.d);
   }

   private static int a(dnm $$0) {
      int $$1 = 0;

      for (dnn $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(uq $$0, dnm $$1) {
      for (dnn $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<abq.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(abq.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      hz.a $$5 = new hz.a();

      for (abq.a $$6 : this.d) {
         int $$7 = $$3 + jb.b($$6.c >> 4);
         int $$8 = $$4 + jb.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public uq a() {
      return new uq(Unpooled.wrappedBuffer(this.c));
   }

   public sw b() {
      return this.b;
   }

   static class a {
      public static final xo<vb, abq.a> a = xo.a(abq.a::a, abq.a::new);
      public static final xo<vb, List<abq.a>> b = a.a(xm.a());
      final int c;
      final int d;
      final div<?> e;
      @Nullable
      final sw f;

      private a(int $$0, int $$1, div<?> $$2, @Nullable sw $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(vb $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = xm.a(kg.h).decode($$0);
         this.f = $$0.q();
      }

      private void a(vb $$0) {
         $$0.k(this.c);
         $$0.l(this.d);
         xm.a(kg.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static abq.a a(dit $$0) {
         sw $$1 = $$0.aA_();
         hz $$2 = $$0.aE_();
         int $$3 = jb.b($$2.u()) << 4 | jb.b($$2.w());
         return new abq.a($$3, $$2.v(), $$0.v(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(hz var1, div<?> var2, @Nullable sw var3);
   }
}
