import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record act(List<act.a> b) implements zo<acd> {
   public static final zf<we, act> a = zo.a(act::a, act::new);
   private static final int c = 2097152;

   private act(we $$0) {
      this($$0.a(act.a::new));
   }

   public static act a(List<dxj> $$0) {
      return new act($$0.stream().map(act.a::new).toList());
   }

   private void a(we $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zq<act> a() {
      return ags.p;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public static record a(deb a, byte[] b) {
      public a(dxj $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new we(this.d()), $$0);
      }

      public a(we $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dxj $$0) {
         int $$1 = 0;

         for (dxk $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public we a() {
         return new we(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(we $$0, dxj $$1) {
         for (dxk $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(we $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public deb b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
