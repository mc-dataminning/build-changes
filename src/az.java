import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class az extends dv<az.a> {
   @Override
   public Codec<az.a> a() {
      return az.a.a;
   }

   public void a(aqv $$0, akq<dcw> $$1, akq<dcw> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<akq<dcw>> c, Optional<akq<dcw>> d) implements dv.a {
      public static final Codec<az.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(az.a::a),
                  akq.a(lu.ba).optionalFieldOf("from").forGetter(az.a::c),
                  akq.a(lu.ba).optionalFieldOf("to").forGetter(az.a::d)
               )
               .apply($$0, az.a::new)
      );

      public static ao<az.a> b() {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<az.a> a(akq<dcw> $$0, akq<dcw> $$1) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ao<az.a> a(akq<dcw> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ao<az.a> b(akq<dcw> $$0) {
         return an.w.a(new az.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(akq<dcw> $$0, akq<dcw> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
