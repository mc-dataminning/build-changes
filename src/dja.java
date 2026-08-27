import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dja extends cyw {
   public static final MapCodec<dja> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dhb.a.b.fieldOf("kind").forGetter(cyw::b), u()).apply($$0, dja::new));
   public static final dnt d = ddv.aE;
   private static final Map<ih, eqk> b = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         daa.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ih.d,
         daa.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ih.f,
         daa.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ih.e,
         daa.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dja> a() {
      return c;
   }

   protected dja(dhb.a $$0, dmy.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ih.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dmz a(css $$0) {
      dmz $$1 = super.a($$0);
      cwf $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
         if ($$5.o().d()) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
