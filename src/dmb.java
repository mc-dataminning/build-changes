import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmb extends dbv {
   public static final MapCodec<dmb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(crs.q.fieldOf("color").forGetter(dbv::b), u()).apply($$0, dmb::new));
   public static final drb b = dha.aE;
   private static final Map<is, eui> c = Maps.newEnumMap(
      ImmutableMap.of(
         is.c,
         dde.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         is.d,
         dde.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         is.e,
         dde.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         is.f,
         dde.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   public dmb(crs $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, is.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = this.n();
      dag $$2 = $$0.q();
      in $$3 = $$0.a();
      is[] $$4 = $$0.f();

      for (is $$5 : $$4) {
         if ($$5.o().d()) {
            is $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }
}
