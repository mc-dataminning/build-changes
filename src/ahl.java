import net.minecraft.server.MinecraftServer;

public class ahl extends bjv {
   private long g = 0L;
   private long h = 0L;
   private long i = 0L;
   private long j = 0L;
   private boolean k = false;
   private final MinecraftServer l;

   public ahl(MinecraftServer $$0) {
      this.l = $$0;
   }

   public boolean a() {
      return this.j > 0L;
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      this.n();
   }

   private void n() {
      this.l.ae().a(acn.a(this));
   }

   private void o() {
      this.l.ae().a(aco.a(this));
   }

   public boolean a(int $$0) {
      if (!this.l()) {
         return false;
      } else {
         this.d = $$0;
         this.o();
         return true;
      }
   }

   public boolean b() {
      if (this.d > 0) {
         this.d = 0;
         this.o();
         return true;
      } else {
         return false;
      }
   }

   public boolean c() {
      if (this.g > 0L) {
         this.p();
         return true;
      } else {
         return false;
      }
   }

   public boolean b(int $$0) {
      boolean $$1 = this.g > 0L;
      this.i = 0L;
      this.j = (long)$$0;
      this.g = (long)$$0;
      this.k = this.l();
      this.a(false);
      return $$1;
   }

   private void p() {
      long $$0 = this.j - this.g;
      double $$1 = Math.max(1.0, (double)this.i) / (double)auz.b;
      int $$2 = (int)((double)(auz.c * $$0) / $$1);
      String $$3 = String.format("%.2f", $$0 == 0L ? (double)this.g() : $$1 / (double)$$0);
      this.j = 0L;
      this.i = 0L;
      this.l.aF().a(() -> vb.a("commands.tick.sprint.report", $$2, $$3), true);
      this.g = 0L;
      this.a(this.k);
      this.l.B();
   }

   public boolean d() {
      if (!this.e) {
         return false;
      } else if (this.g > 0L) {
         this.h = System.nanoTime();
         this.g--;
         return true;
      } else {
         this.p();
         return false;
      }
   }

   public void e() {
      this.i = this.i + (System.nanoTime() - this.h);
   }

   @Override
   public void a(float $$0) {
      super.a($$0);
      this.l.B();
      this.n();
   }

   public void a(amq $$0) {
      $$0.c.b(acn.a(this));
      $$0.c.b(aco.a(this));
   }
}
