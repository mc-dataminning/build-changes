import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmn extends clf {
   private static final String a = "Johnny";
   static final Predicate<bsh> b = $$0 -> $$0 == bsh.c || $$0 == bsh.d;
   boolean bY;

   public cmn(bus<? extends cmn> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new cbm<>(this, cnc.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cmn.a(this));
      this.bS.a(3, new clf.b(this));
      this.bS.a(4, new cql.a(this, 10.0F));
      this.bS.a(5, new ccp(this, 1.0, false));
      this.bT.a(1, new cdx(this, cql.class).a());
      this.bT.a(2, new cdy<>(this, cox.class, true));
      this.bT.a(3, new cdy<>(this, cod.class, true));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(4, new cmn.b(this));
      this.bS.a(8, new cdc(this, 0.6));
      this.bS.a(9, new ccn(this, cox.class, 3.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
   }

   @Override
   protected void a(ard $$0) {
      if (!this.gf() && cgd.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((ces)this.P()).b($$1);
      }

      super.a($$0);
   }

   public static bwo.a p() {
      return cly.gx().a(bwp.v, 0.35F).a(bwp.m, 12.0).a(bwp.s, 24.0).a(bwp.c, 5.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clf.a m() {
      if (this.gh()) {
         return clf.a.b;
      } else {
         return this.gK() ? clf.a.g : clf.a.a;
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public avz aj_() {
      return awa.Cb;
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bwa $$4 = super.a($$0, $$1, $$2, $$3);
      ((ces)this.P()).b(true);
      azh $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bsi $$1) {
      if (this.gF() == null) {
         this.a(but.a, new cwp(cwt.pJ));
      }
   }

   @Override
   public void b(@Nullable wp $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected avz u() {
      return awa.Ca;
   }

   @Override
   protected avz o_() {
      return awa.Cc;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.Cd;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cwp $$3 = new cwp(cwt.pJ);
      cqk $$4 = this.gF();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         aku<deh> $$6 = $$1 > $$4.a(bsh.c) ? den.f : den.e;
         ddb.a($$3, $$0.K_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(but.a, $$3);
   }

   static class a extends cbp {
      public a(bvj $$0) {
         super($$0, 6, cmn.b);
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean c() {
         cmn $$0 = (cmn)this.d;
         return $$0.gI() && super.c();
      }

      @Override
      public boolean b() {
         cmn $$0 = (cmn)this.d;
         return $$0.gI() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cdy<bvh> {
      public b(cmn $$0) {
         super($$0, bvh.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cmn)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
