import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dgg extends dgd {
   public static final MapCodec<dgg> b = b(dgg::new);
   public static final duu c = dkr.aE;
   private static final Map<jj, eyx> e = Maps.newEnumMap(
      ImmutableMap.of(
         jj.c,
         dgv.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jj.d,
         dgv.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jj.e,
         dgv.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jj.f,
         dgv.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dgg> a() {
      return b;
   }

   protected dgg(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, jj.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dgx.a.o() : $$0;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      jj $$3 = $$0.c(c);
      je $$4 = $$2.a($$3.g());
      dua $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = super.a($$0);
      ddv $$2 = $$0.q();
      je $$3 = $$0.a();
      jj[] $$4 = $$0.f();

      for (jj $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.b(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
