import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elx extends emt {
   public static final MapCodec<elx> a = Codec.FLOAT.fieldOf("mossiness").xmap(elx::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsk[] e = new dsk[]{dfj.jD.o(), dfj.jK.o()};
   private final float f;

   public elx(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emw.c a(dci $$0, ja $$1, ja $$2, emw.c $$3, emw.c $$4, ems $$5) {
      ayo $$6 = $$5.b($$4.a());
      dsk $$7 = $$4.b();
      ja $$8 = $$4.a();
      dsk $$9 = null;
      if ($$7.a(dfj.eH) || $$7.a(dfj.b) || $$7.a(dfj.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avw.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avw.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avw.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfj.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emw.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsk a(ayo $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsk[] $$1 = new dsk[]{dfj.eJ.o(), a($$0, dfj.fj)};
         dsk[] $$2 = new dsk[]{dfj.eI.o(), a($$0, dfj.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsk a(ayo $$0, dsk $$1) {
      jf $$2 = $$1.c(dnb.b);
      dtj $$3 = $$1.c(dnb.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsk[] $$4 = new dsk[]{dfj.ng.o().a(dnb.b, $$2).a(dnb.c, $$3), dfj.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsk b(ayo $$0) {
      return $$0.i() < this.f ? dfj.nu.o() : null;
   }

   @Nullable
   private dsk c(ayo $$0) {
      return $$0.i() < this.f ? dfj.nI.o() : null;
   }

   @Nullable
   private dsk d(ayo $$0) {
      return $$0.i() < 0.15F ? dfj.pk.o() : null;
   }

   private static dsk a(ayo $$0, dfh $$1) {
      return $$1.o().a(dnb.b, jf.c.a.a($$0)).a(dnb.c, ac.a(dtj.values(), $$0));
   }

   private dsk a(ayo $$0, dsk[] $$1, dsk[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsk a(ayo $$0, dsk[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emv<?> a() {
      return emv.k;
   }
}
