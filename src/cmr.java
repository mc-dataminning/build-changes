import java.util.UUID;
import javax.annotation.Nullable;

public class cmr extends cmp implements bvk {
   private static final bum c = buq.bQ.n().a(0.5F).b(0.97F);
   private static final aku cb = aku.b("attacking");
   private static final bwl cc = new bwl(cb, 0.05, bwl.a.a);
   private static final brt cd = baa.a(0, 1);
   private int ce;
   private static final brt cf = baa.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;
   private static final int ci = 10;
   private static final brt cj = baa.a(4, 6);
   private int ck;

   public cmr(buq<? extends cmr> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Override
   protected void p() {
      this.bS.a(2, new cds(this, 1.0, false));
      this.bS.a(7, new cdq(this, 1.0));
      this.bT.a(1, new cdv(this).a());
      this.bT.a(2, new cdw<>(this, cov.class, 10, true, false, this::a));
      this.bT.a(3, new cec<>(this, true));
   }

   public static bwm.a gy() {
      return cmp.gs().a(bwn.A, 0.0).a(bwn.v, 0.23F).a(bwn.c, 5.0);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   protected void a(arc $$0) {
      bwj $$1 = this.g(bwn.v);
      if (this.ac_()) {
         if (!this.e_() && !$$1.b(cb)) {
            $$1.b(cc);
         }

         this.gz();
      } else if ($$1.b(cb)) {
         $$1.c(cb);
      }

      this.a($$0, true);
      if (this.O_() != null) {
         this.gA();
      }

      if (this.ac_()) {
         this.bd = this.af;
      }

      super.a($$0);
   }

   private void gz() {
      if (this.ce > 0) {
         this.ce--;
         if (this.ce == 0) {
            this.gC();
         }
      }
   }

   private void gA() {
      if (this.ck > 0) {
         this.ck--;
      } else {
         if (this.N().a(this.O_())) {
            this.gB();
         }

         this.ck = cj.a(this.ae);
      }
   }

   private void gB() {
      double $$0 = this.h(bwn.m);
      fat $$1 = fat.a(this.du()).c($$0, 10.0, $$0);
      this.dW()
         .a(cmr.class, $$1, buo.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.O_() == null)
         .filter($$0x -> !$$0x.s(this.O_()))
         .forEach($$0x -> $$0x.h(this.O_()));
   }

   private void gC() {
      this.a(avz.Eu, this.fg() * 2.0F, this.fh() * 1.8F);
   }

   @Override
   public void h(@Nullable bvf $$0) {
      if (this.O_() == null && $$0 != null) {
         this.ce = cd.a(this.ae);
         this.ck = cj.a(this.ae);
      }

      if ($$0 instanceof cov) {
         this.c((cov)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   public static boolean b(buq<cmr> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.am() != bsf.a && !$$1.a_($$3.e()).a(djm.lm);
   }

   @Override
   public boolean a(dgj $$0) {
      return $$0.f(this) && !$$0.d(this.cR());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(this.dW(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   protected avy u() {
      return this.ac_() ? avz.Eu : avz.Et;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.Ew;
   }

   @Override
   protected avy o_() {
      return avz.Ev;
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      this.a(bur.a, new cwn(cwr.pB));
   }

   @Override
   protected cwn gp() {
      return cwn.j;
   }

   @Override
   protected void gx() {
      this.g(bwn.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   public boolean a(arc $$0, cov $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(arc $$0, cwn $$1) {
      return this.g($$1);
   }
}
