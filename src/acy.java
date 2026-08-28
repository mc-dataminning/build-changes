import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.List;

public record acy(List<acy.a> b) implements zw<aci> {
   public static final zn<wm, acy> a = zw.a(acy::a, acy::new);
   private static final int c = 2097152;

   private acy(wm $$0) {
      this($$0.a(acy.a::new));
   }

   public static acy a(List<duk> $$0) {
      return new acy($$0.stream().map(acy.a::new).toList());
   }

   private void a(wm $$0) {
      $$0.a(this.b, ($$0x, $$1) -> $$1.a($$0x));
   }

   @Override
   public zy<acy> a() {
      return agu.p;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public static record a(dbh a, byte[] b) {
      public a(duk $$0) {
         this($$0.f(), new byte[a($$0)]);
         a(new wm(this.d()), $$0);
      }

      public a(wm $$0) {
         this($$0.f(), $$0.a(2097152));
      }

      private static int a(duk $$0) {
         int $$1 = 0;

         for (dul $$2 : $$0.d()) {
            $$1 += $$2.i().c();
         }

         return $$1;
      }

      public wm a() {
         return new wm(Unpooled.wrappedBuffer(this.b));
      }

      private ByteBuf d() {
         ByteBuf $$0 = Unpooled.wrappedBuffer(this.b);
         $$0.writerIndex(0);
         return $$0;
      }

      public static void a(wm $$0, duk $$1) {
         for (dul $$2 : $$1.d()) {
            $$2.i().b($$0);
         }
      }

      public void a(wm $$0) {
         $$0.a(this.a);
         $$0.a(this.b);
      }

      public dbh b() {
         return this.a;
      }

      public byte[] c() {
         return this.b;
      }
   }
}
