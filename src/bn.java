import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bn extends dr<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(arf $$0, @Nullable bst $$1) {
      eqh $$2 = $$1 != null ? bu.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bf> b, Optional<df> c, Optional<bf> d) implements dr.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(bn.a::a),
                  df.a.optionalFieldOf("effects").forGetter(bn.a::b),
                  bu.b.optionalFieldOf("source").forGetter(bn.a::c)
               )
               .apply($$0, bn.a::new)
      );

      public static an<bn.a> a(df.a $$0) {
         return am.B.a(new bn.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static an<bn.a> a(bu.a $$0) {
         return am.B.a(new bn.a(Optional.empty(), Optional.empty(), Optional.of(bu.a($$0.b()))));
      }

      public boolean a(arf $$0, @Nullable eqh $$1) {
         return this.c.isPresent() && !this.c.get().a((bto)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bg $$0) {
         dr.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<df> b() {
         return this.c;
      }

      public Optional<bf> c() {
         return this.d;
      }
   }
}
