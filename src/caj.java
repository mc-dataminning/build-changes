import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caj extends cah implements bjt {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bkq d = new bkq(c, "Attacking speed boost", 0.05, bkq.a.a);
   private static final bgp bX = asz.a(0, 1);
   private int bY;
   private static final bgp bZ = asz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bgp cd = asz.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public caj(bja<? extends caj> $$0, cqb $$1) {
      super($$0, $$1);
      this.a(ear.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void s() {
      this.bO.a(2, new brw(this, 1.0, false));
      this.bO.a(7, new bru(this, 1.0));
      this.bP.a(1, new brz(this).a());
      this.bP.a(2, new bsa<>(this, cca.class, 10, true, false, this::a_));
      this.bP.a(3, new bsg<>(this, true));
   }

   public static bkr.a go() {
      return cah.gi().a(bks.n, 0.0).a(bks.m, 0.23F).a(bks.c, 5.0);
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return this.m_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void X() {
      bko $$0 = this.a(bks.m);
      if (this.X_()) {
         if (!this.m_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gp();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((akt)this.dL(), true);
      if (this.q() != null) {
         this.gq();
      }

      if (this.X_()) {
         this.aZ = this.ah;
      }

      super.X();
   }

   private void gp() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gs();
         }
      }
   }

   private void gq() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.M().a(this.q())) {
            this.gr();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gr() {
      double $$0 = this.b(bks.g);
      ehc $$1 = ehc.a(this.dj()).c($$0, 10.0, $$0);
      this.dL()
         .a(caj.class, $$1, biz.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(apg.Bn, this.eV() * 2.0F, this.eW() * 1.8F);
   }

   @Override
   public void h(@Nullable bjm $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cca) {
         this.c((cca)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bja<caj> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.ai() != bhb.a && !$$1.a_($$3.d()).a(cte.kK);
   }

   @Override
   public boolean a(cqe $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   protected apf w() {
      return this.X_() ? apg.Bn : apg.Bm;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.Bp;
   }

   @Override
   protected apf l_() {
      return apg.Bo;
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      this.a(bjb.a, new cjl(cjo.oh));
   }

   @Override
   protected cjl ge() {
      return cjl.b;
   }

   @Override
   protected void gn() {
      this.a(bks.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cca $$0) {
      return this.a_((bjm)$$0);
   }

   @Override
   public boolean k(cjl $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
