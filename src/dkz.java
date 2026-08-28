import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dkz extends dky implements dtj {
   public static final MapCodec<dkz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dkz::new)
   );
   public static final eaq c = eap.I;
   public static final eax<ja> d = eap.R;
   private final float e;
   private final float f;
   private final Map<ja, ffc> g;

   @Override
   public MapCodec<dkz> a() {
      return b;
   }

   public dkz(float $$0, float $$1, dzy.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, ja.b));
      this.g = fez.d(dma.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      ja $$3 = $$0.c(d);
      iu $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, ewh.c, ewh.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dmc.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      diw $$1 = $$0.q();
      iu $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == ewh.c)).b(d, $$0.k());
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(c) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d);
   }
}
