import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dau(List<buk> c, float f) implements daw {
   public static final MapCodec<dau> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(buk.d.listOf().fieldOf("effects").forGetter(dau::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(dau::c))
            .apply($$0, dau::new)
   );
   public static final zt<xg, dau> b = zt.a(buk.e.a(zr.a()), dau::b, zr.l, dau::c, dau::new);

   public dau(buk $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public dau(List<buk> $$0) {
      this($$0, 1.0F);
   }

   public dau(buk $$0) {
      this($$0, 1.0F);
   }

   @Override
   public daw.a<dau> a() {
      return daw.a.a;
   }

   @Override
   public boolean a(dha $$0, cxk $$1, bwb $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (buk $$4 : this.c) {
            if ($$2.a(new buk($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<buk> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
