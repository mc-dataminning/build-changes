import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doc extends ddw {
   public static final MapCodec<doc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cst.q.fieldOf("color").forGetter(ddw::b), u()).apply($$0, doc::new));
   public static final dtb b = djb.aE;
   private static final Map<jf, ews> c = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dff.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jf.d,
         dff.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jf.e,
         dff.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jf.f,
         dff.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<doc> a() {
      return a;
   }

   public doc(cst $$0, dsg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = this.o();
      dcg $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }
}
