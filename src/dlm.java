import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlm extends drp {
   public static final MapCodec<dlm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzh.a.fieldOf("wood_type").forGetter(drp::d), t()).apply($$0, dlm::new));
   public static final dyu b = dyl.bb;
   public static final dym c = dyl.a;
   protected static final float d = 5.0F;
   protected static final fcs e = dkm.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fcs> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dkm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dkm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dkm.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dkm.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dlm> a() {
      return a;
   }

   public dlm(dzh $$0, dxu.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$2.c_($$3) instanceof dwk $$7 && this.a($$4, $$6, $$7, $$0)) {
         return btj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cpx $$0, fbu $$1, dwk $$2, cxp $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cxe && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dsq.b);
   }

   @Override
   public dxv a(dbg $$0) {
      dhi $$1 = $$0.q();
      etx $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dxv $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axu.aD);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !dkm.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dto.b)) {
            jm $$8 = $$4.c(dto.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dza.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dza.a($$6.g()) : dza.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == ety.c));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      fcs $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fcs b_(dxv $$0, dgn $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fcd.a());
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dko.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxv $$0) {
      return dza.b($$0.c(b));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return a($$2, duz.i, dwk::a);
   }
}
