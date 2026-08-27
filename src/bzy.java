import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzy extends bzw implements bji {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bkf d = new bkf(c, "Attacking speed boost", 0.05, bkf.a.a);
   private static final bge bX = asp.a(0, 1);
   private int bY;
   private static final bge bZ = asp.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bge cd = asp.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public bzy(bip<? extends bzy> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void p() {
      this.bO.a(2, new brl(this, 1.0, false));
      this.bO.a(7, new brj(this, 1.0));
      this.bP.a(1, new bro(this).a());
      this.bP.a(2, new brp<>(this, cbp.class, 10, true, false, this::a_));
      this.bP.a(3, new brv<>(this, true));
   }

   public static bkg.a gk() {
      return bzw.ge().a(bkh.m, 0.0).a(bkh.d, 0.23F).a(bkh.f, 5.0);
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return this.i_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gb() {
      return false;
   }

   @Override
   protected void V() {
      bkd $$0 = this.a(bkh.d);
      if (this.S_()) {
         if (!this.i_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gl();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((akn)this.dK(), true);
      if (this.j() != null) {
         this.gm();
      }

      if (this.S_()) {
         this.aZ = this.ah;
      }

      super.V();
   }

   private void gl() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.go();
         }
      }
   }

   private void gm() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.J().a(this.j())) {
            this.gn();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gn() {
      double $$0 = this.b(bkh.b);
      ehd $$1 = ehd.a(this.di()).c($$0, 10.0, $$0);
      this.dK()
         .a(bzy.class, $$1, bio.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.j() == null)
         .filter($$0x -> !$$0x.s(this.j()))
         .forEach($$0x -> $$0x.h(this.j()));
   }

   private void go() {
      this.a(aoz.Bn, this.eU() * 2.0F, this.eV() * 1.8F);
   }

   @Override
   public void h(@Nullable bjb $$0) {
      if (this.j() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cbp) {
         this.c((cbp)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bip<bzy> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.ai() != bgq.a && !$$1.a_($$3.d()).a(csr.kK);
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.a(this.dK(), $$0);
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
   protected aoy r() {
      return this.S_() ? aoz.Bn : aoz.Bm;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Bp;
   }

   @Override
   protected aoy h_() {
      return aoz.Bo;
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      this.a(biq.a, new cja(cjd.oh));
   }

   @Override
   protected cja ga() {
      return cja.b;
   }

   @Override
   protected void gj() {
      this.a(bkh.m).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cbp $$0) {
      return this.a_((bjb)$$0);
   }

   @Override
   public boolean k(cja $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
