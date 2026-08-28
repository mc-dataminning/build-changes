import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cc extends dz<cc.a> {
   @Override
   public Codec<cc.a> a() {
      return cc.a.a;
   }

   public void a(are $$0, cwq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<cv> c) implements dz.a {
      public static final Codec<cc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bx.b.optionalFieldOf("player").forGetter(cc.a::a), cv.a.optionalFieldOf("item").forGetter(cc.a::b)).apply($$0, cc.a::new)
      );

      public static aq<cc.a> a(cv.a $$0) {
         return ap.k.a(new cc.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cwq $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }
   }
}
