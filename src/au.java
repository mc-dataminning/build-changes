import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends df<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(aqo $$0, drd $$1, ctq $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bc> b, Optional<ix<dea>> c, Optional<ch> d, ct.d e) implements df.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(au.a::a),
                  le.e.r().optionalFieldOf("block").forGetter(au.a::b),
                  ch.a.optionalFieldOf("item").forGetter(au.a::c),
                  ct.d.d.optionalFieldOf("num_bees_inside", ct.d.c).forGetter(au.a::d)
               )
               .apply($$0, au.a::new)
      );

      public static an<au.a> a(dea $$0, ch.a $$1, ct.d $$2) {
         return am.L.a(new au.a(Optional.empty(), Optional.of($$0.q()), Optional.of($$1.b()), $$2));
      }

      public boolean a(drd $$0, ctq $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ix<dea>> b() {
         return this.c;
      }

      public Optional<ch> c() {
         return this.d;
      }

      public ct.d d() {
         return this.e;
      }
   }
}
