import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class diy extends div {
   public static final MapCodec<diy> b = b(diy::new);
   public static final dxv<jn> c = dnl.aF;
   private static final Map<jn, fbv> e = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djn.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         jn.d,
         djn.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         jn.e,
         djn.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         jn.f,
         djn.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends diy> a() {
      return b;
   }

   protected diy(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, jn.c).b(d, Boolean.valueOf(true)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return e.get($$0.c(c));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return $$4.g() == $$0.c(c) && !$$0.a($$1, $$3) ? djp.a.m() : $$0;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      jn $$3 = $$0.c(c);
      ji $$4 = $$2.a($$3.g());
      dwy $$5 = $$1.a_($$4);
      return $$5.c($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = super.a($$0);
      dgm $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
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
