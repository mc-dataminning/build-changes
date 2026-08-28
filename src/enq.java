import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class enq extends eon {
   public static final MapCodec<enq> a = Codec.FLOAT.fieldOf("mossiness").xmap(enq::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dua[] e = new dua[]{dgx.jD.o(), dgx.jK.o()};
   private final float f;

   public enq(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eoq.c a(ddv $$0, je $$1, je $$2, eoq.c $$3, eoq.c $$4, eom $$5) {
      azk $$6 = $$5.b($$4.a());
      dua $$7 = $$4.b();
      je $$8 = $$4.a();
      dua $$9 = null;
      if ($$7.a(dgx.eH) || $$7.a(dgx.b) || $$7.a(dgx.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aws.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aws.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aws.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dgx.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eoq.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dua a(azk $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dua[] $$1 = new dua[]{dgx.eJ.o(), a($$0, dgx.fj)};
         dua[] $$2 = new dua[]{dgx.eI.o(), a($$0, dgx.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dua a(azk $$0, dua $$1) {
      jj $$2 = $$1.c(doq.b);
      duz $$3 = $$1.c(doq.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dua[] $$4 = new dua[]{dgx.ng.o().b(doq.b, $$2).b(doq.c, $$3), dgx.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dua b(azk $$0) {
      return $$0.i() < this.f ? dgx.nu.o() : null;
   }

   @Nullable
   private dua c(azk $$0) {
      return $$0.i() < this.f ? dgx.nI.o() : null;
   }

   @Nullable
   private dua d(azk $$0) {
      return $$0.i() < 0.15F ? dgx.pk.o() : null;
   }

   private static dua a(azk $$0, dgv $$1) {
      return $$1.o().b(doq.b, jj.c.a.a($$0)).b(doq.c, ad.a(duz.values(), $$0));
   }

   private dua a(azk $$0, dua[] $$1, dua[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dua a(azk $$0, dua[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eop<?> a() {
      return eop.k;
   }
}
