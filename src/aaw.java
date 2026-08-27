import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record aaw(List<aaw.a> b) implements xx<aag> {
   public static final xo<uq, aaw> a = xx.a(aaw::a, aaw::new);
   private static final int c = 2097152;

   private aaw(uq $$0) {
      this($$0.a(aaw.a::new));
   }

   public static aaw a(List<dnq> $$0) {
      return new aaw($$0.stream().map(aaw.a::new).toList());
   }

   private void a(uq $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public xz<aaw> a() {
      return aeq.p;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public static record a(cuy a, byte[] b) {
      public a(dnq $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new uq(this.d()), $$0);
      }

      public a(uq $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dnq $$0) {
         int $$1 = 0;

         for (dnr $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public uq a() {
         return new uq(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(uq $$0, dnq $$1) {
         for (dnr $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cuy b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
