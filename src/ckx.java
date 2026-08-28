import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckx(iv e, ctj f) implements ctf<cti, ctg> {
   public static final Codec<ckx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.b.forGetter(ckx::b), ctj.b.fieldOf("spawn_conditions").forGetter(ckx::c)).apply($$0, ckx::new)
   );
   public static final Codec<ckx> b = RecordCodecBuilder.create($$0 -> $$0.group(iv.b.forGetter(ckx::b)).apply($$0, ckx::new));
   public static final Codec<je<ckx>> c = ald.a(mg.aT);
   public static final yw<wj, je<ckx>> d = yu.b(mg.aT);

   private ckx(iv $$0) {
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
