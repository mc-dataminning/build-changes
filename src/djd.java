import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class djd extends djc implements drl {
   public static final MapCodec<djd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, djd::new)
   );
   public static final dyh c = dyg.I;
   public static final dyo<jn> d = dyg.R;
   private final float e;
   private final float f;
   private final Map<jn, fcr> g;

   @Override
   public MapCodec<djd> a() {
      return b;
   }

   public djd(float $$0, float $$1, dxp.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jn.b));
      this.g = fco.d(dke.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      jn $$3 = $$0.c(d);
      ji $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dha $$1 = $$0.q();
      ji $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == etx.c)).b(d, $$0.k());
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
   protected etw b_(dxq $$0) {
      return $$0.c(c) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d);
   }
}
