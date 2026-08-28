import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bp extends dx<bp.a> {
   @Override
   public Codec<bp.a> a() {
      return bp.a.a;
   }

   public void a(arn $$0, cvx $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<ct> c, di.d d) implements dx.a {
      public static final Codec<bp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(bp.a::a),
                  ct.a.optionalFieldOf("item").forGetter(bp.a::c),
                  di.d.d.optionalFieldOf("levels", di.d.c).forGetter(bp.a::d)
               )
               .apply($$0, bp.a::new)
      );

      public static ao<bp.a> b() {
         return an.j.a(new bp.a(Optional.empty(), Optional.empty(), di.d.c));
      }

      public boolean a(cvx $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
