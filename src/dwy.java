import javax.annotation.Nullable;

public abstract class dwy extends dxf implements btw, buf, bug {
   private bue d = bue.a;
   @Nullable
   private wy e;

   protected dwy(dxh<?> $$0, iu $$1, eah $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.d = bue.b($$0, $$1);
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

   public boolean d(crc $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(crc $$0, bue $$1, wy $$2) {
      if (!$$0.V_() && !$$1.a($$0.fb())) {
         $$0.a(wy.a("container.isLocked", $$2), true);
         $$0.a(awn.eT, awo.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract jn<czd> f();

   protected abstract void a(jn<czd> var1);

   @Override
   public boolean c() {
      for (czd $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czd a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public czd a(int $$0, int $$1) {
      czd $$2 = btx.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public czd b(int $$0) {
      return btx.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, czd $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.f_($$1));
      this.e();
   }

   @Override
   public boolean a(crc $$0) {
      return btw.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public cuv createMenu(int $$0, crb $$1, crc $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract cuv a(int var1, crb var2);

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.e = $$0.a(kj.g);
      this.d = $$0.a(kj.as, bue.a);
      $$0.a(kj.ap, dbv.a).a(this.f());
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.g, this.e);
      if (!this.d.equals(bue.a)) {
         $$0.a(kj.as, this.d);
      }

      $$0.a(kj.ap, dbv.a(this.f()));
   }

   @Override
   public void a(tz $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
