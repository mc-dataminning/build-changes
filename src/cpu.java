import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cpu extends cpq {
   private static final int bH = 50;
   private static final float bI = 0.35F;
   private static final int bJ = 7;
   private static final double bK = 12.0;
   protected static final ImmutableList<chn<? extends chm<? super cpu>>> d = ImmutableList.of(chn.c, chn.d, chn.b, chn.f, chn.m);
   protected static final ImmutableList<cgg<?>> bG = ImmutableList.of(
      cgg.o, cgg.w, cgg.g, cgg.h, cgg.k, cgg.l, cgg.ap, cgg.ao, cgg.y, cgg.z, cgg.n, cgg.F, new cgg[]{cgg.p, cgg.q, cgg.r, cgg.u, cgg.ac, cgg.N, cgg.b}
   );

   public cpu(bwo<? extends cpu> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 20;
   }

   public static byj.a n() {
      return cod.gu().a(byk.s, 50.0).a(byk.v, 0.35F).a(byk.c, 7.0).a(byk.m, 12.0);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      cpv.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      this.a(bwp.a, new czd(czh.pN));
   }

   @Override
   protected bye.b<cpu> ed() {
      return bye.a(bG, d);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cpv.a(this, this.ed().a($$0));
   }

   @Override
   public bye<cpu> ec() {
      return (bye<cpu>)super.ec();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(arq $$0, czd $$1) {
      return $$1.a(czh.pN) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      cpv.b(this);
      cpv.c(this);
      super.a($$0);
   }

   @Override
   public cpt x() {
      return this.gi() && this.gr() ? cpt.a : cpt.f;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxe $$4) {
         cpv.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awm u() {
      return awn.uD;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.uG;
   }

   @Override
   protected awm l_() {
      return awn.uF;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.uH, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(awn.uE);
   }

   @Override
   protected void gs() {
      this.b(awn.uI);
   }
}
