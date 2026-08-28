import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cis extends cgy implements bwh<jq<chj>> {
   protected static final ImmutableList<cfs<? extends cfr<? super cis>>> bY = ImmutableList.of(cfs.c, cfs.f, cfs.v, cfs.s, cfs.w);
   protected static final ImmutableList<cel<?>> bZ = ImmutableList.of(
      cel.n, cel.g, cel.h, cel.m, cel.E, cel.t, cel.r, cel.S, cel.T, cel.o, cel.O, cel.P, new cel[]{cel.R, cel.x, cel.y, cel.B, cel.X, cel.Y, cel.Z, cel.aa}
   );
   private static final akm<jq<chj>> cg = akq.a(cis.class, ako.z);
   private static final akm<OptionalInt> ch = akq.a(cis.class, ako.v);
   private static final int ci = 5;
   public static final String ca = "variant";
   private static final ali<chj> cj = chj.b;
   public final bud cc = new bud();
   public final bud cd = new bud();
   public final bud ce = new bud();
   public final bud cf = new bud();

   public cis(bus<? extends cgy> $$0, dfm $$1) {
      super($$0, $$1);
      this.bO = new cis.a(this);
      this.a(esm.j, 4.0F);
      this.a(esm.e, -1.0F);
      this.bP = new cbk(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bwj.b<cis> ec() {
      return bwj.a(bZ, bY);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return cit.a(this.ec().a($$0));
   }

   @Override
   public bwj<cis> eb() {
      return (bwj<cis>)super.eb();
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cg, lz.aj.b(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void n() {
      this.al.a(ch, OptionalInt.empty());
   }

   public Optional<bul> q() {
      return this.al.a(ch).stream().mapToObj(this.dV()::a).filter(Objects::nonNull).findFirst();
   }

   public void b(bul $$0) {
      this.al.a(ch, OptionalInt.of($$0.ar()));
   }

   @Override
   public int ac() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public jq<chj> v() {
      return this.al.a(cg);
   }

   public void j(jq<chj> $$0) {
      this.al.a(cg, $$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("variant", this.v().e().orElse(cj).a().toString());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      Optional.ofNullable(alj.c($$0.l("variant"))).map($$0x -> ali.a(ma.F, $$0x)).flatMap(lz.aj::a).ifPresent(this::j);
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("frogBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("frogActivityUpdate");
      cit.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public void h() {
      if (this.dV().A_()) {
         this.cf.a(this.bm() && !this.aS.d(), this.af);
      }

      super.h();
   }

   @Override
   public void a(akm<?> $$0) {
      if (aq.equals($$0)) {
         bvt $$1 = this.aw();
         if ($$1 == bvt.g) {
            this.cc.a(this.af);
         } else {
            this.cc.a();
         }

         if ($$1 == bvt.i) {
            this.cd.a(this.af);
         } else {
            this.cd.a();
         }

         if ($$1 == bvt.j) {
            this.ce.a(this.af);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void B(float $$0) {
      float $$1;
      if (this.cc.b()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aS.a($$1, 0.4F, this.e_() ? 3.0F : 1.0F);
   }

   @Override
   public void gs() {
      this.dV().a(null, this, awn.jO, awo.g, 2.0F, 1.0F);
   }

   @Nullable
   @Override
   public buc a(arp $$0, buc $$1) {
      cis $$2 = bus.aa.a($$0, bur.e);
      if ($$2 != null) {
         cit.a($$2, $$0.G_());
      }

      return $$2;
   }

   @Override
   public boolean e_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(arp $$0, cgy $$1) {
      this.a($$0, $$1, null);
      this.eb().a(cel.Y, bas.a);
   }

   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      jq<dgo> $$4 = $$0.t(this.dv());
      if ($$4.a(axb.ai)) {
         this.j(lz.aj.b(chj.d));
      } else if ($$4.a(axb.aj)) {
         this.j(lz.aj.b(chj.c));
      } else {
         this.j(lz.aj.b(cj));
      }

      cit.a(this, $$0.G_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static bwo.a gm() {
      return cgy.gr().a(bwp.v, 1.0).a(bwp.s, 10.0).a(bwp.c, 10.0).a(bwp.B, 1.0);
   }

   @Nullable
   @Override
   protected awm t() {
      return awn.jM;
   }

   @Nullable
   @Override
   protected awm e(btb $$0) {
      return awn.jP;
   }

   @Nullable
   @Override
   protected awm n_() {
      return awn.jN;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.jS, 0.15F, 1.0F);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 5;
   }

   @Override
   public void a_(ezy $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bvl.a, this.dy());
         this.h(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   public static boolean j(bvh $$0) {
      if ($$0 instanceof cmh $$1 && $$1.gn() != 1) {
         return false;
      }

      return $$0.aq().a(axg.n);
   }

   @Override
   protected cet b(dfm $$0) {
      return new cis.c(this, $$0);
   }

   @Nullable
   @Override
   public bvh aa_() {
      return this.O();
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ap);
   }

   public static boolean c(bus<? extends cgy> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.ch) && a($$1, $$3);
   }

   class a extends cbh {
      a(final bvj $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cis.this.q().isEmpty();
      }
   }

   static class b extends ese {
      private final jh.a l = new jh.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public esh a() {
         return !this.b.bj() ? super.a() : this.c(new jh(azm.a(this.b.cR().a), azm.a(this.b.cR().b), azm.a(this.b.cR().c)));
      }

      @Override
      public esm a(eso $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dvv $$4 = $$0.a(this.l);
         return $$4.a(axc.bS) ? esm.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ceq {
      c(cis $$0, dfm $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(esm $$0) {
         return $$0 != esm.k && super.b($$0);
      }

      @Override
      protected esl a(int $$0) {
         this.o = new cis.b(true);
         this.o.a(true);
         return new esl(this.o, $$0);
      }
   }
}
