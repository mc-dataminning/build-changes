import javax.annotation.Nullable;

public class fmx extends fnl {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final wu q;
   private final wu r;
   private final Runnable s;
   @Nullable
   private fin u;
   private fhu v;
   private int w;

   public static fmx a(wu $$0, wu $$1, Runnable $$2) {
      return new fmx($$0, null, $$1, $$2, 0);
   }

   public static fmx a(wu $$0, wu $$1, wu $$2, Runnable $$3) {
      return new fmx($$0, $$1, $$2, $$3, 20);
   }

   protected fmx(wu $$0, @Nullable wu $$1, wu $$2, Runnable $$3, int $$4) {
      super($$0);
      this.q = $$1;
      this.r = $$2;
      this.s = $$3;
      this.w = $$4;
   }

   @Override
   protected void aP_() {
      super.aP_();
      if (this.q != null) {
         this.u = fin.a(this.o, this.q, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.u != null ? this.u.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.n - 40);
      this.v = this.c(fhu.a(this.r, $$0x -> this.d()).a((this.m - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void e() {
      if (this.w > 0) {
         this.w--;
      }

      this.v.j = this.w == 0;
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 80, 16777215);
      if (this.u == null) {
         String $$4 = fna.a(ac.c());
         $$0.a(this.o, $$4, this.m / 2, 120, 10526880);
      } else {
         this.u.a($$0, this.m / 2, 120);
      }
   }

   @Override
   public boolean aF_() {
      return this.u != null && this.v.j;
   }

   @Override
   public void d() {
      this.s.run();
   }

   @Override
   public wu i() {
      return wt.a(this.k, this.q != null ? this.q : wt.a);
   }
}
