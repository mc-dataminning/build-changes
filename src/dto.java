import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dto extends dro {
   public static final MapCodec<dto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzg.a.fieldOf("wood_type").forGetter(dro::d), t()).apply($$0, dto::new));
   public static final dyr<jm> b = doj.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fcr> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkl.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dkl.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         dkl.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         dkl.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   public dto(dzg $$0, dxt.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = this.m();
      etw $$2 = $$0.q().b_($$0.a());
      dhk $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxu $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fbx o(dxu $$0) {
      fcr $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, f);
   }
}
