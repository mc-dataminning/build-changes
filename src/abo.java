import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record abo(List<abo.a> b) implements yn<aay> {
   public static final ye<vg, abo> a = yn.a(abo::a, abo::new);
   private static final int c = 2097152;

   private abo(vg $$0) {
      this($$0.a(abo.a::new));
   }

   public static abo a(List<drf> $$0) {
      return new abo($$0.stream().map(abo.a::new).toList());
   }

   private void a(vg $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yp<abo> a() {
      return afj.p;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public static record a(cye a, byte[] b) {
      public a(drf $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vg(this.d()), $$0);
      }

      public a(vg $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(drf $$0) {
         int $$1 = 0;

         for (drg $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vg a() {
         return new vg(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vg $$0, drf $$1) {
         for (drg $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vg $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cye b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
