import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bp extends dy<bp.a> {
   @Override
   public Codec<bp.a> a() {
      return bp.a.a;
   }

   public void a(aro $$0, @Nullable bue $$1) {
      euc $$2 = $$1 != null ? bw.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bh> b, Optional<dk> c, Optional<bh> d) implements dy.a {
      public static final Codec<bp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(bp.a::a),
                  dk.a.optionalFieldOf("effects").forGetter(bp.a::b),
                  bw.b.optionalFieldOf("source").forGetter(bp.a::c)
               )
               .apply($$0, bp.a::new)
      );

      public static ap<bp.a> a(dk.a $$0) {
         return ao.B.a(new bp.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static ap<bp.a> a(bw.a $$0) {
         return ao.B.a(new bp.a(Optional.empty(), Optional.empty(), Optional.of(bw.a($$0.b()))));
      }

      public boolean a(aro $$0, @Nullable euc $$1) {
         return this.c.isPresent() && !this.c.get().a((bva)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<dk> b() {
         return this.c;
      }

      public Optional<bh> c() {
         return this.d;
      }
   }
}
