import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ek extends dx<ek.a> {
   @Override
   public Codec<ek.a> a() {
      return ek.a.a;
   }

   public void a(arn $$0, cvx $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<ct> c) implements dx.a {
      public static final Codec<ek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(ek.a::a), ct.a.optionalFieldOf("item").forGetter(ek.a::b)).apply($$0, ek.a::new)
      );

      public static ao<ek.a> a(ct $$0) {
         return an.C.a(new ek.a(Optional.empty(), Optional.of($$0)));
      }

      public static ao<ek.a> a(jq<cvt> $$0, deu $$1) {
         return an.C.a(new ek.a(Optional.empty(), Optional.of(ct.a.a().a($$0, $$1).b())));
      }

      public boolean a(cvx $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<ct> b() {
         return this.c;
      }
   }
}
