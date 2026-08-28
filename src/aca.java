import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record aca(List<aca.a> b) implements yw<abl> {
   public static final yn<vl, aca> a = yw.a(aca::a, aca::new);
   private static final int c = 2097152;

   private aca(vl $$0) {
      this($$0.a(aca.a::new));
   }

   public static aca a(List<dzw> $$0) {
      return new aca($$0.stream().map(aca.a::new).toList());
   }

   private void a(vl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yy<aca> a() {
      return agd.o;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public static record a(dgg a, byte[] b) {
      public a(dzw $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vl(this.d()), $$0);
      }

      public a(vl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dzw $$0) {
         int $$1 = 0;

         for (dzx $$2 : $$0.d()) {
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

      public static void a(vl $$0, dzw $$1) {
         for (dzx $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dgg b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
