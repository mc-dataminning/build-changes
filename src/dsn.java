import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dsn extends dic {
   public static final MapCodec<dsn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(dic::b), t()).apply($$0, dsn::new));
   public static final dxt<jn> b = dnj.aF;
   private static final Map<jn, fbt> c = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djl.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djl.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jn.e,
         djl.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jn.f,
         djl.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(cvl $$0, dwv.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = this.m();
      dgk $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
