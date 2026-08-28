import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkl extends dqq {
   public static final MapCodec<dkl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyi.a.fieldOf("wood_type").forGetter(dqq::d), t()).apply($$0, dkl::new));
   public static final dxv b = dxm.bd;
   public static final dxn c = dxm.b;
   protected static final float d = 5.0F;
   protected static final fbt e = djl.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fbt> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         djl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         djl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         djl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         djl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   public dkl(dyi $$0, dwv.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      if ($$2.c_($$3) instanceof dvl $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsj.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cow $$0, fav $$1, dvl $$2, cwo $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwd && $$1.c().equals(jn.a);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jn.a, drr.b);
   }

   @Override
   public dww a(daf $$0) {
      dgh $$1 = $$0.q();
      esy $$2 = $$1.b_($$0.a());
      ji $$3 = $$0.a().d();
      dww $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aD);
      jn $$6 = jn.a((double)$$0.i());
      boolean $$7 = !djl.a($$4.g($$1, $$3), jn.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dsp.b)) {
            jn $$8 = $$4.c(dsp.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jn> $$9 = dyb.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dyb.a($$6.g()) : dyb.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == esz.c));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      fbt $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbe.a());
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dww $$0) {
      return dyb.b($$0.c(b));
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new duy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dty> dtz<T> a(dgh $$0, dww $$1, dua<T> $$2) {
      return a($$2, dua.i, dvl::a);
   }
}
