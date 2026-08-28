import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acl(List<acl.a> b) implements zh<abw> {
   public static final yy<vw, acl> a = zh.a(acl::a, acl::new);
   private static final int c = 2097152;

   private acl(vw $$0) {
      this($$0.a(acl.a::new));
   }

   public static acl a(List<edl> $$0) {
      return new acl($$0.stream().map(acl.a::new).toList());
   }

   private void a(vw $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zj<acl> a() {
      return agp.o;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public static record a(djc a, byte[] b) {
      public a(edl $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vw(this.d()), $$0);
      }

      public a(vw $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(edl $$0) {
         int $$1 = 0;

         for (edm $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vw a() {
         return new vw(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vw $$0, edl $$1) {
         for (edm $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public djc b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
