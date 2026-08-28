import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bb extends dz<bb.a> {
   @Override
   public Codec<bb.a> a() {
      return bb.a.a;
   }

   public void a(are $$0, akt<dgz> $$1, akt<dgz> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bi> b, Optional<akt<dgz>> c, Optional<akt<dgz>> d) implements dz.a {
      public static final Codec<bb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(bb.a::a),
                  akt.a(mc.bg).optionalFieldOf("from").forGetter(bb.a::c),
                  akt.a(mc.bg).optionalFieldOf("to").forGetter(bb.a::d)
               )
               .apply($$0, bb.a::new)
      );

      public static aq<bb.a> b() {
         return ap.w.a(new bb.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static aq<bb.a> a(akt<dgz> $$0, akt<dgz> $$1) {
         return ap.w.a(new bb.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static aq<bb.a> a(akt<dgz> $$0) {
         return ap.w.a(new bb.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static aq<bb.a> b(akt<dgz> $$0) {
         return ap.w.a(new bb.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(akt<dgz> $$0, akt<dgz> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }
   }
}
