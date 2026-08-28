import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dle extends dld implements dtq {
   public static final MapCodec<dle> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dle::new)
   );
   public static final eay c = eax.I;
   public static final ebf<ja> d = eax.R;
   private final float e;
   private final float f;
   private final Map<ja, ffk> g;

   @Override
   public MapCodec<dle> a() {
      return b;
   }

   public dle(float $$0, float $$1, eag.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, ja.b));
      this.g = ffh.d(dmf.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      ja $$3 = $$0.c(d);
      iu $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dmh.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      djb $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == ewp.c)).b(d, $$0.k());
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(c) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d);
   }
}
