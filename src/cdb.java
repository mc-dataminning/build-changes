import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class cdb extends cam {
   private static final int cb = 1700;
   private static final int cc = 6000;
   private static final int cd = 30;
   private static final int ce = 120;
   private static final int cf = 48000;
   private static final float cg = 0.4F;
   private static final boi ch = boi.b(bol.aP.k(), bol.aP.l() - 0.4F).b(0.81F);
   private static final aii<cdb.a> ci = ail.a(cdb.class, aik.A);
   private static final aii<Integer> cj = ail.a(cdb.class, aik.b);
   public final bob bV = new bob();
   public final bob bW = new bob();
   public final bob bY = new bob();
   public final bob bZ = new bob();
   public final bob ca = new bob();

   public static bqd.a u() {
      return boz.C().a(bqe.o, 0.1F).a(bqe.n, 14.0);
   }

   public cdb(bol<? extends cam> $$0, cwe $$1) {
      super($$0, $$1);
      this.am.a(ci, cdb.a.a);
      this.am.a(cj, 0);
      this.N().a(true);
      this.a(eic.j, -1.0F);
      this.a(eic.g, -1.0F);
      this.a(eic.y, -1.0F);
   }

   @Override
   public void E() {
      super.E();
      if (this.bK() || this.aZ()) {
         this.a(eic.j, 0.0F);
      }
   }

   @Override
   public void G() {
      this.a(eic.j, -1.0F);
   }

   @Override
   public boi e(bpi $$0) {
      return this.am.a(ci) && this.gw() == cdb.a.f ? ch.a(this.dX()) : super.e($$0);
   }

   public boolean w() {
      return this.gw() == cdb.a.e;
   }

   public boolean A() {
      return this.bA.c(bya.R).orElse(false);
   }

   public boolean gl() {
      return !this.A() && !this.gi() && !this.aZ() && !this.gp() && this.aC() && !this.bL() && !this.fZ();
   }

   public boolean gr() {
      return this.gw() == cdb.a.f || this.gw() == cdb.a.e;
   }

   private ib gu() {
      eov $$0 = this.gv();
      return ib.a($$0.a(), this.dq() + 0.2F, $$0.c());
   }

   private eov gv() {
      return this.dh().e(this.bH().a(2.25));
   }

   private cdb.a gw() {
      return this.am.b(ci);
   }

   private cdb b(cdb.a $$0) {
      this.am.b(ci, $$0);
      return this;
   }

   @Override
   public void a(aii<?> $$0) {
      if (ci.equals($$0)) {
         cdb.a $$1 = this.gw();
         this.gx();
         switch ($$1) {
            case c:
               this.bW.b(this.ag);
               break;
            case d:
               this.bY.b(this.ag);
               break;
            case f:
               this.bZ.b(this.ag);
               break;
            case g:
               this.ca.b(this.ag);
               break;
            case b:
               this.bV.b(this.ag);
         }

         this.k_();
      }

      super.a($$0);
   }

   private void gx() {
      this.bZ.a();
      this.bY.a();
      this.ca.a();
      this.bV.a();
      this.bW.a();
   }

   public cdb a(cdb.a $$0) {
      switch ($$0) {
         case c:
            this.b(cdb.a.c).gy();
            break;
         case d:
            this.a(atp.xL, 1.0F, 1.0F);
            this.b(cdb.a.d);
            break;
         case f:
            this.b(cdb.a.f).gz();
            break;
         case g:
            this.a(atp.xO, 1.0F, 1.0F);
            this.b(cdb.a.g);
            break;
         case b:
            this.a(atp.xP, 1.0F, 1.0F);
            this.b(cdb.a.b);
            break;
         case a:
            this.b(cdb.a.a);
            break;
         case e:
            this.b(cdb.a.e);
      }

      return this;
   }

   private cdb gy() {
      this.a(atp.xK, 1.0F, this.o_() ? 1.3F : 1.0F);
      return this;
   }

   private cdb gz() {
      this.am.b(cj, this.ag + 120);
      this.dJ().a(this, (byte)63);
      return this;
   }

   public cdb w(boolean $$0) {
      if ($$0) {
         this.j(this.aJ());
      }

      return this;
   }

   Optional<ib> gs() {
      return IntStream.range(0, 5)
         .mapToObj($$0 -> bzu.a(this, 10 + 2 * $$0, 3))
         .filter(Objects::nonNull)
         .map(ib::a)
         .filter($$0 -> this.dJ().D_().a($$0))
         .map(ib::d)
         .filter(this::i)
         .findFirst();
   }

   boolean gt() {
      return !this.gi() && !this.A() && !this.o_() && !this.aZ() && this.aC() && !this.bL() && this.i(this.gu().d());
   }

   private boolean i(ib $$0) {
      return this.dJ().a_($$0).a(aue.ck)
         && this.gB().noneMatch($$1 -> ik.a(this.dJ().ad(), $$0).equals($$1))
         && Optional.ofNullable(this.N().a($$0, 1)).map(eig::j).orElse(false);
   }

   private void gA() {
      if (!this.dJ().y_() && this.am.b(cj) == this.ag) {
         apa $$0 = (apa)this.dJ();
         ekg $$1 = $$0.o().aM().getLootTable(ejw.aK);
         eke $$2 = new eke.a($$0).a(emj.f, this.gv()).a(emj.a, this).a(emi.i);
         List<cpq> $$3 = $$1.a($$2);
         ib $$4 = this.gu();

         for (cpq $$5 : $$3) {
            cel $$6 = new cel($$0, (double)$$4.u(), (double)$$4.v(), (double)$$4.w(), $$5);
            $$6.u();
            $$0.b($$6);
         }

         this.a(atp.xJ, 1.0F, 1.0F);
      }
   }

   private cdb a(bob $$0) {
      boolean $$1 = $$0.b() > 1700L && $$0.b() < 6000L;
      if ($$1) {
         ib $$2 = this.gu();
         dme $$3 = this.dJ().a_($$2.d());
         if ($$3.l() != dfk.a) {
            for (int $$4 = 0; $$4 < 30; $$4++) {
               eov $$5 = eov.b($$2).b(0.0, -0.65F, 0.0);
               this.dJ().a(new jt(kb.c, $$3), $$5.c, $$5.d, $$5.e, 0.0, 0.0, 0.0);
            }

            if (this.ag % 10 == 0) {
               this.dJ().a(this.do(), this.dq(), this.du(), $$3.w().f(), this.cY(), 0.5F, 0.5F, false);
            }
         }
      }

      if (this.ag % 10 == 0) {
         this.dJ().a(dqr.u, this.gu(), dqr.a.a(this));
      }

      return this;
   }

   private cdb j(ib $$0) {
      List<ik> $$1 = this.gB().limit(20L).collect(Collectors.toList());
      $$1.add(0, ik.a(this.dJ().ad(), $$0));
      this.dM().a(bya.aQ, $$1);
      return this;
   }

   private Stream<ik> gB() {
      return this.dM().c(bya.aQ).stream().flatMap(Collection::stream);
   }

   @Override
   protected void fd() {
      super.fd();
      double $$0 = this.bM.c();
      if ($$0 > 0.0) {
         double $$1 = this.dm().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eov(0.0, 0.0, 1.0));
         }
      }
   }

   @Override
   public void a(apa $$0, cam $$1) {
      cpq $$2 = new cpq(cpt.kp);
      cel $$3 = new cel($$0, this.dh().a(), this.dh().b(), this.dh().c(), $$2);
      $$3.u();
      this.a($$0, $$1, null);
      this.a(atp.xQ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 0.5F);
      $$0.b($$3);
   }

   @Override
   public void a(bne $$0) {
      this.a(cdb.a.a);
      super.a($$0);
   }

   @Override
   public void l() {
      switch (this.gw()) {
         case f:
            this.a(this.bZ).gA();
            break;
         case e:
            this.gC();
      }

      super.l();
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      boolean $$3 = this.o($$2);
      bml $$4 = super.b($$0, $$1);
      if ($$4.a() && $$3) {
         this.dJ().a(null, this, this.d($$2), atq.g, 1.0F, awm.b(this.dJ().z, 0.8F, 1.2F));
      }

      return $$4;
   }

   private void gC() {
      if (this.dJ().y_() && this.ag % 20 == 0) {
         this.dJ().a(this.do(), this.dq(), this.du(), atp.xM, this.cY(), 1.0F, 1.0F, false);
      }
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.xE, 0.15F, 1.0F);
   }

   @Override
   public ato d(cpq $$0) {
      return atp.xF;
   }

   @Override
   protected ato y() {
      return Set.of(cdb.a.f, cdb.a.e).contains(this.gw()) ? null : atp.xG;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.xH;
   }

   @Override
   protected ato n_() {
      return atp.xI;
   }

   @Override
   public int fJ() {
      return 50;
   }

   @Override
   public void a(boolean $$0) {
      this.c_($$0 ? -48000 : 0);
   }

   @Override
   public boa a(apa $$0, boa $$1) {
      return bol.aP.a((cwe)$$0);
   }

   @Override
   public boolean a(cam $$0) {
      if (!($$0 instanceof cdb $$1)) {
         return false;
      } else {
         Set<cdb.a> $$2 = Set.of(cdb.a.a, cdb.a.c, cdb.a.b);
         return $$2.contains(this.gw()) && $$2.contains($$1.gw()) && super.a($$0);
      }
   }

   @Override
   public eoq i_() {
      return super.i_().g(0.6F);
   }

   @Override
   public boolean o(cpq $$0) {
      return $$0.a(aum.aP);
   }

   @Override
   protected bpy<?> a(Dynamic<?> $$0) {
      return cdc.a(this.dN().a($$0));
   }

   @Override
   public bpy<cdb> dM() {
      return (bpy<cdb>)super.dM();
   }

   @Override
   protected bpy.b<cdb> dN() {
      return bpy.a(cdc.b, cdc.a);
   }

   @Override
   protected void aa() {
      this.dJ().ae().a("snifferBrain");
      this.dM().a((apa)this.dJ(), this);
      this.dJ().ae().b("snifferActivityUpdate");
      cdc.a(this);
      this.dJ().ae().c();
      super.aa();
   }

   @Override
   protected void Z() {
      super.Z();
      aes.a(this);
   }

   public static enum a {
      a(0),
      b(1),
      c(2),
      d(3),
      e(4),
      f(5),
      g(6);

      public static final IntFunction<cdb.a> h = ave.a(cdb.a::a, values(), ave.a.a);
      public static final xq<ByteBuf, cdb.a> i = xo.a(h, cdb.a::a);
      private final int j;

      private a(int $$0) {
         this.j = $$0;
      }

      public int a() {
         return this.j;
      }
   }
}
