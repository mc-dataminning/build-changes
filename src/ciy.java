import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ciy(iv e, ctj f) implements ctf<cti, ctg> {
   public static final Codec<ciy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.b.forGetter(ciy::b), ctj.b.fieldOf("spawn_conditions").forGetter(ciy::c)).apply($$0, ciy::new)
   );
   public static final Codec<ciy> b = RecordCodecBuilder.create($$0 -> $$0.group(iv.b.forGetter(ciy::b)).apply($$0, ciy::new));
   public static final Codec<je<ciy>> c = ald.a(mg.aH);
   public static final yw<wj, je<ciy>> d = yu.b(mg.aH);

   private ciy(iv $$0) {
      this($$0, ctj.a);
   }

   @Override
   public List<ctf.a<cti, ctg>> a() {
      return this.f.a();
   }

   public iv b() {
      return this.e;
   }

   public ctj c() {
      return this.f;
   }
}
