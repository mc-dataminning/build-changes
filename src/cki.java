import java.util.UUID;
import javax.annotation.Nullable;

public class cki extends ckg implements bte {
   private static final bsg c = bsj.bx.n().a(0.5F).b(0.97F);
   private static final UUID d = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bue cd = new bue(d, "Attacking speed boost", 0.05, bue.a.a);
   private static final bpo ce = aze.a(0, 1);
   private int cf;
   private static final bpo cg = aze.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;
   private static final int cj = 10;
   private static final bpo ck = aze.a(4, 6);
   private int cl;

   public cki(bsj<? extends cki> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Override
   protected void u() {
      this.bU.a(2, new cbl(this, 1.0, false));
      this.bU.a(7, new cbj(this, 1.0));
      this.bV.a(1, new cbo(this).a());
      this.bV.a(2, new cbp<>(this, cmh.class, 10, true, false, this::a_));
      this.bV.a(3, new cbv<>(this, true));
   }

   public static buf.a gx() {
      return ckg.gr().a(bug.A, 0.0).a(bug.v, 0.23F).a(bug.c, 5.0);
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? c : super.e($$0);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected void Z() {
      buc $$0 = this.f(bug.v);
      if (this.Z_()) {
         if (!this.p_() && !$$0.a(cd)) {
            $$0.c(cd);
         }

         this.gy();
      } else if ($$0.a(cd)) {
         $$0.b(cd.b());
      }

      this.a((aqk)this.dP(), true);
      if (this.p() != null) {
         this.gz();
      }

      if (this.Z_()) {
         this.bd = this.ai;
      }

      super.Z();
   }

   private void gy() {
      if (this.cf > 0) {
         this.cf--;
         if (this.cf == 0) {
            this.gB();
         }
      }
   }

   private void gz() {
      if (this.cl > 0) {
         this.cl--;
      } else {
         if (this.M().a(this.p())) {
            this.gA();
         }

         this.cl = ck.a(this.ah);
      }
   }

   private void gA() {
      double $$0 = this.g(bug.m);
      evu $$1 = evu.a(this.dn()).c($$0, 10.0, $$0);
      this.dP()
         .a(cki.class, $$1, bsi.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.p() == null)
         .filter($$0x -> !$$0x.s(this.p()))
         .forEach($$0x -> $$0x.h(this.p()));
   }

   private void gB() {
      this.a(avf.DF, this.fa() * 2.0F, this.fb() * 1.8F);
   }

   @Override
   public void h(@Nullable bsy $$0) {
      if (this.p() == null && $$0 != null) {
         this.cf = ce.a(this.ah);
         this.cl = ck.a(this.ah);
      }

      if ($$0 instanceof cmh) {
         this.c((cmh)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   public static boolean b(bsj<cki> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.al() != bqa.a && !$$1.a_($$3.d()).a(dfh.kK);
   }

   @Override
   public boolean a(dcg $$0) {
      return $$0.f(this) && !$$0.d(this.cK());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   protected ave v() {
      return this.Z_() ? avf.DF : avf.DE;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.DH;
   }

   @Override
   protected ave o_() {
      return avf.DG;
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      this.a(bsk.a, new cua(cud.oV));
   }

   @Override
   protected cua go() {
      return cua.l;
   }

   @Override
   protected void gw() {
      this.f(bug.A).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   public boolean f(cmh $$0) {
      return this.a_((bsy)$$0);
   }

   @Override
   public boolean k(cua $$0) {
      return this.j($$0);
   }
}
