import javax.annotation.Nullable;

public class abq implements yb<aam> {
   public static final xs<uu, abq> a = yb.a(abq::a, abq::new);
   private final int b;
   private final byte c;

   public abq(box $$0, byte $$1) {
      this.b = $$0.aj();
      this.c = $$1;
   }

   private abq(uu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readByte();
   }

   private void a(uu $$0) {
      $$0.p(this.b);
      $$0.k(this.c);
   }

   @Override
   public yd<abq> a() {
      return aex.D;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   @Nullable
   public box a(cxb $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
