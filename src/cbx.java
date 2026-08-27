import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbx extends caq {
   private static final String b = "Johnny";
   static final Predicate<biu> e = $$0 -> $$0 == biu.c || $$0 == biu.d;
   boolean bT;

   public cbx(bku<? extends cbx> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(1, new cbx.a(this));
      this.bO.a(2, new caq.b(this));
      this.bO.a(3, new cfc.a(this, 10.0F));
      this.bO.a(4, new bsl(this, 1.0, false));
      this.bP.a(1, new btt(this, cfc.class).a());
      this.bP.a(2, new btu<>(this, cdu.class, true));
      this.bP.a(3, new btu<>(this, cdc.class, true));
      this.bP.a(3, new btu<>(this, bxd.class, true));
      this.bP.a(4, new cbx.b(this));
      this.bO.a(8, new bsy(this, 0.6));
      this.bO.a(9, new bsj(this, cdu.class, 3.0F, 1.0F));
      this.bO.a(10, new bsj(this, bli.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.fV() && bvx.a(this)) {
         boolean $$0 = ((ame)this.dN()).d(this.dn());
         ((buo)this.N()).b($$0);
      }

      super.Z();
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.m, 0.35F).a(bmm.g, 12.0).a(bmm.l, 24.0).a(bmm.c, 5.0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public caq.a u() {
      if (this.fX()) {
         return caq.a.b;
      } else {
         return this.gw() ? caq.a.g : caq.a.a;
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public aqq ae_() {
      return aqr.zH;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      blz $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((buo)this.N()).b(true);
      ats $$6 = $$0.E_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      if (this.gt() == null) {
         this.a(bkv.a, new clj(clm.pa));
      }
   }

   @Override
   public boolean s(bkq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof blg && ((blg)$$0).eT() == bll.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   public void b(@Nullable ur $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected aqq y() {
      return aqr.zG;
   }

   @Override
   protected aqq m_() {
      return aqr.zI;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.zJ;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      clj $$2 = new clj(clm.pa);
      cfb $$3 = this.gt();
      int $$4 = 1;
      if ($$0 > $$3.a(biu.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.ag.i() <= $$3.w();
      if ($$5) {
         Map<cpu, Integer> $$6 = Maps.newHashMap();
         $$6.put(cpy.n, $$4);
         cpw.a($$6, $$2);
      }

      this.a(bkv.a, $$2);
   }

   static class a extends brl {
      public a(bli $$0) {
         super($$0, 6, cbx.e);
         this.a(EnumSet.of(bsb.a.a));
      }

      @Override
      public boolean b() {
         cbx $$0 = (cbx)this.d;
         return $$0.gu() && super.b();
      }

      @Override
      public boolean a() {
         cbx $$0 = (cbx)this.d;
         return $$0.gu() && $$0.ag.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.o(0);
      }
   }

   static class b extends btu<blg> {
      public b(cbx $$0) {
         super($$0, blg.class, 0, true, true, blg::fA);
      }

      @Override
      public boolean a() {
         return ((cbx)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.o(0);
      }
   }
}
