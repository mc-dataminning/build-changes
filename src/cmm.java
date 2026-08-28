import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmm extends cle {
   private static final String a = "Johnny";
   static final Predicate<bsg> b = $$0 -> $$0 == bsg.c || $$0 == bsg.d;
   boolean bY;

   public cmm(bur<? extends cmm> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cby(this));
      this.bS.a(1, new cbl<>(this, cnb.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cmm.a(this));
      this.bS.a(3, new cle.b(this));
      this.bS.a(4, new cqk.a(this, 10.0F));
      this.bS.a(5, new cco(this, 1.0, false));
      this.bT.a(1, new cdw(this, cqk.class).a());
      this.bT.a(2, new cdx<>(this, cow.class, true));
      this.bT.a(3, new cdx<>(this, coc.class, true));
      this.bT.a(3, new cdx<>(this, chj.class, true));
      this.bT.a(4, new cmm.b(this));
      this.bS.a(8, new cdb(this, 0.6));
      this.bS.a(9, new ccm(this, cow.class, 3.0F, 1.0F));
      this.bS.a(10, new ccm(this, bvi.class, 8.0F));
   }

   @Override
   protected void a(ard $$0) {
      if (!this.gf() && cgc.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cer)this.P()).b($$1);
      }

      super.a($$0);
   }

   public static bwn.a p() {
      return clx.gx().a(bwo.v, 0.35F).a(bwo.m, 12.0).a(bwo.s, 24.0).a(bwo.c, 5.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cle.a m() {
      if (this.gh()) {
         return cle.a.b;
      } else {
         return this.gK() ? cle.a.g : cle.a.a;
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
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      bvz $$4 = super.a($$0, $$1, $$2, $$3);
      ((cer)this.P()).b(true);
      azh $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      if (this.gF() == null) {
         this.a(bus.a, new cwo(cws.pJ));
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
   protected avz e(bta $$0) {
      return awa.Cd;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cwo $$3 = new cwo(cws.pJ);
      cqj $$4 = this.gF();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         aku<deg> $$6 = $$1 > $$4.a(bsg.c) ? dem.f : dem.e;
         dda.a($$3, $$0.K_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bus.a, $$3);
   }

   static class a extends cbo {
      public a(bvi $$0) {
         super($$0, 6, cmm.b);
         this.a(EnumSet.of(cce.a.a));
      }

      @Override
      public boolean c() {
         cmm $$0 = (cmm)this.d;
         return $$0.gI() && super.c();
      }

      @Override
      public boolean b() {
         cmm $$0 = (cmm)this.d;
         return $$0.gI() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cdx<bvg> {
      public b(cmm $$0) {
         super($$0, bvg.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cmm)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
