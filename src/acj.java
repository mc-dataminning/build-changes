import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acj(List<acj.a> b) implements zf<abt> {
   public static final yw<vv, acj> a = zf.a(acj::a, acj::new);
   private static final int c = 2097152;

   private acj(vv $$0) {
      this($$0.a(acj.a::new));
   }

   public static acj a(List<dvg> $$0) {
      return new acj($$0.stream().map(acj.a::new).toList());
   }

   private void a(vv $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zh<acj> a() {
      return agf.p;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public static record a(dcb a, byte[] b) {
      public a(dvg $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vv(this.d()), $$0);
      }

      public a(vv $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dvg $$0) {
         int $$1 = 0;

         for (dvh $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vv a() {
         return new vv(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vv $$0, dvg $$1) {
         for (dvh $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vv $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dcb b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
