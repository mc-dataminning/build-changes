import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cpa extends cow {
   private static final int bF = 50;
   private static final float bG = 0.35F;
   private static final int bH = 7;
   private static final double bI = 12.0;
   protected static final ImmutableList<cha<? extends cgz<? super cpa>>> d = ImmutableList.of(cha.c, cha.d, cha.b, cha.f, cha.m);
   protected static final ImmutableList<cft<?>> bE = ImmutableList.of(
      cft.o, cft.w, cft.g, cft.h, cft.k, cft.l, cft.ap, cft.ao, cft.y, cft.z, cft.n, cft.F, new cft[]{cft.p, cft.q, cft.r, cft.u, cft.ac, cft.N, cft.b}
   );

   public cpa(bwb<? extends cpa> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 20;
   }

   public static bxw.a n() {
      return cnj.gt().a(bxx.s, 50.0).a(bxx.v, 0.35F).a(bxx.c, 7.0).a(bxx.m, 12.0);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      cpb.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      this.a(bwc.a, new cxy(cyc.pI));
   }

   @Override
   protected bxr.b<cpa> ec() {
      return bxr.a(bE, d);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cpb.a(this, this.ec().a($$0));
   }

   @Override
   public bxr<cpa> eb() {
      return (bxr<cpa>)super.eb();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(arn $$0, cxy $$1) {
      return $$1.a(cyc.pI) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpb.b(this);
      cpb.c(this);
      super.a($$0);
   }

   @Override
   public coz x() {
      return this.gh() && this.gq() ? coz.a : coz.f;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bwr $$4) {
         cpb.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awj u() {
      return awk.uz;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.uC;
   }

   @Override
   protected awj l_() {
      return awk.uB;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.uD, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(awk.uA);
   }

   @Override
   protected void gr() {
      this.b(awk.uE);
   }
}
