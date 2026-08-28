import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dw extends dx<dw.a> {
   @Override
   public Codec<dw.a> a() {
      return dw.a.a;
   }

   public void a(arn $$0, cvx $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<ct> c) implements dx.a {
      public static final Codec<dw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dw.a::a), ct.a.optionalFieldOf("item").forGetter(dw.a::b)).apply($$0, dw.a::new)
      );

      public static ao<dw.a> a(Optional<ct> $$0) {
         return an.G.a(new dw.a(Optional.empty(), $$0));
      }

      public static ao<dw.a> a(jq<cvt> $$0, deu $$1) {
         return an.G.a(new dw.a(Optional.empty(), Optional.of(ct.a.a().a($$0, $$1).b())));
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
