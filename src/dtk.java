import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dtk extends drk {
   public static final MapCodec<dtk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter(drk::d), t()).apply($$0, dtk::new));
   public static final dyo<jn> b = dod.e;
   private static final Map<jn, fcr> c = fco.c(dke.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   public dtk(dzd $$0, dxp.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.B.b().b(b, jn.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = this.m();
      etw $$2 = $$0.q().b_($$0.a());
      dhc $$3 = $$0.q();
      ji $$4 = $$0.a();
      jn[] $$5 = $$0.f();

      for (jn $$6 : $$5) {
         if ($$6.o().d()) {
            jn $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == etx.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxq $$0) {
      return $$0.c(b).p();
   }

   @Override
   public fbx o(dxq $$0) {
      return c.get($$0.c(b)).a().f();
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
      $$0.a(b, d);
   }
}
