import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acj(List<acj.a> b) implements zf<abu> {
   public static final yw<vu, acj> a = zf.a(acj::a, acj::new);
   private static final int c = 2097152;

   private acj(vu $$0) {
      this($$0.a(acj.a::new));
   }

   public static acj a(List<eco> $$0) {
      return new acj($$0.stream().map(acj.a::new).toList());
   }

   private void a(vu $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<acj> a() {
      return agn.o;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public static record a(dih a, byte[] b) {
      public a(eco $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vu(this.d()), $$0);
      }

      public a(vu $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(eco $$0) {
         int $$1 = 0;

         for (ecp $$2 : $$0.d()) {
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

      public static void a(vu $$0, eco $$1) {
         for (ecp $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dih b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
