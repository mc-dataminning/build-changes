import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acv(List<acv.a> b) implements zq<acf> {
   public static final zh<wg, acv> a = zq.a(acv::a, acv::new);
   private static final int c = 2097152;

   private acv(wg $$0) {
      this($$0.a(acv.a::new));
   }

   public static acv a(List<dya> $$0) {
      return new acv($$0.stream().map(acv.a::new).toList());
   }

   private void a(wg $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zs<acv> a() {
      return agu.p;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public static record a(des a, byte[] b) {
      public a(dya $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wg(this.d()), $$0);
      }

      public a(wg $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dya $$0) {
         int $$1 = 0;

         for (dyb $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wg a() {
         return new wg(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wg $$0, dya $$1) {
         for (dyb $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public des b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
