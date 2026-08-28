import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dth extends dri {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dza.a.fieldOf("wood_type").forGetter(dri::d), t()).apply($$0, dth::new));
   public static final dyl<jm> b = dob.aF;
   public static final fcl c = dkd.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fcl d = dkd.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fcl e = fci.a(c, dkd.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fcl i = fci.a(d, dkd.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fcl> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(dza $$0, dxn.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.c_($$3) instanceof dwd $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bta.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dxo $$0, cpo $$1, fbn $$2, dwd $$3, cxg $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwv && !this.a($$2, $$0);
   }

   private boolean a(fbn $$0, dxo $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fbw.a());
   }

   @Override
   protected fcl b(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dxo $$0, dhc $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dhc $$0, dxo $$1, jh $$2, jm $$3) {
      dxo $$4 = $$0.a_($$2);
      return $$4.a(axk.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dsj.a);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m();
      etq $$2 = $$0.q().b_($$0.a());
      dhc $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxo $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, f);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvq($$0, $$1);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.i, dwd::a);
   }
}
