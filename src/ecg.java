import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ecg extends edc {
   public static final Codec<ecg> a = Codec.FLOAT.fieldOf("mossiness").xmap(ecg::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final djg[] e = new djg[]{cwr.jD.o(), cwr.jK.o()};
   private final float f;

   public ecg(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public edf.c a(ctr $$0, hx $$1, hx $$2, edf.c $$3, edf.c $$4, edb $$5) {
      auu $$6 = $$5.b($$4.a());
      djg $$7 = $$4.b();
      hx $$8 = $$4.a();
      djg $$9 = null;
      if ($$7.a(cwr.eH) || $$7.a(cwr.b) || $$7.a(cwr.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(asg.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(asg.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(asg.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cwr.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new edf.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private djg a(auu $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         djg[] $$1 = new djg[]{cwr.eJ.o(), a($$0, cwr.fj)};
         djg[] $$2 = new djg[]{cwr.eI.o(), a($$0, cwr.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private djg a(auu $$0, djg $$1) {
      ic $$2 = $$1.c(dei.b);
      dkf $$3 = $$1.c(dei.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         djg[] $$4 = new djg[]{cwr.ng.o().a(dei.b, $$2).a(dei.c, $$3), cwr.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private djg b(auu $$0) {
      return $$0.i() < this.f ? cwr.nu.o() : null;
   }

   @Nullable
   private djg c(auu $$0) {
      return $$0.i() < this.f ? cwr.nI.o() : null;
   }

   @Nullable
   private djg d(auu $$0) {
      return $$0.i() < 0.15F ? cwr.pk.o() : null;
   }

   private static djg a(auu $$0, cwp $$1) {
      return $$1.o().a(dei.b, ic.c.a.a($$0)).a(dei.c, ac.a(dkf.values(), $$0));
   }

   private djg a(auu $$0, djg[] $$1, djg[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static djg a(auu $$0, djg[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ede<?> a() {
      return ede.k;
   }
}
