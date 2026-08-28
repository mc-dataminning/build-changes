import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dpv extends dnw {
   public static final MapCodec<dpv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dvn.a.fieldOf("wood_type").forGetter(dnw::d), u()).apply($$0, dpv::new));
   public static final duu b = dkr.aE;
   public static final eyx c = dgv.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eyx d = dgv.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eyx e = eyu.a(c, dgv.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eyx i = eyu.a(d, dgv.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jj, eyx> j = Maps.newEnumMap(ImmutableMap.of(jj.c, e, jj.d, e, jj.f, i, jj.e, i));

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(dvn $$0, dtz.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.E.b().b(b, jj.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.c_($$3) instanceof dsq $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return brk.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dua $$0, cnp $$1, eya $$2, dsq $$3, cvl $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cuy && !this.a($$2, $$0);
   }

   private boolean a(eya $$0, dua $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected eyx b_(dua $$0, dcx $$1, je $$2) {
      return this.a($$0, $$1, $$2, eyj.a());
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((jj)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dua $$0, ddv $$1, je $$2) {
      jj $$3 = $$0.c(b).h();
      jj $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(ddv $$0, dua $$1, je $$2, jj $$3) {
      dua $$4 = $$0.a_($$2);
      return $$4.a(aws.aA) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dox.a);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = this.o();
      eqb $$2 = $$0.q().b_($$0.a());
      ddv $$3 = $$0.q();
      je $$4 = $$0.a();

      for (jj $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jj $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == eqc.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float h(dua $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsd($$0, $$1);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.i, dsq::a);
   }
}
