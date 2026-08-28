import javax.annotation.Nullable;

public abstract class dwg extends dwn implements btr, bua, bub {
   private btz d = btz.a;
   @Nullable
   private ww e;

   protected dwg(dwp<?> $$0, iu $$1, dzo $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = btz.b($$0, $$1);
      if ($$0.e("CustomName")) {
         this.e = a($$0.c("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (uu)wy.a.encodeStart($$1.a(ul.a), this.e).getOrThrow());
      }
   }

   @Override
   public ww al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public ww m_() {
      return this.al();
   }

   @Nullable
   @Override
   public ww an() {
      return this.e;
   }

   protected abstract ww j();

   public boolean d(cqs $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(cqs $$0, btz $$1, ww $$2) {
      if (!$$0.U_() && !$$1.a($$0.fa())) {
         $$0.a(ww.a("container.isLocked", $$2), true);
         $$0.a(awl.eR, awm.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jn<cys> f();

   protected abstract void a(jn<cys> var1);

   @Override
   public boolean c() {
      for (cys $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cys a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cys a(int $$0, int $$1) {
      cys $$2 = bts.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cys b(int $$0) {
      return bts.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cys $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cqs $$0) {
      return btr.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cuk createMenu(int $$0, cqr $$1, cqs $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cuk a(int var1, cqr var2);

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.e = $$0.a(kj.g);
      this.d = $$0.a(kj.as, btz.a);
      $$0.a(kj.ap, dbk.a).a(this.f());
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.e);
      if (!this.d.equals(btz.a)) {
         $$0.a(kj.as, this.d);
      }

      $$0.a(kj.ap, dbk.a(this.f()));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
