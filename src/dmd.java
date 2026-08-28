import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmd extends dmc implements dup {
   public static final MapCodec<dmd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dmd::new)
   );
   public static final ebx c = ebw.I;
   public static final ece<jc> d = ebw.R;
   private final float e;
   private final float f;
   private final Map<jc, fgm> g;

   @Override
   public MapCodec<dmd> a() {
      return b;
   }

   public dmd(float $$0, float $$1, ebf.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jc.b));
      this.g = fgj.d(dne.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      jc $$3 = $$0.c(d);
      iw $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      dka $$1 = $$0.q();
      iw $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == exr.c)).b(d, $$0.k());
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(c) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d);
   }
}
