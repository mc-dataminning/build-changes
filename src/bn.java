import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends dx<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(arn $$0, ezh $$1) {
      ezh $$2 = $$0.dv();
      this.a($$0, $$3 -> $$3.a($$0.B(), $$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<dg> c, Optional<bm> d) implements dx.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bn.a::a),
                  dg.a.optionalFieldOf("start_position").forGetter(bn.a::b),
                  bm.a.optionalFieldOf("distance").forGetter(bn.a::c)
               )
               .apply($$0, bn.a::new)
      );

      public static ao<bn.a> a(bv.a $$0, bm $$1, dg.a $$2) {
         return an.X.a(new bn.a(Optional.of(bv.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static ao<bn.a> a(bv.a $$0, bm $$1) {
         return an.Y.a(new bn.a(Optional.of(bv.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static ao<bn.a> a(bm $$0) {
         return an.D.a(new bn.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(arm $$0, ezh $$1, ezh $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<dg> b() {
         return this.c;
      }

      public Optional<bm> c() {
         return this.d;
      }
   }
}
