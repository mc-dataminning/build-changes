import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsq extends dqq {
   public static final MapCodec<dsq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter(dqq::d), t()).apply($$0, dsq::new));
   public static final dxt<jn> b = dnj.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jn, fbt> i = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djl.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djl.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jn.f,
         djl.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jn.e,
         djl.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   public dsq(dyi $$0, dwv.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = this.m();
      esy $$2 = $$0.q().b_($$0.a());
      dgk $$3 = $$0.q();
      ji $$4 = $$0.a();
      jn[] $$5 = $$0.f();

      for (jn $$6 : $$5) {
         if ($$6.o().d()) {
            jn $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == esz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dww $$0) {
      return $$0.c(b).p();
   }

   @Override
   public faz o(dww $$0) {
      fbt $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, f);
   }
}
