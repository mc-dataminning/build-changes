import java.util.function.BooleanSupplier;

public class flb extends fld {
   private static final wu a = wu.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;

   public flb(BooleanSupplier $$0) {
      super(fcw.a);
      this.d = $$0;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, 16777215);
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.m.aZ().c(wu.c("narrator.ready_to_play"));
      super.d();
   }

   @Override
   public boolean k() {
      return false;
   }
}
