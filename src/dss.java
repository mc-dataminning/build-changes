import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dss extends dqs {
   public static final MapCodec<dss> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter(dqs::d), t()).apply($$0, dss::new));
   public static final dxv<jn> b = dnl.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jn, fbv> i = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djn.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djn.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jn.f,
         djn.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jn.e,
         djn.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(dyk $$0, dwx.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = this.m();
      eta $$2 = $$0.q().b_($$0.a());
      dgm $$3 = $$0.q();
      ji $$4 = $$0.a();
      jn[] $$5 = $$0.f();

      for (jn $$6 : $$5) {
         if ($$6.o().d()) {
            jn $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwy $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fbb o(dwy $$0) {
      fbv $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, f);
   }
}
