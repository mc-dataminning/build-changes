import javax.annotation.Nullable;

public class exm extends eyf {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final ti k;
   private final ti l;
   private final Runnable m;
   @Nullable
   private ete n;
   private esl o;
   private int p;

   public static exm a(ti $$0, ti $$1, Runnable $$2) {
      return new exm($$0, null, $$1, $$2, 0);
   }

   public static exm a(ti $$0, ti $$1, ti $$2, Runnable $$3) {
      return new exm($$0, $$1, $$2, $$3, 20);
   }

   protected exm(ti $$0, @Nullable ti $$1, ti $$2, Runnable $$3, int $$4) {
      super($$0);
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.p = $$4;
   }

   @Override
   protected void aD_() {
      super.aD_();
      if (this.k != null) {
         this.n = ete.a(this.i, this.k, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.n != null ? this.n.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.h - 40);
      this.o = this.d(esl.a(this.l, $$0x -> this.au_()).a((this.g - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void c() {
      if (this.p > 0) {
         this.p--;
      }

      this.o.i = this.p == 0;
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 80, 16777215);
      if (this.n == null) {
         String $$4 = exq.a(ac.b());
         $$0.a(this.i, $$4, this.g / 2, 120, 10526880);
      } else {
         this.n.a($$0, this.g / 2, 120);
      }
   }

   @Override
   public boolean at_() {
      return this.n != null && this.o.i;
   }

   @Override
   public void au_() {
      this.m.run();
   }

   @Override
   public ti g() {
      return th.a(this.e, this.k != null ? this.k : th.a);
   }
}
