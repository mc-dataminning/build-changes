import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtn extends dro {
   public static final MapCodec<dtn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzg.a.fieldOf("wood_type").forGetter(dro::d), t()).apply($$0, dtn::new));
   public static final dyr<jm> b = doj.aF;
   public static final fcr c = dkl.a(0.0, 14.0, 6.0, 16.0, 16.0, 10.0);
   public static final fcr d = dkl.a(6.0, 14.0, 0.0, 10.0, 16.0, 16.0);
   public static final fcr e = fco.a(c, dkl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0));
   public static final fcr i = fco.a(d, dkl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0));
   private static final Map<jm, fcr> j = Maps.newEnumMap(ImmutableMap.of(jm.c, e, jm.d, e, jm.f, i, jm.e, i));

   @Override
   public MapCodec<dtn> a() {
      return a;
   }

   public dtn(dzg $$0, dxt.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, jm.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dwj $$7 && this.a($$1, $$4, $$6, $$7, $$0)) {
         return bti.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(dxu $$0, cpw $$1, fbt $$2, dwj $$3, cxo $$4) {
      return !$$3.a($$3.a($$1), $$1) && $$4.h() instanceof cxd && !this.a($$2, $$0);
   }

   private boolean a(fbt $$0, dxu $$1) {
      return $$0.c().o() == $$1.c(b).o();
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return j.get($$0.c(b));
   }

   @Override
   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fcc.a());
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ((jm)$$0.c(b)) {
         case f:
         case e:
            return d;
         default:
            return c;
      }
   }

   public boolean b(dxu $$0, dhk $$1, jh $$2) {
      jm $$3 = $$0.c(b).h();
      jm $$4 = $$0.c(b).i();
      return this.a($$1, $$0, $$2.a($$3), $$4) || this.a($$1, $$0, $$2.a($$4), $$3);
   }

   public boolean a(dhk $$0, dxu $$1, jh $$2, jm $$3) {
      dxu $$4 = $$0.a_($$2);
      return $$4.a(axu.aC) ? $$4.c(b).o().a($$1.c(b)) : $$4.a($$0, $$2, $$3, dsp.a);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = this.m();
      etw $$2 = $$0.q().b_($$0.a());
      dhk $$3 = $$0.q();
      jh $$4 = $$0.a();

      for (jm $$5 : $$0.f()) {
         if ($$5.o().d() && !$$5.o().a($$0.k())) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$3, $$4) && this.b($$1, $$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4.o() == $$0.c(b).h().o() && !$$0.a($$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxu $$0) {
      return $$0.c(b).p();
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, f);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvw($$0, $$1);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.i, dwj::a);
   }
}
