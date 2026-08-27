import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dhp extends dfr {
   public static final MapCodec<dhp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmw.a.fieldOf("wood_type").forGetter(dfr::d), u()).apply($$0, dhp::new));
   public static final dmd b = dcn.aE;
   public static final eos c = cys.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final eos d = cys.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final eos e = eop.a(c, cys.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final eos i = eop.a(d, cys.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<ie, eos> j = Maps.newEnumMap(ImmutableMap.of(ie.c, e, ie.d, e, ie.f, i, ie.e, i));

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dmw $$0, dli.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, ie.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      if ($$2.c_($$3) instanceof dkg $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bly.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dlj $$0, chl $$1, env $$2, dkg $$3, cpd $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.d() instanceof coq && !this.a($$2, $$0);
   }

   private boolean a(env $$0, dlj $$1) {
      return $$0.b().o() == $$1.c(b).o();
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected eos b_(dlj $$0, cux $$1, hz $$2) {
      return this.a($$0, $$1, $$2, eoe.a());
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      switch ((ie)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dlj $$0, cvu $$1, hz $$2) {
      ie $$3 = $$0.c(b).h();
      ie $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(cvu $$0, dlj $$1, hz $$2, ie $$3) {
      dlj $$4 = $$0.a_($$2);
      return $$4.a(aua.ay) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dgs.a);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      dlj $$1 = this.o();
      egw $$2 = $$0.q().b_($$0.a());
      cvu $$3 = $$0.q();
      hz $$4 = $$0.a();

      for (ie $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            ie $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == egx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1.o() == $$0.c(b).h().o() && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlj $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dju($$0, $$1);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.i, dkg::a);
   }
}
