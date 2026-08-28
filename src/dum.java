import javax.annotation.Nullable;

public abstract class dum extends dus implements bsr, bta, btb {
   private bsz d = bsz.a;
   @Nullable
   private wp e;

   protected dum(duu<?> $$0, ji $$1, dxq $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.d = bsz.b($$0, $$1);
      if ($$0.e("CustomName")) {
         this.e = a($$0.c("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (un)wr.a.encodeStart($$1.a(ue.a), this.e).getOrThrow());
      }
   }

   @Override
   public wp al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public wp m_() {
      return this.al();
   }

   @Nullable
   @Override
   public wp an() {
      return this.e;
   }

   protected abstract wp j();

   public boolean d(cpr $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(cpr $$0, bsz $$1, wp $$2) {
      if (!$$0.U_() && !$$1.a($$0.eZ())) {
         $$0.a(wp.a("container.isLocked", $$2), true);
         $$0.a(awa.eR, awb.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract ka<cxh> f();

   protected abstract void a(ka<cxh> var1);

   @Override
   public boolean c() {
      for (cxh $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxh a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cxh a(int $$0, int $$1) {
      cxh $$2 = bss.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cxh b(int $$0) {
      return bss.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cxh $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cpr $$0) {
      return bsr.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public csw createMenu(int $$0, cpq $$1, cpr $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract csw a(int var1, cpq var2);

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      this.e = $$0.a(kv.g);
      this.d = $$0.a(kv.aq, bsz.a);
      $$0.a(kv.an, czx.a).a(this.f());
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.g, this.e);
      if (!this.d.equals(bsz.a)) {
         $$0.a(kv.aq, this.d);
      }

      $$0.a(kv.an, czx.a(this.f()));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
