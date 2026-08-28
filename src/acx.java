import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acx(List<acx.a> b) implements zs<ach> {
   public static final zj<wi, acx> a = zs.a(acx::a, acx::new);
   private static final int c = 2097152;

   private acx(wi $$0) {
      this($$0.a(acx.a::new));
   }

   public static acx a(List<dxt> $$0) {
      return new acx($$0.stream().map(acx.a::new).toList());
   }

   private void a(wi $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zu<acx> a() {
      return agw.p;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public static record a(del a, byte[] b) {
      public a(dxt $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wi(this.d()), $$0);
      }

      public a(wi $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dxt $$0) {
         int $$1 = 0;

         for (dxu $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wi a() {
         return new wi(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wi $$0, dxt $$1) {
         for (dxu $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wi $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public del b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
