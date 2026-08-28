import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record aca(List<aca.a> b) implements yv<abk> {
   public static final ym<vl, aca> a = yv.a(aca::a, aca::new);
   private static final int c = 2097152;

   private aca(vl $$0) {
      this($$0.a(aca.a::new));
   }

   public static aca a(List<dzc> $$0) {
      return new aca($$0.stream().map(aca.a::new).toList());
   }

   private void a(vl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yx<aca> a() {
      return agd.p;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public static record a(dfo a, byte[] b) {
      public a(dzc $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vl(this.d()), $$0);
      }

      public a(vl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dzc $$0) {
         int $$1 = 0;

         for (dzd $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vl a() {
         return new vl(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vl $$0, dzc $$1) {
         for (dzd $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dfo b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
