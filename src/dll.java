import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dll extends dro {
   public static final MapCodec<dll> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzg.a.fieldOf("wood_type").forGetter(dro::d), t()).apply($$0, dll::new));
   public static final dyt b = dyk.bb;
   public static final dyl c = dyk.a;
   protected static final float d = 5.0F;
   protected static final fcr e = dkl.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, fcr> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dkl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dkl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dkl.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dkl.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   public dll(dzg $$0, dxt.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.F.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dwj $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bti.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cpw $$0, fbt $$1, dwj $$2, cxo $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cxd && $$1.c().equals(jm.a);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jm.a, dsp.b);
   }

   @Override
   public dxu a(dbf $$0) {
      dhh $$1 = $$0.q();
      etw $$2 = $$1.b_($$0.a());
      jh $$3 = $$0.a().d();
      dxu $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axu.aD);
      jm $$6 = jm.a((double)$$0.i());
      boolean $$7 = !dkl.a($$4.g($$1, $$3), jm.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dtn.b)) {
            jm $$8 = $$4.c(dtn.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jm> $$9 = dyz.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dyz.a($$6.g()) : dyz.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(f, Boolean.valueOf($$2.a() == etx.c));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      fcr $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected fcr b_(dxu $$0, dgm $$1, jh $$2) {
      return this.a($$0, $$1, $$2, fcc.a());
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.b && !this.a($$0, $$1, $$3) ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxu $$0) {
      return dyz.b($$0.c(b));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return a($$2, duy.i, dwj::a);
   }
}
