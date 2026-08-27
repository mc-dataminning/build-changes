import javax.annotation.Nullable;

public class aav implements xf<za> {
   private final int a;
   private final cji<?> b;
   private final vf c;

   public aav(int $$0, cji<?> $$1, vf $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aav(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.a(kd.r);
      this.c = $$0.m();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(kd.r, this.b);
      $$0.a(this.c);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   @Nullable
   public cji<?> d() {
      return this.b;
   }

   public vf e() {
      return this.c;
   }
}
