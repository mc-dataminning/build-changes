import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acc(List<acc.a> b) implements zb<abm> {
   public static final ys<vu, acc> a = zb.a(acc::a, acc::new);
   private static final int c = 2097152;

   private acc(vu $$0) {
      this($$0.a(acc.a::new));
   }

   public static acc a(List<dsn> $$0) {
      return new acc($$0.stream().map(acc.a::new).toList());
   }

   private void a(vu $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<acc> a() {
      return afx.p;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public static record a(czk a, byte[] b) {
      public a(dsn $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vu(this.d()), $$0);
      }

      public a(vu $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dsn $$0) {
         int $$1 = 0;

         for (dso $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vu a() {
         return new vu(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vu $$0, dsn $$1) {
         for (dso $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public czk b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
