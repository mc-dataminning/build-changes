import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckt(iv e, cte f) implements cta<ctd, ctb> {
   public static final Codec<ckt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.b.forGetter(ckt::b), cte.b.fieldOf("spawn_conditions").forGetter(ckt::c)).apply($$0, ckt::new)
   );
   public static final Codec<ckt> b = RecordCodecBuilder.create($$0 -> $$0.group(iv.b.forGetter(ckt::b)).apply($$0, ckt::new));
   public static final Codec<je<ckt>> c = ald.a(mg.aS);
   public static final yw<wj, je<ckt>> d = yu.b(mg.aS);

   private ckt(iv $$0) {
      this($$0, cte.a);
   }

   @Override
   public List<cta.a<ctd, ctb>> a() {
      return this.f.a();
   }

   public iv b() {
      return this.e;
   }

   public cte c() {
      return this.f;
   }
}
