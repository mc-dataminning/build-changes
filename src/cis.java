import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cis(iv e, csy f) implements csu<csx, csv> {
   public static final Codec<cis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.b.forGetter(cis::b), csy.b.fieldOf("spawn_conditions").forGetter(cis::c)).apply($$0, cis::new)
   );
   public static final Codec<cis> b = RecordCodecBuilder.create($$0 -> $$0.group(iv.b.forGetter(cis::b)).apply($$0, cis::new));
   public static final Codec<je<cis>> c = alb.a(mg.aH);
   public static final yu<wh, je<cis>> d = ys.b(mg.aH);

   private cis(iv $$0) {
      this($$0, csy.a);
   }

   @Override
   public List<csu.a<csx, csv>> a() {
      return this.f.a();
   }

   public iv b() {
      return this.e;
   }

   public csy c() {
      return this.f;
   }
}
