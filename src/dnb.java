import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnb extends dcw {
   public static final MapCodec<dnb> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dlc.a.b.fieldOf("kind").forGetter(dcw::b), u()).apply($$0, dnb::new));
   public static final drx d = dhw.aE;
   private static final Map<it, evf> b = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         dea.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         it.d,
         dea.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         it.f,
         dea.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         it.e,
         dea.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dnb> a() {
      return c;
   }

   protected dnb(dlc.a $$0, drc.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, it.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = super.a($$0);
      daf $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
         if ($$5.o().d()) {
            it $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
