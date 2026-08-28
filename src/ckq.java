import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ckq extends cji {
   private static final String b = "Johnny";
   static final Predicate<bqn> e = $$0 -> $$0 == bqn.c || $$0 == bqn.d;
   boolean ca;

   public ckq(bsw<? extends ckq> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cae(this));
      this.bU.a(1, new ckq.a(this));
      this.bU.a(2, new cji.b(this));
      this.bU.a(3, new coh.a(this, 10.0F));
      this.bU.a(4, new cau(this, 1.0, false));
      this.bV.a(1, new ccc(this, coh.class).a());
      this.bV.a(2, new ccd<>(this, cmv.class, true));
      this.bV.a(3, new ccd<>(this, cmd.class, true));
      this.bV.a(3, new ccd<>(this, cfo.class, true));
      this.bV.a(4, new ckq.b(this));
      this.bU.a(8, new cbh(this, 0.6));
      this.bU.a(9, new cas(this, cmv.class, 3.0F, 1.0F));
      this.bU.a(10, new cas(this, btn.class, 8.0F));
   }

   @Override
   protected void Z() {
      if (!this.gb() && cei.a(this)) {
         boolean $$0 = ((aqt)this.dQ()).e(this.dq());
         ((ccx)this.J()).b($$0);
      }

      super.Z();
   }

   public static but.a t() {
      return ckb.gs().a(buu.v, 0.35F).a(buu.m, 12.0).a(buu.s, 24.0).a(buu.c, 5.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.ca) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cji.a s() {
      if (this.gd()) {
         return cji.a.b;
      } else {
         return this.gF() ? cji.a.g : cji.a.a;
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.ca = $$0.q("Johnny");
      }
   }

   @Override
   public avn ae_() {
      return avo.Bn;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      buf $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccx)this.J()).b(true);
      ayv $$5 = $$0.E_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      if (this.gA() == null) {
         this.a(bsx.a, new cuo(cur.pe));
      }
   }

   @Override
   public void b(@Nullable wy $$0) {
      super.b($$0);
      if (!this.ca && $$0 != null && $$0.getString().equals("Johnny")) {
         this.ca = true;
      }
   }

   @Override
   protected avn v() {
      return avo.Bm;
   }

   @Override
   protected avn n_() {
      return avo.Bo;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.Bp;
   }

   @Override
   public void a(aqt $$0, int $$1, boolean $$2) {
      cuo $$3 = new cuo(cur.pe);
      cog $$4 = this.gA();
      boolean $$5 = this.ah.i() <= $$4.v();
      if ($$5) {
         akp<dbh> $$6 = $$1 > $$4.a(bqn.c) ? dbn.f : dbn.e;
         dac.a($$3, $$0.H_(), $$6, $$0.d_(this.dq()), this.ah);
      }

      this.a(bsx.a, $$3);
   }

   static class a extends bzu {
      public a(btn $$0) {
         super($$0, 6, ckq.e);
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean c() {
         ckq $$0 = (ckq)this.d;
         return $$0.gD() && super.c();
      }

      @Override
      public boolean b() {
         ckq $$0 = (ckq)this.d;
         return $$0.gD() && $$0.ah.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends ccd<btl> {
      public b(ckq $$0) {
         super($$0, btl.class, 0, true, true, btl::fE);
      }

      @Override
      public boolean b() {
         return ((ckq)this.e).ca && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
