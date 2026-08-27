import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbv extends cbt implements blf {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bmc d = new bmc(c, "Attacking speed boost", 0.05, bmc.a.a);
   private static final bib bX = aug.a(0, 1);
   private int bY;
   private static final bib bZ = aug.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bib cd = aug.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cbv(bkm<? extends cbv> $$0, crs $$1) {
      super($$0, $$1);
      this.a(ecr.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void s() {
      this.bO.a(2, new bti(this, 1.0, false));
      this.bO.a(7, new btg(this, 1.0));
      this.bP.a(1, new btl(this).a());
      this.bP.a(2, new btm<>(this, cdm.class, 10, true, false, this::a_));
      this.bP.a(3, new bts<>(this, true));
   }

   public static bmd.a go() {
      return cbt.gi().a(bme.n, 0.0).a(bme.m, 0.23F).a(bme.c, 5.0);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.n_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void X() {
      bma $$0 = this.a(bme.m);
      if (this.Y_()) {
         if (!this.n_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gp();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((ama)this.dL(), true);
      if (this.q() != null) {
         this.gq();
      }

      if (this.Y_()) {
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
      double $$0 = this.b(bme.g);
      ejd $$1 = ejd.a(this.dj()).c($$0, 10.0, $$0);
      this.dL()
         .a(cbv.class, $$1, bkl.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(aqn.Bs, this.eV() * 2.0F, this.eW() * 1.8F);
   }

   @Override
   public void h(@Nullable bky $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cdm) {
         this.c((cdm)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bkm<cbv> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.ai() != bin.a && !$$1.a_($$3.d()).a(cuv.kK);
   }

   @Override
   public boolean a(crv $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
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
   protected aqm w() {
      return this.Y_() ? aqn.Bs : aqn.Br;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.Bu;
   }

   @Override
   protected aqm m_() {
      return aqn.Bt;
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      this.a(bkn.a, new clb(cle.oh));
   }

   @Override
   protected clb ge() {
      return clb.b;
   }

   @Override
   protected void gn() {
      this.a(bme.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cdm $$0) {
      return this.a_((bky)$$0);
   }

   @Override
   public boolean k(clb $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
