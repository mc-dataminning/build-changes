import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cwa extends cvx {
   public static final MapCodec<cwa> b = b(cwa::new);
   public static final dka c = dak.aE;
   private static final Map<ic, eml> e = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwp.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ic.d,
         cwp.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ic.e,
         cwp.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ic.f,
         cwp.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cwa> a() {
      return b;
   }

   protected cwa(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cwr.a.o() : $$0;
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      ic $$3 = $$0.c(c);
      hx $$4 = $$2.a($$3.g());
      djg $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = super.a($$0);
      ctr $$2 = $$0.q();
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
