import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dji extends dpj {
   public static final MapCodec<dji> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dxa.a.fieldOf("wood_type").forGetter(dpj::d), t()).apply($$0, dji::new));
   public static final dwn b = dwe.ba;
   public static final dwf c = dwe.a;
   protected static final float d = 5.0F;
   protected static final fal e = dij.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fal> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dij.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dij.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dij.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dij.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   public dji(dxa $$0, dvn.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$2.c_($$3) instanceof dud $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsh.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cor $$0, ezn $$1, dud $$2, cwf $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cvu && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dqk.b);
   }

   @Override
   public dvo a(czw $$0) {
      dff $$1 = $$0.q();
      ero $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dvo $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axd.aC);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !dij.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dri.b)) {
            jm $$8 = $$4.c(dri.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dwt.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dwt.a($$6.g()) : dwt.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == erp.c));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      fal $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fal b_(dvo $$0, dek $$1, jh $$2) {
      return this.a($$0, $$1, $$2, ezw.a());
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dil.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dvo $$0) {
      return dwt.b($$0.c(b));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.i, dud::a);
   }
}
