import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acd(List<acd.a> b) implements zb<abn> {
   public static final ys<vr, acd> a = zb.a(acd::a, acd::new);
   private static final int c = 2097152;

   private acd(vr $$0) {
      this($$0.a(acd.a::new));
   }

   public static acd a(List<dun> $$0) {
      return new acd($$0.stream().map(acd.a::new).toList());
   }

   private void a(vr $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zd<acd> a() {
      return afz.p;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public static record a(dbk a, byte[] b) {
      public a(dun $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vr(this.d()), $$0);
      }

      public a(vr $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dun $$0) {
         int $$1 = 0;

         for (duo $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vr a() {
         return new vr(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vr $$0, dun $$1) {
         for (duo $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dbk b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
