import javax.annotation.Nullable;

public class exm extends eye {
   private static final int a = 80;
   private static final int b = 120;
   private static final int c = 360;
   @Nullable
   private final tl k;
   private final tl l;
   private final Runnable m;
   @Nullable
   private etd n;
   private esk o;
   private int p;

   public static exm a(tl $$0, tl $$1, Runnable $$2) {
      return new exm($$0, null, $$1, $$2, 0);
   }

   public static exm a(tl $$0, tl $$1, tl $$2, Runnable $$3) {
      return new exm($$0, $$1, $$2, $$3, 20);
   }

   protected exm(tl $$0, @Nullable tl $$1, tl $$2, Runnable $$3, int $$4) {
      super($$0);
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.p = $$4;
   }

   @Override
   protected void aH_() {
      super.aH_();
      if (this.k != null) {
         this.n = etd.a(this.i, this.k, 360);
      }

      int $$0 = 150;
      int $$1 = 20;
      int $$2 = this.n != null ? this.n.a() : 1;
      int $$3 = Math.max($$2, 5) * 9;
      int $$4 = Math.min(120 + $$3, this.h - 40);
      this.o = this.d(esk.a(this.l, $$0x -> this.az_()).a((this.g - 150) / 2, $$4, 150, 20).a());
   }

   @Override
   public void c() {
      if (this.p > 0) {
         this.p--;
      }

      this.o.i = this.p == 0;
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
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
   public boolean ay_() {
      return this.n != null && this.o.i;
   }

   @Override
   public void az_() {
      this.m.run();
   }

   @Override
   public tl g() {
      return tk.a(this.e, this.k != null ? this.k : tk.a);
   }
}
