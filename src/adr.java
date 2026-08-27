import javax.annotation.Nullable;

public class adr implements yb<aam> {
   public static final xs<uu, adr> a = yb.a(adr::a, adr::new);
   private final int b;
   private final int c;

   public adr(bow $$0, @Nullable bow $$1) {
      this.b = $$0.aj();
      this.c = $$1 != null ? $$1.aj() : 0;
   }

   private adr(uu $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(uu $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public yd<adr> a() {
      return aex.aD;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
