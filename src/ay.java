import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends cx<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(apt $$0, ajs<cyx> $$1, ajs<cyx> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<ajs<cyx>> c, Optional<ajs<cyx>> d) implements cx.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aws.a(br.b, "player").forGetter(ay.a::a), aws.a(ajs.a(ks.aO), "from").forGetter(ay.a::c), aws.a(ajs.a(ks.aO), "to").forGetter(ay.a::d)
               )
               .apply($$0, ay.a::new)
      );

      public static an<ay.a> b() {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ay.a> a(ajs<cyx> $$0, ajs<cyx> $$1) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static an<ay.a> a(ajs<cyx> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static an<ay.a> b(ajs<cyx> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(ajs<cyx> $$0, ajs<cyx> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
