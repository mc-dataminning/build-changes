import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends df<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(aqn $$0, cle $$1, cto $$2) {
      epf $$3 = br.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static record a(Optional<bc> b, Optional<bc> c, Optional<ch> d) implements df.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(dr.a::a),
                  br.b.optionalFieldOf("villager").forGetter(dr.a::c),
                  ch.a.optionalFieldOf("item").forGetter(dr.a::d)
               )
               .apply($$0, dr.a::new)
      );

      public static an<dr.a> b() {
         return am.t.a(new dr.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static an<dr.a> a(br.a $$0) {
         return am.t.a(new dr.a(Optional.of(br.a($$0)), Optional.empty(), Optional.empty()));
      }

      public boolean a(epf $$0, cto $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         $$0.a(this.c, ".villager");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }
   }
}
