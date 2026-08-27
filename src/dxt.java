import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dxt extends dyp {
   public static final Codec<dxt> a = Codec.FLOAT.fieldOf("mossiness").xmap(dxt::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dfa[] e = new dfa[]{csn.jD.n(), csn.jK.n()};
   private final float f;

   public dxt(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public dys.c a(cpp $$0, gu $$1, gu $$2, dys.c $$3, dys.c $$4, dyo $$5) {
      aru $$6 = $$5.b($$4.a());
      dfa $$7 = $$4.b();
      gu $$8 = $$4.a();
      dfa $$9 = null;
      if ($$7.a(csn.eI) || $$7.a(csn.b) || $$7.a(csn.eL)) {
         $$9 = this.a($$6);
      } else if ($$7.a(apl.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(apl.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(apl.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(csn.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new dys.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dfa a(aru $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfa[] $$1 = new dfa[]{csn.eK.n(), a($$0, csn.fj)};
         dfa[] $$2 = new dfa[]{csn.eJ.n(), a($$0, csn.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dfa a(aru $$0, dfa $$1) {
      ha $$2 = $$1.c(dag.a);
      dfz $$3 = $$1.c(dag.b);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dfa[] $$4 = new dfa[]{csn.ng.n().a(dag.a, $$2).a(dag.b, $$3), csn.nu.n()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dfa b(aru $$0) {
      return $$0.i() < this.f ? csn.nu.n() : null;
   }

   @Nullable
   private dfa c(aru $$0) {
      return $$0.i() < this.f ? csn.nI.n() : null;
   }

   @Nullable
   private dfa d(aru $$0) {
      return $$0.i() < 0.15F ? csn.pk.n() : null;
   }

   private static dfa a(aru $$0, csm $$1) {
      return $$1.n().a(dag.a, ha.c.a.a($$0)).a(dag.b, ac.a(dfz.values(), $$0));
   }

   private dfa a(aru $$0, dfa[] $$1, dfa[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dfa a(aru $$0, dfa[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected dyr<?> a() {
      return dyr.k;
   }
}
