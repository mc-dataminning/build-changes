import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqj extends dok {
   public static final MapCodec<dqj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwb.a.fieldOf("wood_type").forGetter(dok::d), u()).apply($$0, dqj::new));
   public static final dvi b = dlf.aF;
   public static final ezm c = dhj.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ezm d = dhj.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ezm e = ezj.a(c, dhj.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ezm i = ezj.a(d, dhj.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jj, ezm> j = Maps.newEnumMap(ImmutableMap.of(jj.c, e, jj.d, e, jj.f, i, jj.e, i));

   @Override
   public MapCodec<dqj> a() {
      return a;
   }

   public dqj(dwb $$0, dun.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jj.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      if ($$2.c_($$3) instanceof dte $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return brp.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(duo $$0, cnu $$1, eyo $$2, dte $$3, cvp $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cvd && !this.a($$2, $$0);
   }

   private boolean a(eyo $$0, duo $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ezm b_(duo $$0, ddl $$1, je $$2) {
      return this.a($$0, $$1, $$2, eyx.a());
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ((jj)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(duo $$0, dej $$1, je $$2) {
      jj $$3 = $$0.c(b).h();
      jj $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dej $$0, duo $$1, je $$2, jj $$3) {
      duo $$4 = $$0.a_($$2);
      return $$4.a(awt.aA) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dpl.a);
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = this.o();
      eqp $$2 = $$0.q().b_($$0.a());
      dej $$3 = $$0.q();
      je $$4 = $$0.a();

      for (jj $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == eqq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dhl.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(duo $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, f);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dsr($$0, $$1);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.i, dte::a);
   }
}
