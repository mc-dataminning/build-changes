import javax.annotation.Nullable;

public class aig implements zw<agw> {
   public static final zn<wm, aig> a = zw.a(aig::a, aig::new);
   private final aig.a b;
   @Nullable
   private final alf c;

   public aig(aig.a $$0, @Nullable alf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aig a(af $$0) {
      return new aig(aig.a.a, $$0.a());
   }

   public static aig b() {
      return new aig(aig.a.b, null);
   }

   private aig(wm $$0) {
      this.b = $$0.b(aig.a.class);
      if (this.b == aig.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      if (this.b == aig.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zy<aig> a() {
      return agu.bQ;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public aig.a e() {
      return this.b;
   }

   @Nullable
   public alf f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
