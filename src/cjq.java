import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjq(ix e, cug f) implements cuc<cuf, cud> {
   public static final Codec<cjq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ix.b.forGetter(cjq::b), cug.b.fieldOf("spawn_conditions").forGetter(cjq::c)).apply($$0, cjq::new)
   );
   public static final Codec<cjq> b = RecordCodecBuilder.create($$0 -> $$0.group(ix.b.forGetter(cjq::b)).apply($$0, cjq::new));
   public static final Codec<jg<cjq>> c = alh.a(mi.aH);
   public static final za<wn, jg<cjq>> d = yy.b(mi.aH);

   private cjq(ix $$0) {
      this($$0, cug.a);
   }

   @Override
   public List<cuc.a<cuf, cud>> a() {
      return this.f.a();
   }

   public ix b() {
      return this.e;
   }

   public cug c() {
      return this.f;
   }
}
