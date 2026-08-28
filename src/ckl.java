import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckl extends ckk implements cma {
   private static final Logger b = LogUtils.getLogger();
   private static final ajp<Boolean> c = ajt.a(ckl.class, ajr.k);
   private static final ajp<clz> d = ajt.a(ckl.class, ajr.u);
   private static final int cd = 3600;
   private static final int ce = 6000;
   private static final int cf = 14;
   private static final int cg = 4;
   private int ch;
   @Nullable
   private UUID ci;
   @Nullable
   private uu cj;
   @Nullable
   private dbf ck;
   private int cl;

   public ckl(bsn<? extends ckl> $$0, dcg $$1) {
      super($$0, $$1);
      lq.x.a(this.ah).ifPresent($$0x -> this.a(this.gy().a((cmb)$$0x.a())));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new clz(cmd.c, cmb.b, 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      clz.c.encodeStart(ul.a, this.gy()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ck != null) {
         $$0.a("Offers", (uu)dbf.a.encodeStart(this.dT().a(ul.a), this.ck).getOrThrow());
      }

      if (this.cj != null) {
         $$0.a("Gossips", this.cj);
      }

      $$0.a("ConversionTime", this.gx() ? this.ch : -1);
      if (this.ci != null) {
         $$0.a("ConversionPlayer", this.ci);
      }

      $$0.a("Xp", this.cl);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<clz> $$1 = clz.c.parse(new Dynamic(ul.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dbf.a.parse(this.dT().a(ul.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ck = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cj = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cl = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dR().B && this.bF() && this.gx()) {
         int $$0 = this.gA();
         this.ch -= $$0;
         if (this.ch <= 0) {
            this.b((aqm)this.dR());
         }
      }

      super.l();
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      cud $$2 = $$0.b($$1);
      if ($$2.a(cug.qa)) {
         if (this.b(brr.r)) {
            $$2.a(1, $$0);
            if (!this.dR().B) {
               this.a($$0.cB(), this.ah.a(2401) + 3600);
            }

            return bqh.a;
         } else {
            return bqh.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gx() && this.cl == 0;
   }

   public boolean gx() {
      return this.ar().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ci = $$0;
      this.ch = $$1;
      this.ar().a(c, true);
      this.e(brr.r);
      this.b(new brp(brr.e, $$1, Math.min(this.dR().al().a() - 1, 0)));
      this.dR().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aY()) {
            this.dR().a(this.dw(), this.dA(), this.dC(), avh.DL, this.dg(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void b(aqm $$0) {
      cly $$1 = this.a(bsn.bj, false);

      for (bso $$2 : bso.values()) {
         cud $$3 = this.a($$2);
         if (!$$3.e()) {
            if (czo.a($$3, czn.E)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gy());
      if (this.cj != null) {
         $$1.a(this.cj);
      }

      if (this.ck != null) {
         $$1.b(this.ck.a());
      }

      $$1.u(this.cl);
      $$1.a($$0, $$0.d_($$1.dr()), btg.i, null);
      $$1.b($$0);
      if (this.ci != null) {
         cml $$5 = $$0.b(this.ci);
         if ($$5 instanceof aqn) {
            am.s.a((aqn)$$5, this, $$1);
            $$0.a(ced.a, $$5, $$1);
         }
      }

      $$1.b(new brp(brr.i, 200, 0));
      if (!this.aY()) {
         $$0.a(null, 1027, this.dr(), 0);
      }
   }

   private int gA() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         ja.a $$2 = new ja.a();

         for (int $$3 = (int)this.dw() - 4; $$3 < (int)this.dw() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dy() - 4; $$4 < (int)this.dy() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dC() - 4; $$5 < (int)this.dC() + 4 && $$1 < 14; $$5++) {
                  dsl $$6 = this.dR().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dfk.eW) || $$6.b() instanceof dfb) {
                     if (this.ah.i() < 0.3F) {
                        $$0++;
                     }

                     $$1++;
                  }
               }
            }
         }
      }

      return $$0;
   }

   @Override
   public float fd() {
      return this.o_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avg v() {
      return avh.DJ;
   }

   @Override
   public avg d(bra $$0) {
      return avh.DN;
   }

   @Override
   public avg n_() {
      return avh.DM;
   }

   @Override
   public avg gn() {
      return avh.DO;
   }

   @Override
   protected cud go() {
      return cud.l;
   }

   public void a(dbf $$0) {
      this.ck = $$0;
   }

   public void a(uu $$0) {
      this.cj = $$0;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.a(this.gy().a(cmd.a($$0.t(this.dr()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(clz $$0) {
      clz $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ck = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public clz gy() {
      return this.ao.a(d);
   }

   public int gz() {
      return this.cl;
   }

   @Override
   public void b(int $$0) {
      this.cl = $$0;
   }
}
