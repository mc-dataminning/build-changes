import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnc extends cgy implements clq, cne {
   private static final akm<Boolean> cc = akq.a(cnc.class, ako.k);
   private static final int cd = 40;
   private static final float ce = 0.3F;
   private static final int cf = 1;
   private static final float cg = 0.6F;
   private static final int ch = 6;
   private static final float ci = 0.5F;
   public static final int bY = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends cfs<? extends cfr<? super cnc>>> bZ = ImmutableList.of(cfs.c, cfs.d, cfs.o, cfs.n);
   protected static final ImmutableList<? extends cel<?>> ca = ImmutableList.of(
      cel.r,
      cel.g,
      cel.h,
      cel.k,
      cel.l,
      cel.n,
      cel.m,
      cel.E,
      cel.t,
      cel.o,
      cel.p,
      cel.aq,
      new cel[]{cel.z, cel.as, cel.at, cel.ap, cel.K, cel.aw, cel.ax, cel.Z}
   );

   public cnc(bus<? extends cnc> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.ck = $$0;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 40.0).a(bwp.v, 0.3F).a(bwp.p, 0.6F).a(bwp.d, 1.0).a(bwp.c, 6.0);
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      if ($$1 instanceof bvh $$2) {
         this.cj = 10;
         this.dV().a(this, (byte)4);
         this.b(awn.mp);
         cnd.a(this, $$2);
         return cne.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void e(bvh $$0) {
      if (this.q()) {
         cne.a(this, $$0);
      }
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvh $$4) {
         cnd.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected bwj.b<cnc> ec() {
      return bwj.a(ca, bZ);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cnd.a(this.ec().a($$0));
   }

   @Override
   public bwj<cnc> eb() {
      return (bwj<cnc>)super.eb();
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("hoglinBrain");
      this.eb().a($$0, this);
      $$1.c();
      cnd.a(this);
      if (this.v()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(awn.mq);
            this.go();
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.d_();
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.bN = 3;
         this.g(bwp.c).a(0.5);
      } else {
         this.bN = 5;
         this.g(bwp.c).a(6.0);
      }
   }

   public static boolean c(bus<cnc> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return !$$1.a_($$3.e()).a(dis.kK);
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.aj();
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      if (cnd.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dis.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      bsk $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.ai();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(awn.mp);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gm() {
      return this.cj;
   }

   @Override
   public boolean em() {
      return true;
   }

   @Override
   protected int e(arp $$0) {
      return this.bN;
   }

   private void go() {
      this.a(bus.bJ, bug.a(this, true, false), $$0 -> $$0.a(new btq(bts.i, 200, 0)));
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.aq);
   }

   public boolean q() {
      return !this.e_();
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.gp()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.au().a(cc, $$0);
   }

   private boolean gp() {
      return this.au().a(cc);
   }

   public boolean v() {
      return !this.dV().F_().b() && !this.gp() && !this.fZ();
   }

   private void y(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gn() {
      return this.q() && !this.cl;
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      cnc $$2 = bus.ai.a($$0, bur.e);
      if ($$2 != null) {
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean gt() {
      return !cnd.c(this) && super.gt();
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm t() {
      return this.dV().C ? null : cnd.b(this).orElse(null);
   }

   @Override
   protected awm e(btb $$0) {
      return awn.ms;
   }

   @Override
   protected awm n_() {
      return awn.mr;
   }

   @Override
   protected awm aV() {
      return awn.mX;
   }

   @Override
   protected awm aW() {
      return awn.mW;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.mu, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.O();
   }
}
