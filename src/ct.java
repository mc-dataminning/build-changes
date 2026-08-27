import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ct extends cv<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(anf $$0, cqm<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<ct.a> a(ahh $$0) {
      return am.g.a(new ct.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bb> b, ahh c) implements cv.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atx.a(bp.b, "player").forGetter(ct.a::a), ahh.a.fieldOf("recipe").forGetter(ct.a::b)).apply($$0, ct.a::new)
      );

      public boolean a(cqm<?> $$0) {
         return this.c.equals($$0.a());
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
