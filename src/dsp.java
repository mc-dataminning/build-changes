import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsp extends dqq {
   public static final MapCodec<dsp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter(dqq::d), t()).apply($$0, dsp::new));
   public static final dxt<jn> b = dnj.aF;
   public static final fbt c = djl.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fbt d = djl.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fbt e = fbq.a(c, djl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fbt i = fbq.a(d, djl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jn, fbt> j = Maps.newEnumMap(ImmutableMap.of(jn.c, e, jn.d, e, jn.f, i, jn.e, i));

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   public dsp(dyi $$0, dwv.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$2.c_($$3) instanceof dvl $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dww $$0, cow $$1, fav $$2, dvl $$3, cwo $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwd && !this.a($$2, $$0);
   }

   private boolean a(fav $$0, dww $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbe.a());
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      switch ((jn)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dww $$0, dgk $$1, ji $$2) {
      jn $$3 = $$0.c(b).h();
      jn $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dgk $$0, dww $$1, ji $$2, jn $$3) {
      dww $$4 = $$0.a_($$2);
      return $$4.a(awp.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, drr.a);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = this.m();
      esy $$2 = $$0.q().b_($$0.a());
      dgk $$3 = $$0.q();
      ji $$4 = $$0.a();

      for (jn $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == esz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dww $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duy($$0, $$1);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.i, dvl::a);
   }
}
