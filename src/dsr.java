import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dsr extends dqr {
   public static final MapCodec<dsr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dyj.a.fieldOf("wood_type").forGetter(dqr::d), t()).apply($$0, dsr::new));
   public static final dxu<jn> b = dnk.aF;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<jn, fbu> i = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djm.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djm.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         jn.f,
         djm.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         jn.e,
         djm.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(dyj $$0, dww.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.F.b().b(b, jn.c).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = this.m();
      esz $$2 = $$0.q().b_($$0.a());
      dgl $$3 = $$0.q();
      ji $$4 = $$0.a();
      jn[] $$5 = $$0.f();

      for (jn $$6 : $$5) {
         if ($$6.o().d()) {
            jn $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(f, Boolean.valueOf($$2.a() == eta.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dwx $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fba o(dwx $$0) {
      fbu $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, f);
   }
}
