import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmo extends clg {
   private static final String a = "Johnny";
   static final Predicate<bsi> b = $$0 -> $$0 == bsi.c || $$0 == bsi.d;
   boolean bY;

   public cmo(but<? extends cmo> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cca(this));
      this.bS.a(1, new cbn<>(this, cnd.class, 8.0F, 1.0, 1.2));
      this.bS.a(2, new cmo.a(this));
      this.bS.a(3, new clg.b(this));
      this.bS.a(4, new cqm.a(this, 10.0F));
      this.bS.a(5, new ccq(this, 1.0, false));
      this.bT.a(1, new cdy(this, cqm.class).a());
      this.bT.a(2, new cdz<>(this, coy.class, true));
      this.bT.a(3, new cdz<>(this, coe.class, true));
      this.bT.a(3, new cdz<>(this, chl.class, true));
      this.bT.a(4, new cmo.b(this));
      this.bS.a(8, new cdd(this, 0.6));
      this.bS.a(9, new cco(this, coy.class, 3.0F, 1.0F));
      this.bS.a(10, new cco(this, bvk.class, 8.0F));
   }

   @Override
   protected void a(ard $$0) {
      if (!this.gf() && cge.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((cet)this.P()).b($$1);
      }

      super.a($$0);
   }

   public static bwp.a p() {
      return clz.gx().a(bwq.v, 0.35F).a(bwq.m, 12.0).a(bwq.s, 24.0).a(bwq.c, 5.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clg.a m() {
      if (this.gh()) {
         return clg.a.b;
      } else {
         return this.gK() ? clg.a.g : clg.a.a;
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
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      bwb $$4 = super.a($$0, $$1, $$2, $$3);
      ((cet)this.P()).b(true);
      azh $$5 = $$0.H_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azh $$0, bsj $$1) {
      if (this.gF() == null) {
         this.a(buu.a, new cwq(cwu.pJ));
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
   protected avz e(btc $$0) {
      return awa.Cd;
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
      cwq $$3 = new cwq(cwu.pJ);
      cql $$4 = this.gF();
      boolean $$5 = this.ae.i() <= $$4.v();
      if ($$5) {
         aku<dei> $$6 = $$1 > $$4.a(bsi.c) ? deo.f : deo.e;
         ddc.a($$3, $$0.K_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(buu.a, $$3);
   }

   static class a extends cbq {
      public a(bvk $$0) {
         super($$0, 6, cmo.b);
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean c() {
         cmo $$0 = (cmo)this.d;
         return $$0.gI() && super.c();
      }

      @Override
      public boolean b() {
         cmo $$0 = (cmo)this.d;
         return $$0.gI() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cdz<bvi> {
      public b(cmo $$0) {
         super($$0, bvi.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cmo)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
