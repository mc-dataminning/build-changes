import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dld extends dri {
   public static final MapCodec<dld> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dza.a.fieldOf("wood_type").forGetter(dri::d), t()).apply($$0, dld::new));
   public static final dyn b = dye.bd;
   public static final dyf c = dye.b;
   protected static final float d = 5.0F;
   protected static final fcl e = dkd.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fcl> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dkd.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dkd.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dkd.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dkd.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   public dld(dza $$0, dxn.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      if ($$2.c_($$3) instanceof dwd $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bta.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cpo $$0, fbn $$1, dwd $$2, cxg $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwv && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dsj.b);
   }

   @Override
   public dxo a(dax $$0) {
      dgz $$1 = $$0.q();
      etq $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dxo $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axk.aD);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !dkd.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dth.b)) {
            jm $$8 = $$4.c(dth.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dyt.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dyt.a($$6.g()) : dyt.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == etr.c));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      fcl $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fcl b_(dxo $$0, dge $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fbw.a());
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxo $$0) {
      return dyt.b($$0.c(b));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return a($$2, dus.i, dwd::a);
   }
}
