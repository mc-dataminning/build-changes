import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cgx extends cfd implements bun<ji<cfo>> {
   protected static final ImmutableList<cdy<? extends cdx<? super cgx>>> bY = ImmutableList.of(cdy.c, cdy.f, cdy.v, cdy.s, cdy.w);
   protected static final ImmutableList<ccr<?>> bZ = ImmutableList.of(
      ccr.n, ccr.g, ccr.h, ccr.m, ccr.E, ccr.t, ccr.r, ccr.S, ccr.T, ccr.o, ccr.O, ccr.P, new ccr[]{ccr.R, ccr.x, ccr.y, ccr.B, ccr.X, ccr.Y, ccr.Z, ccr.aa}
   );
   private static final akj<ji<cfo>> cg = akn.a(cgx.class, akl.z);
   private static final akj<OptionalInt> ch = akn.a(cgx.class, akl.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final ald<cfo> cj = cfo.a;
   public final bsn cc = new bsn();
   public final bsn cd = new bsn();
   public final bsn ce = new bsn();
   public final bsn cf = new bsn();

   public cgx(bsy<? extends cfd> $$0, dbw $$1) {
      super($$0, $$1);
      this.bO = new cgx.a(this);
      this.a(eok.j, 4.0F);
      this.a(eok.e, -1.0F);
      this.bP = new bzq(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bup.b<cgx> dT() {
      return bup.a(bZ, bY);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return cgy.a(this.dT().a($$0));
   }

   @Override
   public bup<cgx> dS() {
      return (bup<cgx>)super.dS();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cg, lp.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<bss> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(bss $$0) {
      this.ao.a(ch, OptionalInt.of($$0.al()));
   }

   @Override
   public int ae() {
      return 35;
   }

   @Override
   public int ab() {
      return 5;
   }

   public ji<cfo> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ji<cfo> $$0) {
      this.ao.a(cg, $$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("variant", this.y().e().orElse(cj).a().toString());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      Optional.ofNullable(ale.a($$0.l("variant"))).map($$0x -> ald.a(lq.B, $$0x)).flatMap(lp.al::b).ifPresent(this::i);
   }

   @Override
   protected void Z() {
      this.dP().ag().a("frogBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      this.dP().ag().a("frogActivityUpdate");
      cgy.a(this);
      this.dP().ag().c();
      super.Z();
   }

   @Override
   public void l() {
      if (this.dP().x_()) {
         this.cf.a(this.bh() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(akj<?> $$0) {
      if (at.equals($$0)) {
         btz $$1 = this.ar();
         if ($$1 == btz.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == btz.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == btz.j) {
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

      this.aU.a($$1, 0.4F);
   }

   @Nullable
   @Override
   public bsm a(are $$0, bsm $$1) {
      cgx $$2 = bsy.R.a((dbw)$$0);
      if ($$2 != null) {
         cgy.a($$2, $$0.E_());
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
   public void a(are $$0, cfd $$1) {
      this.a($$0, $$1, null);
      this.dS().a(ccr.Y, baa.a);
   }

   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      ji<dcv> $$4 = $$0.t(this.dp());
      if ($$4.a(awn.ai)) {
         this.i(lp.al.g(cfo.c));
      } else if ($$4.a(awn.aj)) {
         this.i(lp.al.g(cfo.b));
      } else {
         this.i(lp.al.g(cj));
      }

      cgy.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static buu.a gq() {
      return btp.A().a(buv.r, 1.0).a(buv.q, 10.0).a(buv.c, 10.0).a(buv.v, 1.0);
   }

   @Nullable
   @Override
   protected avy v() {
      return avz.jL;
   }

   @Nullable
   @Override
   protected avy d(brl $$0) {
      return avz.jO;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.jM;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void Y() {
      super.Y();
      ags.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(evp $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bts.a, this.ds());
         this.h(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(btn $$0) {
      if ($$0 instanceof ckk $$1 && $$1.gr() != 1) {
         return false;
      }

      return $$0.ak().a(aws.n);
   }

   @Override
   protected ccz b(dbw $$0) {
      return new cgx.c(this, $$0);
   }

   @Nullable
   @Override
   public btn p() {
      return this.N();
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.al);
   }

   public static boolean c(bsy<? extends cfd> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.a_($$3.d()).a(awo.cg) && a($$1, $$3);
   }

   class a extends bzn {
      a(final btp $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cgx.this.u().isEmpty();
      }
   }

   static class b extends eoc {
      private final iz.a l = new iz.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eof a() {
         return !this.b.be() ? super.a() : this.c(new iz(ayx.a(this.b.cK().a), ayx.a(this.b.cK().b), ayx.a(this.b.cK().c)));
      }

      @Override
      public eok a(eom $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         dsa $$4 = $$0.a(this.l);
         return $$4.a(awo.bR) ? eok.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends ccw {
      c(cgx $$0, dbw $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(eok $$0) {
         return $$0 != eok.k && super.b($$0);
      }

      @Override
      protected eoj a(int $$0) {
         this.o = new cgx.b(true);
         this.o.a(true);
         return new eoj(this.o, $$0);
      }
   }
}
