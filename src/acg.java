import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acg(List<acg.a> b) implements zc<abr> {
   public static final yt<vr, acg> a = zc.a(acg::a, acg::new);
   private static final int c = 2097152;

   private acg(vr $$0) {
      this($$0.a(acg.a::new));
   }

   public static acg a(List<eat> $$0) {
      return new acg($$0.stream().map(acg.a::new).toList());
   }

   private void a(vr $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public ze<acg> a() {
      return agk.o;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public static record a(dgw a, byte[] b) {
      public a(eat $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vr(this.d()), $$0);
      }

      public a(vr $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(eat $$0) {
         int $$1 = 0;

         for (eau $$2 : $$0.d()) {
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

      public static void a(vr $$0, eat $$1) {
         for (eau $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dgw b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
