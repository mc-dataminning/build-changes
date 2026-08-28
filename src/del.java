import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class del extends dei {
   public static final MapCodec<del> b = b(del::new);
   public static final dsx c = diw.aE;
   private static final Map<je, ewl> e = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         dfa.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         je.d,
         dfa.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         je.e,
         dfa.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         je.f,
         dfa.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends del> a() {
      return b;
   }

   protected del(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dfc.a.o() : $$0;
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      je $$3 = $$0.c(c);
      iz $$4 = $$2.a($$3.g());
      dsd $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = super.a($$0);
      dcc $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
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
