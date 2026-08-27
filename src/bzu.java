import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzu extends bzs implements bjd {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bkb d = new bkb(c, "Attacking speed boost", 0.05, bkb.a.a);
   private static final bfz bX = ask.a(0, 1);
   private int bY;
   private static final bfz bZ = ask.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bfz cd = ask.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public bzu(bik<? extends bzu> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void p() {
      this.bO.a(2, new brh(this, 1.0, false));
      this.bO.a(7, new brf(this, 1.0));
      this.bP.a(1, new brk(this).a());
      this.bP.a(2, new brl<>(this, cbl.class, 10, true, false, this::a_));
      this.bP.a(3, new brr<>(this, true));
   }

   public static bkc.a gj() {
      return bzs.gd().a(bkd.m, 0.0).a(bkd.d, 0.23F).a(bkd.f, 5.0);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return this.i_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean ga() {
      return false;
   }

   @Override
   protected void V() {
      bjz $$0 = this.a(bkd.d);
      if (this.S_()) {
         if (!this.i_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gk();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((aki)this.dK(), true);
      if (this.j() != null) {
         this.gl();
      }

      if (this.S_()) {
         this.aZ = this.ah;
      }

      super.V();
   }

   private void gk() {
      if (this.bY > 0) {
         this.bY--;
         if (this.bY == 0) {
            this.gn();
         }
      }
   }

   private void gl() {
      if (this.ce > 0) {
         this.ce--;
      } else {
         if (this.J().a(this.j())) {
            this.gm();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gm() {
      double $$0 = this.b(bkd.b);
      eha $$1 = eha.a(this.di()).c($$0, 10.0, $$0);
      this.dK()
         .a(bzu.class, $$1, bij.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.j() == null)
         .filter($$0x -> !$$0x.s(this.j()))
         .forEach($$0x -> $$0x.h(this.j()));
   }

   private void gn() {
      this.a(aou.Bd, this.eU() * 2.0F, this.eV() * 1.8F);
   }

   @Override
   public void h(@Nullable biw $$0) {
      if (this.j() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cbl) {
         this.c((cbl)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bik<bzu> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.ai() != bgl.a && !$$1.a_($$3.d()).a(csl.kK);
   }

   @Override
   public boolean a(cpn $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(qs $$0) {
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
   protected aot r() {
      return this.S_() ? aou.Bd : aou.Bc;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.Bf;
   }

   @Override
   protected aot h_() {
      return aou.Be;
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      this.a(bil.a, new ciw(ciz.oh));
   }

   @Override
   protected ciw fZ() {
      return ciw.b;
   }

   @Override
   protected void gi() {
      this.a(bkd.m).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cbl $$0) {
      return this.a_((biw)$$0);
   }

   @Override
   public boolean k(ciw $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
