import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtg extends drh {
   public static final MapCodec<dtg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyz.a.fieldOf("wood_type").forGetter(drh::d), t()).apply($$0, dtg::new));
   public static final dyk<jm> b = doc.aF;
   public static final fcm c = dke.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fcm d = dke.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fcm e = fcj.a(c, dke.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fcm i = fcj.a(d, dke.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fcm> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<dtg> a() {
      return a;
   }

   public dtg(dyz $$0, dxm.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$2.c_($$3) instanceof dwc $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bte.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dxn $$0, cps $$1, fbo $$2, dwc $$3, cxk $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cwz && !this.a($$2, $$0);
   }

   private boolean a(fbo $$0, dxn $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fcm b_(dxn $$0, dgf $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fbx.a());
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dxn $$0, dhd $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dhd $$0, dxn $$1, jh $$2, jm $$3) {
      dxn $$4 = $$0.a_($$2);
      return $$4.a(axu.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dsi.a);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = this.m();
      etp $$2 = $$0.q().b_($$0.a());
      dhd $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxn $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, f);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvp($$0, $$1);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.i, dwc::a);
   }
}
