import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class ech extends edd {
   public static final Codec<ech> a = Codec.FLOAT.fieldOf("mossiness").xmap(ech::new, $$0 -> $$0.f).codec();
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final djh[] e = new djh[]{cws.jD.o(), cws.jK.o()};
   private final float f;

   public ech(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public edg.c a(cts $$0, hx $$1, hx $$2, edg.c $$3, edg.c $$4, edc $$5) {
      auv $$6 = $$5.b($$4.a());
      djh $$7 = $$4.b();
      hx $$8 = $$4.a();
      djh $$9 = null;
      if ($$7.a(cws.eH) || $$7.a(cws.b) || $$7.a(cws.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(ash.J)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(ash.K)) {
         $$9 = this.b($$6);
      } else if ($$7.a(ash.L)) {
         $$9 = this.c($$6);
      } else if ($$7.a(cws.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new edg.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private djh a(auv $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         djh[] $$1 = new djh[]{cws.eJ.o(), a($$0, cws.fj)};
         djh[] $$2 = new djh[]{cws.eI.o(), a($$0, cws.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private djh a(auv $$0, djh $$1) {
      ic $$2 = $$1.c(dej.b);
      dkg $$3 = $$1.c(dej.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         djh[] $$4 = new djh[]{cws.ng.o().a(dej.b, $$2).a(dej.c, $$3), cws.nu.o()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private djh b(auv $$0) {
      return $$0.i() < this.f ? cws.nu.o() : null;
   }

   @Nullable
   private djh c(auv $$0) {
      return $$0.i() < this.f ? cws.nI.o() : null;
   }

   @Nullable
   private djh d(auv $$0) {
      return $$0.i() < 0.15F ? cws.pk.o() : null;
   }

   private static djh a(auv $$0, cwq $$1) {
      return $$1.o().a(dej.b, ic.c.a.a($$0)).a(dej.c, ac.a(dkg.values(), $$0));
   }

   private djh a(auv $$0, djh[] $$1, djh[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static djh a(auv $$0, djh[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected edf<?> a() {
      return edf.k;
   }
}
