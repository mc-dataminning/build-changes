import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class drq extends dpq {
   public static final MapCodec<drq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxh.a.fieldOf("wood_type").forGetter(dpq::d), t()).apply($$0, drq::new));
   public static final dws<jm> b = dml.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fas> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         diq.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         diq.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         diq.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         diq.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<drq> a() {
      return a;
   }

   public drq(dxh $$0, dvu.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = this.m();
      erv $$2 = $$0.q().b_($$0.a());
      dfp $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvv $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ezy o(dvv $$0) {
      fas $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, f);
   }
}
