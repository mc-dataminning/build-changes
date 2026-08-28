import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cm(di.d c, di.d d) implements dy<Integer> {
   public static final Codec<cm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(di.d.d.optionalFieldOf("durability", di.d.c).forGetter(cm::b), di.d.d.optionalFieldOf("damage", di.d.c).forGetter(cm::c))
            .apply($$0, cm::new)
   );

   @Override
   public ks<Integer> a() {
      return kt.e;
   }

   public boolean a(cvx $$0, Integer $$1) {
      return !this.c.d($$0.p() - $$1) ? false : this.d.d($$1);
   }

   public static cm a(di.d $$0) {
      return new cm($$0, di.d.c);
   }

   public di.d b() {
      return this.c;
   }

   public di.d c() {
      return this.d;
   }
}
