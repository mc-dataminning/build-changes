import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class cvu extends cvr {
   public static final MapCodec<cvu> b = b(cvu::new);
   public static final dju c = dae.aE;
   private static final Map<ic, emf> e = Maps.newEnumMap(
      ImmutableMap.of(
         ic.c,
         cwj.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ic.d,
         cwj.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ic.e,
         cwj.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ic.f,
         cwj.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends cvu> a() {
      return b;
   }

   protected cvu(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cwl.a.o() : $$0;
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      ic $$3 = $$0.c(c);
      hx $$4 = $$2.a($$3.g());
      dja $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      dja $$1 = super.a($$0);
      ctl $$2 = $$0.q();
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
