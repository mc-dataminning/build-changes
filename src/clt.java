import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clt extends bsb implements clw, clx, dbd {
   private static final ajp<Integer> cc = ajt.a(clt.class, ajr.b);
   private static final Logger cd = LogUtils.getLogger();
   public static final int ca = 300;
   private static final int ce = 8;
   @Nullable
   private cml cf;
   @Nullable
   protected dbf cb;
   private final bqq cg = new bqq(8);

   public clt(bsn<? extends clt> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.n, 16.0F);
      this.a(epa.o, -1.0F);
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$3 == null) {
         $$3 = new bsb.a(false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public int s() {
      return this.ao.a(cc);
   }

   public void s(int $$0) {
      this.ao.a(cc, $$0);
   }

   @Override
   public int t() {
      return 0;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
   }

   @Override
   public void f(@Nullable cml $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public cml gn() {
      return this.cf;
   }

   public boolean go() {
      return this.cf != null;
   }

   @Override
   public dbf gp() {
      if (this.dR().B) {
         throw new IllegalStateException("Cannot load Villager offers on the client");
      } else {
         if (this.cb == null) {
            this.cb = new dbf();
            this.gu();
         }

         return this.cb;
      }
   }

   @Override
   public void a(@Nullable dbf $$0) {
   }

   @Override
   public void t(int $$0) {
   }

   @Override
   public void a(dbe $$0) {
      $$0.l();
      this.bO = -this.P();
      this.b($$0);
      if (this.cf instanceof aqn) {
         am.t.a((aqn)this.cf, this, $$0.f());
      }
   }

   protected abstract void b(dbe var1);

   @Override
   public boolean gq() {
      return true;
   }

   @Override
   public void n(cud $$0) {
      if (!this.dR().B && this.bO > -this.P() + 20) {
         this.bO = -this.P();
         this.b(this.w(!$$0.e()));
      }
   }

   @Override
   public avg gr() {
      return avh.AX;
   }

   protected avg w(boolean $$0) {
      return $$0 ? avh.AX : avh.AV;
   }

   public void gs() {
      this.b(avh.AS);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (!this.dR().B) {
         dbf $$1 = this.gp();
         if (!$$1.isEmpty()) {
            $$0.a("Offers", (uu)dbf.a.encodeStart(this.dT().a(ul.a), $$1).getOrThrow());
         }
      }

      this.b($$0, this.dT());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Offers")) {
         dbf.a.parse(this.dT().a(ul.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", cd::warn)).ifPresent($$0x -> this.cb = $$0x);
      }

      this.a($$0, this.dT());
   }

   @Nullable
   @Override
   public bsh a(bsh.a $$0) {
      this.gt();
      return super.a($$0);
   }

   protected void gt() {
      this.f(null);
   }

   @Override
   public void a(bra $$0) {
      super.a($$0);
      this.gt();
   }

   protected void a(lh $$0) {
      for (int $$1 = 0; $$1 < 5; $$1++) {
         double $$2 = this.ah.k() * 0.02;
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         this.dR().a($$0, this.d(1.0), this.dz() + 1.0, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(cml $$0) {
      return false;
   }

   @Override
   public bqq x() {
      return this.cg;
   }

   @Override
   public btu a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.cg.b() ? btu.a(this.cg, $$1) : super.a_($$0);
   }

   protected abstract void gu();

   protected void a(dbf $$0, cmc.g[] $$1, int $$2) {
      ArrayList<cmc.g> $$3 = Lists.newArrayList($$1);
      int $$4 = 0;

      while ($$4 < $$2 && !$$3.isEmpty()) {
         dbe $$5 = $$3.remove(this.ah.a($$3.size())).a(this, this.ah);
         if ($$5 != null) {
            $$0.add($$5);
            $$4++;
         }
      }
   }

   @Override
   public ewh r(float $$0) {
      float $$1 = ayg.i($$0, this.ba, this.aZ) * (float) (Math.PI / 180.0);
      ewh $$2 = new ewh(0.0, this.cM().c() - 1.0, 0.2);
      return this.m($$0).e($$2.b(-$$1));
   }

   @Override
   public boolean gv() {
      return this.dR().B;
   }
}
