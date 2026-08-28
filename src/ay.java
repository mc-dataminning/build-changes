import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends dv<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(ari $$0, jn<cxm> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<jn<cxm>> c) implements dv.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ay.a::a), cxm.a.optionalFieldOf("potion").forGetter(ay.a::c)).apply($$0, ay.a::new)
      );

      public static ao<ay.a> b() {
         return an.l.a(new ay.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(jn<cxm> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
