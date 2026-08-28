import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cls extends ckk {
   private static final String b = "Johnny";
   static final Predicate<brp> c = $$0 -> $$0 == brp.c || $$0 == brp.d;
   boolean bY;

   public cls(bty<? extends cls> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new cls.a(this));
      this.bS.a(2, new ckk.b(this));
      this.bS.a(3, new cpm.a(this, 10.0F));
      this.bS.a(4, new cbu(this, 1.0, false));
      this.bT.a(1, new cdc(this, cpm.class).a());
      this.bT.a(2, new cdd<>(this, cnx.class, true));
      this.bT.a(3, new cdd<>(this, cnf.class, true));
      this.bT.a(3, new cdd<>(this, cgp.class, true));
      this.bT.a(4, new cls.b(this));
      this.bS.a(8, new cch(this, 0.6));
      this.bS.a(9, new cbs(this, cnx.class, 3.0F, 1.0F));
      this.bS.a(10, new cbs(this, bup.class, 8.0F));
   }

   @Override
   protected void ac() {
      if (!this.gd() && cfi.a(this)) {
         boolean $$0 = ((arj)this.dS()).e(this.ds());
         ((cdx)this.P()).b($$0);
      }

      super.ac();
   }

   public static bvt.a t() {
      return cld.gu().a(bvu.v, 0.35F).a(bvu.m, 12.0).a(bvu.s, 24.0).a(bvu.c, 5.0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.bY) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ckk.a q() {
      if (this.gf()) {
         return ckk.a.b;
      } else {
         return this.gH() ? ckk.a.g : ckk.a.a;
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bY = $$0.q("Johnny");
      }
   }

   @Override
   public awf ai_() {
      return awg.Bt;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      bvf $$4 = super.a($$0, $$1, $$2, $$3);
      ((cdx)this.P()).b(true);
      azn $$5 = $$0.D_();
      this.a($$5, $$1);
      this.a($$0, $$5, $$1);
      return $$4;
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      if (this.gC() == null) {
         this.a(btz.a, new cvs(cvw.pf));
      }
   }

   @Override
   public void b(@Nullable xe $$0) {
      super.b($$0);
      if (!this.bY && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bY = true;
      }
   }

   @Override
   protected awf w() {
      return awg.Bs;
   }

   @Override
   protected awf o_() {
      return awg.Bu;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.Bv;
   }

   @Override
   public void a(arj $$0, int $$1, boolean $$2) {
      cvs $$3 = new cvs(cvw.pf);
      cpl $$4 = this.gC();
      boolean $$5 = this.af.i() <= $$4.v();
      if ($$5) {
         ald<dcv> $$6 = $$1 > $$4.a(brp.c) ? ddb.f : ddb.e;
         dbp.a($$3, $$0.G_(), $$6, $$0.d_(this.ds()), this.af);
      }

      this.a(btz.a, $$3);
   }

   static class a extends cau {
      public a(bup $$0) {
         super($$0, 6, cls.c);
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean c() {
         cls $$0 = (cls)this.d;
         return $$0.gF() && super.c();
      }

      @Override
      public boolean b() {
         cls $$0 = (cls)this.d;
         return $$0.gF() && $$0.af.a(b(10)) == 0 && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.d.o(0);
      }
   }

   static class b extends cdd<bun> {
      public b(cls $$0) {
         super($$0, bun.class, 0, true, true, bun::fI);
      }

      @Override
      public boolean b() {
         return ((cls)this.e).bY && super.b();
      }

      @Override
      public void d() {
         super.d();
         this.e.o(0);
      }
   }
}
