import javax.annotation.Nullable;

public class exc extends exv {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final te k;
   private final te l;
   private final Runnable m;
   @Nullable
   private etb n;
   private esi o;
   private int p;

   public static exc a(te $$0, te $$1, Runnable $$2) {
      return new exc($$0, null, $$1, $$2, 0);
   }

   public static exc a(te $$0, te $$1, te $$2, Runnable $$3) {
      return new exc($$0, $$1, $$2, $$3, 20);
   }

   protected exc(te $$0, @Nullable te $$1, te $$2, Runnable $$3, int $$4) {
      super($$0);
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.p = $$4;
   }

   @Override
   protected void aE_() {
      super.aE_();
      if (this.k != null) {
         this.n = etb.a(this.i, this.k, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.n != null ? this.n.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.h - 40);
      this.o = this.d(esi.a(this.l, $$0x -> this.au_()).a((this.g - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void c() {
      if (this.p > 0) {
         this.p--;
      }

      this.o.i = this.p == 0;
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 80, 16777215);
      if (this.n == null) {
         String $$4 = exg.a(ac.b());
         $$0.a(this.i, $$4, this.g / 2, 120, 10526880);
      } else {
         this.n.a($$0, this.g / 2, 120);
      }
   }

   @Override
   public boolean aA_() {
      return this.n != null && this.o.i;
   }

   @Override
   public void au_() {
      this.m.run();
   }

   @Override
   public te e() {
      return td.a(this.e, this.k != null ? this.k : td.a);
   }
}
