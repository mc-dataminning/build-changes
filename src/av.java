import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class av extends dv<av.a> {
   @Override
   public Codec<av.a> a() {
      return av.a.a;
   }

   public void a(aqv $$0, dtc $$1, cuq $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bg> b, Optional<jm<dfy>> c, Optional<cs> d, dh.d e) implements dv.a {
      public static final Codec<av.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(av.a::a),
                  lt.e.s().optionalFieldOf("block").forGetter(av.a::b),
                  cs.a.optionalFieldOf("item").forGetter(av.a::c),
                  dh.d.d.optionalFieldOf("num_bees_inside", dh.d.c).forGetter(av.a::d)
               )
               .apply($$0, av.a::new)
      );

      public static ao<av.a> a(dfy $$0, cs.a $$1, dh.d $$2) {
         return an.L.a(new av.a(Optional.empty(), Optional.of($$0.s()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dtc $$0, cuq $$1, int $$2) {
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

      public Optional<jm<dfy>> b() {
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
