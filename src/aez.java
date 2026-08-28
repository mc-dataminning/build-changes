import javax.annotation.Nullable;

public class aez implements zf<abt> {
   public static final yw<vv, aez> a = zf.a(aez::a, aez::new);
   private final int b;
   private final int c;

   public aez(bsq $$0, @Nullable bsq $$1) {
      this.b = $$0.an();
      this.c = $$1 != null ? $$1.an() : 0;
   }

   private aez(vv $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
   }

   private void a(vv $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
   }

   @Override
   public zh<aez> a() {
      return agf.aD;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
