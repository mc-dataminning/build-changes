import javax.annotation.Nullable;

public class aht implements yw<agg> {
   public static final yn<vl, aht> a = yw.a(aht::a, aht::new);
   private final aht.a b;
   @Nullable
   private final akv c;

   public aht(aht.a $$0, @Nullable akv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aht a(ai $$0) {
      return new aht(aht.a.a, $$0.a());
   }

   public static aht b() {
      return new aht(aht.a.b, null);
   }

   private aht(vl $$0) {
      this.b = $$0.b(aht.a.class);
      if (this.b == aht.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      if (this.b == aht.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public yy<aht> a() {
      return age.bZ;
   }

   public void a(agg $$0) {
      $$0.a(this);
   }

   public aht.a e() {
      return this.b;
   }

   @Nullable
   public akv f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
