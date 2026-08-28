import net.minecraft.server.MinecraftServer;

public class alo extends bth {
   private long g = 0L;
   private long h = 0L;
   private long i = 0L;
   private long j = 0L;
   private boolean k = false;
   private final MinecraftServer l;

   public alo(MinecraftServer $$0) {
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
      this.l.ag().a(afu.a(this));
   }

   private void o() {
      this.l.ag().a(afv.a(this));
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
      double $$1 = Math.max(1.0, (double)this.i) / (double)bab.b;
      int $$2 = (int)((double)(bab.c * $$0) / $$1);
      String $$3 = String.format("%.2f", $$0 == 0L ? (double)this.g() : $$1 / (double)$$0);
      this.j = 0L;
      this.i = 0L;
      this.l.aH().a(() -> wp.a("commands.tick.sprint.report", $$2, $$3), true);
      this.g = 0L;
      this.a(this.k);
      this.l.F();
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
      this.l.F();
      this.n();
   }

   public void a(are $$0) {
      $$0.f.b(afu.a(this));
      $$0.f.b(afv.a(this));
   }
}
