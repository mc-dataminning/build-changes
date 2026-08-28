import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class etk extends euh {
   public static final MapCodec<etk> a = Codec.FLOAT.fieldOf("mossiness").xmap(etk::new, $$0 -> $$0.f);
   private static final float b = 0.5F;
   private static final float c = 0.5F;
   private static final float d = 0.15F;
   private static final dzo[] e = new dzo[]{dlw.kc.m(), dlw.kj.m()};
   private final float f;

   public etk(float $$0) {
      this.f = $$0;
   }

   @Nullable
   @Override
   public euk.d a(dis $$0, iu $$1, iu $$2, euk.d $$3, euk.d $$4, eug $$5) {
      azt $$6 = $$5.b($$4.a());
      dzo $$7 = $$4.b();
      iu $$8 = $$4.a();
      dzo $$9 = null;
      if ($$7.a(dlw.eV) || $$7.a(dlw.b) || $$7.a(dlw.eY)) {
         $$9 = this.a($$6);
      } else if ($$7.a(axa.L)) {
         $$9 = this.a($$6, $$4.b());
      } else if ($$7.a(axa.M)) {
         $$9 = this.b($$6);
      } else if ($$7.a(axa.N)) {
         $$9 = this.c($$6);
      } else if ($$7.a(dlw.cv)) {
         $$9 = this.d($$6);
      }

      return $$9 != null ? new euk.d($$8, $$9, $$4.c()) : $$4;
   }

   @Nullable
   private dzo a(azt $$0) {
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dzo[] $$1 = new dzo[]{dlw.eX.m(), a($$0, dlw.fy)};
         dzo[] $$2 = new dzo[]{dlw.eW.m(), a($$0, dlw.nI)};
         return this.a($$0, $$1, $$2);
      }
   }

   @Nullable
   private dzo a(azt $$0, dzo $$1) {
      ja $$2 = $$1.c(dtu.b);
      ean $$3 = $$1.c(dtu.c);
      if ($$0.i() >= 0.5F) {
         return null;
      } else {
         dzo[] $$4 = new dzo[]{dlw.nI.m().b(dtu.b, $$2).b(dtu.c, $$3), dlw.nW.m()};
         return this.a($$0, e, $$4);
      }
   }

   @Nullable
   private dzo b(azt $$0) {
      return $$0.i() < this.f ? dlw.nW.m() : null;
   }

   @Nullable
   private dzo c(azt $$0) {
      return $$0.i() < this.f ? dlw.ok.m() : null;
   }

   @Nullable
   private dzo d(azt $$0) {
      return $$0.i() < 0.15F ? dlw.pO.m() : null;
   }

   private static dzo a(azt $$0, dlu $$1) {
      return $$1.m().b(dtu.b, ja.c.a.a($$0)).b(dtu.c, af.a(ean.values(), $$0));
   }

   private dzo a(azt $$0, dzo[] $$1, dzo[] $$2) {
      return $$0.i() < this.f ? a($$0, $$2) : a($$0, $$1);
   }

   private static dzo a(azt $$0, dzo[] $$1) {
      return $$1[$$0.a($$1.length)];
   }

   @Override
   protected euj<?> a() {
      return euj.k;
   }
}
