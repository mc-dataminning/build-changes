import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record czl(List<btj> c, float f) implements czn {
   public static final MapCodec<czl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btj.d.listOf().fieldOf("effects").forGetter(czl::b), Codec.floatRange(0.0F, 1.0F).optionalFieldOf("probability", 1.0F).forGetter(czl::c))
            .apply($$0, czl::new)
   );
   public static final zg<wt, czl> b = zg.a(btj.e.a(ze.a()), czl::b, ze.j, czl::c, czl::new);

   public czl(btj $$0, float $$1) {
      this(List.of($$0), $$1);
   }

   public czl(List<btj> $$0) {
      this($$0, 1.0F);
   }

   public czl(btj $$0) {
      this($$0, 1.0F);
   }

   @Override
   public czn.a<czl> a() {
      return czn.a.a;
   }

   @Override
   public boolean a(dfb $$0, cwb $$1, bva $$2) {
      if ($$2.ea().i() >= this.f) {
         return false;
      } else {
         boolean $$3 = false;

         for (btj $$4 : this.c) {
            if ($$2.a(new btj($$4))) {
               $$3 = true;
            }
         }

         return $$3;
      }
   }

   public List<btj> b() {
      return this.c;
   }

   public float c() {
      return this.f;
   }
}
