import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bc extends dk<bc.a> {
   @Override
   public Codec<bc.a> a() {
      return bc.a.a;
   }

   public void a(arr $$0, alf<djh> $$1, alf<djh> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<alf<djh>> c, Optional<alf<djh>> d) implements dk.a {
      public static final Codec<bc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(bc.a::a),
                  alf.a(mh.bo).optionalFieldOf("from").forGetter(bc.a::c),
                  alf.a(mh.bo).optionalFieldOf("to").forGetter(bc.a::d)
               )
               .apply($$0, bc.a::new)
      );

      public static ar<bc.a> b() {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<bc.a> a(alf<djh> $$0, alf<djh> $$1) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ar<bc.a> a(alf<djh> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ar<bc.a> b(alf<djh> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(alf<djh> $$0, alf<djh> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
