import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cpo extends cof {
   private static final String a = "Johnny";
   static final Predicate<buo> b = $$0 -> $$0 == buo.c || $$0 == buo.d;
   private static final boolean e = false;
   boolean f = false;

   public cpo(bxc<? extends cpo> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cdx<>(this, cqd.class, 8.0F, 1.0, 1.2));
      this.bF.a(2, new cpo.a(this));
      this.bF.a(3, new cof.b(this));
      this.bF.a(4, new cto.a(this, 10.0F));
      this.bF.a(5, new cfa(this, 1.0, false));
      this.bG.a(1, new cgi(this, cto.class).a());
      this.bG.a(2, new cgj<>(this, crx.class, true));
      this.bG.a(3, new cgj<>(this, cre.class, true));
      this.bG.a(3, new cgj<>(this, cka.class, true));
      this.bG.a(4, new cpo.b(this));
      this.bF.a(8, new cfn(this, 0.6));
      this.bF.a(9, new cey(this, crx.class, 3.0F, 1.0F));
      this.bF.a(10, new cey(this, bxw.class, 8.0F));
   }

   @Override
   protected void a(ars $$0) {
      if (!this.gj() && cio.a(this)) {
         boolean $$1 = $$0.e(this.dv());
         ((chd)this.O()).b($$1);
      }

      super.a($$0);
   }

   public static byz.a m() {
      return coz.gx().a(bza.v, 0.35F).a(bza.m, 12.0).a(bza.s, 24.0).a(bza.c, 5.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.f) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cof.a j() {
      if (this.gl()) {
         return cof.a.b;
      } else {
         return this.gK() ? cof.a.g : cof.a.a;
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.f = $$0.b("Johnny", false);
   }

   @Override
   public awo ai_() {
      return awp.Cr;
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      bym $$4 = super.a($$0, $$1, $$2, $$3);
      ((chd)this.O()).b(true);
      azx $$5 = $$0.G_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      if (this.gF() == null) {
         this.a(bxd.a, new czy(dac.pS));
      }
   }

   @Override
   public void b(@Nullable xa $$0) {
      super.b($$0);
      if (!this.f && $$0 != null && $$0.getString().equals("Johnny")) {
         this.f = true;
      }
   }

   @Override
   protected awo u() {
      return awp.Cq;
   }

   @Override
   protected awo l_() {
      return awp.Cs;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.Ct;
   }

   @Override
   public void a(ars $$0, int $$1, boolean $$2) {
      czy $$3 = new czy(dac.pS);
      ctn $$4 = this.gF();
      boolean $$5 = this.ae.i() <= $$4.s();
      if ($$5) {
         alh<dht> $$6 = $$1 > $$4.a(buo.c) ? dhz.f : dhz.e;
         dgn.a($$3, $$0.J_(), $$6, $$0.d_(this.dv()), this.ae);
      }

      this.a(bxd.a, $$3);
   }

   static class a extends cea {
      public a(bxw $$0) {
         super($$0, 6, cpo.b);
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean c() {
         cpo $$0 = (cpo)this.d;
         return $$0.gI() && super.c();
      }

      @Override
      public boolean b() {
         cpo $$0 = (cpo)this.d;
         return $$0.gI() && $$0.ae.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.n(0);
      }
   }

   static class b extends cgj<bxu> {
      public b(cpo $$0) {
         super($$0, bxu.class, 0, true, true, ($$0x, $$1) -> $$0x.fM());
      }

      @Override
      public boolean b() {
         return ((cpo)this.e).f && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.n(0);
      }
   }
}
