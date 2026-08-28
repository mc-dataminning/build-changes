import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dso extends dqp {
   public static final MapCodec<dso> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter(dqp::d), t()).apply($$0, dso::new));
   public static final dxs<jn> b = dni.aF;
   public static final fbs c = djk.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fbs d = djk.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fbs e = fbp.a(c, djk.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fbs i = fbp.a(d, djk.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jn, fbs> j = Maps.newEnumMap(ImmutableMap.of(jn.c, e, jn.d, e, jn.f, i, jn.e, i));

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(dyh $$0, dwu.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.c_($$3) instanceof dvk $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsi.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dwv $$0, cov $$1, fau $$2, dvk $$3, cwn $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwc && !this.a($$2, $$0);
   }

   private boolean a(fau $$0, dwv $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbd.a());
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ((jn)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dwv $$0, dgj $$1, ji $$2) {
      jn $$3 = $$0.c(b).h();
      jn $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dgj $$0, dwv $$1, ji $$2, jn $$3) {
      dwv $$4 = $$0.a_($$2);
      return $$4.a(awo.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, drq.a);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = this.m();
      esx $$2 = $$0.q().b_($$0.a());
      dgj $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == esy.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwv $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dux($$0, $$1);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.i, dvk::a);
   }
}
