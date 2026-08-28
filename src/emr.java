import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class emr extends eno {
   public static final MapCodec<emr> a = Codec.FLOAT.fieldOf("mossiness").xmap(emr::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dtc[] e = new dtc[]{dga.jD.o(), dga.jK.o()};
   private final float f;

   public emr(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public enr.c a(dcz $$0, jd $$1, jd $$2, enr.c $$3, enr.c $$4, enn $$5) {
      ayw $$6 = $$5.b($$4.a());
      dtc $$7 = $$4.b();
      jd $$8 = $$4.a();
      dtc $$9 = null;
      if ($$7.a(dga.eH) || $$7.a(dga.b) || $$7.a(dga.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(awe.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(awe.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(awe.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dga.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new enr.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dtc a(ayw $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dtc[] $$1 = new dtc[]{dga.eJ.o(), a($$0, dga.fj)};
         dtc[] $$2 = new dtc[]{dga.eI.o(), a($$0, dga.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dtc a(ayw $$0, dtc $$1) {
      ji $$2 = $$1.c(dnt.b);
      dub $$3 = $$1.c(dnt.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dtc[] $$4 = new dtc[]{dga.ng.o().a(dnt.b, $$2).a(dnt.c, $$3), dga.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dtc b(ayw $$0) {
      return $$0.i() < this.f ? dga.nu.o() : null;
   }

   @Nullable
   private dtc c(ayw $$0) {
      return $$0.i() < this.f ? dga.nI.o() : null;
   }

   @Nullable
   private dtc d(ayw $$0) {
      return $$0.i() < 0.15F ? dga.pk.o() : null;
   }

   private static dtc a(ayw $$0, dfy $$1) {
      return $$1.o().a(dnt.b, ji.c.a.a($$0)).a(dnt.c, ad.a(dub.values(), $$0));
   }

   private dtc a(ayw $$0, dtc[] $$1, dtc[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dtc a(ayw $$0, dtc[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected enq<?> a() {
      return enq.k;
   }
}
