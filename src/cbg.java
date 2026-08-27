import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbg extends cbe implements bkq {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bln d = new bln(c, "Attacking speed boost", 0.05, bln.a.a);
   private static final bhm bX = atw.a(0, 1);
   private int bY;
   private static final bhm bZ = atw.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final bhm cd = atw.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public cbg(bjx<? extends cbg> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void s() {
      this.bO.a(2, new bst(this, 1.0, false));
      this.bO.a(7, new bsr(this, 1.0));
      this.bP.a(1, new bsw(this).a());
      this.bP.a(2, new bsx<>(this, ccx.class, 10, true, false, this::a_));
      this.bP.a(3, new btd<>(this, true));
   }

   public static blo.a go() {
      return cbe.gi().a(blp.n, 0.0).a(blp.m, 0.23F).a(blp.c, 5.0);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return this.n_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void X() {
      bll $$0 = this.a(blp.m);
      if (this.Y_()) {
         if (!this.n_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gp();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((alq)this.dL(), true);
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
      double $$0 = this.b(blp.g);
      eia $$1 = eia.a(this.dj()).c($$0, 10.0, $$0);
      this.dL()
         .a(cbg.class, $$1, bjw.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(aqd.Bq, this.eV() * 2.0F, this.eW() * 1.8F);
   }

   @Override
   public void h(@Nullable bkj $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof ccx) {
         this.c((ccx)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(bjx<cbg> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.ai() != bhy.a && !$$1.a_($$3.d()).a(cuc.kK);
   }

   @Override
   public boolean a(crc $$0) {
      return $$0.f(this) && !$$0.d(this.cG());
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(rt $$0) {
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
   protected aqc w() {
      return this.Y_() ? aqd.Bq : aqd.Bp;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.Bs;
   }

   @Override
   protected aqc m_() {
      return aqd.Br;
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      this.a(bjy.a, new ckj(ckm.oh));
   }

   @Override
   protected ckj ge() {
      return ckj.b;
   }

   @Override
   protected void gn() {
      this.a(blp.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(ccx $$0) {
      return this.a_((bkj)$$0);
   }

   @Override
   public boolean k(ckj $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
