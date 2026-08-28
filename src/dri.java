import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dri extends dpj {
   public static final MapCodec<dri> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxa.a.fieldOf("wood_type").forGetter(dpj::d), t()).apply($$0, dri::new));
   public static final dwl<jm> b = dme.aF;
   public static final fal c = dij.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fal d = dij.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fal e = fai.a(c, dij.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fal i = fai.a(d, dij.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fal> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   public dri(dxa $$0, dvn.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$2.c_($$3) instanceof dud $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bsh.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dvo $$0, cor $$1, ezn $$2, dud $$3, cwf $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cvu && !this.a($$2, $$0);
   }

   private boolean a(ezn $$0, dvo $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      return this.a($$0, $$1, $$2, ezw.a());
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dvo $$0, dfi $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dfi $$0, dvo $$1, jh $$2, jm $$3) {
      dvo $$4 = $$0.a_($$2);
      return $$4.a(axd.aB) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dqk.a);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = this.m();
      ero $$2 = $$0.q().b_($$0.a());
      dfi $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == erp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvo $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtq($$0, $$1);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.i, dud::a);
   }
}
