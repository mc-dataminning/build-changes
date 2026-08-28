import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bf extends dv<bf.a> {
   @Override
   public Codec<bf.a> a() {
      return bf.a.a;
   }

   public void a(ari $$0, cvp $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<cs> c) implements dv.a {
      public static final Codec<bf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(bf.a::a), cs.a.optionalFieldOf("item").forGetter(bf.a::c)).apply($$0, bf.a::new)
      );

      public static ao<bf.a> b() {
         return an.A.a(new bf.a(Optional.empty(), Optional.empty()));
      }

      public static ao<bf.a> a(jo<cvk> $$0, def $$1) {
         return a(cs.a.a().a($$0, $$1.q()));
      }

      public static ao<bf.a> a(cs.a $$0) {
         return an.A.a(new bf.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cvp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
