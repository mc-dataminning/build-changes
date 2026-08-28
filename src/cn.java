import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cn(dj.d c, dj.d d) implements dz<Integer> {
   public static final Codec<cn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dj.d.d.optionalFieldOf("durability", dj.d.c).forGetter(cn::b), dj.d.d.optionalFieldOf("damage", dj.d.c).forGetter(cn::c))
            .apply($$0, cn::new)
   );

   @Override
   public kt<Integer> a() {
      return ku.e;
   }

   public boolean a(cxk $$0, Integer $$1) {
      return !this.c.d($$0.p() - $$1) ? false : this.d.d($$1);
   }

   public static cn a(dj.d $$0) {
      return new cn($$0, dj.d.c);
   }

   public dj.d b() {
      return this.c;
   }

   public dj.d c() {
      return this.d;
   }
}
