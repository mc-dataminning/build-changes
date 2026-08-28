import com.google.common.collect.UnmodifiableIterator;
import java.util.Optional;
import javax.annotation.Nullable;

public class cix extends cig implements bwo {
   private static final akg<Integer> bE = akk.a(cix.class, aki.b);
   private static final akg<js<ciy>> bF = akk.a(cix.class, aki.A);
   private final bwn bG = new bwn(this.al, bE);

   public cix(bwb<? extends cix> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new ceg(this, 1.25));
      this.bB.a(3, new ccz(this, 1.0));
      this.bB.a(4, new cev(this, 1.2, $$0 -> $$0.a(cyc.ov), false));
      this.bB.a(4, new cev(this, 1.2, $$0 -> $$0.a(axi.av), false));
      this.bB.a(5, new cdm(this, 1.1));
      this.bB.a(6, new cfa(this, 1.0));
      this.bB.a(7, new cdv(this, cqi.class, 6.0F));
      this.bB.a(8, new cei(this));
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 10.0).a(bxx.v, 0.25);
   }

   @Nullable
   @Override
   public bwr cW() {
      return (bwr)(this.ak() && this.cZ() instanceof cqi $$0 && $$0.b(cyc.ov) ? $$0 : super.cW());
   }

   @Override
   public void a(akg<?> $$0) {
      if (bE.equals($$0) && this.dV().C) {
         this.bG.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bE, 0);
      kf<ciy> $$1 = this.dX().f(me.aX);
      $$0.a(bF, $$1.a(ciz.d).or($$1::a).orElseThrow());
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      this.t().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      Optional.ofNullable(ald.c($$0.l("variant"))).map($$0x -> alc.a(me.aX, $$0x)).flatMap($$0x -> this.dX().f(me.aX).a($$0x)).ifPresent(this::j);
   }

   @Override
   protected awj u() {
      return awk.uk;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.um;
   }

   @Override
   protected awj l_() {
      return awk.ul;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.uo, 0.15F, 1.0F);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      boolean $$2 = this.k($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fX()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return btq.a;
      } else {
         btq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxy $$4 = $$0.b($$1);
            return (btq)(this.a($$4, bwc.h) ? $$4.a($$0, this, $$1) : btq.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bwc $$0) {
      return $$0 != bwc.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwc $$0) {
      return $$0 == bwc.h || super.f($$0);
   }

   @Override
   protected js<awj> a(bwc $$0, cxy $$1, dgc $$2) {
      return (js<awj>)($$0 == bwc.h ? awk.un : super.a($$0, $$1, $$2));
   }

   @Override
   public fcu b(bwr $$0) {
      jo $$1 = this.cP();
      if ($$1.o() == jo.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = csn.a($$1);
         jj $$3 = this.dv();
         jj.a $$4 = new jj.a();
         UnmodifiableIterator var6 = $$0.fN().iterator();

         while (var6.hasNext()) {
            bxd $$5 = (bxd)var6.next();
            fcp $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (csn.a($$8)) {
                  fcu $$9 = fcu.a($$4, $$8);
                  if (csn.a(this.dV(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(arn $$0, bwq $$1) {
      if ($$0.an() != btn.a) {
         coe $$2 = this.a(bwb.bQ, bvm.a(this, false, true), $$0x -> {
            if (this.fa().f()) {
               $$0x.a(bwc.a, new cxy(cyc.pF));
            }

            $$0x.fY();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cqi $$0, fcu $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aU = this.aW = this.dL();
      this.bG.b();
   }

   @Override
   protected fcu b(cqi $$0, fcu $$1) {
      return new fcu(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cqi $$0) {
      return (float)(this.h(bxx.v) * 0.225 * (double)this.bG.c());
   }

   @Override
   public boolean a() {
      return this.bG.a(this.dY());
   }

   @Nullable
   public cix b(arn $$0, bvi $$1) {
      cix $$2 = bwb.aQ.a($$0, bwa.e);
      if ($$2 != null && $$1 instanceof cix $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.av);
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(js<ciy> $$0) {
      this.al.a(bF, $$0);
   }

   public js<ciy> t() {
      return this.al.a(bF);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aD ? b((kw<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aD);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aD) {
         this.j(b(kx.aD, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      js<dis> $$4 = $$0.t(this.dv());
      ciz.a(this.ae, this.dX(), $$4).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
