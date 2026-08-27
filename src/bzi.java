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

public class bzi extends bww {
   private static final int bZ = 1700;
   private static final int ca = 6000;
   private static final int cb = 30;
   private static final int cc = 120;
   private static final int cd = 48000;
   private static final float ce = 0.4F;
   private static final bkw cf = bkw.b(bkz.aN.k(), bkz.aN.l() - 0.4F);
   private static final afs<bzi.a> cg = afv.a(bzi.class, afu.z);
   private static final afs<Integer> ch = afv.a(bzi.class, afu.b);
   public final bkr bT = new bkr();
   public final bkr bU = new bkr();
   public final bkr bW = new bkr();
   public final bkr bX = new bkr();
   public final bkr bY = new bkr();

   public static bmq.a u() {
      return bln.C().a(bmr.m, 0.1F).a(bmr.l, 14.0);
   }

   public bzi(bkz<? extends bww> $$0, csf $$1) {
      super($$0, $$1);
      this.an.a(cg, bzi.a.a);
      this.an.a(ch, 0);
      this.N().a(true);
      this.a(edi.j, -1.0F);
      this.a(edi.g, -1.0F);
      this.a(edi.y, -1.0F);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return this.a($$0).b * 0.6F;
   }

   @Override
   public void E() {
      super.E();
      if (this.bN() || this.aZ()) {
         this.a(edi.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(edi.j, -1.0F);
   }

   @Override
   public bkw a(blx $$0) {
      return this.an.a(cg) && this.gq() == bzi.a.f ? cf.a(this.ea()) : super.a($$0);
   }

   public boolean w() {
      return this.gq() == bzi.a.e;
   }

   public boolean A() {
      return this.bz.c(bum.Q).orElse(false);
   }

   public boolean gf() {
      return !this.A() && !this.gc() && !this.aZ() && !this.gj() && this.aC() && !this.bO() && !this.fT();
   }

   public boolean gl() {
      return this.gq() == bzi.a.f || this.gq() == bzi.a.e;
   }

   private hx go() {
      ejz $$0 = this.gp();
      return hx.a($$0.a(), this.du() + 0.2F, $$0.c());
   }

   private ejz gp() {
      return this.dl().e(this.bH().a(2.25));
   }

   private bzi.a gq() {
      return this.an.b(cg);
   }

   private bzi b(bzi.a $$0) {
      this.an.b(cg, $$0);
      return this;
   }

   @Override
   public void a(afs<?> $$0) {
      if (cg.equals($$0)) {
         bzi.a $$1 = this.gq();
         this.gr();
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

         this.k_();
      }

      super.a($$0);
   }

   private void gr() {
      this.bX.a();
      this.bW.a();
      this.bY.a();
      this.bT.a();
      this.bU.a();
   }

   public bzi a(bzi.a $$0) {
      switch ($$0) {
         case c:
            this.b(bzi.a.c).gs();
            break;
         case d:
            this.a(aqv.xa, 1.0F, 1.0F);
            this.b(bzi.a.d);
            break;
         case f:
            this.b(bzi.a.f).gt();
            break;
         case g:
            this.a(aqv.xd, 1.0F, 1.0F);
            this.b(bzi.a.g);
            break;
         case b:
            this.a(aqv.xe, 1.0F, 1.0F);
            this.b(bzi.a.b);
            break;
         case a:
            this.b(bzi.a.a);
            break;
         case e:
            this.b(bzi.a.e);
      }

      return this;
   }

   private bzi gs() {
      this.a(aqv.wZ, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private bzi gt() {
      this.an.b(ch, this.ah + 120);
      this.dN().a(this, (byte)63);
      return this;
   }

   public bzi w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<hx> gm() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bwe.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(hx::a)
         .filter($$0 -> this.dN().D_().a($$0))
         .map(hx::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gn() {
      return !this.gc() && !this.A() && !this.o_() && !this.aZ() && this.aC() && !this.bO() && this.i(this.go().d());
   }

   private boolean i(hx $$0) {
      return this.dN().a_($$0).a(ark.cj)
         && this.gv().noneMatch($$1 -> ie.a(this.dN().ad(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(edm::j).orElse(false);
   }

   private void gu() {
      if (!this.dN().y_() && this.an.b(ch) == this.ah) {
         ami $$0 = (ami)this.dN();
         efk $$1 = $$0.n().aJ().getLootTable(efa.aA);
         efi $$2 = new efi.a($$0).a(ehn.f, this.gp()).a(ehn.a, this).a(ehm.i);
         List<clo> $$3 = $$1.a($$2);
         hx $$4 = this.go();

         for (clo $$5 : $$3) {
            cas $$6 = new cas($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(aqv.wY, 1.0F, 1.0F);
      }
   }

   private bzi a(bkr $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         hx $$2 = this.go();
         dhn $$3 = this.dN().a_($$2.d());
         if ($$3.l() != dbk.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               ejz $$5 = ejz.b($$2).b(0.0, -0.65F, 0.0);
               this.dN().a(new jo(jw.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ah % 10 == 0) {
               this.dN().a(this.ds(), this.du(), this.dy(), $$3.w().f(), this.dc(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ah % 10 == 0) {
         this.dN().a(dlx.u, this.go(), dlx.a.a(this));
      }

      return this;
   }

   private bzi j(hx $$0) {
      List<ie> $$1 = this.gv().limit(20L).collect(Collectors.toList());
      $$1.add(0, ie.a(this.dN().ad(), $$0));
      this.dP().a(bum.aP, $$1);
      return this;
   }

   private Stream<ie> gv() {
      return this.dP().c(bum.aP).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fc() {
      super.fc();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ejz(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(ami $$0, bww $$1) {
      clo $$2 = new clo(clr.kp);
      cas $$3 = new cas($$0, this.dl().a(), this.dl().b(), this.dl().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(aqv.xf, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bjt $$0) {
      this.a(bzi.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gq()) {
         case f:
            this.a(this.bX).gu();
            break;
         case e:
            this.gw();
      }

      super.l();
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      boolean $$3 = this.m($$2);
      bjb $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dN().a(null, this, this.d($$2), aqw.g, 1.0F, atq.b(this.dN().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.34375F * $$2, 0.0F);
   }

   @Override
   public float dj() {
      return super.dj() + 0.3F;
   }

   private void gw() {
      if (this.dN().y_() && this.ah % 20 == 0) {
         this.dN().a(this.ds(), this.du(), this.dy(), aqv.xb, this.dc(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.wT, 0.15F, 1.0F);
   }

   @Override
   public aqu d(clo $$0) {
      return aqv.wU;
   }

   @Override
   protected aqu y() {
      return Set.of(bzi.a.f, bzi.a.e).contains(this.gq()) ? null : aqv.wV;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.wW;
   }

   @Override
   protected aqu n_() {
      return aqv.wX;
   }

   @Override
   public int ab() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public bkq a(ami $$0, bkq $$1) {
      return bkz.aN.a((csf)$$0);
   }

   @Override
   public boolean a(bww $$0) {
      if (!($$0 instanceof bzi $$1)) {
         return false;
      } else {
         Set<bzi.a> $$2 = Set.of(bzi.a.a, bzi.a.c, bzi.a.b);
         return $$2.contains(this.gq()) && $$2.contains($$1.gq()) && super.a($$0);
      }
   }

   @Override
   public eju i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean m(clo $$0) {
      return $$0.a(ars.aK);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return bzj.a(this.dQ().a($$0));
   }

   @Override
   public bml<bzi> dP() {
      return (bml<bzi>)super.dP();
   }

   @Override
   protected bml.b<bzi> dQ() {
      return bml.a(bzj.b, bzj.a);
   }

   @Override
   protected void Z() {
      this.dN().ae().a("snifferBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().b("snifferActivityUpdate");
      bzj.a(this);
      this.dN().ae().c();
      super.Z();
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
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
