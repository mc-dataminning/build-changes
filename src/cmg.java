import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmg extends cky {
   private static final String b = "Johnny";
   static final Predicate<bsa> c = $$0 -> $$0 == bsa.c || $$0 == bsa.d;
   boolean bY;

   public cmg(bul<? extends cmg> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new cmg.a(this));
      this.bS.a(2, new cky.b(this));
      this.bS.a(3, new cqb.a(this, 10.0F));
      this.bS.a(4, new cci(this, 1.0, false));
      this.bT.a(1, new cdq(this, cqb.class).a());
      this.bT.a(2, new cdr<>(this, com.class, true));
      this.bT.a(3, new cdr<>(this, cnt.class, true));
      this.bT.a(3, new cdr<>(this, chd.class, true));
      this.bT.a(4, new cmg.b(this));
      this.bS.a(8, new ccv(this, 0.6));
      this.bS.a(9, new ccg(this, com.class, 3.0F, 1.0F));
      this.bS.a(10, new ccg(this, bvc.class, 8.0F));
   }

   @Override
   protected void ac() {
      if (!this.gh() && cfw.a(this)) {
         boolean $$0 = ((arn)this.dX()).e(this.dx());
         ((cel)this.P()).b($$0);
      }

      super.ac();
   }

   public static bwh.a t() {
      return clr.gA().a(bwi.v, 0.35F).a(bwi.m, 12.0).a(bwi.s, 24.0).a(bwi.c, 5.0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cky.a q() {
      if (this.gj()) {
         return cky.a.b;
      } else {
         return this.gN() ? cky.a.g : cky.a.a;
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public awk aj_() {
      return awl.Br;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      bvt $$4 = super.a($$0, $$1, $$2, $$3);
      ((cel)this.P()).b(true);
      azs $$5 = $$0.E_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azs $$0, bsb $$1) {
      if (this.gI() == null) {
         this.a(bum.a, new cwb(cwf.pf));
      }
   }

   @Override
   public void b(@Nullable xi $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected awk w() {
      return awl.Bq;
   }

   @Override
   protected awk o_() {
      return awl.Bs;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.Bt;
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
      cwb $$3 = new cwb(cwf.pf);
      cqa $$4 = this.gI();
      boolean $$5 = this.af.i() <= $$4.v();
      if ($$5) {
         alh<dda> $$6 = $$1 > $$4.a(bsa.c) ? ddg.f : ddg.e;
         dbu.a($$3, $$0.H_(), $$6, $$0.d_(this.dx()), this.af);
      }

      this.a(bum.a, $$3);
   }

   static class a extends cbi {
      public a(bvc $$0) {
         super($$0, 6, cmg.c);
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean c() {
         cmg $$0 = (cmg)this.d;
         return $$0.gL() && super.c();
      }

      @Override
      public boolean b() {
         cmg $$0 = (cmg)this.d;
         return $$0.gL() && $$0.af.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends cdr<bva> {
      public b(cmg $$0) {
         super($$0, bva.class, 0, true, true, bva::fO);
      }

      @Override
      public boolean b() {
         return ((cmg)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
