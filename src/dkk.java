import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkk extends dqp {
   public static final MapCodec<dkk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyh.a.fieldOf("wood_type").forGetter(dqp::d), t()).apply($$0, dkk::new));
   public static final dxu b = dxl.bd;
   public static final dxm c = dxl.b;
   protected static final float d = 5.0F;
   protected static final fbs e = djk.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fbs> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         djk.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         djk.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         djk.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         djk.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dyh $$0, dwu.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if ($$2.c_($$3) instanceof dvk $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsi.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cov $$0, fau $$1, dvk $$2, cwn $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwc && $$1.c().equals(jn.a);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jn.a, drq.b);
   }

   @Override
   public dwv a(dae $$0) {
      dgg $$1 = $$0.q();
      esx $$2 = $$1.b_($$0.a());
      ji $$3 = $$0.a().d();
      dwv $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awo.aD);
      jn $$6 = jn.a((double)$$0.i());
      boolean $$7 = !djk.a($$4.g($$1, $$3), jn.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dso.b)) {
            jn $$8 = $$4.c(dso.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jn> $$9 = dya.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dya.a($$6.g()) : dya.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == esy.c));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      fbs $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbd.a());
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwv $$0) {
      return dya.b($$0.c(b));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dux($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.i, dvk::a);
   }
}
