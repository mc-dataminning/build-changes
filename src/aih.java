import javax.annotation.Nullable;

public class aih implements zq<agw> {
   public static final zh<wg, aih> a = zq.a(aih::a, aih::new);
   private final aih.a b;
   @Nullable
   private final alj c;

   public aih(aih.a $$0, @Nullable alj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aih a(ah $$0) {
      return new aih(aih.a.a, $$0.a());
   }

   public static aih b() {
      return new aih(aih.a.b, null);
   }

   private aih(wg $$0) {
      this.b = $$0.b(aih.a.class);
      if (this.b == aih.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      if (this.b == aih.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zs<aih> a() {
      return agu.bT;
   }

   public void a(agw $$0) {
      $$0.a(this);
   }

   public aih.a e() {
      return this.b;
   }

   @Nullable
   public alj f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
