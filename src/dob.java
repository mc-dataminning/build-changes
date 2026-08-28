import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dob extends ddw {
   public static final MapCodec<dob> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmc.a.b.fieldOf("kind").forGetter(ddw::b), u()).apply($$0, dob::new));
   public static final dsx d = diw.aE;
   private static final Map<je, ewl> b = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfa.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         je.d,
         dfa.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         je.f,
         dfa.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         je.e,
         dfa.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dob> a() {
      return c;
   }

   protected dob(dmc.a $$0, dsc.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = super.a($$0);
      dbf $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
