import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acn(List<acn.a> b) implements zj<aby> {
   public static final za<vy, acn> a = zj.a(acn::a, acn::new);
   private static final int c = 2097152;

   private acn(vy $$0) {
      this($$0.a(acn.a::new));
   }

   public static acn a(List<edn> $$0) {
      return new acn($$0.stream().map(acn.a::new).toList());
   }

   private void a(vy $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zl<acn> a() {
      return agr.o;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public static record a(dje a, byte[] b) {
      public a(edn $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vy(this.d()), $$0);
      }

      public a(vy $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(edn $$0) {
         int $$1 = 0;

         for (edo $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vy a() {
         return new vy(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vy $$0, edn $$1) {
         for (edo $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vy $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dje b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
