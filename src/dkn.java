import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dkn extends dqs {
   public static final MapCodec<dkn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyk.a.fieldOf("wood_type").forGetter(dqs::d), t()).apply($$0, dkn::new));
   public static final dxx b = dxo.bd;
   public static final dxp c = dxo.b;
   protected static final float d = 5.0F;
   protected static final fbv e = djn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fbv> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         djn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         djn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         djn.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         djn.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dyk $$0, dwx.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if ($$2.c_($$3) instanceof dvn $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsl.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(coy $$0, fax $$1, dvn $$2, cwq $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwf && $$1.c().equals(jn.a);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jn.a, drt.b);
   }

   @Override
   public dwy a(dah $$0) {
      dgj $$1 = $$0.q();
      eta $$2 = $$1.b_($$0.a());
      ji $$3 = $$0.a().d();
      dwy $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aD);
      jn $$6 = jn.a((double)$$0.i());
      boolean $$7 = !djn.a($$4.g($$1, $$3), jn.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dsr.b)) {
            jn $$8 = $$4.c(dsr.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jn> $$9 = dyd.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dyd.a($$6.g()) : dyd.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == etb.c));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      fbv $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fbg.a());
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwy $$0) {
      return dyd.b($$0.c(b));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dva($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return a($$2, duc.i, dvn::a);
   }
}
