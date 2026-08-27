import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cj extends cv<cj.a> {
   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public void a(anf $$0, ahh $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bb> b, ahh c) implements cv.a {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atx.a(bp.b, "player").forGetter(cj.a::a), ahh.a.fieldOf("loot_table").forGetter(cj.a::b)).apply($$0, cj.a::new)
      );

      public static an<cj.a> a(ahh $$0) {
         return am.O.a(new cj.a(Optional.empty(), $$0));
      }

      public boolean b(ahh $$0) {
         return this.c.equals($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public ahh b() {
         return this.c;
      }
   }
}
