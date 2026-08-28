import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dth extends div {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwe.q.fieldOf("color").forGetter(div::b), t()).apply($$0, dth::new));
   public static final dyo<jn> b = dod.e;
   private static final Map<jn, fcr> c = fco.c(dke.a(16.0, 0.0, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(cwe $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.B.b().b(b, jn.c));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == $$0.c(b).g() && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m();
      dhc $$2 = $$0.q();
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
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
