import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dae extends dge {
   public static final MapCodec<dae> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnr.a.fieldOf("wood_type").forGetter(dge::d), u()).apply($$0, dae::new));
   public static final dne b = dmu.ba;
   public static final dmv c = dmu.a;
   protected static final float d = 5.0F;
   protected static final epo e = czf.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, epo> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         czf.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         czf.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         czf.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         czf.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dae> a() {
      return a;
   }

   public dae(dnr $$0, dmd.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.c_($$3) instanceof dku $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bmn.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cia $$0, eor $$1, dku $$2, cpq $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cpd && $$1.b().equals(ih.a);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ih.a, dhf.b);
   }

   @Override
   public dme a(crx $$0) {
      cwe $$1 = $$0.q();
      ehr $$2 = $$1.b_($$0.a());
      ib $$3 = $$0.a().c();
      dme $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(aue.az);
      ih $$6 = ih.a((double)$$0.i());
      boolean $$7 = !czf.a($$4.k($$1, $$3), ih.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(did.b)) {
            ih $$8 = $$4.c(did.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ih> $$9 = dnk.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dnk.a($$6.g()) : dnk.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ehs.c));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      epo $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      return this.a($$0, $$1, $$2, epa.a());
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.b && !this.a($$0, $$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dme $$0) {
      return dnk.b($$0.c(b));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dki($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.i, dku::a);
   }
}
