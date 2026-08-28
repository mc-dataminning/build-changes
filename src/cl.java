import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cl(dh.d c, dh.d d) implements dx<Integer> {
   public static final Codec<cl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dh.d.d.optionalFieldOf("durability", dh.d.c).forGetter(cl::b), dh.d.d.optionalFieldOf("damage", dh.d.c).forGetter(cl::c))
            .apply($$0, cl::new)
   );

   @Override
   public kr<Integer> a() {
      return ks.e;
   }

   public boolean a(cvs $$0, Integer $$1) {
      return !this.c.d($$0.p() - $$1) ? false : this.d.d($$1);
   }

   public static cl a(dh.d $$0) {
      return new cl($$0, dh.d.c);
   }

   public dh.d b() {
      return this.c;
   }

   public dh.d c() {
      return this.d;
   }
}
