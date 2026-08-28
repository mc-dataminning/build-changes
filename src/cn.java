import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cn extends dx<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(arn $$0, cvx $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<ct> c, di.d d, di.d e) implements dx.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(cn.a::a),
                  ct.a.optionalFieldOf("item").forGetter(cn.a::b),
                  di.d.d.optionalFieldOf("durability", di.d.c).forGetter(cn.a::c),
                  di.d.d.optionalFieldOf("delta", di.d.c).forGetter(cn.a::d)
               )
               .apply($$0, cn.a::new)
      );

      public static ao<cn.a> a(Optional<ct> $$0, di.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static ao<cn.a> a(Optional<bg> $$0, Optional<ct> $$1, di.d $$2) {
         return an.u.a(new cn.a($$0, $$1, $$2, di.d.c));
      }

      public boolean a(cvx $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.p() - $$1) ? false : this.e.d($$0.o() - $$1);
         }
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<ct> b() {
         return this.c;
      }

      public di.d c() {
         return this.d;
      }

      public di.d d() {
         return this.e;
      }
   }
}
