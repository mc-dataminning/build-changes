import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmx extends dcr {
   public static final MapCodec<dmx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csj.q.fieldOf("color").forGetter(dcr::b), u()).apply($$0, dmx::new));
   public static final drx b = dhw.aE;
   private static final Map<it, evf> c = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         dea.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         it.d,
         dea.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         it.e,
         dea.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         it.f,
         dea.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dmx> a() {
      return a;
   }

   public dmx(csj $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = this.n();
      dbc $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
         if ($$5.o().d()) {
            it $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b);
   }
}
