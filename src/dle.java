import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dle extends drh {
   public static final MapCodec<dle> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyz.a.fieldOf("wood_type").forGetter(drh::d), t()).apply($$0, dle::new));
   public static final dym b = dyd.bb;
   public static final dye c = dyd.a;
   protected static final float d = 5.0F;
   protected static final fcm e = dke.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fcm> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dke.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dke.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dke.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dke.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dyz $$0, dxm.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$2.c_($$3) instanceof dwc $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bte.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cps $$0, fbo $$1, dwc $$2, cxk $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cwz && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dsi.b);
   }

   @Override
   public dxn a(dbb $$0) {
      dha $$1 = $$0.q();
      etp $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dxn $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axu.aD);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !dke.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dtg.b)) {
            jm $$8 = $$4.c(dtg.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dys.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dys.a($$6.g()) : dys.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == etq.c));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      fcm $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fbx.a());
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxn $$0) {
      return dys.b($$0.c(b));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.i, dwc::a);
   }
}
