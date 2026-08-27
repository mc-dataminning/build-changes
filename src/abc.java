import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record abc(List<abc.a> b) implements yb<aam> {
   public static final xs<uu, abc> a = yb.a(abc::a, abc::new);
   private static final int c = 2097152;

   private abc(uu $$0) {
      this($$0.a(abc.a::new));
   }

   public static abc a(List<dpi> $$0) {
      return new abc($$0.stream().map(abc.a::new).toList());
   }

   private void a(uu $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public yd<abc> a() {
      return aex.p;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public static record a(cwi a, byte[] b) {
      public a(dpi $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new uu(this.d()), $$0);
      }

      public a(uu $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(dpi $$0) {
         int $$1 = 0;

         for (dpj $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public uu a() {
         return new uu(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(uu $$0, dpi $$1) {
         for (dpj $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(uu $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public cwi b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
