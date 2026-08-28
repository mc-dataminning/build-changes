import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ciw(iv e, cte f) implements cta<ctd, ctb> {
   public static final Codec<ciw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.b.forGetter(ciw::b), cte.b.fieldOf("spawn_conditions").forGetter(ciw::c)).apply($$0, ciw::new)
   );
   public static final Codec<ciw> b = RecordCodecBuilder.create($$0 -> $$0.group(iv.b.forGetter(ciw::b)).apply($$0, ciw::new));
   public static final Codec<je<ciw>> c = ald.a(mg.aH);
   public static final yw<wj, je<ciw>> d = yu.b(mg.aH);

   private ciw(iv $$0) {
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
