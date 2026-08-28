import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bz extends dr<bz.a> {
   @Override
   public Codec<bz.a> a() {
      return bz.a.a;
   }

   public void a(arg $$0, cup $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<cp> c) implements dr.a {
      public static final Codec<bz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bu.b.optionalFieldOf("player").forGetter(bz.a::a), cp.a.optionalFieldOf("item").forGetter(bz.a::b)).apply($$0, bz.a::new)
      );

      public static an<bz.a> a(cp.a $$0) {
         return am.k.a(new bz.a(Optional.empty(), Optional.of($$0.b())));
      }

      public boolean a(cup $$0) {
         return !this.c.isPresent() || this.c.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }
   }
}
