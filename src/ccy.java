import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccy extends cbr {
   private static final String b = "Johnny";
   static final Predicate<bjs> e = $$0 -> $$0 == bjs.c || $$0 == bjs.d;
   boolean bT;

   public ccy(blt<? extends ccy> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new ccy.a(this));
      this.bO.a(2, new cbr.b(this));
      this.bO.a(3, new cgk.a(this, 10.0F));
      this.bO.a(4, new btl(this, 1.0, false));
      this.bP.a(1, new but(this, cgk.class).a());
      this.bP.a(2, new buu<>(this, cfb.class, true));
      this.bP.a(3, new buu<>(this, cej.class, true));
      this.bP.a(3, new buu<>(this, bye.class, true));
      this.bP.a(4, new ccy.b(this));
      this.bO.a(8, new bty(this, 0.6));
      this.bO.a(9, new btj(this, cfb.class, 3.0F, 1.0F));
      this.bO.a(10, new btj(this, bmh.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.fU() && bwy.a(this)) {
         boolean $$0 = ((amz)this.dM()).e(this.dm());
         ((bvo)this.N()).b($$0);
      }

      super.Z();
   }

   public static bnk.a w() {
      return ccj.gk().a(bnl.m, 0.35F).a(bnl.g, 12.0).a(bnl.l, 24.0).a(bnl.c, 5.0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cbr.a u() {
      if (this.fW()) {
         return cbr.a.b;
      } else {
         return this.gv() ? cbr.a.g : cbr.a.a;
      }
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public arl af_() {
      return arm.Ac;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      bmy $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bvo)this.N()).b(true);
      aup $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      if (this.gs() == null) {
         this.a(blu.a, new cmr(cmu.pa));
      }
   }

   @Override
   public boolean s(blp $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bmf && ((bmf)$$0).eS() == bmk.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   public void b(@Nullable vd $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected arl y() {
      return arm.Ab;
   }

   @Override
   protected arl n_() {
      return arm.Ad;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Ae;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cmr $$2 = new cmr(cmu.pa);
      cgj $$3 = this.gs();
      int $$4 = 1;
      if ($$0 > $$3.a(bjs.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<crc, Integer> $$6 = Maps.newHashMap();
         $$6.put(crg.n, $$4);
         cre.a($$6, $$2);
      }

      this.a(blu.a, $$2);
   }

   static class a extends bsl {
      public a(bmh $$0) {
         super($$0, 6, ccy.e);
         this.a(EnumSet.of(btb.a.a));
      }

      @Override
      public boolean b() {
         ccy $$0 = (ccy)this.d;
         return $$0.gt() && super.b();
      }

      @Override
      public boolean a() {
         ccy $$0 = (ccy)this.d;
         return $$0.gt() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends buu<bmf> {
      public b(ccy $$0) {
         super($$0, bmf.class, 0, true, true, bmf::fz);
      }

      @Override
      public boolean a() {
         return ((ccy)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
