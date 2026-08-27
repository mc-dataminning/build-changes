import javax.annotation.Nullable;

public class aaw implements xg<zb> {
   private final int a;
   private final cjq<?> b;
   private final vg c;

   public aaw(int $$0, cjq<?> $$1, vg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aaw(uj $$0) {
      this.a = $$0.n();
      this.b = $$0.a(kd.r);
      this.c = $$0.m();
   }

   @Override
   public void a(uj $$0) {
      $$0.c(this.a);
      $$0.a(kd.r, this.b);
      $$0.a(this.c);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cjq<?> d() {
      return this.b;
   }

   public vg e() {
      return this.c;
   }
}
