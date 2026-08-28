import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record daa(List<btr> c, float f) implements dac {
   public static final MapCodec<daa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btr.d.listOf().fieldOf("effects").forGetter(daa::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(daa::c))
            .apply($$0, daa::new)
   );
   public static final yn<wa, daa> b = yn.a(btr.e.a(yl.a()), daa::b, yl.l, daa::c, daa::new);

   public daa(btr $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public daa(List<btr> $$0) {
      this($$0, 1.0F);
   }

   public daa(btr $$0) {
      this($$0, 1.0F);
   }

   @Override
   public dac.a<daa> a() {
      return dac.a.a;
   }

   @Override
   public boolean a(dgj $$0, cwq $$1, bvi $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (btr $$4 : this.c) {
            if ($$2.a(new btr($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<btr> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
