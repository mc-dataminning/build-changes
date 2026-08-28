import javax.annotation.Nullable;

public class aij implements zs<agy> {
   public static final zj<wi, aij> a = zs.a(aij::a, aij::new);
   private final aij.a b;
   @Nullable
   private final all c;

   public aij(aij.a $$0, @Nullable all $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static aij a(ah $$0) {
      return new aij(aij.a.a, $$0.a());
   }

   public static aij b() {
      return new aij(aij.a.b, null);
   }

   private aij(wi $$0) {
      this.b = $$0.b(aij.a.class);
      if (this.b == aij.a.a) {
         this.c = $$0.q();
      } else {
         this.c = null;
      }
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      if (this.b == aij.a.a) {
         $$0.a(this.c);
      }
   }

   @Override
   public zu<aij> a() {
      return agw.bT;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public aij.a e() {
      return this.b;
   }

   @Nullable
   public all f() {
      return this.c;
   }

   public static enum a {
      a,
      b;
   }
}
