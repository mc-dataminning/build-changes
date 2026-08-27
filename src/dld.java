import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dld extends day {
   public static final MapCodec<dld> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cql.q.fieldOf("color").forGetter(day::b), u()).apply($$0, dld::new));
   public static final dqc b = dgc.aE;
   private static final Map<ij, etc> c = Maps.newEnumMap(
      ImmutableMap.of(
         ij.c,
         dch.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ij.d,
         dch.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ij.e,
         dch.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ij.f,
         dch.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(cql $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ij.c));
   }

   @Override
   public String g() {
      return this.p().a();
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = this.n();
      czj $$2 = $$0.q();
      id $$3 = $$0.a();
      ij[] $$4 = $$0.f();

      for (ij $$5 : $$4) {
         if ($$5.o().d()) {
            ij $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }
}
