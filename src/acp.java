import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acp(List<acp.a> b) implements zk<abz> {
   public static final zb<wa, acp> a = zk.a(acp::a, acp::new);
   private static final int c = 2097152;

   private acp(wa $$0) {
      this($$0.a(acp.a::new));
   }

   public static acp a(List<dwg> $$0) {
      return new acp($$0.stream().map(acp.a::new).toList());
   }

   private void a(wa $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zm<acp> a() {
      return ago.p;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public static record a(dcy a, byte[] b) {
      public a(dwg $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wa(this.d()), $$0);
      }

      public a(wa $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dwg $$0) {
         int $$1 = 0;

         for (dwh $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wa a() {
         return new wa(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wa $$0, dwg $$1) {
         for (dwh $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wa $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dcy b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
