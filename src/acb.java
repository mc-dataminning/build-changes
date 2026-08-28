import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acb(List<acb.a> b) implements yw<abl> {
   public static final yn<vl, acb> a = yw.a(acb::a, acb::new);
   private static final int c = 2097152;

   private acb(vl $$0) {
      this($$0.a(acb.a::new));
   }

   public static acb a(List<dzd> $$0) {
      return new acb($$0.stream().map(acb.a::new).toList());
   }

   private void a(vl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yy<acb> a() {
      return age.p;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public static record a(dfp a, byte[] b) {
      public a(dzd $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vl(this.d()), $$0);
      }

      public a(vl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dzd $$0) {
         int $$1 = 0;

         for (dze $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vl a() {
         return new vl(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vl $$0, dzd $$1) {
         for (dze $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dfp b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
