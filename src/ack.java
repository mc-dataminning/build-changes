import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record ack(List<ack.a> b) implements zg<abu> {
   public static final yx<vw, ack> a = zg.a(ack::a, ack::new);
   private static final int c = 2097152;

   private ack(vw $$0) {
      this($$0.a(ack.a::new));
   }

   public static ack a(List<dvi> $$0) {
      return new ack($$0.stream().map(ack.a::new).toList());
   }

   private void a(vw $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zi<ack> a() {
      return agg.p;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public static record a(dcd a, byte[] b) {
      public a(dvi $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vw(this.d()), $$0);
      }

      public a(vw $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dvi $$0) {
         int $$1 = 0;

         for (dvj $$2 : $$0.d()) {
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

      public static void a(vw $$0, dvi $$1) {
         for (dvj $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dcd b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
