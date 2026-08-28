import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dpa extends deu {
   public static final MapCodec<dpa> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnb.a.b.fieldOf("kind").forGetter(deu::b), u()).apply($$0, dpa::new));
   public static final dtw d = dju.aE;
   private static final Map<ji, exv> b = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfy.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         ji.d,
         dfy.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         ji.f,
         dfy.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         ji.e,
         dfy.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dpa> a() {
      return c;
   }

   protected dpa(dnb.a $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, ji.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      dcc $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
