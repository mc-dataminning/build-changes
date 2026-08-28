import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cmk extends clc {
   private static final String b = "Johnny";
   static final Predicate<bse> c = $$0 -> $$0 == bse.c || $$0 == bse.d;
   boolean bY;

   public cmk(bup<? extends cmk> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new cmk.a(this));
      this.bS.a(2, new clc.b(this));
      this.bS.a(3, new cqf.a(this, 10.0F));
      this.bS.a(4, new ccm(this, 1.0, false));
      this.bT.a(1, new cdu(this, cqf.class).a());
      this.bT.a(2, new cdv<>(this, cor.class, true));
      this.bT.a(3, new cdv<>(this, cnx.class, true));
      this.bT.a(3, new cdv<>(this, chh.class, true));
      this.bT.a(4, new cmk.b(this));
      this.bS.a(8, new ccz(this, 0.6));
      this.bS.a(9, new cck(this, cor.class, 3.0F, 1.0F));
      this.bS.a(10, new cck(this, bvg.class, 8.0F));
   }

   @Override
   protected void ac() {
      if (!this.gi() && cga.a(this)) {
         boolean $$0 = ((arq)this.dY()).e(this.dy());
         ((cep)this.P()).b($$0);
      }

      super.ac();
   }

   public static bwl.a t() {
      return clv.gB().a(bwm.v, 0.35F).a(bwm.m, 12.0).a(bwm.s, 24.0).a(bwm.c, 5.0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public clc.a q() {
      if (this.gk()) {
         return clc.a.b;
      } else {
         return this.gO() ? clc.a.g : clc.a.a;
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public awn aj_() {
      return awo.Br;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      bvx $$4 = super.a($$0, $$1, $$2, $$3);
      ((cep)this.P()).b(true);
      azv $$5 = $$0.E_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      if (this.gJ() == null) {
         this.a(buq.a, new cwf(cwj.pf));
      }
   }

   @Override
   public void b(@Nullable xl $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected awn w() {
      return awo.Bq;
   }

   @Override
   protected awn o_() {
      return awo.Bs;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.Bt;
   }

   @Override
   public void a(arq $$0, int $$1, boolean $$2) {
      cwf $$3 = new cwf(cwj.pf);
      cqe $$4 = this.gJ();
      boolean $$5 = this.af.i() <= $$4.v();
      if ($$5) {
         alk<dde> $$6 = $$1 > $$4.a(bse.c) ? ddk.f : ddk.e;
         dby.a($$3, $$0.H_(), $$6, $$0.d_(this.dy()), this.af);
      }

      this.a(buq.a, $$3);
   }

   static class a extends cbm {
      public a(bvg $$0) {
         super($$0, 6, cmk.c);
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean c() {
         cmk $$0 = (cmk)this.d;
         return $$0.gM() && super.c();
      }

      @Override
      public boolean b() {
         cmk $$0 = (cmk)this.d;
         return $$0.gM() && $$0.af.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends cdv<bve> {
      public b(cmk $$0) {
         super($$0, bve.class, 0, true, true, bve::fP);
      }

      @Override
      public boolean b() {
         return ((cmk)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
