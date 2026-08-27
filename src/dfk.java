import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfk extends cvg {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cll.q.fieldOf("color").forGetter(cvg::b), u()).apply($$0, dfk::new));
   public static final dka b = dak.aE;
   private static final Map<ic, eml> c = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwp.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwp.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ic.e,
         cwp.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ic.f,
         cwp.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dfk> a() {
      return a;
   }

   public dfk(cll $$0, djf.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = this.o();
      ctr $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            ic $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
