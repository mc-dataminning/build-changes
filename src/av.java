import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dw<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(ark $$0, dus $$1, cvs $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bg> b, Optional<jo<dhm>> c, Optional<cs> d, dh.d e) implements dw.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(av.a::a),
                  lv.e.r().optionalFieldOf("block").forGetter(av.a::b),
                  cs.a.optionalFieldOf("item").forGetter(av.a::c),
                  dh.d.d.optionalFieldOf("num_bees_inside", dh.d.c).forGetter(av.a::d)
               )
               .apply($$0, av.a::new)
      );

      public static ao<av.a> a(dhm $$0, cs.a $$1, dh.d $$2) {
         return an.L.a(new av.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dus $$0, cvs $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<jo<dhm>> b() {
         return this.c;
      }

      public Optional<cs> c() {
         return this.d;
      }

      public dh.d d() {
         return this.e;
      }
   }
}
