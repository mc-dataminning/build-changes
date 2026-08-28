import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ckn(iv e, csy f) implements csu<csx, csv> {
   public static final Codec<ckn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.b.forGetter(ckn::b), csy.b.fieldOf("spawn_conditions").forGetter(ckn::c)).apply($$0, ckn::new)
   );
   public static final Codec<ckn> b = RecordCodecBuilder.create($$0 -> $$0.group(iv.b.forGetter(ckn::b)).apply($$0, ckn::new));
   public static final Codec<je<ckn>> c = alb.a(mg.aR);
   public static final yu<wh, je<ckn>> d = ys.b(mg.aR);

   private ckn(iv $$0) {
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
