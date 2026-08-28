import javax.annotation.Nullable;

public abstract class dwq extends dwx implements btu, bud, bue {
   private buc d = buc.a;
   @Nullable
   private wy e;

   protected dwq(dwz<?> $$0, iu $$1, dzz $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = buc.b($$0, $$1);
      if ($$0.e("CustomName")) {
         this.e = a($$0.c("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (uw)xa.a.encodeStart($$1.a(un.a), this.e).getOrThrow());
      }
   }

   @Override
   public wy al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public wy m_() {
      return this.al();
   }

   @Nullable
   @Override
   public wy an() {
      return this.e;
   }

   protected abstract wy j();

   public boolean d(cqy $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(cqy $$0, buc $$1, wy $$2) {
      if (!$$0.U_() && !$$1.a($$0.fa())) {
         $$0.a(wy.a("container.isLocked", $$2), true);
         $$0.a(awn.eR, awo.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jn<cyy> f();

   protected abstract void a(jn<cyy> var1);

   @Override
   public boolean c() {
      for (cyy $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cyy a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cyy a(int $$0, int $$1) {
      cyy $$2 = btv.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cyy b(int $$0) {
      return btv.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cyy $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(cqy $$0) {
      return btu.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cuq createMenu(int $$0, cqx $$1, cqy $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cuq a(int var1, cqx var2);

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.e = $$0.a(kj.g);
      this.d = $$0.a(kj.as, buc.a);
      $$0.a(kj.ap, dbq.a).a(this.f());
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.e);
      if (!this.d.equals(buc.a)) {
         $$0.a(kj.as, this.d);
      }

      $$0.a(kj.ap, dbq.a(this.f()));
   }

   @Override
   public void a(tz $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
