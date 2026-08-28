import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class elr extends emn {
   public static final MapCodec<elr> a = Codec.FLOAT.fieldOf("mossiness").xmap(elr::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dsh[] e = new dsh[]{dfh.jD.o(), dfh.jK.o()};
   private final float f;

   public elr(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public emq.c a(dcg $$0, ja $$1, ja $$2, emq.c $$3, emq.c $$4, emm $$5) {
      aym $$6 = $$5.b($$4.a());
      dsh $$7 = $$4.b();
      ja $$8 = $$4.a();
      dsh $$9 = null;
      if ($$7.a(dfh.eH) || $$7.a(dfh.b) || $$7.a(dfh.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(avu.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(avu.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(avu.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dfh.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new emq.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dsh a(aym $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsh[] $$1 = new dsh[]{dfh.eJ.o(), a($$0, dfh.fj)};
         dsh[] $$2 = new dsh[]{dfh.eI.o(), a($$0, dfh.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dsh a(aym $$0, dsh $$1) {
      jf $$2 = $$1.c(dmz.b);
      dtg $$3 = $$1.c(dmz.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dsh[] $$4 = new dsh[]{dfh.ng.o().a(dmz.b, $$2).a(dmz.c, $$3), dfh.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dsh b(aym $$0) {
      return $$0.i() < this.f ? dfh.nu.o() : null;
   }

   @Nullable
   private dsh c(aym $$0) {
      return $$0.i() < this.f ? dfh.nI.o() : null;
   }

   @Nullable
   private dsh d(aym $$0) {
      return $$0.i() < 0.15F ? dfh.pk.o() : null;
   }

   private static dsh a(aym $$0, dff $$1) {
      return $$1.o().a(dmz.b, jf.c.a.a($$0)).a(dmz.c, ac.a(dtg.values(), $$0));
   }

   private dsh a(aym $$0, dsh[] $$1, dsh[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dsh a(aym $$0, dsh[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected emp<?> a() {
      return emp.k;
   }
}
