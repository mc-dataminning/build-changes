import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bf extends dx<bf.a> {
   @Override
   public Codec<bf.a> a() {
      return bf.a.a;
   }

   public void a(arn $$0, cvx $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<ct> c) implements dx.a {
      public static final Codec<bf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bf.a::a), ct.a.optionalFieldOf("item").forGetter(bf.a::c)).apply($$0, bf.a::new)
      );

      public static ao<bf.a> b() {
         return an.A.a(new bf.a(Optional.empty(), Optional.empty()));
      }

      public static ao<bf.a> a(jq<cvt> $$0, deu $$1) {
         return a(ct.a.a().a($$0, $$1.j()));
      }

      public static ao<bf.a> a(ct.a $$0) {
         return an.A.a(new bf.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cvx $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
