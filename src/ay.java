import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends dw<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(ark $$0, jo<cxp> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<jo<cxp>> c) implements dw.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ay.a::a), cxp.a.optionalFieldOf("potion").forGetter(ay.a::c)).apply($$0, ay.a::new)
      );

      public static ao<ay.a> b() {
         return an.l.a(new ay.a(Optional.empty(), Optional.empty()));
      }

      public boolean a(jo<cxp> $$0) {
         return !this.c.isPresent() || this.c.get().equals($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
