import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class csn extends csk {
   public static final MapCodec<csn> b = b(csn::new);
   public static final dfx c = cww.aE;
   private static final Map<ha, eia> e = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ctc.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ha.d,
         ctc.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ha.e,
         ctc.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ha.f,
         ctc.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends csn> a() {
      return b;
   }

   protected csn(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ha.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cte.a.o() : $$0;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = $$0.c(c);
      gw $$4 = $$2.a($$3.g());
      dfd $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = super.a($$0);
      cqe $$2 = $$0.q();
      gw $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
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
