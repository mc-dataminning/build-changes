import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evp extends ewm {
   public static final MapCodec<evp> a = Codec.FLOAT.fieldOf("mossiness").xmap(evp::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final ebq[] e = new ebq[]{dnq.kg.m(), dnq.kn.m()};
   private final float f;

   public evp(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public ewp.d a(dkm $$0, iw $$1, iw $$2, ewp.d $$3, ewp.d $$4, ewl $$5) {
      bai $$6 = $$5.b($$4.a());
      ebq $$7 = $$4.b();
      iw $$8 = $$4.a();
      ebq $$9 = null;
      if ($$7.a(dnq.eZ) || $$7.a(dnq.b) || $$7.a(dnq.fc)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axn.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axn.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axn.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dnq.cy)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new ewp.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private ebq a(bai $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         ebq[] $$1 = new ebq[]{dnq.fb.m(), a($$0, dnq.fC)};
         ebq[] $$2 = new ebq[]{dnq.fa.m(), a($$0, dnq.nM)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private ebq a(bai $$0, ebq $$1) {
      jc $$2 = $$1.c(dvs.b);
      ecp $$3 = $$1.c(dvs.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         ebq[] $$4 = new ebq[]{dnq.nM.m().b(dvs.b, $$2).b(dvs.c, $$3), dnq.oa.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private ebq b(bai $$0) {
      return $$0.i() < this.f ? dnq.oa.m() : null;
   }

   @Nullable
   private ebq c(bai $$0) {
      return $$0.i() < this.f ? dnq.oo.m() : null;
   }

   @Nullable
   private ebq d(bai $$0) {
      return $$0.i() < 0.15F ? dnq.pS.m() : null;
   }

   private static ebq a(bai $$0, dno $$1) {
      return $$1.m().b(dvs.b, jc.c.a.a($$0)).b(dvs.c, ag.a(ecp.values(), $$0));
   }

   private ebq a(bai $$0, ebq[] $$1, ebq[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static ebq a(bai $$0, ebq[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected ewo<?> a() {
      return ewo.k;
   }
}
