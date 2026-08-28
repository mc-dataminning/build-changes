import javax.annotation.Nullable;

public abstract class dve extends dvl implements btj, bts, btt {
   private btr d = btr.a;
   @Nullable
   private wv e;

   protected dve(dvn<?> $$0, jj $$1, dym $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.d = btr.b($$0, $$1);
      if ($$0.e("CustomName")) {
         this.e = a($$0.c("CustomName"), $$1);
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      this.d.a($$0, $$1);
      if (this.e != null) {
         $$0.a("CustomName", (ut)wx.a.encodeStart($$1.a(uk.a), this.e).getOrThrow());
      }
   }

   @Override
   public wv al() {
      return this.e != null ? this.e : this.j();
   }

   @Override
   public wv m_() {
      return this.al();
   }

   @Nullable
   @Override
   public wv an() {
      return this.e;
   }

   protected abstract wv j();

   public boolean d(cqi $$0) {
      return a($$0, this.d, this.m_());
   }

   public static boolean a(cqi $$0, btr $$1, wv $$2) {
      if (!$$0.U_() && !$$1.a($$0.fa())) {
         $$0.a(wv.a("container.isLocked", $$2), true);
         $$0.a(awk.eR, awl.e, 1.0F, 1.0F);
         return false;
      } else {
         return true;
      }
   }

   protected abstract kb<cxy> f();

   protected abstract void a(kb<cxy> var1);

   @Override
   public boolean c() {
      for (cxy $$0 : this.f()) {
         if (!$$0.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cxy a(int $$0) {
      return this.f().get($$0);
   }

   @Override
   public cxy a(int $$0, int $$1) {
      cxy $$2 = btk.a(this.f(), $$0, $$1);
      if (!$$2.f()) {
         this.e();
      }

      return $$2;
   }

   @Override
   public cxy b(int $$0) {
      return btk.a(this.f(), $$0);
   }

   @Override
   public void a(int $$0, cxy $$1) {
      this.f().set($$0, $$1);
      $$1.f(this.e_($$1));
      this.e();
   }

   @Override
   public boolean a(cqi $$0) {
      return btj.a(this, $$0);
   }

   @Override
   public void a() {
      this.f().clear();
   }

   @Nullable
   @Override
   public ctn createMenu(int $$0, cqh $$1, cqi $$2) {
      return this.d($$2) ? this.a($$0, $$1) : null;
   }

   protected abstract ctn a(int var1, cqh var2);

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      this.e = $$0.a(kx.g);
      this.d = $$0.a(kx.aq, btr.a);
      $$0.a(kx.an, dan.a).a(this.f());
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.g, this.e);
      if (!this.d.equals(btr.a)) {
         $$0.a(kx.aq, this.d);
      }

      $$0.a(kx.an, dan.a(this.f()));
   }

   @Override
   public void a(tw $$0) {
      $$0.r("CustomName");
      $$0.r("lock");
      $$0.r("Items");
   }
}
