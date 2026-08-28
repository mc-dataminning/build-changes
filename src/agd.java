import javax.annotation.Nullable;

public class agd implements zl<aca> {
   public static final zc<wb, agd> a = zl.a(agd::a, agd::new);
   private final int b;
   @Nullable
   private final ug c;

   public agd(int $$0, @Nullable ug $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agd(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.o();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a((vd)this.c);
   }

   @Override
   public zn<agd> a() {
      return agp.aY;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   @Nullable
   public ug e() {
      return this.c;
   }

   @Override
   public boolean c() {
      return true;
   }
}
