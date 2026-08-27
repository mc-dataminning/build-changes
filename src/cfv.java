import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfv extends ceo {
   private static final String b = "Johnny";
   static final Predicate<bmi> e = $$0 -> $$0 == bmi.c || $$0 == bmi.d;
   boolean bV;

   public cfv(bol<? extends cfv> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new cfv.a(this));
      this.bP.a(2, new ceo.b(this));
      this.bP.a(3, new cjk.a(this, 10.0F));
      this.bP.a(4, new bwe(this, 1.0, false));
      this.bQ.a(1, new bxm(this, cjk.class).a());
      this.bQ.a(2, new bxn<>(this, cia.class, true));
      this.bQ.a(3, new bxn<>(this, chi.class, true));
      this.bQ.a(3, new bxn<>(this, cay.class, true));
      this.bQ.a(4, new cfv.b(this));
      this.bP.a(8, new bwr(this, 0.6));
      this.bP.a(9, new bwc(this, cia.class, 3.0F, 1.0F));
      this.bP.a(10, new bwc(this, boz.class, 8.0F));
   }

   @Override
   protected void aa() {
      if (!this.gb() && bzs.a(this)) {
         boolean $$0 = ((apa)this.dJ()).e(this.dj());
         ((byh)this.N()).b($$0);
      }

      super.aa();
   }

   public static bqd.a w() {
      return cfg.gr().a(bqe.o, 0.35F).a(bqe.i, 12.0).a(bqe.n, 24.0).a(bqe.c, 5.0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      if (this.bV) {
         $$0.a("Johnny", true);
      }
   }

   @Override
   public ceo.a u() {
      if (this.gd()) {
         return ceo.a.b;
      } else {
         return this.gC() ? ceo.a.g : ceo.a.a;
      }
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("Johnny", 99)) {
         this.bV = $$0.q("Johnny");
      }
   }

   @Override
   public ato ag_() {
      return atp.AF;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      bpp $$4 = super.a($$0, $$1, $$2, $$3);
      ((byh)this.N()).b(true);
      awt $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return $$4;
   }

   @Override
   protected void a(awt $$0, bmj $$1) {
      if (this.gz() == null) {
         this.a(bom.a, new cpq(cpt.pc));
      }
   }

   @Override
   public void b(@Nullable vs $$0) {
      super.b($$0);
      if (!this.bV && $$0 != null && $$0.getString().equals("Johnny")) {
         this.bV = true;
      }
   }

   @Override
   protected ato y() {
      return atp.AE;
   }

   @Override
   protected ato n_() {
      return atp.AG;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.AH;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cpq $$2 = new cpq(cpt.pc);
      cjj $$3 = this.gz();
      int $$4 = 1;
      if ($$0 > $$3.a(bmi.c)) {
         $$4 = 2;
      }

      boolean $$5 = this.af.i() <= $$3.w();
      if ($$5) {
         $$2.a(cuc.n, $$4);
      }

      this.a(bom.a, $$2);
   }

   static class a extends bve {
      public a(boz $$0) {
         super($$0, 6, cfv.e);
         this.a(EnumSet.of(bvu.a.a));
      }

      @Override
      public boolean b() {
         cfv $$0 = (cfv)this.d;
         return $$0.gA() && super.b();
      }

      @Override
      public boolean a() {
         cfv $$0 = (cfv)this.d;
         return $$0.gA() && $$0.af.a(b(10)) == 0 && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.d.p(0);
      }
   }

   static class b extends bxn<box> {
      public b(cfv $$0) {
         super($$0, box.class, 0, true, true, box::fB);
      }

      @Override
      public boolean a() {
         return ((cfv)this.e).bV && super.a();
      }

      @Override
      public void c() {
         super.c();
         this.e.p(0);
      }
   }
}
