import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record ach(List<ach.a> b) implements zd<abs> {
   public static final yu<vs, ach> a = zd.a(ach::a, ach::new);
   private static final int c = 2097152;

   private ach(vs $$0) {
      this($$0.a(ach.a::new));
   }

   public static ach a(List<ebv> $$0) {
      return new ach($$0.stream().map(ach.a::new).toList());
   }

   private void a(vs $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zf<ach> a() {
      return agl.o;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public static record a(dhw a, byte[] b) {
      public a(ebv $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new vs(this.d()), $$0);
      }

      public a(vs $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(ebv $$0) {
         int $$1 = 0;

         for (ebw $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public vs a() {
         return new vs(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(vs $$0, ebv $$1) {
         for (ebw $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dhw b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
