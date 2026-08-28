import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjz(ix e, cup f) implements cul<cuo, cum> {
   public static final Codec<cjz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ix.b.forGetter(cjz::b), cup.b.fieldOf("spawn_conditions").forGetter(cjz::c)).apply($$0, cjz::new)
   );
   public static final Codec<cjz> b = RecordCodecBuilder.create($$0 -> $$0.group(ix.b.forGetter(cjz::b)).apply($$0, cjz::new));
   public static final Codec<jg<cjz>> c = alo.a(mi.aH);
   public static final ze<wp, jg<cjz>> d = zc.b(mi.aH);

   private cjz(ix $$0) {
      this($$0, cup.a);
   }

   @Override
   public List<cul.a<cuo, cum>> a() {
      return this.f.a();
   }

   public ix b() {
      return this.e;
   }

   public cup c() {
      return this.f;
   }
}
