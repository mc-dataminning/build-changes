import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dti extends dri {
   public static final MapCodec<dti> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dza.a.fieldOf("wood_type").forGetter(dri::d), t()).apply($$0, dti::new));
   public static final dyl<jm> b = dob.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fcl> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkd.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dkd.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         dkd.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         dkd.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dti> a() {
      return a;
   }

   public dti(dza $$0, dxn.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m();
      etq $$2 = $$0.q().b_($$0.a());
      dhc $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxo $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fbr o(dxo $$0) {
      fcl $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, f);
   }
}
