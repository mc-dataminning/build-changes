import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzz extends bys {
   private static final String b = "Johnny";
   static final Predicate<bgx> e = $$0 -> $$0 == bgx.c || $$0 == bgx.d;
   boolean bT;

   public bzz(biw<? extends bzz> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bzz.a(this));
      this.bO.a(2, new bys.b(this));
      this.bO.a(3, new cde.a(this, 10.0F));
      this.bO.a(4, new bqn(this, 1.0, false));
      this.bP.a(1, new brv(this, cde.class).a());
      this.bP.a(2, new brw<>(this, cbw.class, true));
      this.bP.a(3, new brw<>(this, cbe.class, true));
      this.bP.a(3, new brw<>(this, bvf.class, true));
      this.bP.a(4, new bzz.b(this));
      this.bO.a(8, new bra(this, 0.6));
      this.bO.a(9, new bql(this, cbw.class, 3.0F, 1.0F));
      this.bO.a(10, new bql(this, bjk.class, 8.0F));
   }

   @Override
   protected void X() {
      if (!this.fT() && btz.a(this)) {
         boolean $$0 = ((aks)this.dL()).d(this.dl());
         ((bsq)this.L()).b($$0);
      }

      super.X();
   }

   public static bkn.a t() {
      return bzk.gj().a(bko.d, 0.35F).a(bko.b, 12.0).a(bko.a, 24.0).a(bko.f, 5.0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public bys.a s() {
      if (this.fV()) {
         return bys.a.b;
      } else {
         return this.gu() ? bys.a.g : bys.a.a;
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public ape ac_() {
      return apf.zc;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      bkb $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bsq)this.L()).b(true);
      ase $$6 = $$0.D_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(ase $$0, bgy $$1) {
      if (this.gr() == null) {
         this.a(bix.a, new cjh(cjk.op));
      }
   }

   @Override
   public boolean s(bis $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bji && ((bji)$$0).eR() == bjn.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   public void b(@Nullable tn $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected ape w() {
      return apf.zb;
   }

   @Override
   protected ape l_() {
      return apf.zd;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.ze;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cjh $$2 = new cjh(cjk.op);
      cdd $$3 = this.gr();
      int $$4 = 1;
      if ($$0 > $$3.a(bgx.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cnq, Integer> $$6 = Maps.newHashMap();
         $$6.put(cnu.n, $$4);
         cns.a($$6, $$2);
      }

      this.a(bix.a, $$2);
   }

   static class a extends bpn {
      public a(bjk $$0) {
         super($$0, 6, bzz.e);
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public boolean b() {
         bzz $$0 = (bzz)this.d;
         return $$0.gs() && super.b();
      }

      @Override
      public boolean a() {
         bzz $$0 = (bzz)this.d;
         return $$0.gs() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends brw<bji> {
      public b(bzz $$0) {
         super($$0, bji.class, 0, true, true, bji::fy);
      }

      @Override
      public boolean a() {
         return ((bzz)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
