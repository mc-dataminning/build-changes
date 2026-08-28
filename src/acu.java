import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acu(List<acu.a> b) implements zp<ace> {
   public static final zg<wf, acu> a = zp.a(acu::a, acu::new);
   private static final int c = 2097152;

   private acu(wf $$0) {
      this($$0.a(acu.a::new));
   }

   public static acu a(List<dxp> $$0) {
      return new acu($$0.stream().map(acu.a::new).toList());
   }

   private void a(wf $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zr<acu> a() {
      return agt.p;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public static record a(deh a, byte[] b) {
      public a(dxp $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wf(this.d()), $$0);
      }

      public a(wf $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dxp $$0) {
         int $$1 = 0;

         for (dxq $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wf a() {
         return new wf(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wf $$0, dxp $$1) {
         for (dxq $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wf $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public deh b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
