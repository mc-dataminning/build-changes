import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record aay(List<aay.a> b) implements xz<aai> {
   public static final xq<us, aay> a = xz.a(aay::a, aay::new);
   private static final int c = 2097152;

   private aay(us $$0) {
      this($$0.a(aay.a::new));
   }

   public static aay a(List<dol> $$0) {
      return new aay($$0.stream().map(aay.a::new).toList());
   }

   private void a(us $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yb<aay> a() {
      return aet.p;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public static record a(cvl a, byte[] b) {
      public a(dol $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new us(this.d()), $$0);
      }

      public a(us $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dol $$0) {
         int $$1 = 0;

         for (dom $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public us a() {
         return new us(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(us $$0, dol $$1) {
         for (dom $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(us $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cvl b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
