import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dny extends dds {
   public static final MapCodec<dny> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctk.q.fieldOf("color").forGetter(dds::b), u()).apply($$0, dny::new));
   public static final dsy b = dix.aE;
   private static final Map<je, ewm> c = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfb.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         je.d,
         dfb.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         je.e,
         dfb.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         je.f,
         dfb.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(ctk $$0, dsd.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = this.o();
      dcd $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b);
   }
}
