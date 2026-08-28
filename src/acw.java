import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acw(List<acw.a> b) implements zr<acg> {
   public static final zi<wh, acw> a = zr.a(acw::a, acw::new);
   private static final int c = 2097152;

   private acw(wh $$0) {
      this($$0.a(acw.a::new));
   }

   public static acw a(List<dzt> $$0) {
      return new acw($$0.stream().map(acw.a::new).toList());
   }

   private void a(wh $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zt<acw> a() {
      return agz.p;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public static record a(dgf a, byte[] b) {
      public a(dzt $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wh(this.d()), $$0);
      }

      public a(wh $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dzt $$0) {
         int $$1 = 0;

         for (dzu $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wh a() {
         return new wh(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wh $$0, dzt $$1) {
         for (dzu $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wh $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dgf b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
