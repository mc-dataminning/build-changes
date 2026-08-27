import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dby extends cry {
   public static final MapCodec<dby> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dac.a.b.fieldOf("kind").forGetter(cry::b), t()).apply($$0, dby::new));
   public static final dfx d = cww.aE;
   private static final Map<ha, eia> b = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ctc.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ha.d,
         ctc.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ha.f,
         ctc.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ha.e,
         ctc.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dby> a() {
      return c;
   }

   protected dby(dac.a $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ha.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = super.a($$0);
      cph $$2 = $$0.q();
      gw $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
