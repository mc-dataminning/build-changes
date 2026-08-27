import javax.annotation.Nullable;

public class aas implements xd<yx> {
   private final int a;
   private final cjb<?> b;
   private final vd c;

   public aas(int $$0, cjb<?> $$1, vd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aas(ug $$0) {
      this.a = $$0.n();
      this.b = $$0.a(kd.r);
      this.c = $$0.m();
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a(kd.r, this.b);
      $$0.a(this.c);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cjb<?> d() {
      return this.b;
   }

   public vd e() {
      return this.c;
   }
}
