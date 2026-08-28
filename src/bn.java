import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends dv<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(aqv $$0, exa $$1) {
      exa $$2 = $$0.dn();
      this.a($$0, $$3 -> $$3.a($$0.A(), $$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<df> c, Optional<bm> d) implements dv.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bn.a::a),
                  df.a.optionalFieldOf("start_position").forGetter(bn.a::b),
                  bm.a.optionalFieldOf("distance").forGetter(bn.a::c)
               )
               .apply($$0, bn.a::new)
      );

      public static ao<bn.a> a(bv.a $$0, bm $$1, df.a $$2) {
         return an.X.a(new bn.a(Optional.of(bv.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static ao<bn.a> a(bv.a $$0, bm $$1) {
         return an.Y.a(new bn.a(Optional.of(bv.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static ao<bn.a> a(bm $$0) {
         return an.D.a(new bn.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(aqu $$0, exa $$1, exa $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<df> b() {
         return this.c;
      }

      public Optional<bm> c() {
         return this.d;
      }
   }
}
