import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acx(List<acx.a> b) implements zv<ach> {
   public static final zm<wl, acx> a = zv.a(acx::a, acx::new);
   private static final int c = 2097152;

   private acx(wl $$0) {
      this($$0.a(acx.a::new));
   }

   public static acx a(List<duh> $$0) {
      return new acx($$0.stream().map(acx.a::new).toList());
   }

   private void a(wl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zx<acx> a() {
      return agt.p;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public static record a(dbe a, byte[] b) {
      public a(duh $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wl(this.d()), $$0);
      }

      public a(wl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(duh $$0) {
         int $$1 = 0;

         for (dui $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wl a() {
         return new wl(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wl $$0, duh $$1) {
         for (dui $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dbe b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
