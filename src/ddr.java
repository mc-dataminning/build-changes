import javax.annotation.Nullable;

public abstract class ddr extends ddx implements bhu, bie, bif {
   private bid c = bid.a;
   @Nullable
   private ui d;

   protected ddr(ddz<?> $$0, ht $$1, dgb $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.c = bid.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.d = ui.a.a($$0.l("CustomName"));
      }
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      this.c.a($$0);
      if (this.d != null) {
         $$0.a("CustomName", ui.a.a(this.d));
      }
   }

   public void a(ui $$0) {
      this.d = $$0;
   }

   @Override
   public ui ab() {
      return this.d != null ? this.d : this.g();
   }

   @Override
   public ui O_() {
      return this.ab();
   }

   @Nullable
   @Override
   public ui ad() {
      return this.d;
   }

   protected abstract ui g();

   public boolean d(ccx $$0) {
      return a($$0, this.c, this.O_());
   }

   public static boolean a(ccx $$0, bid $$1, ui $$2) {
      if (!$$0.N_() && !$$1.a($$0.eS())) {
         $$0.a(ui.a("container.isLocked", $$2), true);
         $$0.a(aqd.ei, aqe.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public cfp createMenu(int $$0, ccw $$1, ccx $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cfp a(int var1, ccw var2);
}
