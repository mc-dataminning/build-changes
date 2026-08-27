import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cga extends ceg implements btq<ix<cer>> {
   protected static final ImmutableList<cdb<? extends cda<? super cga>>> bY = ImmutableList.of(cdb.c, cdb.f, cdb.v, cdb.s, cdb.w);
   protected static final ImmutableList<cbu<?>> bZ = ImmutableList.of(
      cbu.n, cbu.g, cbu.h, cbu.m, cbu.E, cbu.t, cbu.r, cbu.S, cbu.T, cbu.o, cbu.O, cbu.P, new cbu[]{cbu.R, cbu.x, cbu.y, cbu.B, cbu.X, cbu.Y, cbu.Z, cbu.aa}
   );
   private static final ajs<ix<cer>> cg = ajw.a(cga.class, aju.z);
   private static final ajs<OptionalInt> ch = ajw.a(cga.class, aju.v);
   private static final int ci = 5;
   public static final String cb = "variant";
   private static final akm<cer> cj = cer.a;
   public final brr cc = new brr();
   public final brr cd = new brr();
   public final brr ce = new brr();
   public final brr cf = new brr();

   public cga(bsc<? extends ceg> $$0, daz $$1) {
      super($$0, $$1);
      this.bO = new cga.a(this);
      this.a(enn.j, 4.0F);
      this.a(enn.e, -1.0F);
      this.bP = new byt(this, 85, 10, 0.02F, 0.1F, true);
   }

   @Override
   protected bts.b<cga> dT() {
      return bts.a(bZ, bY);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cgb.a(this.dT().a($$0));
   }

   @Override
   public bts<cga> dS() {
      return (bts<cga>)super.dS();
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cg, le.al.g(cj));
      $$0.a(ch, OptionalInt.empty());
   }

   @Override
   public void s() {
      this.ao.a(ch, OptionalInt.empty());
   }

   public Optional<brw> u() {
      return this.ao.a(ch).stream().mapToObj(this.dP()::a).filter(Objects::nonNull).findFirst();
   }

   @Override
   public void b(brw $$0) {
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

   public ix<cer> y() {
      return this.ao.a(cg);
   }

   @Override
   public void i(ix<cer> $$0) {
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
      Optional.ofNullable(akn.a($$0.l("variant"))).map($$0x -> akm.a(lf.B, $$0x)).flatMap(le.al::b).ifPresent(this::i);
   }

   @Override
   protected void Y() {
      this.dP().af().a("frogBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      this.dP().af().a("frogActivityUpdate");
      cgb.a(this);
      this.dP().af().c();
      super.Y();
   }

   @Override
   public void l() {
      if (this.dP().x_()) {
         this.cf.a(this.bh() && !this.aU.c(), this.ai);
      }

      super.l();
   }

   @Override
   public void a(ajs<?> $$0) {
      if (at.equals($$0)) {
         btc $$1 = this.ar();
         if ($$1 == btc.g) {
            this.cc.a(this.ai);
         } else {
            this.cc.a();
         }

         if ($$1 == btc.i) {
            this.cd.a(this.ai);
         } else {
            this.cd.a();
         }

         if ($$1 == btc.j) {
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
   public brq a(aqn $$0, brq $$1) {
      cga $$2 = bsc.R.a((daz)$$0);
      if ($$2 != null) {
         cgb.a($$2, $$0.E_());
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
   public void a(aqn $$0, ceg $$1) {
      this.a($$0, $$1, null);
      this.dS().a(cbu.Y, azh.a);
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      ix<dby> $$4 = $$0.t(this.dp());
      if ($$4.a(avw.ai)) {
         this.i(le.al.g(cer.c));
      } else if ($$4.a(avw.aj)) {
         this.i(le.al.g(cer.b));
      } else {
         this.i(le.al.g(cj));
      }

      cgb.a(this, $$0.E_());
      return super.a($$0, $$1, $$2, $$3);
   }

   public static btx.a gp() {
      return bss.A().a(bty.r, 1.0).a(bty.q, 10.0).a(bty.c, 10.0).a(bty.v, 1.0);
   }

   @Nullable
   @Override
   protected avh v() {
      return avi.jL;
   }

   @Nullable
   @Override
   protected avh d(bqp $$0) {
      return avi.jO;
   }

   @Nullable
   @Override
   protected avh o_() {
      return avi.jM;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.jR, 0.15F, 1.0F);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   protected void X() {
      super.X();
      agb.a(this);
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 5;
   }

   @Override
   public void a(eum $$0) {
      if (this.da() && this.be()) {
         this.a(this.fn(), $$0);
         this.a(bsv.a, this.ds());
         this.g(this.ds().a(0.9));
      } else {
         super.a($$0);
      }
   }

   public static boolean j(bsq $$0) {
      if ($$0 instanceof cjn $$1 && $$1.gq() != 1) {
         return false;
      }

      return $$0.ak().a(awa.n);
   }

   @Override
   protected ccc b(daz $$0) {
      return new cga.c(this, $$0);
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.al);
   }

   public static boolean c(bsc<? extends ceg> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.cg) && a($$1, $$3);
   }

   class a extends byq {
      a(bss $$0) {
         super($$0);
      }

      @Override
      protected boolean c() {
         return cga.this.u().isEmpty();
      }
   }

   static class b extends enf {
      private final io.a l = new io.a();

      public b(boolean $$0) {
         super($$0);
      }

      @Override
      public eni a() {
         return !this.b.be() ? super.a() : this.c(new io(ayf.a(this.b.cK().a), ayf.a(this.b.cK().b), ayf.a(this.b.cK().c)));
      }

      @Override
      public enn a(enp $$0, int $$1, int $$2, int $$3) {
         this.l.d($$1, $$2 - 1, $$3);
         drd $$4 = $$0.a(this.l);
         return $$4.a(avx.bR) ? enn.b : super.a($$0, $$1, $$2, $$3);
      }
   }

   static class c extends cbz {
      c(cga $$0, daz $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean b(enn $$0) {
         return $$0 != enn.k && super.b($$0);
      }

      @Override
      protected enm a(int $$0) {
         this.o = new cga.b(true);
         this.o.a(true);
         return new enm(this.o, $$0);
      }
   }
}
