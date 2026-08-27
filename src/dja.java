import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dja extends dhb {
   public static final MapCodec<dja> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(doo.a.fieldOf("wood_type").forGetter(dhb::d), u()).apply($$0, dja::new));
   public static final dnv b = ddx.aE;
   public static final eqm c = dac.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eqm d = dac.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eqm e = eqj.a(c, dac.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eqm i = eqj.a(d, dac.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ih, eqm> j = Maps.newEnumMap(ImmutableMap.of(ih.c, e, ih.d, e, ih.f, i, ih.e, i));

   @Override
   public MapCodec<dja> a() {
      return a;
   }

   public dja(doo $$0, dna.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bnf a(cqm $$0, dnb $$1, cxb $$2, ib $$3, ciu $$4, bnc $$5, epp $$6) {
      if ($$2.c_($$3) instanceof dlr $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bnf.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dnb $$0, ciu $$1, epp $$2, dlr $$3, cqm $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof cpz && !this.a($$2, $$0);
   }

   private boolean a(epp $$0, dnb $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected eqm b_(dnb $$0, cwh $$1, ib $$2) {
      return this.a($$0, $$1, $$2, epy.a());
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((ih)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dnb $$0, cxe $$1, ib $$2) {
      ih $$3 = $$0.c(b).h();
      ih $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cxe $$0, dnb $$1, ib $$2, ih $$3) {
      dnb $$4 = $$0.a_($$2);
      return $$4.a(aun.az) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dic.a);
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = this.o();
      eip $$2 = $$0.q().b_($$0.a());
      cxe $$3 = $$0.q();
      ib $$4 = $$0.a();

      for (ih $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eiq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dnb $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlf($$0, $$1);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$2, dkk.i, dlr::a);
   }
}
