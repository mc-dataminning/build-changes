import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dft extends cvp {
   public static final MapCodec<dft> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clv.q.fieldOf("color").forGetter(cvp::b), u()).apply($$0, dft::new));
   public static final dkj b = dat.aE;
   private static final Map<ic, emv> c = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwy.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ic.d,
         cwy.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ic.e,
         cwy.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ic.f,
         cwy.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   public dft(clv $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ic.c));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public djp a(cpp $$0) {
      djp $$1 = this.o();
      cua $$2 = $$0.q();
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
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }
}
