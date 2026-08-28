import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cme extends bsn implements cmh, cmi, dau {
   private static final akj<Integer> ca = akn.a(cme.class, akl.b);
   private static final Logger cb = LogUtils.getLogger();
   public static final int bY = 300;
   private static final int cc = 8;
   @Nullable
   private cmw cd;
   @Nullable
   protected daw bZ;
   private final brc ce = new brc(8);

   public cme(bsz<? extends cme> $$0, dbx $$1) {
      super($$0, $$1);
      this.a(eol.n, 16.0F);
      this.a(eol.o, -1.0F);
   }

   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsn.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int s() {
      return this.ao.a(ca);
   }

   public void t(int $$0) {
      this.ao.a(ca, $$0);
   }

   @Override
   public int u() {
      return 0;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
   }

   @Override
   public void f(@Nullable cmw $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public cmw gq() {
      return this.cd;
   }

   public boolean gr() {
      return this.cd != null;
   }

   @Override
   public daw gs() {
      if (this.bZ == null) {
         this.bZ = new daw();
         this.gx();
      }

      return this.bZ;
   }

   @Override
   public void a(@Nullable daw $$0) {
   }

   @Override
   public void u(int $$0) {
   }

   @Override
   public void a(dav $$0) {
      $$0.l();
      this.bM = -this.P();
      this.b($$0);
      if (this.cd instanceof arf) {
         am.t.a((arf)this.cd, this, $$0.f());
      }
   }

   protected abstract void b(dav var1);

   @Override
   public boolean gt() {
      return true;
   }

   @Override
   public void n(cuo $$0) {
      if (!this.dP().B && this.bM > -this.P() + 20) {
         this.bM = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avy gu() {
      return avz.AU;
   }

   protected avy w(boolean $$0) {
      return $$0 ? avz.AU : avz.AS;
   }

   public void gv() {
      this.b(avz.AP);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      daw $$1 = this.gs();
      if (!$$1.isEmpty()) {
         $$0.a("Offers", (vo)daw.a.encodeStart(this.dR().a(vf.a), $$1).getOrThrow());
      }

      this.b($$0, this.dR());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         daw.a.parse(this.dR().a(vf.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cb::warn)).ifPresent($$0x -> this.bZ = $$0x);
      }

      this.a($$0, this.dR());
   }

   @Nullable
   @Override
   public bst b(are $$0) {
      this.gw();
      return super.b($$0);
   }

   protected void gw() {
      this.f(null);
   }

   @Override
   public void a(brm $$0) {
      super.a($$0);
      this.gw();
   }

   protected void a(lg $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dP().a($$0, this.d(1.0), this.dx() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return false;
   }

   @Override
   public brc y() {
      return this.ce;
   }

   @Override
   public bug a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ce.b() ? bug.a(this.ce, $$1) : super.a_($$0);
   }

   protected abstract void gx();

   protected void a(daw $$0, cmn.g[] $$1, int $$2) {
      ArrayList<cmn.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dav $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public evq q(float $$0) {
      float $$1 = ayy.i($$0, this.aZ, this.aY) * (float) (Math.PI / 180.0);
      evq $$2 = new evq(0.0, this.cK().c() - 1.0, 0.2);
      return this.l($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gy() {
      return this.dP().B;
   }
}
