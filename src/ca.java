import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ca extends dy<ca.a> {
   @Override
   public Codec<ca.a> a() {
      return ca.a.a;
   }

   public void a(asi $$0, fbx $$1, @Nullable bvj $$2) {
      fbx $$3 = $$0.du();
      ewo $$4 = $$2 != null ? bw.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.y(), $$1, $$3, $$4));
   }

   public static record a(Optional<bh> b, Optional<dh> c, Optional<bn> d, Optional<bh> e) implements dy.a {
      public static final Codec<ca.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(ca.a::a),
                  dh.a.optionalFieldOf("start_position").forGetter(ca.a::b),
                  bn.a.optionalFieldOf("distance").forGetter(ca.a::c),
                  bw.b.optionalFieldOf("cause").forGetter(ca.a::d)
               )
               .apply($$0, ca.a::new)
      );

      public static ap<ca.a> a(bn $$0, bw.a $$1) {
         return ao.ae.a(new ca.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bw.a($$1))));
      }

      @Override
      public void a(bi $$0) {
         dy.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(ash $$0, fbx $$1, fbx $$2, @Nullable ewo $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.d, $$1.e, $$1.f)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.d, $$1.e, $$1.f, $$2.d, $$2.e, $$2.f)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<dh> b() {
         return this.c;
      }

      public Optional<bn> c() {
         return this.d;
      }

      public Optional<bh> d() {
         return this.e;
      }
   }
}
