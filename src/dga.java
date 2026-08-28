import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dga extends dmb {
   public static final MapCodec<dga> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtr.a.fieldOf("wood_type").forGetter(dmb::d), u()).apply($$0, dga::new));
   public static final dte b = dsu.ba;
   public static final dsv c = dsu.a;
   protected static final float d = 5.0F;
   protected static final ewm e = dfb.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ewm> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfb.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfb.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfb.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfb.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dtr $$0, dsd.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if ($$2.c_($$3) instanceof dqt $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqy.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cmz $$0, evp $$1, dqt $$2, cur $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.g() instanceof cue && $$1.b().equals(je.a);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), je.a, dnc.b);
   }

   @Override
   public dse a(cyc $$0) {
      dca $$1 = $$0.q();
      enx $$2 = $$1.b_($$0.a());
      iz $$3 = $$0.a().c();
      dse $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aA);
      je $$6 = je.a((double)$$0.i());
      boolean $$7 = !dfb.a($$4.k($$1, $$3), je.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(doa.b)) {
            je $$8 = $$4.c(doa.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<je> $$9 = dtk.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dtk.a($$6.g()) : dtk.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eny.c));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      ewm $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected ewm b_(dse $$0, dbg $$1, iz $$2) {
      return this.a($$0, $$1, $$2, evy.a());
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.b && !this.a($$0, $$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dse $$0) {
      return dtk.b($$0.c(b));
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.i, dqt::a);
   }
}
