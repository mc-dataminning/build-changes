import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dbz extends dbk {
   public static final MapCodec<dbz> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group(c.forGetter($$0x -> $$0x.e), t()).apply($$0, dbz::new));
   public static final dfx g = cww.aE;
   protected static final float h = 2.5F;
   private static final Map<ha, eia> i = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ctc.a(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         ha.d,
         ctc.a(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         ha.e,
         ctc.a(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         ha.f,
         ctc.a(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   @Override
   public MapCodec<dbz> a() {
      return f;
   }

   protected dbz(iy $$0, dfc.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(g, ha.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return h($$0);
   }

   public static eia h(dfd $$0) {
      return i.get($$0.c(g));
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      ha $$3 = $$0.c(g);
      gw $$4 = $$2.a($$3.g());
      dfd $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = this.o();
      cqe $$2 = $$0.q();
      gw $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(g, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(g) && !$$0.a($$3, $$4) ? cte.a.o() : $$0;
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      ha $$4 = $$0.c(g);
      double $$5 = (double)$$2.u() + 0.5;
      double $$6 = (double)$$2.v() + 0.7;
      double $$7 = (double)$$2.w() + 0.5;
      double $$8 = 0.22;
      double $$9 = 0.27;
      ha $$10 = $$4.g();
      $$1.a(iv.Z, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
      $$1.a(this.e, $$5 + 0.27 * (double)$$10.j(), $$6 + 0.22, $$7 + 0.27 * (double)$$10.l(), 0.0, 0.0, 0.0);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(g, $$1.a($$0.c(g)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(g)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(g);
   }
}
