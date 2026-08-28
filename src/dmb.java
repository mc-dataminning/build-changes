import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmb extends dma implements dun {
   public static final MapCodec<dmb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dmb::new)
   );
   public static final ebv c = ebu.I;
   public static final ecc<jb> d = ebu.R;
   private final float e;
   private final float f;
   private final Map<jb, fgk> g;

   @Override
   public MapCodec<dmb> a() {
      return b;
   }

   public dmb(float $$0, float $$1, ebd.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jb.b));
      this.g = fgh.d(dnc.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      jb $$3 = $$0.c(d);
      iv $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, exp.c, exp.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      djy $$1 = $$0.q();
      iv $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == exp.c)).b(d, $$0.k());
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(c) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d);
   }
}
