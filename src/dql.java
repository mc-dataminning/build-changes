import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dql extends dlt implements doz {
   public static final MapCodec<dql> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvs.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.m), t()).apply($$0, dql::new)
   );
   public static final dvu b = dvt.u;
   public static final dwb<dwc> c = dvt.af;
   public static final dvu d = dvt.w;
   public static final dvu e = dvt.C;
   protected static final int f = 3;
   protected static final fab g = dhy.a(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   protected static final fab h = dhy.a(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fab i = dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   protected static final fab j = dhy.a(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
   protected static final fab k = dhy.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
   protected static final fab l = dhy.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private final dvs m;

   @Override
   public MapCodec<? extends dql> a() {
      return a;
   }

   protected dql(dvs $$0, dvc.d $$1) {
      super($$1.a($$0.g()));
      this.m = $$0;
      this.l(this.F.b().b(aF, jl.c).b(b, Boolean.valueOf(false)).b(c, dwc.b).b(d, Boolean.valueOf(false)).b(e, Boolean.valueOf(false)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      if (!$$0.c(b)) {
         return $$0.c(c) == dwc.a ? l : k;
      } else {
         switch ((jl)$$0.c(aF)) {
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
   protected boolean a(dvd $$0, ert $$1) {
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
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!this.m.c()) {
         return bry.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return bry.a;
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, den $$3, BiConsumer<cvx, jg> $$4) {
      if ($$3.f() && this.m.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(dvd $$0, dev $$1, jg $$2, @Nullable coh $$3) {
      dvd $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(e)) {
         $$1.a($$2, erf.c, erf.c.a((dey)$$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable coh $$0, dev $$1, jg $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.m.k() : this.m.j(), awl.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? eaa.h : eaa.d, $$2);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.C($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(e)) {
               $$1.a($$2, erf.c, erf.c.a((dey)$$1));
            }
         }
      }
   }

   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m();
      ere $$2 = $$0.q().b_($$0.a());
      jl $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(aF, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? dwc.a : dwc.b);
      } else {
         $$1 = $$1.b(aF, $$0.g().g()).b(c, $$3 == jl.b ? dwc.b : dwc.a);
      }

      if ($$0.q().C($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(e, Boolean.valueOf($$2.a() == erf.c));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF, b, c, d, e);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(e) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected dvs q() {
      return this.m;
   }
}
