import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends ds<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(aqn $$0, akj<dcf> $$1, akj<dcf> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bf> b, Optional<akj<dcf>> c, Optional<akj<dcf>> d) implements ds.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(ay.a::a),
                  akj.a(lr.aZ).optionalFieldOf("from").forGetter(ay.a::c),
                  akj.a(lr.aZ).optionalFieldOf("to").forGetter(ay.a::d)
               )
               .apply($$0, ay.a::new)
      );

      public static an<ay.a> b() {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ay.a> a(akj<dcf> $$0, akj<dcf> $$1) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static an<ay.a> a(akj<dcf> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static an<ay.a> b(akj<dcf> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(akj<dcf> $$0, akj<dcf> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }
   }
}
