import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cll(ix e, cug f) implements cuc<cuf, cud> {
   public static final Codec<cll> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ix.b.forGetter(cll::b), cug.b.fieldOf("spawn_conditions").forGetter(cll::c)).apply($$0, cll::new)
   );
   public static final Codec<cll> b = RecordCodecBuilder.create($$0 -> $$0.group(ix.b.forGetter(cll::b)).apply($$0, cll::new));
   public static final Codec<jg<cll>> c = alh.a(mi.aT);
   public static final za<wn, jg<cll>> d = yy.b(mi.aT);

   private cll(ix $$0) {
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
