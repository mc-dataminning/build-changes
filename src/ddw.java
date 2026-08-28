import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddw(List<bwi> c, float f) implements ddy {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bwi.d.listOf().fieldOf("effects").forGetter(ddw::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(ddw::c))
            .apply($$0, ddw::new)
   );
   public static final ze<wp, ddw> b = ze.a(bwi.e.a(zc.a()), ddw::b, zc.l, ddw::c, ddw::new);

   public ddw(bwi $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public ddw(List<bwi> $$0) {
      this($$0, 1.0F);
   }

   public ddw(bwi $$0) {
      this($$0, 1.0F);
   }

   @Override
   public ddy.a<ddw> a() {
      return ddy.a.a;
   }

   @Override
   public boolean a(dkj $$0, dak $$1, byf $$2) {
      if ($$2.dY().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (bwi $$4 : this.c) {
            if ($$2.a(new bwi($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<bwi> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
