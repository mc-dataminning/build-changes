import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtp extends drp {
   public static final MapCodec<dtp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzh.a.fieldOf("wood_type").forGetter(drp::d), t()).apply($$0, dtp::new));
   public static final dys<jm> b = dok.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jm, fcs> i = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkm.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dkm.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jm.f,
         dkm.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jm.e,
         dkm.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dtp> a() {
      return a;
   }

   public dtp(dzh $$0, dxu.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = this.m();
      etx $$2 = $$0.q().b_($$0.a());
      dhl $$3 = $$0.q();
      jh $$4 = $$0.a();
      jm[] $$5 = $$0.f();

      for (jm $$6 : $$5) {
         if ($$6.o().d()) {
            jm $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == ety.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxv $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fby o(dxv $$0) {
      fcs $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, f);
   }
}
