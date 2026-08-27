import javax.annotation.Nullable;

public abstract class dmx extends dnd implements boj, bou, bov {
   private bot e = bot.a;
   @Nullable
   private ws f;

   protected dmx(dnf<?> $$0, im $$1, dpy $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.e = bot.b($$0);
      if ($$0.b("CustomName", 8)) {
         this.f = ws.a.a($$0.l("CustomName"), $$1);
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      this.e.a($$0);
      if (this.f != null) {
         $$0.a("CustomName", ws.a.a(this.f, $$1));
      }
   }

   @Override
   public ws ad() {
      return this.f != null ? this.f : this.k();
   }

   @Override
   public ws O_() {
      return this.ad();
   }

   @Nullable
   @Override
   public ws af() {
      return this.f;
   }

   protected abstract ws k();

   public boolean d(ckl $$0) {
      return a($$0, this.e, this.O_());
   }

   public static boolean a(ckl $$0, bot $$1, ws $$2) {
      if (!$$0.N_() && !$$1.a($$0.eV())) {
         $$0.a(ws.a("container.isLocked", $$2), true);
         $$0.a(auz.eP, ava.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract je<csd> j();

   protected abstract void a(je<csd> var1);

   @Override
   public boolean c() {
      for (csd $$0 : this.j()) {
         if (!$$0.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csd a(int $$0) {
      return this.j().get($$0);
   }

   @Override
   public csd a(int $$0, int $$1) {
      csd $$2 = bok.a(this.j(), $$0, $$1);
      if (!$$2.d()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public csd b(int $$0) {
      return bok.a(this.j(), $$0);
   }

   @Override
   public void a(int $$0, csd $$1) {
      this.j().set($$0, $$1);
      if ($$1.G() > this.ah_()) {
         $$1.e(this.ah_());
      }

      this.e();
   }

   @Override
   public boolean a(ckl $$0) {
      return boj.a(this, $$0);
   }

   @Override
   public void a() {
      this.j().clear();
   }

   @Nullable
   @Override
   public cnh createMenu(int $$0, ckk $$1, ckl $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cnh a(int var1, ckk var2);

   @Override
   public void a(jv $$0) {
      this.f = $$0.a(jz.d);
      this.e = $$0.a(jz.T, bot.a);
      $$0.a(jz.Q, cux.a).a(this.j());
   }

   @Override
   public void a(jv.a $$0) {
      $$0.a(jz.d, this.f);
      if (!this.e.equals(bot.a)) {
         $$0.a(jz.T, this.e);
      }

      $$0.a(jz.Q, cux.a(this.j()));
   }

   @Override
   public void a(ty $$0) {
      $$0.r("CustomName");
      $$0.r("Lock");
      $$0.r("Items");
   }
}
