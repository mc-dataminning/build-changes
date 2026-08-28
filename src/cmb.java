import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmb extends ckt {
   private static final String b = "Johnny";
   static final Predicate<brv> c = $$0 -> $$0 == brv.c || $$0 == brv.d;
   boolean bY;

   public cmb(bug<? extends cmb> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new cmb.a(this));
      this.bS.a(2, new ckt.b(this));
      this.bS.a(3, new cpw.a(this, 10.0F));
      this.bS.a(4, new ccd(this, 1.0, false));
      this.bT.a(1, new cdl(this, cpw.class).a());
      this.bT.a(2, new cdm<>(this, coh.class, true));
      this.bT.a(3, new cdm<>(this, cno.class, true));
      this.bT.a(3, new cdm<>(this, cgy.class, true));
      this.bT.a(4, new cmb.b(this));
      this.bS.a(8, new ccq(this, 0.6));
      this.bS.a(9, new ccb(this, coh.class, 3.0F, 1.0F));
      this.bS.a(10, new ccb(this, bux.class, 8.0F));
   }

   @Override
   protected void ac() {
      if (!this.gi() && cfr.a(this)) {
         boolean $$0 = ((arm)this.dX()).e(this.dx());
         ((ceg)this.P()).b($$0);
      }

      super.ac();
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.v, 0.35F).a(bwd.m, 12.0).a(bwd.s, 24.0).a(bwd.c, 5.0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ckt.a q() {
      if (this.gk()) {
         return ckt.a.b;
      } else {
         return this.gO() ? ckt.a.g : ckt.a.a;
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public awj aj_() {
      return awk.Br;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      bvo $$4 = super.a($$0, $$1, $$2, $$3);
      ((ceg)this.P()).b(true);
      azr $$5 = $$0.E_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      if (this.gJ() == null) {
         this.a(buh.a, new cvx(cwb.pf));
      }
   }

   @Override
   public void b(@Nullable xh $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected awj w() {
      return awk.Bq;
   }

   @Override
   protected awj o_() {
      return awk.Bs;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.Bt;
   }

   @Override
   public void a(arm $$0, int $$1, boolean $$2) {
      cvx $$3 = new cvx(cwb.pf);
      cpv $$4 = this.gJ();
      boolean $$5 = this.af.i() <= $$4.v();
      if ($$5) {
         alg<dcu> $$6 = $$1 > $$4.a(brv.c) ? dda.f : dda.e;
         dbo.a($$3, $$0.H_(), $$6, $$0.d_(this.dx()), this.af);
      }

      this.a(buh.a, $$3);
   }

   static class a extends cbd {
      public a(bux $$0) {
         super($$0, 6, cmb.c);
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean c() {
         cmb $$0 = (cmb)this.d;
         return $$0.gM() && super.c();
      }

      @Override
      public boolean b() {
         cmb $$0 = (cmb)this.d;
         return $$0.gM() && $$0.af.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends cdm<buv> {
      public b(cmb $$0) {
         super($$0, buv.class, 0, true, true, buv::fO);
      }

      @Override
      public boolean b() {
         return ((cmb)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
