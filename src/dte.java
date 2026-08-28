import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dte extends div {
   public static final MapCodec<dte> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.q.fieldOf("color").forGetter(div::b), t()).apply($$0, dte::new));
   public static final dyk<jm> b = doc.aF;
   private static final Map<jm, fcm> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dke.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dke.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         dke.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         dke.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dte> a() {
      return a;
   }

   public dte(cwh $$0, dxm.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = this.m();
      dhd $$2 = $$0.q();
      jh $$3 = $$0.a();
      jm[] $$4 = $$0.f();

      for (jm $$5 : $$4) {
         if ($$5.o().d()) {
            jm $$6 = $$5.g();
            $$1 = $$1.b(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
