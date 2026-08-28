import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dby(float c, Optional<ale> d) {
   public static final Codec<dby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ays.o.fieldOf("seconds").forGetter(dby::b), ale.a.optionalFieldOf("cooldown_group").forGetter(dby::c)).apply($$0, dby::new)
   );
   public static final yu<wh, dby> b = yu.a(ys.l, dby::b, ale.b.a(ys::a), dby::c, dby::new);

   public dby(float $$0) {
      this($$0, Optional.empty());
   }

   public int a() {
      return (int)(this.c * 20.0F);
   }

   public void a(cys $$0, bwz $$1) {
      if ($$1 instanceof cqs $$2) {
         $$2.gE().a($$0, this.a());
      }
   }

   public float b() {
      return this.c;
   }

   public Optional<ale> c() {
      return this.d;
   }
}
