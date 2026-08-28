import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acu(List<acu.a> b) implements zs<ace> {
   public static final zj<wl, acu> a = zs.a(acu::a, acu::new);
   private static final int c = 2097152;

   private acu(wl $$0) {
      this($$0.a(acu.a::new));
   }

   public static acu a(List<dud> $$0) {
      return new acu($$0.stream().map(acu.a::new).toList());
   }

   private void a(wl $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zu<acu> a() {
      return agq.p;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public static record a(dba a, byte[] b) {
      public a(dud $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wl(this.d()), $$0);
      }

      public a(wl $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dud $$0) {
         int $$1 = 0;

         for (due $$2 : $$0.d()) {
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

      public static void a(wl $$0, dud $$1) {
         for (due $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wl $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dba b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
