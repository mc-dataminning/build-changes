import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class djp extends dpq {
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxh.a.fieldOf("wood_type").forGetter(dpq::d), t()).apply($$0, djp::new));
   public static final dwu b = dwl.ba;
   public static final dwm c = dwl.a;
   protected static final float d = 5.0F;
   protected static final fas e = diq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fas> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         diq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         diq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         diq.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         diq.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dxh $$0, dvu.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$2.c_($$3) instanceof duk $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsk.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cou $$0, ezu $$1, duk $$2, cwm $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwb && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dqr.b);
   }

   @Override
   public dvv a(dad $$0) {
      dfm $$1 = $$0.q();
      erv $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dvv $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axc.aC);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !diq.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(drp.b)) {
            jm $$8 = $$4.c(drp.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dxa.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dxa.a($$6.g()) : dxa.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == erw.c));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      fas $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fas b_(dvv $$0, der $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fad.a());
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvv $$0) {
      return dxa.b($$0.c(b));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.i, duk::a);
   }
}
