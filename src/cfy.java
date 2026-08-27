import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cfy extends cee implements bto<ix<cep>> {
   protected static final ImmutableList<ccz<? extends ccy<? super cfy>>> bY = ImmutableList.of(ccz.c, ccz.f, ccz.v, ccz.s, ccz.w);
   protected static final ImmutableList<cbs<?>> bZ = ImmutableList.of(
      cbs.n, cbs.g, cbs.h, cbs.m, cbs.E, cbs.t, cbs.r, cbs.S, cbs.T, cbs.o, cbs.O, cbs.P, new cbs[]{cbs.R, cbs.x, cbs.y, cbs.B, cbs.X, cbs.Y, cbs.Z, cbs.aa}
   );
   private static final ajr<ix<cep>> cg = ajv.a(cfy.class, ajt.z);
   private static final ajr<OptionalInt> ch = ajv.a(cfy.class, ajt.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final akl<cep> cj = cep.a;
   public final brp cc = new brp();
   public final brp cd = new brp();
   public final brp ce = new brp();
   public final brp cf = new brp();

   public cfy(bsa<? extends cee> $$0, dax $$1) {
      super($$0, $$1);
      this.bO = new cfy.a(this);
      this.a(enl.j, 4.0F);
      this.a(enl.e, -1.0F);
      this.bP = new byr(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected btq.b<cfy> dT() {
      return btq.a(bZ, bY);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return cfz.a(this.dT().a($$0));
   }

   @Override
   public btq<cfy> dS() {
      return (btq<cfy>)super.dS();
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cg, le.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<bru> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bru $$0) {
      this.ao.a(ch, OptionalInt.of($$0.al()));
   }

   @Override
   public int ad() {
      return 35;
   }

   @Override
   public int aa() {
      return 5;
   }

   public ix<cep> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ix<cep> $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      Optional.ofNullable(akm.a($$0.l("variant"))).map($$0x -> akl.a(lf.B, $$0x)).flatMap(le.al::b).ifPresent(this::i);
   }

   @Override
   protected void Y() {
      this.dP().af().a("frogBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("frogActivityUpdate");
      cfz.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dP().x_()) {
         this.cf.a(this.bh() && !this.aV.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajr<?> $$0) {
      if (at.equals($$0)) {
         bta $$1 = this.ar();
         if ($$1 == bta.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == bta.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == bta.j) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void x(float $$0) {
      float $$1;
      if (this.cc.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aV.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bro a(aqm $$0, bro $$1) {
      cfy $$2 = bsa.R.a((dax)$$0);
      if ($$2 != null) {
         cfz.a($$2, $$0.E_());
      }

      return $$2;
   }

   @Override
   public boolean p_() {
      return false;
   }

   @Override
   public void a(boolean $$0) {
   }

   @Override
   public void a(aqm $$0, cee $$1) {
      this.a($$0, $$1, null);
      this.dS().a(cbs.Y, azf.a);
   }

   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ix<dbw> $$4 = $$0.t(this.dp());
      if ($$4.a(avv.ai)) {
         this.i(le.al.g(cep.c));
      } else if ($$4.a(avv.aj)) {
         this.i(le.al.g(cep.b));
      } else {
         this.i(le.al.g(cj));
      }

      cfz.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static btv.a gp() {
      return bsq.A().a(btw.r, 1.0).a(btw.q, 10.0).a(btw.c, 10.0).a(btw.v, 1.0);
   }

   @Nullable
   @Override
   protected avg v() {
      return avh.jL;
   }

   @Nullable
   @Override
   protected avg d(bqn $$0) {
      return avh.jO;
   }

   @Nullable
   @Override
   protected avg o_() {
      return avh.jM;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      aga.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(euk $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bst.a, this.ds());
         this.g(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bso $$0) {
      if ($$0 instanceof cjl $$1 && $$1.gq() != 1) {
         return false;
      }

      return $$0.ak().a(avz.n);
   }

   @Override
   protected cca b(dax $$0) {
      return new cfy.c(this, $$0);
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.al);
   }

   public static boolean c(bsa<? extends cee> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.cg) && a($$1, $$3);
   }

   class a extends byo {
      a(bsq $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cfy.this.u().isEmpty();
      }
   }

   static class b extends end {
      private final io.a l = new io.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eng a() {
         return !this.b.be() ? super.a() : this.c(new io(ayd.a(this.b.cK().a), ayd.a(this.b.cK().b), ayd.a(this.b.cK().c)));
      }

      @Override
      public enl a(enn $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         drb $$4 = $$0.a(this.l);
         return $$4.a(avw.bR) ? enl.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cbx {
      c(cfy $$0, dax $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(enl $$0) {
         return $$0 != enl.k && super.b($$0);
      }

      @Override
      protected enk a(int $$0) {
         this.o = new cfy.b(true);
         this.o.a(true);
         return new enk(this.o, $$0);
      }
   }
}
