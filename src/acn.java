import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acn(List<acn.a> b) implements zl<abw> {
   public static final zc<we, acn> a = zl.a(acn::a, acn::new);
   private static final int c = 2097152;

   private acn(we $$0) {
      this($$0.a(acn.a::new));
   }

   public static acn a(List<dvi> $$0) {
      return new acn($$0.stream().map(acn.a::new).toList());
   }

   private void a(we $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<acn> a() {
      return agj.q;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public static record a(dbh a, byte[] b) {
      public a(dvi $$0) {
         this($$0.g(), new byte[a($$0)]);
         a(new we(this.d()), $$0);
      }

      public a(we $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dvi $$0) {
         int $$1 = 0;

         for (dvj $$2 : $$0.e()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public we a() {
         return new we(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(we $$0, dvi $$1) {
         for (dvj $$2 : $$1.e()) {
            $$2.i().b($$0);
         }
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dbh b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
