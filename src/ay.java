import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends dr<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(arg $$0, ale<dby> $$1, ale<dby> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bf> b, Optional<ale<dby>> c, Optional<ale<dby>> d) implements dr.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ay.a::a),
                  ale.a(lq.aS).optionalFieldOf("from").forGetter(ay.a::c),
                  ale.a(lq.aS).optionalFieldOf("to").forGetter(ay.a::d)
               )
               .apply($$0, ay.a::new)
      );

      public static an<ay.a> b() {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ay.a> a(ale<dby> $$0, ale<dby> $$1) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static an<ay.a> a(ale<dby> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static an<ay.a> b(ale<dby> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(ale<dby> $$0, ale<dby> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
