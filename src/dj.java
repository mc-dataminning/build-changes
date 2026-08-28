import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends dz<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(aro $$0, alc<exq> $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bi> b, alc<exq> c) implements dz.a {
      public static final Codec<dj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(dj.a::a), alc.a(me.bn).fieldOf("loot_table").forGetter(dj.a::b)).apply($$0, dj.a::new)
      );

      public static aq<dj.a> a(alc<exq> $$0) {
         return ap.Q.a(new dj.a(Optional.empty(), $$0));
      }

      public boolean b(alc<exq> $$0) {
         return this.c == $$0;
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public alc<exq> b() {
         return this.c;
      }
   }
}
