import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elk extends emg {
   public static final MapCodec<elk> a = Codec.FLOAT.fieldOf("mossiness").xmap(elk::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsb[] e = new dsb[]{dfa.jD.o(), dfa.jK.o()};
   private final float f;

   public elk(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emj.c a(dca $$0, iz $$1, iz $$2, emj.c $$3, emj.c $$4, emf $$5) {
      azg $$6 = $$5.b($$4.a());
      dsb $$7 = $$4.b();
      iz $$8 = $$4.a();
      dsb $$9 = null;
      if ($$7.a(dfa.eH) || $$7.a(dfa.b) || $$7.a(dfa.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awo.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awo.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awo.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfa.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emj.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsb a(azg $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsb[] $$1 = new dsb[]{dfa.eJ.o(), a($$0, dfa.fj)};
         dsb[] $$2 = new dsb[]{dfa.eI.o(), a($$0, dfa.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsb a(azg $$0, dsb $$1) {
      je $$2 = $$1.c(dms.b);
      dta $$3 = $$1.c(dms.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsb[] $$4 = new dsb[]{dfa.ng.o().a(dms.b, $$2).a(dms.c, $$3), dfa.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsb b(azg $$0) {
      return $$0.i() < this.f ? dfa.nu.o() : null;
   }

   @Nullable
   private dsb c(azg $$0) {
      return $$0.i() < this.f ? dfa.nI.o() : null;
   }

   @Nullable
   private dsb d(azg $$0) {
      return $$0.i() < 0.15F ? dfa.pk.o() : null;
   }

   private static dsb a(azg $$0, dey $$1) {
      return $$1.o().a(dms.b, je.c.a.a($$0)).a(dms.c, ac.a(dta.values(), $$0));
   }

   private dsb a(azg $$0, dsb[] $$1, dsb[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsb a(azg $$0, dsb[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emi<?> a() {
      return emi.k;
   }
}
