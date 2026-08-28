import javax.annotation.Nullable;

public class afu implements zg<abu> {
   public static final yx<vw, afu> a = zg.a(afu::a, afu::new);
   private final int b;
   @Nullable
   private final ub c;

   public afu(int $$0, @Nullable ub $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afu(vw $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a((uy)this.c);
   }

   @Override
   public zi<afu> a() {
      return agg.aX;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ub e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
