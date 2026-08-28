import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmn extends clf {
   private static final String a = "Johnny";
   static final Predicate<bsh> b = $$0 -> $$0 == bsh.c || $$0 == bsh.d;
   boolean bY;

   public cmn(bus<? extends cmn> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new cmn.a(this));
      this.bS.a(2, new clf.b(this));
      this.bS.a(3, new cqi.a(this, 10.0F));
      this.bS.a(4, new ccp(this, 1.0, false));
      this.bT.a(1, new cdx(this, cqi.class).a());
      this.bT.a(2, new cdy<>(this, cou.class, true));
      this.bT.a(3, new cdy<>(this, coa.class, true));
      this.bT.a(3, new cdy<>(this, chk.class, true));
      this.bT.a(4, new cmn.b(this));
      this.bS.a(8, new cdc(this, 0.6));
      this.bS.a(9, new ccn(this, cou.class, 3.0F, 1.0F));
      this.bS.a(10, new ccn(this, bvj.class, 8.0F));
   }

   @Override
   protected void a(arp $$0) {
      if (!this.fZ() && cgd.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((ces)this.L()).b($$1);
      }

      super.a($$0);
   }

   public static bwo.a q() {
      return cly.gs().a(bwp.v, 0.35F).a(bwp.m, 12.0).a(bwp.s, 24.0).a(bwp.c, 5.0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clf.a n() {
      if (this.gb()) {
         return clf.a.b;
      } else {
         return this.gF() ? clf.a.g : clf.a.a;
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public awm aj_() {
      return awn.Br;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      bwa $$4 = super.a($$0, $$1, $$2, $$3);
      ((ces)this.L()).b(true);
      azu $$5 = $$0.G_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azu $$0, bsi $$1) {
      if (this.gA() == null) {
         this.a(but.a, new cwm(cwq.pf));
      }
   }

   @Override
   public void b(@Nullable xj $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected awm t() {
      return awn.Bq;
   }

   @Override
   protected awm n_() {
      return awn.Bs;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.Bt;
   }

   @Override
   public void a(arp $$0, int $$1, boolean $$2) {
      cwm $$3 = new cwm(cwq.pf);
      cqh $$4 = this.gA();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         ali<ddl> $$6 = $$1 > $$4.a(bsh.c) ? ddr.f : ddr.e;
         dcf.a($$3, $$0.J_(), $$6, $$0.d_(this.dv()), this.ae);
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
         return $$0.gD() && super.c();
      }

      @Override
      public boolean b() {
         cmn $$0 = (cmn)this.d;
         return $$0.gD() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cdy<bvh> {
      public b(cmn $$0) {
         super($$0, bvh.class, 0, true, true, ($$0x, $$1) -> $$0x.fK());
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
