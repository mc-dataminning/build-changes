import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cj extends cv<cj.a> {
   @Override
   public Codec<cj.a> a() {
      return cj.a.a;
   }

   public void a(amq $$0, agt $$1) {
      this.a($$0, $$1x -> $$1x.b($$1));
   }

   public static record a(Optional<bb> b, agt c) implements cv.a {
      public static final Codec<cj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atg.a(bp.b, "player").forGetter(cj.a::a), agt.a.fieldOf("loot_table").forGetter(cj.a::b)).apply($$0, cj.a::new)
      );

      public static an<cj.a> a(agt $$0) {
         return am.O.a(new cj.a(Optional.empty(), $$0));
      }

      public boolean b(agt $$0) {
         return this.c.equals($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public agt b() {
         return this.c;
      }
   }
}
