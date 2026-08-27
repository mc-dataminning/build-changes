import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class did extends dge {
   public static final MapCodec<did> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dnr.a.fieldOf("wood_type").forGetter(dge::d), u()).apply($$0, did::new));
   public static final dmy b = dda.aE;
   public static final epo c = czf.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final epo d = czf.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final epo e = epl.a(c, czf.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final epo i = epl.a(d, czf.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ih, epo> j = Maps.newEnumMap(ImmutableMap.of(ih.c, e, ih.d, e, ih.f, i, ih.e, i));

   @Override
   public MapCodec<did> a() {
      return a;
   }

   public did(dnr $$0, dmd.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.c_($$3) instanceof dku $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bmn.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dme $$0, cia $$1, eor $$2, dku $$3, cpq $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cpd && !this.a($$2, $$0);
   }

   private boolean a(eor $$0, dme $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      return this.a($$0, $$1, $$2, epa.a());
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ((ih)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dme $$0, cwh $$1, ib $$2) {
      ih $$3 = $$0.c(b).h();
      ih $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cwh $$0, dme $$1, ib $$2, ih $$3) {
      dme $$4 = $$0.a_($$2);
      return $$4.a(aue.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dhf.a);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = this.o();
      ehr $$2 = $$0.q().b_($$0.a());
      cwh $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ehs.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dme $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, f);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dki($$0, $$1);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.i, dku::a);
   }
}
