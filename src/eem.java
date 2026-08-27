import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class eem extends efi {
   public static final Codec<eem> a = Codec.FLOAT.fieldOf("mossiness").xmap(eem::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dlj[] e = new dlj[]{cyu.jD.o(), cyu.jK.o()};
   private final float f;

   public eem(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      awp $$6 = $$5.b($$4.a());
      dlj $$7 = $$4.b();
      hz $$8 = $$4.a();
      dlj $$9 = null;
      if ($$7.a(cyu.eH) || $$7.a(cyu.b) || $$7.a(cyu.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(aua.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(aua.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(aua.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cyu.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new efl.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dlj a(awp $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dlj[] $$1 = new dlj[]{cyu.eJ.o(), a($$0, cyu.fj)};
         dlj[] $$2 = new dlj[]{cyu.eI.o(), a($$0, cyu.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dlj a(awp $$0, dlj $$1) {
      ie $$2 = $$1.c(dgl.b);
      dmi $$3 = $$1.c(dgl.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dlj[] $$4 = new dlj[]{cyu.ng.o().a(dgl.b, $$2).a(dgl.c, $$3), cyu.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dlj b(awp $$0) {
      return $$0.i() < this.f ? cyu.nu.o() : null;
   }

   @Nullable
   private dlj c(awp $$0) {
      return $$0.i() < this.f ? cyu.nI.o() : null;
   }

   @Nullable
   private dlj d(awp $$0) {
      return $$0.i() < 0.15F ? cyu.pk.o() : null;
   }

   private static dlj a(awp $$0, cys $$1) {
      return $$1.o().a(dgl.b, ie.c.a.a($$0)).a(dgl.c, ac.a(dmi.values(), $$0));
   }

   private dlj a(awp $$0, dlj[] $$1, dlj[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dlj a(awp $$0, dlj[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected efk<?> a() {
      return efk.k;
   }
}
