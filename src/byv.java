import com.mojang.serialization.Dynamic;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.joml.Vector3f;

public class byv extends bwj {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bkj cf = bkj.b(bkm.aN.k(), bkm.aN.l() - 0.4F);
   private static final afm<byv.a> cg = afp.a(byv.class, afo.z);
   private static final afm<Integer> ch = afp.a(byv.class, afo.b);
   public final bke bT = new bke();
   public final bke bU = new bke();
   public final bke bW = new bke();
   public final bke bX = new bke();
   public final bke bY = new bke();

   public static bmd.a s() {
      return bla.A().a(bme.m, 0.1F).a(bme.l, 14.0);
   }

   public byv(bkm<? extends bwj> $$0, crs $$1) {
      super($$0, $$1);
      this.an.a(cg, byv.a.a);
      this.an.a(ch, 0);
      this.L().a(true);
      this.a(ecr.j, -1.0F);
      this.a(ecr.g, -1.0F);
      this.a(ecr.y, -1.0F);
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void C() {
      super.C();
      if (this.bM() || this.aX()) {
         this.a(ecr.j, 0.0F);
      }
   }

   @Override
   public void E() {
      this.a(ecr.j, -1.0F);
   }

   @Override
   public bkj a(blk $$0) {
      return this.an.a(cg) && this.gp() == byv.a.f ? cf.a(this.dY()) : super.a($$0);
   }

   public boolean t() {
      return this.gp() == byv.a.e;
   }

   public boolean y() {
      return this.bz.c(btz.Q).orElse(false);
   }

   public boolean ge() {
      return !this.y() && !this.gb() && !this.aX() && !this.gi() && this.aA() && !this.bN() && !this.fS();
   }

   public boolean gk() {
      return this.gp() == byv.a.f || this.gp() == byv.a.e;
   }

   private ht gn() {
      eji $$0 = this.go();
      return ht.a($$0.a(), this.ds() + 0.2F, $$0.c());
   }

   private eji go() {
      return this.dj().e(this.bG().a(2.25));
   }

   private byv.a gp() {
      return this.an.b(cg);
   }

   private byv b(byv.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(afm<?> $$0) {
      if (cg.equals($$0)) {
         byv.a $$1 = this.gp();
         this.gq();
         switch ($$1) {
            case c:
               this.bU.b(this.ah);
               break;
            case d:
               this.bW.b(this.ah);
               break;
            case f:
               this.bX.b(this.ah);
               break;
            case g:
               this.bY.b(this.ah);
               break;
            case b:
               this.bT.b(this.ah);
         }

         this.j_();
      }

      super.a($$0);
   }

   private void gq() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public byv a(byv.a $$0) {
      switch ($$0) {
         case c:
            this.b(byv.a.c).gr();
            break;
         case d:
            this.a(aqn.wJ, 1.0F, 1.0F);
            this.b(byv.a.d);
            break;
         case f:
            this.b(byv.a.f).gs();
            break;
         case g:
            this.a(aqn.wM, 1.0F, 1.0F);
            this.b(byv.a.g);
            break;
         case b:
            this.a(aqn.wN, 1.0F, 1.0F);
            this.b(byv.a.b);
            break;
         case a:
            this.b(byv.a.a);
            break;
         case e:
            this.b(byv.a.e);
      }

      return this;
   }

   private byv gr() {
      this.a(aqn.wI, 1.0F, this.n_() ? 1.3F : 1.0F);
      return this;
   }

   private byv gs() {
      this.an.b(ch, this.ah + 120);
      this.dL().a(this, (byte)63);
      return this;
   }

   public byv w(boolean $$0) {
      if ($$0) {
         this.j(this.aH());
      }

      return this;
   }

   Optional<ht> gl() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bvr.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ht::a)
         .filter($$0 -> this.dL().C_().a($$0))
         .map(ht::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gm() {
      return !this.gb() && !this.y() && !this.n_() && !this.aX() && this.aA() && !this.bN() && this.i(this.gn().d());
   }

   private boolean i(ht $$0) {
      return this.dL().a_($$0).a(arc.cj)
         && this.gu().noneMatch($$1 -> ia.a(this.dL().ac(), $$0).equals($$1))
         && Optional.ofNullable(this.L().a($$0, 1)).map(ecv::j).orElse(false);
   }

   private void gt() {
      if (!this.dL().x_() && this.an.b(ch) == this.ah) {
         ama $$0 = (ama)this.dL();
         eet $$1 = $$0.n().aH().getLootTable(eej.aA);
         eer $$2 = new eer.a($$0).a(egw.f, this.go()).a(egw.a, this).a(egv.i);
         List<clb> $$3 = $$1.a($$2);
         ht $$4 = this.gn();

         for (clb $$5 : $$3) {
            caf $$6 = new caf($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.t();
            $$0.b($$6);
         }

         this.a(aqn.wH, 1.0F, 1.0F);
      }
   }

   private byv a(bke $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ht $$2 = this.gn();
         dgw $$3 = this.dL().a_($$2.d());
         if ($$3.l() != day.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eji $$5 = eji.b($$2).b(0.0, -0.65F, 0.0);
               this.dL().a(new jk(js.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dL().a(this.dq(), this.ds(), this.dw(), $$3.w().f(), this.da(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dL().a(dlg.u, this.gn(), dlg.a.a(this));
      }

      return this;
   }

   private byv j(ht $$0) {
      List<ia> $$1 = this.gu().limit(20L).collect(Collectors.toList());
      $$1.add(0, ia.a(this.dL().ac(), $$0));
      this.dN().a(btz.aP, $$1);
      return this;
   }

   private Stream<ia> gu() {
      return this.dN().c(btz.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eji(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ama $$0, bwj $$1) {
      clb $$2 = new clb(cle.jU);
      caf $$3 = new caf($$0, this.dj().a(), this.dj().b(), this.dj().c(), $$2);
      $$3.t();
      this.a($$0, $$1, null);
      this.a(aqn.wO, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bjg $$0) {
      this.a(byv.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gp()) {
         case f:
            this.a(this.bX).gt();
            break;
         case e:
            this.gv();
      }

      super.l();
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      biq $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dL().a(null, this, this.d($$2), aqo.g, 1.0F, ati.b(this.dL().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dh() {
      return super.dh() + 0.3F;
   }

   private void gv() {
      if (this.dL().x_() && this.ah % 20 == 0) {
         this.dL().a(this.dq(), this.ds(), this.dw(), aqn.wK, this.da(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.wC, 0.15F, 1.0F);
   }

   @Override
   public aqm d(clb $$0) {
      return aqn.wD;
   }

   @Override
   protected aqm w() {
      return Set.of(byv.a.f, byv.a.e).contains(this.gp()) ? null : aqn.wE;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.wF;
   }

   @Override
   protected aqm m_() {
      return aqn.wG;
   }

   @Override
   public int Z() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bkd a(ama $$0, bkd $$1) {
      return bkm.aN.a((crs)$$0);
   }

   @Override
   public boolean a(bwj $$0) {
      if (!($$0 instanceof byv $$1)) {
         return false;
      } else {
         Set<byv.a> $$2 = Set.of(byv.a.a, byv.a.c, byv.a.b);
         return $$2.contains(this.gp()) && $$2.contains($$1.gp()) && super.a($$0);
      }
   }

   @Override
   public ejd h_() {
      return super.h_().g(0.6F);
   }

   @Override
   public boolean m(clb $$0) {
      return $$0.a(ark.aK);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return byw.a(this.dO().a($$0));
   }

   @Override
   public bly<byv> dN() {
      return (bly<byv>)super.dN();
   }

   @Override
   protected bly.b<byv> dO() {
      return bly.a(byw.b, byw.a);
   }

   @Override
   protected void X() {
      this.dL().ad().a("snifferBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().b("snifferActivityUpdate");
      byw.a(this);
      this.dL().ad().c();
      super.X();
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
