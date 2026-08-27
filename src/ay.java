import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ay extends de<ay.a> {
   @Override
   public Codec<ay.a> a() {
      return ay.a.a;
   }

   public void a(aqi $$0, akg<dad> $$1, akg<dad> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<akg<dad>> c, Optional<akg<dad>> d) implements de.a {
      public static final Codec<ay.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(ay.a::a), axh.a(akg.a(le.aS), "from").forGetter(ay.a::c), axh.a(akg.a(le.aS), "to").forGetter(ay.a::d)
               )
               .apply($$0, ay.a::new)
      );

      public static an<ay.a> b() {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<ay.a> a(akg<dad> $$0, akg<dad> $$1) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static an<ay.a> a(akg<dad> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static an<ay.a> b(akg<dad> $$0) {
         return am.w.a(new ay.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(akg<dad> $$0, akg<dad> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
