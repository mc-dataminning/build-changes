import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dsd extends dnj implements dqr {
   public static final MapCodec<dsd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxl.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dsd::new)
   );
   public static final dxn b = dxm.z;
   public static final dxt<dxu> c = dxm.ai;
   public static final dxn d = dxm.B;
   public static final dxn e = dxm.J;
   protected static final int f = 3;
   protected static final fbt g = djl.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fbt h = djl.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbt i = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fbt j = djl.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fbt k = djl.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fbt l = djl.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dxl m;

   @Override
   public MapCodec<? extends dsd> a() {
      return a;
   }

   protected dsd(dxl $$0, dwv.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jn.c).b(b, Boolean.valueOf(false)).b(c, dxu.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dxu.a ? l : k;
      } else {
         switch ((jn)$$0.c(aF)) {
            case c:
            default:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      }
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(e);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if (!this.m.c()) {
         return bsj.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsj.a;
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, dfz $$3, BiConsumer<cwo, ji> $$4) {
      if ($$3.g() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dww $$0, dgh $$1, ji $$2, @Nullable cow $$3) {
      dww $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, esz.c, esz.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cow $$0, dgh $$1, ji $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awb.e, 1.0F, $$1.H_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? ebs.h : ebs.d, $$2);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, esz.c, esz.c.a($$1));
            }
         }
      }
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = this.m();
      esy $$2 = $$0.q().b_($$0.a());
      jn $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dxu.a : dxu.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jn.b ? dxu.b : dxu.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == esz.c));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(e) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dxl q() {
      return this.m;
   }
}
