import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record aca(List<aca.a> b) implements yz<abk> {
   public static final yq<vs, aca> a = yz.a(aca::a, aca::new);
   private static final int c = 2097152;

   private aca(vs $$0) {
      this($$0.a(aca.a::new));
   }

   public static aca a(List<dse> $$0) {
      return new aca($$0.stream().map(aca.a::new).toList());
   }

   private void a(vs $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zb<aca> a() {
      return afv.p;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public static record a(czb a, byte[] b) {
      public a(dse $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vs(this.d()), $$0);
      }

      public a(vs $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dse $$0) {
         int $$1 = 0;

         for (dsf $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vs a() {
         return new vs(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vs $$0, dse $$1) {
         for (dsf $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public czb b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
