import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dkx extends dix {
   public static final MapCodec<dkx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqm.a.fieldOf("wood_type").forGetter(dix::d), u()).apply($$0, dkx::new));
   public static final dpt b = dft.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ih, est> i = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         dby.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         dby.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ih.f,
         dby.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ih.e,
         dby.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   public dkx(dqm $$0, doy.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = this.n();
      eks $$2 = $$0.q().b_($$0.a());
      cza $$3 = $$0.q();
      ib $$4 = $$0.a();
      ih[] $$5 = $$0.f();

      for (ih $$6 : $$5) {
         if ($$6.o().d()) {
            ih $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ekt.c));
            }
         }
      }

      return null;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(doz $$0) {
      return $$0.c(b).p();
   }

   @Override
   public esa m(doz $$0) {
      est $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, f);
   }
}
