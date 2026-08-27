import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cwb extends cvy {
   public static final MapCodec<cwb> b = b(cwb::new);
   public static final dkb c = dal.aE;
   private static final Map<ic, emm> e = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwq.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ic.d,
         cwq.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ic.e,
         cwq.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ic.f,
         cwq.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cwb> a() {
      return b;
   }

   protected cwb(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cws.a.o() : $$0;
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      ic $$3 = $$0.c(c);
      hx $$4 = $$2.a($$3.g());
      djh $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = super.a($$0);
      cts $$2 = $$0.q();
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
