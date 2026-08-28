import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsr extends dqs {
   public static final MapCodec<dsr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter(dqs::d), t()).apply($$0, dsr::new));
   public static final dxv<jn> b = dnl.aF;
   public static final fbv c = djn.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fbv d = djn.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fbv e = fbs.a(c, djn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fbv i = fbs.a(d, djn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jn, fbv> j = Maps.newEnumMap(ImmutableMap.of(jn.c, e, jn.d, e, jn.f, i, jn.e, i));

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(dyk $$0, dwx.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.c_($$3) instanceof dvn $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsl.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dwy $$0, coy $$1, fax $$2, dvn $$3, cwq $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwf && !this.a($$2, $$0);
   }

   private boolean a(fax $$0, dwy $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbg.a());
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ((jn)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dwy $$0, dgm $$1, ji $$2) {
      jn $$3 = $$0.c(b).h();
      jn $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dgm $$0, dwy $$1, ji $$2, jn $$3) {
      dwy $$4 = $$0.a_($$2);
      return $$4.a(awp.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, drt.a);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = this.m();
      eta $$2 = $$0.q().b_($$0.a());
      dgm $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etb.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwy $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dva($$0, $$1);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.i, dvn::a);
   }
}
