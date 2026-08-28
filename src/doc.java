import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doc extends ddx {
   public static final MapCodec<doc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmd.a.b.fieldOf("kind").forGetter(ddx::b), u()).apply($$0, doc::new));
   public static final dsy d = dix.aE;
   private static final Map<je, ewm> b = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfb.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         je.d,
         dfb.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         je.f,
         dfb.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         je.e,
         dfb.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends doc> a() {
      return c;
   }

   protected doc(dmd.a $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = super.a($$0);
      dbg $$2 = $$0.q();
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
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
