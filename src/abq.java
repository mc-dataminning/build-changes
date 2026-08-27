import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record abq(List<abq.a> b) implements yp<aba> {
   public static final yg<vi, abq> a = yp.a(abq::a, abq::new);
   private static final int c = 2097152;

   private abq(vi $$0) {
      this($$0.a(abq.a::new));
   }

   public static abq a(List<dro> $$0) {
      return new abq($$0.stream().map(abq.a::new).toList());
   }

   private void a(vi $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yr<abq> a() {
      return afl.p;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public static record a(cyn a, byte[] b) {
      public a(dro $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vi(this.d()), $$0);
      }

      public a(vi $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dro $$0) {
         int $$1 = 0;

         for (drp $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vi a() {
         return new vi(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vi $$0, dro $$1) {
         for (drp $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vi $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cyn b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
