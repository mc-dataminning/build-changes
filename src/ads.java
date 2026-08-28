import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ads {
   private static final int a = 2097152;
   private final un b;
   private final byte[] c;
   private final List<ads.a> d;

   public ads(dxt $$0) {
      this.b = new un();

      for (Entry<ebj.a, ebj> $$1 : $$0.e()) {
         if ($$1.getKey().b()) {
            this.b.a($$1.getKey().a(), new uu($$1.getValue().a()));
         }
      }

      this.c = new byte[a($$0)];
      a(new wi(this.c()), $$0);
      this.d = Lists.newArrayList();

      for (Entry<jh, dsr> $$2 : $$0.F().entrySet()) {
         this.d.add(ads.a.a($$2.getValue()));
      }
   }

   public ads(ww $$0, int $$1, int $$2) {
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
            this.d = ads.a.b.decode($$0);
         }
      }
   }

   public void a(ww $$0) {
      $$0.a(this.b);
      $$0.c(this.c.length);
      $$0.c(this.c);
      ads.a.b.encode($$0, this.d);
   }

   private static int a(dxt $$0) {
      int $$1 = 0;

      for (dxu $$2 : $$0.d()) {
         $$1 += $$2.j();
      }

      return $$1;
   }

   private ByteBuf c() {
      ByteBuf $$0 = Unpooled.wrappedBuffer(this.c);
      $$0.writerIndex(0);
      return $$0;
   }

   public static void a(wi $$0, dxt $$1) {
      for (dxu $$2 : $$1.d()) {
         $$2.c($$0);
      }
   }

   public Consumer<ads.b> a(int $$0, int $$1) {
      return $$2 -> this.a($$2, $$0, $$1);
   }

   private void a(ads.b $$0, int $$1, int $$2) {
      int $$3 = 16 * $$1;
      int $$4 = 16 * $$2;
      jh.a $$5 = new jh.a();

      for (ads.a $$6 : this.d) {
         int $$7 = $$3 + kj.b($$6.c >> 4);
         int $$8 = $$4 + kj.b($$6.c);
         $$5.d($$7, $$6.d, $$8);
         $$0.accept($$5, $$6.e, $$6.f);
      }
   }

   public wi a() {
      return new wi(Unpooled.wrappedBuffer(this.c));
   }

   public un b() {
      return this.b;
   }

   static class a {
      public static final zj<ww, ads.a> a = zj.a(ads.a::a, ads.a::new);
      public static final zj<ww, List<ads.a>> b = a.a(zh.a());
      final int c;
      final int d;
      final dst<?> e;
      @Nullable
      final un f;

      private a(int $$0, int $$1, dst<?> $$2, @Nullable un $$3) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
      }

      private a(ww $$0) {
         this.c = $$0.readByte();
         this.d = $$0.readShort();
         this.e = zh.a(ma.h).decode($$0);
         this.f = $$0.o();
      }

      private void a(ww $$0) {
         $$0.l(this.c);
         $$0.m(this.d);
         zh.a(ma.h).encode($$0, this.e);
         $$0.a(this.f);
      }

      static ads.a a(dsr $$0) {
         un $$1 = $$0.a($$0.i().H_());
         jh $$2 = $$0.aB_();
         int $$3 = kj.b($$2.u()) << 4 | kj.b($$2.w());
         return new ads.a($$3, $$2.v(), $$0.q(), $$1.g() ? null : $$1);
      }
   }

   @FunctionalInterface
   public interface b {
      void accept(jh var1, dst<?> var2, @Nullable un var3);
   }
}
