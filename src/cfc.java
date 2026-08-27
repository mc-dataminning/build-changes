import com.google.common.collect.Maps;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfc extends cdv {
   private static final String b = "Johnny";
   static final Predicate<blr> e = $$0 -> $$0 == blr.c || $$0 == blr.d;
   boolean bT;

   public cfc(bnu<? extends cfc> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new buv(this));
      this.bO.a(1, new cfc.a(this));
      this.bO.a(2, new cdv.b(this));
      this.bO.a(3, new cir.a(this, 10.0F));
      this.bO.a(4, new bvl(this, 1.0, false));
      this.bP.a(1, new bwt(this, cir.class).a());
      this.bP.a(2, new bwu<>(this, chh.class, true));
      this.bP.a(3, new bwu<>(this, cgp.class, true));
      this.bP.a(3, new bwu<>(this, caf.class, true));
      this.bP.a(4, new cfc.b(this));
      this.bO.a(8, new bvy(this, 0.6));
      this.bO.a(9, new bvj(this, chh.class, 3.0F, 1.0F));
      this.bO.a(10, new bvj(this, boi.class, 8.0F));
   }

   @Override
   protected void aa() {
      if (!this.fW() && byz.a(this)) {
         boolean $$0 = ((aov)this.dM()).e(this.dm());
         ((bxo)this.N()).b($$0);
      }

      super.aa();
   }

   public static bpk.a w() {
      return cen.gm().a(bpl.o, 0.35F).a(bpl.i, 12.0).a(bpl.n, 24.0).a(bpl.c, 5.0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      if (this.bT) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cdv.a u() {
      if (this.fY()) {
         return cdv.a.b;
      } else {
         return this.gx() ? cdv.a.g : cdv.a.a;
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bT = $$0.q("Johnny");
      }
   }

   @Override
   public atj ag_() {
      return atk.Ar;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      boy $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      ((bxo)this.N()).b(true);
      awo $$6 = $$0.F_();
      this.a($$6, $$1);
      this.b($$6, $$1);
      return $$5;
   }

   @Override
   protected void a(awo $$0, bls $$1) {
      if (this.gu() == null) {
         this.a(bnv.a, new coz(cpc.pc));
      }
   }

   @Override
   public void b(@Nullable vq $$0) {
      super.b($$0);
      if (!this.bT && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bT = true;
      }
   }

   @Override
   protected atj y() {
      return atk.Aq;
   }

   @Override
   protected atj n_() {
      return atk.As;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.At;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      coz $$2 = new coz(cpc.pc);
      ciq $$3 = this.gu();
      int $$4 = 1;
      if ($$0 > $$3.a(blr.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.af.i() <= $$3.w();
      if ($$5) {
         Map<cti, Integer> $$6 = Maps.newHashMap();
         $$6.put(ctl.n, $$4);
         ctj.a($$6, $$2);
      }

      this.a(bnv.a, $$2);
   }

   static class a extends bul {
      public a(boi $$0) {
         super($$0, 6, cfc.e);
         this.a(EnumSet.of(bvb.a.a));
      }

      @Override
      public boolean b() {
         cfc $$0 = (cfc)this.d;
         return $$0.gv() && super.b();
      }

      @Override
      public boolean a() {
         cfc $$0 = (cfc)this.d;
         return $$0.gv() && $$0.af.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bwu<bog> {
      public b(cfc $$0) {
         super($$0, bog.class, 0, true, true, bog::fz);
      }

      @Override
      public boolean a() {
         return ((cfc)this.e).bT && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
