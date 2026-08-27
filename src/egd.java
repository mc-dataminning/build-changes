import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class egd extends egz {
   public static final Codec<egd> a = Codec.FLOAT.fieldOf("mossiness").xmap(egd::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dmz[] e = new dmz[]{dac.jD.o(), dac.jK.o()};
   private final float f;

   public egd(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ehc.c a(cxc $$0, ib $$1, ib $$2, ehc.c $$3, ehc.c $$4, egy $$5) {
      axd $$6 = $$5.b($$4.a());
      dmz $$7 = $$4.b();
      ib $$8 = $$4.a();
      dmz $$9 = null;
      if ($$7.a(dac.eH) || $$7.a(dac.b) || $$7.a(dac.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aun.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aun.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aun.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dac.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ehc.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dmz a(axd $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dmz[] $$1 = new dmz[]{dac.eJ.o(), a($$0, dac.fj)};
         dmz[] $$2 = new dmz[]{dac.eI.o(), a($$0, dac.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dmz a(axd $$0, dmz $$1) {
      ih $$2 = $$1.c(dht.b);
      dny $$3 = $$1.c(dht.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dmz[] $$4 = new dmz[]{dac.ng.o().a(dht.b, $$2).a(dht.c, $$3), dac.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dmz b(axd $$0) {
      return $$0.i() < this.f ? dac.nu.o() : null;
   }

   @Nullable
   private dmz c(axd $$0) {
      return $$0.i() < this.f ? dac.nI.o() : null;
   }

   @Nullable
   private dmz d(axd $$0) {
      return $$0.i() < 0.15F ? dac.pk.o() : null;
   }

   private static dmz a(axd $$0, daa $$1) {
      return $$1.o().a(dht.b, ih.c.a.a($$0)).a(dht.c, ac.a(dny.values(), $$0));
   }

   private dmz a(axd $$0, dmz[] $$1, dmz[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dmz a(axd $$0, dmz[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ehb<?> a() {
      return ehb.k;
   }
}
