import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqx extends doy {
   public static final MapCodec<dqx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwq.a.fieldOf("wood_type").forGetter(doy::d), t()).apply($$0, dqx::new));
   public static final dvx b = dlt.aF;
   public static final fab c = dhy.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fab d = dhy.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fab e = ezy.a(c, dhy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fab i = ezy.a(d, dhy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jl, fab> j = Maps.newEnumMap(ImmutableMap.of(jl.c, e, jl.d, e, jl.f, i, jl.e, i));

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(dwq $$0, dvc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jl.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$2.c_($$3) instanceof dts $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bry.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dvd $$0, coh $$1, ezd $$2, dts $$3, cvx $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cvm && !this.a($$2, $$0);
   }

   private boolean a(ezd $$0, dvd $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      return this.a($$0, $$1, $$2, ezm.a());
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dvd $$0, dey $$1, jg $$2) {
      jl $$3 = $$0.c(b).h();
      jl $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dey $$0, dvd $$1, jg $$2, jl $$3) {
      dvd $$4 = $$0.a_($$2);
      return $$4.a(awz.aA) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dpz.a);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m();
      ere $$2 = $$0.q().b_($$0.a());
      dey $$3 = $$0.q();
      jg $$4 = $$0.a();

      for (jl $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jl $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvd $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtf($$0, $$1);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.i, dts::a);
   }
}
