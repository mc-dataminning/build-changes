import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dqw extends dme implements dpk {
   public static final MapCodec<dqw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwd.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dqw::new)
   );
   public static final dwf b = dwe.u;
   public static final dwl<dwm> c = dwe.af;
   public static final dwf d = dwe.w;
   public static final dwf e = dwe.C;
   protected static final int f = 3;
   protected static final fal g = dij.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fal h = dij.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fal i = dij.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fal j = dij.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fal k = dij.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fal l = dij.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dwd m;

   @Override
   public MapCodec<? extends dqw> a() {
      return a;
   }

   protected dqw(dwd $$0, dvn.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jm.c).b(b, Boolean.valueOf(false)).b(c, dwm.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dwm.a ? l : k;
      } else {
         switch ((jm)$$0.c(aF)) {
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
   protected boolean a(dvo $$0, esd $$1) {
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
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!this.m.c()) {
         return bsh.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bsh.a;
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, dex $$3, BiConsumer<cwf, jh> $$4) {
      if ($$3.f() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dvo $$0, dff $$1, jh $$2, @Nullable cor $$3) {
      dvo $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, erp.c, erp.c.a((dfi)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable cor $$0, dff $$1, jh $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awp.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eak.h : eak.d, $$2);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, erp.c, erp.c.a((dfi)$$1));
            }
         }
      }
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = this.m();
      ero $$2 = $$0.q().b_($$0.a());
      jm $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dwm.a : dwm.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jm.b ? dwm.b : dwm.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == erp.c));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(e) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected dwd q() {
      return this.m;
   }
}
