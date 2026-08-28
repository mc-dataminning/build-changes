import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dmn extends dmm implements duz {
   public static final MapCodec<dmn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("height").forGetter($$0x -> $$0x.e), Codec.FLOAT.fieldOf("width").forGetter($$0x -> $$0x.f), t())
            .apply($$0, dmn::new)
   );
   public static final ech c = ecg.I;
   public static final eco<jc> d = ecg.R;
   private final float e;
   private final float f;
   private final Map<jc, fgw> g;

   @Override
   public MapCodec<dmn> a() {
      return b;
   }

   public dmn(float $$0, float $$1, ebp.d $$2) {
      super($$2);
      this.l(this.m().b(c, Boolean.valueOf(false)).b(d, jc.b));
      this.g = fgt.d(dno.c((double)$$1, (double)(16.0F - $$0), 16.0));
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.g.get($$0.c(d));
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      jc $$3 = $$0.c(d);
      iw $$4 = $$2.a($$3.g());
      return $$1.a_($$4).c($$1, $$4, $$3);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return $$4 == $$0.c(d).g() && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      dkk $$1 = $$0.q();
      iw $$2 = $$0.a();
      return this.m().b(c, Boolean.valueOf($$1.b_($$2).a() == eyb.c)).b(d, $$0.k());
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(c) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d);
   }
}
