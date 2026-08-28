import javax.annotation.Nullable;

public class ahs implements yv<agf> {
   public static final ym<vl, ahs> a = yv.a(ahs::a, ahs::new);
   private final ahs.a b;
   @Nullable
   private final aku c;

   public ahs(ahs.a $$0, @Nullable aku $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static ahs a(ai $$0) {
      return new ahs(ahs.a.a, $$0.a());
   }

   public static ahs b() {
      return new ahs(ahs.a.b, null);
   }

   private ahs(vl $$0) {
      this.b = $$0.b(ahs.a.class);
      if (this.b == ahs.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      if (this.b == ahs.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public yx<ahs> a() {
      return agd.bZ;
   }

   public void a(agf $$0) {
      $$0.a(this);
   }

   public ahs.a e() {
      return this.b;
   }

   @Nullable
   public aku f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
