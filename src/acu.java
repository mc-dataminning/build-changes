import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acu(List<acu.a> b) implements zo<acf> {
   public static final ze<vy, acu> a = zo.a(acu::a, acu::new);
   private static final int c = 2097152;

   private acu(vy $$0) {
      this($$0.a(acu.a::new));
   }

   public static acu a(List<edx> $$0) {
      return new acu($$0.stream().map(acu.a::new).toList());
   }

   private void a(vy $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zq<acu> a() {
      return agy.o;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public static record a(djo a, byte[] b) {
      public a(edx $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vy(this.d()), $$0);
      }

      public a(vy $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(edx $$0) {
         int $$1 = 0;

         for (edy $$2 : $$0.d()) {
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

      public static void a(vy $$0, edx $$1) {
         for (edy $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vy $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public djo b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
