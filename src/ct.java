import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ct extends cv<ct.a> {
   @Override
   public Codec<ct.a> a() {
      return ct.a.a;
   }

   public void a(ane $$0, cqe<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static an<ct.a> a(ahg $$0) {
      return am.g.a(new ct.a(Optional.empty(), $$0));
   }

   public static record a(Optional<bb> b, ahg c) implements cv.a {
      public static final Codec<ct.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(ct.a::a), ahg.a.fieldOf("recipe").forGetter(ct.a::b)).apply($$0, ct.a::new)
      );

      public boolean a(cqe<?> $$0) {
         return this.c.equals($$0.a());
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public ahg b() {
         return this.c;
      }
   }
}
