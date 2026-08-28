import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record adh(List<adh.a> b) implements aac<acr> {
   public static final zt<ws, adh> a = aac.a(adh::a, adh::new);
   private static final int c = 2097152;

   private adh(ws $$0) {
      this($$0.a(adh.a::new));
   }

   public static adh a(List<dzz> $$0) {
      return new adh($$0.stream().map(adh.a::new).toList());
   }

   private void a(ws $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public aae<adh> a() {
      return ahk.p;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public static record a(dgn a, byte[] b) {
      public a(dzz $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new ws(this.d()), $$0);
      }

      public a(ws $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dzz $$0) {
         int $$1 = 0;

         for (eaa $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public ws a() {
         return new ws(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(ws $$0, dzz $$1) {
         for (eaa $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(ws $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dgn b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
