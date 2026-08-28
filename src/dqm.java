import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dqm extends don {
   public static final MapCodec<dqm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dwf.a.fieldOf("wood_type").forGetter(don::d), t()).apply($$0, dqm::new));
   public static final dvm b = dli.aF;
   public static final ezq c = dhm.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final ezq d = dhm.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final ezq e = ezn.a(c, dhm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final ezq i = ezn.a(d, dhm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jk, ezq> j = Maps.newEnumMap(ImmutableMap.of(jk.c, e, jk.d, e, jk.f, i, jk.e, i));

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   public dqm(dwf $$0, dur.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jk.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      if ($$2.c_($$3) instanceof dth $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return brs.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dus $$0, cnx $$1, eys $$2, dth $$3, cvs $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cvg && !this.a($$2, $$0);
   }

   private boolean a(eys $$0, dus $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return this.a($$0, $$1, $$2, ezb.a());
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((jk)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dus $$0, dem $$1, jf $$2) {
      jk $$3 = $$0.c(b).h();
      jk $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dem $$0, dus $$1, jf $$2, jk $$3) {
      dus $$4 = $$0.a_($$2);
      return $$4.a(awv.aA) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dpo.a);
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = this.n();
      eqt $$2 = $$0.q().b_($$0.a());
      dem $$3 = $$0.q();
      jf $$4 = $$0.a();

      for (jk $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jk $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == equ.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dus $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, f);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dsu($$0, $$1);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.i, dth::a);
   }
}
