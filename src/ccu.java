import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccu extends ccs implements bmc {
   private static final UUID c = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final bmz d = new bmz(c, "Attacking speed boost", 0.05, bmz.a.a);
   private static final biw bX = auz.a(0, 1);
   private int bY;
   private static final biw bZ = auz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;
   private static final int cc = 10;
   private static final biw cd = auz.a(4, 6);
   private int ce;
   private static final float cf = 1.79F;
   private static final float cg = 0.82F;

   public ccu(blj<? extends ccu> $$0, csy $$1) {
      super($$0, $$1);
      this.a(eek.i, 8.0F);
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Override
   protected void u() {
      this.bO.a(2, new bug(this, 1.0, false));
      this.bO.a(7, new bue(this, 1.0));
      this.bP.a(1, new buj(this).a());
      this.bP.a(2, new buk<>(this, cer.class, 10, true, false, this::a_));
      this.bP.a(3, new buq<>(this, true));
   }

   public static bna.a go() {
      return ccs.gi().a(bnb.n, 0.0).a(bnb.m, 0.23F).a(bnb.c, 5.0);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? 0.96999997F : 1.79F;
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected void Z() {
      bmx $$0 = this.a(bnb.m);
      if (this.aa_()) {
         if (!this.o_() && !$$0.a(d)) {
            $$0.b(d);
         }

         this.gp();
      } else if ($$0.a(d)) {
         $$0.b(d.a());
      }

      this.a((amp)this.dM(), true);
      if (this.q() != null) {
         this.gq();
      }

      if (this.aa_()) {
         this.aZ = this.ah;
      }

      super.Z();
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
         if (this.O().a(this.q())) {
            this.gr();
         }

         this.ce = cd.a(this.ag);
      }
   }

   private void gr() {
      double $$0 = this.b(bnb.g);
      ekw $$1 = ekw.a(this.dk()).c($$0, 10.0, $$0);
      this.dM()
         .a(ccu.class, $$1, bli.f)
         .stream()
         .filter($$0x -> $$0x != this)
         .filter($$0x -> $$0x.q() == null)
         .filter($$0x -> !$$0x.s(this.q()))
         .forEach($$0x -> $$0x.h(this.q()));
   }

   private void gs() {
      this.a(arc.Cp, this.eW() * 2.0F, this.eX() * 1.8F);
   }

   @Override
   public void h(@Nullable blv $$0) {
      if (this.q() == null && $$0 != null) {
         this.bY = bX.a(this.ag);
         this.ce = cd.a(this.ag);
      }

      if ($$0 instanceof cer) {
         this.c((cer)$$0);
      }

      super.h($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   public static boolean b(blj<ccu> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.aj() != bji.a && !$$1.a_($$3.d()).a(cwb.kK);
   }

   @Override
   public boolean a(ctb $$0) {
      return $$0.f(this) && !$$0.d(this.cH());
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
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
   protected arb y() {
      return this.aa_() ? arc.Cp : arc.Co;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Cr;
   }

   @Override
   protected arb n_() {
      return arc.Cq;
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      this.a(blk.a, new cmh(cmk.oS));
   }

   @Override
   protected cmh ge() {
      return cmh.f;
   }

   @Override
   protected void gn() {
      this.a(bnb.n).a(0.0);
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   public boolean f(cer $$0) {
      return this.a_((blv)$$0);
   }

   @Override
   public boolean k(cmh $$0) {
      return this.j($$0);
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.05F * $$2, 0.0F);
   }
}
