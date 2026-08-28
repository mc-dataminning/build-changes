import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgg extends dmh {
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtx.a.fieldOf("wood_type").forGetter(dmh::d), u()).apply($$0, dgg::new));
   public static final dtk b = dta.ba;
   public static final dtb c = dta.a;
   protected static final float d = 5.0F;
   protected static final ewy e = dfh.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewy> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfh.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfh.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfh.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfh.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public dgg(dtx $$0, dsj.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.c_($$3) instanceof dra $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqi.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmk $$0, ewb $$1, dra $$2, cuc $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof ctp && $$1.b().equals(jf.a);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), jf.a, dni.b);
   }

   @Override
   public dsk a(cxm $$0) {
      dcf $$1 = $$0.q();
      eoh $$2 = $$1.b_($$0.a());
      ja $$3 = $$0.a().c();
      dsk $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(avw.aA);
      jf $$6 = jf.a((double)$$0.i());
      boolean $$7 = !dfh.a($$4.k($$1, $$3), jf.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dog.b)) {
            jf $$8 = $$4.c(dog.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jf> $$9 = dtq.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtq.a($$6.g()) : dtq.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eoi.c));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      ewy $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      return this.a($$0, $$1, $$2, ewk.a());
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.b && !this.a($$0, $$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsk $$0) {
      return dtq.b($$0.c(b));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.i, dra::a);
   }
}
