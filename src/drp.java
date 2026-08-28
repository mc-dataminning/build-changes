import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class drp extends dpq {
   public static final MapCodec<drp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxh.a.fieldOf("wood_type").forGetter(dpq::d), t()).apply($$0, drp::new));
   public static final dws<jm> b = dml.aF;
   public static final fas c = diq.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fas d = diq.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fas e = fap.a(c, diq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fas i = fap.a(d, diq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fas> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   public drp(dxh $$0, dvu.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$2.c_($$3) instanceof duk $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsk.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dvv $$0, cou $$1, ezu $$2, duk $$3, cwm $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwb && !this.a($$2, $$0);
   }

   private boolean a(ezu $$0, dvv $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fad.a());
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dvv $$0, dfp $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dfp $$0, dvv $$1, jh $$2, jm $$3) {
      dvv $$4 = $$0.a_($$2);
      return $$4.a(axc.aB) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dqr.a);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      dvv $$1 = this.m();
      erv $$2 = $$0.q().b_($$0.a());
      dfp $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erw.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvv $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtx($$0, $$1);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.i, duk::a);
   }
}
