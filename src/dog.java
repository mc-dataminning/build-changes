import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dog extends deb {
   public static final MapCodec<dog> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmh.a.b.fieldOf("kind").forGetter(deb::b), u()).apply($$0, dog::new));
   public static final dtb d = djb.aE;
   private static final Map<jf, ews> b = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dff.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jf.d,
         dff.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jf.f,
         dff.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jf.e,
         dff.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dog> a() {
      return c;
   }

   protected dog(dmh.a $$0, dsg.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = super.a($$0);
      dbj $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
