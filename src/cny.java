import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cny extends cmq {
   private static final String a = "Johnny";
   static final Predicate<btn> b = $$0 -> $$0 == btn.c || $$0 == btn.d;
   boolean bE;

   public cny(bwb<? extends cny> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new ccu<>(this, coo.class, 8.0F, 1.0, 1.2));
      this.bB.a(2, new cny.a(this));
      this.bB.a(3, new cmq.b(this));
      this.bB.a(4, new crw.a(this, 10.0F));
      this.bB.a(5, new cdx(this, 1.0, false));
      this.bC.a(1, new cff(this, crw.class).a());
      this.bC.a(2, new cfg<>(this, cqi.class, true));
      this.bC.a(3, new cfg<>(this, cpp.class, true));
      this.bC.a(3, new cfg<>(this, cis.class, true));
      this.bC.a(4, new cny.b(this));
      this.bB.a(8, new cek(this, 0.6));
      this.bB.a(9, new cdv(this, cqi.class, 3.0F, 1.0F));
      this.bB.a(10, new cdv(this, bwt.class, 8.0F));
   }

   @Override
   protected void a(arn $$0) {
      if (!this.gf() && chl.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cga)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.v, 0.35F).a(bxx.m, 12.0).a(bxx.s, 24.0).a(bxx.c, 5.0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.bE) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cmq.a j() {
      if (this.gh()) {
         return cmq.a.b;
      } else {
         return this.gG() ? cmq.a.g : cmq.a.a;
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bE = $$0.q("Johnny");
      }
   }

   @Override
   public awj ad_() {
      return awk.Cl;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      bxj $$4 = super.a($$0, $$1, $$2, $$3);
      ((cga)this.O()).b(true);
      azs $$5 = $$0.C_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      if (this.gB() == null) {
         this.a(bwc.a, new cxy(cyc.pN));
      }
   }

   @Override
   public void b(@Nullable wv $$0) {
      super.b($$0);
      if (!this.bE && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bE = true;
      }
   }

   @Override
   protected awj u() {
      return awk.Ck;
   }

   @Override
   protected awj l_() {
      return awk.Cm;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.Cn;
   }

   @Override
   public void a(arn $$0, int $$1, boolean $$2) {
      cxy $$3 = new cxy(cyc.pN);
      crv $$4 = this.gB();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         alc<dfp> $$6 = $$1 > $$4.a(btn.c) ? dfv.f : dfv.e;
         dej.a($$3, $$0.F_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bwc.a, $$3);
   }

   static class a extends ccx {
      public a(bwt $$0) {
         super($$0, 6, cny.b);
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean c() {
         cny $$0 = (cny)this.d;
         return $$0.gE() && super.c();
      }

      @Override
      public boolean b() {
         cny $$0 = (cny)this.d;
         return $$0.gE() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cfg<bwr> {
      public b(cny $$0) {
         super($$0, bwr.class, 0, true, true, ($$0x, $$1) -> $$0x.fL());
      }

      @Override
      public boolean b() {
         return ((cny)this.e).bE && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
