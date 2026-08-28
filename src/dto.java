import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dto extends drp {
   public static final MapCodec<dto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzh.a.fieldOf("wood_type").forGetter(drp::d), t()).apply($$0, dto::new));
   public static final dys<jm> b = dok.aF;
   public static final fcs c = dkm.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fcs d = dkm.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fcs e = fcp.a(c, dkm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fcs i = fcp.a(d, dkm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fcs> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   public dto(dzh $$0, dxu.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.c_($$3) instanceof dwk $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return btj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dxv $$0, cpx $$1, fbu $$2, dwk $$3, cxp $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cxe && !this.a($$2, $$0);
   }

   private boolean a(fbu $$0, dxv $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fcd.a());
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dxv $$0, dhl $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dhl $$0, dxv $$1, jh $$2, jm $$3) {
      dxv $$4 = $$0.a_($$2);
      return $$4.a(axu.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dsq.a);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = this.m();
      etx $$2 = $$0.q().b_($$0.a());
      dhl $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == ety.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxv $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvx($$0, $$1);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.i, dwk::a);
   }
}
