import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends dz<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(are $$0, aku<evv> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bi> b, aku<evv> c) implements dz.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dj.a::a), aku.a(mc.bg).fieldOf("loot_table").forGetter(dj.a::b)).apply($$0, dj.a::new)
      );

      public static aq<dj.a> a(aku<evv> $$0) {
         return ap.Q.a(new dj.a(Optional.empty(), $$0));
      }

      public boolean b(aku<evv> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public aku<evv> b() {
         return this.c;
      }
   }
}
