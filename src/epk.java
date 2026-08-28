import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class epk extends eqh {
   public static final MapCodec<epk> a = Codec.FLOAT.fieldOf("mossiness").xmap(epk::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dvv[] e = new dvv[]{dis.jD.m(), dis.jK.m()};
   private final float f;

   public epk(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public eqk.c a(dfp $$0, jh $$1, jh $$2, eqk.c $$3, eqk.c $$4, eqg $$5) {
      azu $$6 = $$5.b($$4.a());
      dvv $$7 = $$4.b();
      jh $$8 = $$4.a();
      dvv $$9 = null;
      if ($$7.a(dis.eH) || $$7.a(dis.b) || $$7.a(dis.eK)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axc.K)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axc.L)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axc.M)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dis.co)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new eqk.c($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dvv a(azu $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvv[] $$1 = new dvv[]{dis.eJ.m(), a($$0, dis.fj)};
         dvv[] $$2 = new dvv[]{dis.eI.m(), a($$0, dis.ng)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dvv a(azu $$0, dvv $$1) {
      jm $$2 = $$1.c(dqk.b);
      dwt $$3 = $$1.c(dqk.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dvv[] $$4 = new dvv[]{dis.ng.m().b(dqk.b, $$2).b(dqk.c, $$3), dis.nu.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dvv b(azu $$0) {
      return $$0.i() < this.f ? dis.nu.m() : null;
   }

   @Nullable
   private dvv c(azu $$0) {
      return $$0.i() < this.f ? dis.nI.m() : null;
   }

   @Nullable
   private dvv d(azu $$0) {
      return $$0.i() < 0.15F ? dis.pk.m() : null;
   }

   private static dvv a(azu $$0, diq $$1) {
      return $$1.m().b(dqk.b, jm.c.a.a($$0)).b(dqk.c, ae.a(dwt.values(), $$0));
   }

   private dvv a(azu $$0, dvv[] $$1, dvv[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dvv a(azu $$0, dvv[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected eqj<?> a() {
      return eqj.k;
   }
}
