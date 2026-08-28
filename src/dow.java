import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dow extends dep {
   public static final MapCodec<dow> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dep::b), u()).apply($$0, dow::new));
   public static final dtw b = dju.aE;
   private static final Map<ji, ext> c = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfy.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ji.d,
         dfy.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ji.e,
         dfy.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ji.f,
         dfy.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(cti $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.o();
      dcz $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
         if ($$5.o().d()) {
            ji $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}
