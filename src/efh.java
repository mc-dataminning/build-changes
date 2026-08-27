import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class efh extends egd {
   public static final Codec<efh> a = Codec.FLOAT.fieldOf("mossiness").xmap(efh::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dme[] e = new dme[]{czh.jD.o(), czh.jK.o()};
   private final float f;

   public efh(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      awt $$6 = $$5.b($$4.a());
      dme $$7 = $$4.b();
      ib $$8 = $$4.a();
      dme $$9 = null;
      if ($$7.a(czh.eH) || $$7.a(czh.b) || $$7.a(czh.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aue.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aue.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aue.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(czh.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new egg.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dme a(awt $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dme[] $$1 = new dme[]{czh.eJ.o(), a($$0, czh.fj)};
         dme[] $$2 = new dme[]{czh.eI.o(), a($$0, czh.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dme a(awt $$0, dme $$1) {
      ih $$2 = $$1.c(dgy.b);
      dnd $$3 = $$1.c(dgy.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dme[] $$4 = new dme[]{czh.ng.o().a(dgy.b, $$2).a(dgy.c, $$3), czh.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dme b(awt $$0) {
      return $$0.i() < this.f ? czh.nu.o() : null;
   }

   @Nullable
   private dme c(awt $$0) {
      return $$0.i() < this.f ? czh.nI.o() : null;
   }

   @Nullable
   private dme d(awt $$0) {
      return $$0.i() < 0.15F ? czh.pk.o() : null;
   }

   private static dme a(awt $$0, czf $$1) {
      return $$1.o().a(dgy.b, ih.c.a.a($$0)).a(dgy.c, ac.a(dnd.values(), $$0));
   }

   private dme a(awt $$0, dme[] $$1, dme[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dme a(awt $$0, dme[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected egf<?> a() {
      return egf.k;
   }
}
