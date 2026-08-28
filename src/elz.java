import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elz extends emv {
   public static final MapCodec<elz> a = Codec.FLOAT.fieldOf("mossiness").xmap(elz::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsl[] e = new dsl[]{dfk.jD.o(), dfk.jK.o()};
   private final float f;

   public elz(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emy.c a(dcj $$0, ja $$1, ja $$2, emy.c $$3, emy.c $$4, emu $$5) {
      ayo $$6 = $$5.b($$4.a());
      dsl $$7 = $$4.b();
      ja $$8 = $$4.a();
      dsl $$9 = null;
      if ($$7.a(dfk.eH) || $$7.a(dfk.b) || $$7.a(dfk.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avw.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avw.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avw.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfk.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emy.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsl a(ayo $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsl[] $$1 = new dsl[]{dfk.eJ.o(), a($$0, dfk.fj)};
         dsl[] $$2 = new dsl[]{dfk.eI.o(), a($$0, dfk.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsl a(ayo $$0, dsl $$1) {
      jf $$2 = $$1.c(dnc.b);
      dtk $$3 = $$1.c(dnc.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsl[] $$4 = new dsl[]{dfk.ng.o().a(dnc.b, $$2).a(dnc.c, $$3), dfk.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsl b(ayo $$0) {
      return $$0.i() < this.f ? dfk.nu.o() : null;
   }

   @Nullable
   private dsl c(ayo $$0) {
      return $$0.i() < this.f ? dfk.nI.o() : null;
   }

   @Nullable
   private dsl d(ayo $$0) {
      return $$0.i() < 0.15F ? dfk.pk.o() : null;
   }

   private static dsl a(ayo $$0, dfi $$1) {
      return $$1.o().a(dnc.b, jf.c.a.a($$0)).a(dnc.c, ac.a(dtk.values(), $$0));
   }

   private dsl a(ayo $$0, dsl[] $$1, dsl[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsl a(ayo $$0, dsl[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emx<?> a() {
      return emx.k;
   }
}
