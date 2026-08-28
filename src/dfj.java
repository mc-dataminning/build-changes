import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class dfj extends dfg {
   public static final MapCodec<dfj> b = b(dfj::new);
   public static final dtw c = dju.aE;
   private static final Map<ji, exv> e = Maps.newEnumMap(
      ImmutableMap.of(
         ji.c,
         dfy.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         ji.d,
         dfy.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         ji.e,
         dfy.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         ji.f,
         dfy.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends dfj> a() {
      return b;
   }

   protected dfj(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, ji.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? dga.a.o() : $$0;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      ji $$3 = $$0.c(c);
      jd $$4 = $$2.a($$3.g());
      dtc $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      dcz $$2 = $$0.q();
      jd $$3 = $$0.a();
      ji[] $$4 = $$0.f();

      for (ji $$5 : $$4) {
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
