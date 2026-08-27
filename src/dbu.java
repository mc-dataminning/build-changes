import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dbu extends crs {
   public static final MapCodec<dbu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(chz.q.fieldOf("color").forGetter(crs::b), t()).apply($$0, dbu::new));
   public static final dfx b = cww.aE;
   private static final Map<ha, eia> c = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ctc.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ha.d,
         ctc.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ha.e,
         ctc.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ha.f,
         ctc.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   public dbu(chz $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ha.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = this.o();
      cqe $$2 = $$0.q();
      gw $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }
}
