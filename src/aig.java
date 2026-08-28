import javax.annotation.Nullable;

public class aig implements zj<agt> {
   public static final za<vy, aig> a = zj.a(aig::a, aig::new);
   private final aig.a b;
   @Nullable
   private final alk c;

   public aig(aig.a $$0, @Nullable alk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aig a(aj $$0) {
      return new aig(aig.a.a, $$0.a());
   }

   public static aig b() {
      return new aig(aig.a.b, null);
   }

   private aig(vy $$0) {
      this.b = $$0.b(aig.a.class);
      if (this.b == aig.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      if (this.b == aig.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zl<aig> a() {
      return agr.bZ;
   }

   public void a(agt $$0) {
      $$0.a(this);
   }

   public aig.a e() {
      return this.b;
   }

   @Nullable
   public alk f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
