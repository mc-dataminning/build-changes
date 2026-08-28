import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtf extends diu {
   public static final MapCodec<dtf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwd.q.fieldOf("color").forGetter(diu::b), t()).apply($$0, dtf::new));
   public static final dyl<jm> b = dob.aF;
   private static final Map<jm, fcl> c = Maps.newEnumMap(
      ImmutableMap.of(
         jm.c,
         dkd.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jm.d,
         dkd.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jm.e,
         dkd.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jm.f,
         dkd.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   public dtf(cwd $$0, dxn.d $$1) {
      super($$0, $$1);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = this.m();
      dhc $$2 = $$0.q();
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
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }
}
