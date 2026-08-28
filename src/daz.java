import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record daz(List<bup> c, float f) implements dbb {
   public static final MapCodec<daz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bup.d.listOf().fieldOf("effects").forGetter(daz::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(daz::c))
            .apply($$0, daz::new)
   );
   public static final zt<xg, daz> b = zt.a(bup.e.a(zr.a()), daz::b, zr.l, daz::c, daz::new);

   public daz(bup $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public daz(List<bup> $$0) {
      this($$0, 1.0F);
   }

   public daz(bup $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dbb.a<daz> a() {
      return dbb.a.a;
   }

   @Override
   public boolean a(dhi $$0, cxp $$1, bwg $$2) {
      if ($$2.dZ().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bup $$4 : this.c) {
            if ($$2.a(new bup($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bup> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
