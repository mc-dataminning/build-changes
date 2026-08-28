import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgi extends ceo implements bty<jj<cez>> {
   protected static final ImmutableList<cdj<? extends cdi<? super cgi>>> ca = ImmutableList.of(cdj.c, cdj.f, cdj.v, cdj.s, cdj.w);
   protected static final ImmutableList<ccc<?>> cb = ImmutableList.of(
      ccc.n, ccc.g, ccc.h, ccc.m, ccc.E, ccc.t, ccc.r, ccc.S, ccc.T, ccc.o, ccc.O, ccc.P, new ccc[]{ccc.R, ccc.x, ccc.y, ccc.B, ccc.X, ccc.Y, ccc.Z, ccc.aa}
   );
   private static final ajp<jj<cez>> ci = ajt.a(cgi.class, ajr.z);
   private static final ajp<OptionalInt> cj = ajt.a(cgi.class, ajr.v);
   private static final int ck = 5;
   public static final String cd = "variant";
   private static final akj<cez> cl = cez.a;
   public final bry ce = new bry();
   public final bry cf = new bry();
   public final bry cg = new bry();
   public final bry ch = new bry();

   public cgi(bsj<? extends ceo> $$0, dcd $$1) {
      super($$0, $$1);
      this.bQ = new cgi.a(this);
      this.a(eos.j, 4.0F);
      this.a(eos.e, -1.0F);
      this.bR = new bzb(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bua.b<cgi> dU() {
      return bua.a(cb, ca);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cgj.a(this.dU().a($$0));
   }

   @Override
   public bua<cgi> dT() {
      return (bua<cgi>)super.dT();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ci, lq.aj.g(cl));
      $$0.a(cj, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(cj, OptionalInt.empty());
   }

   public Optional<bsd> u() {
      return this.ao.a(cj).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bsd $$0) {
      this.ao.a(cj, OptionalInt.of($$0.al()));
   }

   @Override
   public int ae() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public jj<cez> y() {
      return this.ao.a(ci);
   }

   @Override
   public void i(jj<cez> $$0) {
      this.ao.a(ci, $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cl).a().toString());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      Optional.ofNullable(akk.a($$0.l("variant"))).map($$0x -> akj.a(lr.F, $$0x)).flatMap(lq.aj::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("frogBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("frogActivityUpdate");
      cgj.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dP().x_()) {
         this.ch.a(this.bh() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajp<?> $$0) {
      if (at.equals($$0)) {
         btk $$1 = this.ar();
         if ($$1 == btk.g) {
            this.ce.a(this.ai);
         } else {
            this.ce.a();
         }

         if ($$1 == btk.i) {
            this.cf.a(this.ai);
         } else {
            this.cf.a();
         }

         if ($$1 == btk.j) {
            this.cg.a(this.ai);
         } else {
            this.cg.a();
         }
      }

      super.a($$0);
   }

   @Override
   protected void y(float $$0) {
      float $$1;
      if (this.ce.c()) {
         $$1 = 0.0F;
      } else {
         $$1 = Math.min($$0 * 25.0F, 1.0F);
      }

      this.aU.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      cgi $$2 = bsj.R.a((dcd)$$0);
      if ($$2 != null) {
         cgj.a($$2, $$0.E_());
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
   public void a(aqk $$0, ceo $$1) {
      this.a($$0, $$1, null);
      this.dT().a(ccc.Y, azh.a);
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      jj<ddd> $$4 = $$0.t(this.dp());
      if ($$4.a(avt.ai)) {
         this.i(lq.aj.g(cez.c));
      } else if ($$4.a(avt.aj)) {
         this.i(lq.aj.g(cez.b));
      } else {
         this.i(lq.aj.g(cl));
      }

      cgj.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buf.a gn() {
      return bta.A().a(bug.v, 1.0).a(bug.s, 10.0).a(bug.c, 10.0).a(bug.B, 1.0);
   }

   @Nullable
   @Override
   protected ave v() {
      return avf.jL;
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return avf.jO;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.jM;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(evz $$0) {
      if (this.da() && this.be()) {
         this.a(this.fj(), $$0);
         this.a(btd.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bsy $$0) {
      if ($$0 instanceof cjw $$1 && $$1.go() != 1) {
         return false;
      }

      return $$0.ak().a(avy.n);
   }

   @Override
   protected cck b(dcd $$0) {
      return new cgi.c(this, $$0);
   }

   @Nullable
   @Override
   public bsy p() {
      return this.N();
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.al);
   }

   public static boolean c(bsj<? extends ceo> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avu.cg) && a($$1, $$3);
   }

   class a extends byy {
      a(final bta $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgi.this.u().isEmpty();
      }
   }

   static class b extends eok {
      private final ja.a l = new ja.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eon a() {
         return !this.b.be() ? super.a() : this.c(new ja(aye.a(this.b.cK().a), aye.a(this.b.cK().b), aye.a(this.b.cK().c)));
      }

      @Override
      public eos a(eou $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsh $$4 = $$0.a(this.l);
         return $$4.a(avu.bR) ? eos.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cch {
      c(cgi $$0, dcd $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eos $$0) {
         return $$0 != eos.k && super.b($$0);
      }

      @Override
      protected eor a(int $$0) {
         this.o = new cgi.b(true);
         this.o.a(true);
         return new eor(this.o, $$0);
      }
   }
}
