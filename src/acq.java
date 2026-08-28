import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acq(List<acq.a> b) implements zl<aca> {
   public static final zc<wb, acq> a = zl.a(acq::a, acq::new);
   private static final int c = 2097152;

   private acq(wb $$0) {
      this($$0.a(acq.a::new));
   }

   public static acq a(List<dwy> $$0) {
      return new acq($$0.stream().map(acq.a::new).toList());
   }

   private void a(wb $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zn<acq> a() {
      return agp.p;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public static record a(ddp a, byte[] b) {
      public a(dwy $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wb(this.d()), $$0);
      }

      public a(wb $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dwy $$0) {
         int $$1 = 0;

         for (dwz $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wb a() {
         return new wb(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wb $$0, dwy $$1) {
         for (dwz $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wb $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public ddp b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
