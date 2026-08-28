import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends dx<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(arn $$0, cvx $$1, btz $$2) {
      etw $$3 = bv.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static record a(Optional<bg> b, Optional<ct> c, Optional<bg> d) implements dx.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dp.a::a),
                  ct.a.optionalFieldOf("item").forGetter(dp.a::b),
                  bv.b.optionalFieldOf("entity").forGetter(dp.a::c)
               )
               .apply($$0, dp.a::new)
      );

      public static ao<dp.a> a(Optional<bg> $$0, ct.a $$1, Optional<bg> $$2) {
         return an.T.a(new dp.a($$0, Optional.of($$1.b()), $$2));
      }

      public static ao<dp.a> a(ct.a $$0, Optional<bg> $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public boolean a(cvx $$0, etw $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.isEmpty() || this.d.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dx.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<ct> b() {
         return this.c;
      }

      public Optional<bg> c() {
         return this.d;
      }
   }
}
