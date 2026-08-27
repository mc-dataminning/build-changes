import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cwj extends cwg {
   public static final MapCodec<cwj> b = b(cwj::new);
   public static final dkj c = dat.aE;
   private static final Map<ic, emv> e = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwy.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ic.d,
         cwy.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ic.e,
         cwy.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ic.f,
         cwy.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cwj> a() {
      return b;
   }

   protected cwj(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cxa.a.o() : $$0;
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      ic $$3 = $$0.c(c);
      hx $$4 = $$2.a($$3.g());
      djp $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = super.a($$0);
      cua $$2 = $$0.q();
      hx $$3 = $$0.a();
      ic[] $$4 = $$0.f();

      for (ic $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
