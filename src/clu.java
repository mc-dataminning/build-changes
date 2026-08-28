import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record clu(ix e, cup f) implements cul<cuo, cum> {
   public static final Codec<clu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ix.b.forGetter(clu::b), cup.b.fieldOf("spawn_conditions").forGetter(clu::c)).apply($$0, clu::new)
   );
   public static final Codec<clu> b = RecordCodecBuilder.create($$0 -> $$0.group(ix.b.forGetter(clu::b)).apply($$0, clu::new));
   public static final Codec<jg<clu>> c = alo.a(mi.aT);
   public static final ze<wp, jg<clu>> d = zc.b(mi.aT);

   private clu(ix $$0) {
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
