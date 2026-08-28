import java.util.UUID;
import javax.annotation.Nullable;

public class cms extends cmq implements bvl {
   private static final bun c = bur.bQ.n().a(0.5F).b(0.97F);
   private static final akv cb = akv.b("attacking");
   private static final bwm cc = new bwm(cb, 0.05, bwm.a.a);
   private static final bru cd = bab.a(0, 1);
   private int ce;
   private static final bru cf = bab.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;
   private static final int ci = 10;
   private static final bru cj = bab.a(4, 6);
   private int ck;

   public cms(bur<? extends cms> $$0, dgh $$1) {
      super($$0, $$1);
      this.a(etp.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Override
   protected void p() {
      this.bS.a(2, new cdt(this, 1.0, false));
      this.bS.a(7, new cdr(this, 1.0));
      this.bT.a(1, new cdw(this).a());
      this.bT.a(2, new cdx<>(this, cow.class, 10, true, false, this::a));
      this.bT.a(3, new ced<>(this, true));
   }

   public static bwn.a gB() {
      return cmq.gv().a(bwo.A, 0.0).a(bwo.v, 0.23F).a(bwo.c, 5.0);
   }

   @Override
   public bun e(bvs $$0) {
      return this.e_() ? c : super.e($$0);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected void a(ard $$0) {
      bwk $$1 = this.g(bwo.v);
      if (this.ac_()) {
         if (!this.e_() && !$$1.b(cb)) {
            $$1.b(cc);
         }

         this.gC();
      } else if ($$1.b(cb)) {
         $$1.c(cb);
      }

      this.a($$0, true);
      if (this.O_() != null) {
         this.gD();
      }

      if (this.ac_()) {
         this.bd = this.af;
      }

      super.a($$0);
   }

   private void gC() {
      if (this.ce > 0) {
         this.ce--;
         if (this.ce == 0) {
            this.gF();
         }
      }
   }

   private void gD() {
      if (this.ck > 0) {
         this.ck--;
      } else {
         if (this.Q().a(this.O_())) {
            this.gE();
         }

         this.ck = cj.a(this.ae);
      }
   }

   private void gE() {
      double $$0 = this.h(bwo.m);
      fau $$1 = fau.a(this.dt()).c($$0, 10.0, $$0);
      this.dV()
         .a(cms.class, $$1, bup.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.O_() == null)
         .filter($$0x -> !$$0x.s(this.O_()))
         .forEach($$0x -> $$0x.h(this.O_()));
   }

   private void gF() {
      this.a(awa.Eu, this.fg() * 2.0F, this.fh() * 1.8F);
   }

   @Override
   public void h(@Nullable bvg $$0) {
      if (this.O_() == null && $$0 != null) {
         this.ce = cd.a(this.ae);
         this.ck = cj.a(this.ae);
      }

      if ($$0 instanceof cow) {
         this.c((cow)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   public static boolean b(bur<cms> $$0, dgi $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.am() != bsg.a && !$$1.a_($$3.e()).a(djn.lm);
   }

   @Override
   public boolean a(dgk $$0) {
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
      this.a(this.dV(), $$0);
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
   protected avz u() {
      return this.ac_() ? awa.Eu : awa.Et;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Ew;
   }

   @Override
   protected avz o_() {
      return awa.Ev;
   }

   @Override
   protected void a(azh $$0, bsh $$1) {
      this.a(bus.a, new cwo(cws.pB));
   }

   @Override
   protected cwo gs() {
      return cwo.j;
   }

   @Override
   protected void gA() {
      this.g(bwo.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   public boolean a(ard $$0, cow $$1) {
      return this.a($$1, $$0);
   }

   @Override
   public boolean c(ard $$0, cwo $$1) {
      return this.g($$1);
   }
}
