import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class drj extends dpj {
   public static final MapCodec<drj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxa.a.fieldOf("wood_type").forGetter(dpj::d), t()).apply($$0, drj::new));
   public static final dwl<jm> b = dme.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fal> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dij.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dij.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         dij.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         dij.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(dxa $$0, dvn.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = this.m();
      ero $$2 = $$0.q().b_($$0.a());
      dfi $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvo $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ezr o(dvo $$0) {
      fal $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, f);
   }
}
