import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cq extends dk<cq.a> {
   @Override
   public Codec<cq.a> a() {
      return cq.a.a;
   }

   public void a(arr $$0, fex $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<bp> c, cw.d d) implements dk.a {
      public static final Codec<cq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(cq.a::a),
                  bp.a.optionalFieldOf("distance").forGetter(cq.a::b),
                  cw.d.d.optionalFieldOf("duration", cw.d.c).forGetter(cq.a::c)
               )
               .apply($$0, cq.a::new)
      );

      public static ar<cq.a> a(bp $$0) {
         return aq.v.a(new cq.a(Optional.empty(), Optional.of($$0), cw.d.c));
      }

      public boolean a(arr $$0, fex $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dz(), $$0.dB(), $$0.dF()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<bp> b() {
         return this.c;
      }

      public cw.d c() {
         return this.d;
      }
   }
}
