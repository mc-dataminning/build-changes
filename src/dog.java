import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dog extends dmh {
   public static final MapCodec<dog> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtx.a.fieldOf("wood_type").forGetter(dmh::d), u()).apply($$0, dog::new));
   public static final dte b = djd.aE;
   public static final ewy c = dfh.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ewy d = dfh.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ewy e = ewv.a(c, dfh.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ewy i = ewv.a(d, dfh.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jf, ewy> j = Maps.newEnumMap(ImmutableMap.of(jf.c, e, jf.d, e, jf.f, i, jf.e, i));

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dtx $$0, dsj.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, jf.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$2.c_($$3) instanceof dra $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bqi.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dsk $$0, cmk $$1, ewb $$2, dra $$3, cuc $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.g() instanceof ctp && !this.a($$2, $$0);
   }

   private boolean a(ewb $$0, dsk $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ewy b_(dsk $$0, dbl $$1, ja $$2) {
      return this.a($$0, $$1, $$2, ewk.a());
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dsk $$0, dci $$1, ja $$2) {
      jf $$3 = $$0.c(b).h();
      jf $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dci $$0, dsk $$1, ja $$2, jf $$3) {
      dsk $$4 = $$0.a_($$2);
      return $$4.a(avw.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dni.a);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = this.o();
      eoh $$2 = $$0.q().b_($$0.a());
      dci $$3 = $$0.q();
      ja $$4 = $$0.a();

      for (jf $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eoi.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dsk $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqn($$0, $$1);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.i, dra::a);
   }
}
