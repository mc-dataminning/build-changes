import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dix extends doy {
   public static final MapCodec<dix> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwq.a.fieldOf("wood_type").forGetter(doy::d), t()).apply($$0, dix::new));
   public static final dwd b = dvt.ba;
   public static final dvu c = dvt.a;
   protected static final float d = 5.0F;
   protected static final fab e = dhy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fab> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dhy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dhy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dhy.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dhy.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public dix(dwq $$0, dvc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bry a(cvx $$0, dvd $$1, dev $$2, jg $$3, coh $$4, brx $$5, ezd $$6) {
      if ($$2.c_($$3) instanceof dts $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bry.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(coh $$0, ezd $$1, dts $$2, cvx $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cvm && $$1.c().equals(jl.a);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jl.a, dpz.b);
   }

   @Override
   public dvd a(czm $$0) {
      dev $$1 = $$0.q();
      ere $$2 = $$1.b_($$0.a());
      jg $$3 = $$0.a().d();
      dvd $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awz.aB);
      jl $$6 = jl.a((double)$$0.i());
      boolean $$7 = !dhy.a($$4.g($$1, $$3), jl.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dqx.b)) {
            jl $$8 = $$4.c(dqx.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jl> $$9 = dwj.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dwj.a($$6.g()) : dwj.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == erf.c));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      fab $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      return this.a($$0, $$1, $$2, ezm.a());
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == jl.b && !this.a($$0, $$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dvd $$0) {
      return dwj.b($$0.c(b));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return a($$2, dsi.i, dts::a);
   }
}
