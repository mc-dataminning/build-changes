import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dtl extends dja {
   public static final MapCodec<dtl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drm.a.b.fieldOf("kind").forGetter(dja::b), t()).apply($$0, dtl::new));
   public static final dyo<jn> d = dod.e;
   private static final Map<jn, fcr> b = fco.c(dke.c(8.0, 8.0, 16.0));

   @Override
   public MapCodec<? extends dtl> a() {
      return c;
   }

   protected dtl(drm.a $$0, dxp.d $$1) {
      super($$0, $$1);
      this.l(this.m().b(d, jn.c));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = super.a($$0);
      dgf $$2 = $$0.q();
      ji $$3 = $$0.a();
      jn[] $$4 = $$0.f();

      for (jn $$5 : $$4) {
         if ($$5.o().d()) {
            jn $$6 = $$5.g();
            $$1 = $$1.b(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
