import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cks extends cjk {
   private static final String b = "Johnny";
   static final Predicate<bqo> e = $$0 -> $$0 == bqo.c || $$0 == bqo.d;
   boolean cc;

   public cks(bsx<? extends cks> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bW.a(0, new cag(this));
      this.bW.a(1, new cks.a(this));
      this.bW.a(2, new cjk.b(this));
      this.bW.a(3, new coj.a(this, 10.0F));
      this.bW.a(4, new caw(this, 1.0, false));
      this.bX.a(1, new cce(this, coj.class).a());
      this.bX.a(2, new ccf<>(this, cmx.class, true));
      this.bX.a(3, new ccf<>(this, cmf.class, true));
      this.bX.a(3, new ccf<>(this, cfq.class, true));
      this.bX.a(4, new cks.b(this));
      this.bW.a(8, new cbj(this, 0.6));
      this.bW.a(9, new cau(this, cmx.class, 3.0F, 1.0F));
      this.bW.a(10, new cau(this, btp.class, 8.0F));
   }

   @Override
   protected void ab() {
      if (!this.fZ() && cek.a(this)) {
         boolean $$0 = ((aqu)this.dO()).e(this.do());
         ((ccz)this.N()).b($$0);
      }

      super.ab();
   }

   public static buv.a t() {
      return ckd.gq().a(buw.v, 0.35F).a(buw.m, 12.0).a(buw.s, 24.0).a(buw.c, 5.0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.cc) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public cjk.a s() {
      if (this.gb()) {
         return cjk.a.b;
      } else {
         return this.gD() ? cjk.a.g : cjk.a.a;
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.cc = $$0.q("Johnny");
      }
   }

   @Override
   public avo ai_() {
      return avp.Bn;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      buh $$4 = super.a($$0, $$1, $$2, $$3);
      ((ccz)this.N()).b(true);
      ayw $$5 = $$0.E_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      if (this.gy() == null) {
         this.a(bsy.a, new cuq(cut.pe));
      }
   }

   @Override
   public void b(@Nullable wz $$0) {
      super.b($$0);
      if (!this.cc && $$0 != null && $$0.getString().equals("Johnny")) {
         this.cc = true;
      }
   }

   @Override
   protected avo v() {
      return avp.Bm;
   }

   @Override
   protected avo n_() {
      return avp.Bo;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.Bp;
   }

   @Override
   public void a(aqu $$0, int $$1, boolean $$2) {
      cuq $$3 = new cuq(cut.pe);
      coi $$4 = this.gy();
      boolean $$5 = this.ah.i() <= $$4.v();
      if ($$5) {
         akq<dbj> $$6 = $$1 > $$4.a(bqo.c) ? dbp.f : dbp.e;
         dae.a($$3, $$0.H_(), $$6, $$0.d_(this.do()), this.ah);
      }

      this.a(bsy.a, $$3);
   }

   static class a extends bzw {
      public a(btp $$0) {
         super($$0, 6, cks.e);
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean c() {
         cks $$0 = (cks)this.d;
         return $$0.gB() && super.c();
      }

      @Override
      public boolean b() {
         cks $$0 = (cks)this.d;
         return $$0.gB() && $$0.ah.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends ccf<btn> {
      public b(cks $$0) {
         super($$0, btn.class, 0, true, true, btn::fD);
      }

      @Override
      public boolean b() {
         return ((cks)this.e).cc && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
