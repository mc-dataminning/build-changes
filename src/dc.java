import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends dx<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(arn $$0, ezh $$1, int $$2) {
      this.a($$0, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public static record a(Optional<bg> b, Optional<bm> c, di.d d) implements dx.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(dc.a::a),
                  bm.a.optionalFieldOf("distance").forGetter(dc.a::b),
                  di.d.d.optionalFieldOf("duration", di.d.c).forGetter(dc.a::c)
               )
               .apply($$0, dc.a::new)
      );

      public static ao<dc.a> a(bm $$0) {
         return an.v.a(new dc.a(Optional.empty(), Optional.of($$0), di.d.c));
      }

      public boolean a(arn $$0, ezh $$1, int $$2) {
         return this.c.isPresent() && !this.c.get().a($$1.d, $$1.e, $$1.f, $$0.dC(), $$0.dE(), $$0.dI()) ? false : this.d.d($$2);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<bm> b() {
         return this.c;
      }

      public di.d c() {
         return this.d;
      }
   }
}
