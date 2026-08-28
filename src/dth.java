import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dth extends drh {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyz.a.fieldOf("wood_type").forGetter(drh::d), t()).apply($$0, dth::new));
   public static final dyk<jm> b = doc.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fcm> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dke.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dke.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         dke.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         dke.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(dyz $$0, dxm.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = this.m();
      etp $$2 = $$0.q().b_($$0.a());
      dhd $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxn $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fbs o(dxn $$0) {
      fcm $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, f);
   }
}
