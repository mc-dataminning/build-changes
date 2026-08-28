import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dso extends did {
   public static final MapCodec<dso> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(did::b), t()).apply($$0, dso::new));
   public static final dxu<jn> b = dnk.aF;
   private static final Map<jn, fbu> c = Maps.newEnumMap(
      ImmutableMap.of(
         jn.c,
         djm.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jn.d,
         djm.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jn.e,
         djm.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jn.f,
         djm.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(cvm $$0, dww.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? djo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = this.m();
      dgl $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
