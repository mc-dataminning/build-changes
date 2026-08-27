import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acg(List<acg.a> b) implements ze<abq> {
   public static final yv<vx, acg> a = ze.a(acg::a, acg::new);
   private static final int c = 2097152;

   private acg(vx $$0) {
      this($$0.a(acg.a::new));
   }

   public static acg a(List<dtj> $$0) {
      return new acg($$0.stream().map(acg.a::new).toList());
   }

   private void a(vx $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zg<acg> a() {
      return agc.p;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public static record a(dag a, byte[] b) {
      public a(dtj $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vx(this.d()), $$0);
      }

      public a(vx $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dtj $$0) {
         int $$1 = 0;

         for (dtk $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vx a() {
         return new vx(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vx $$0, dtj $$1) {
         for (dtk $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vx $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dag b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
