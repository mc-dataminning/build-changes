import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bc extends dl<bc.a> {
   @Override
   public Codec<bc.a> a() {
      return bc.a.a;
   }

   public void a(asc $$0, alq<dkj> $$1, alq<dkj> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<alq<dkj>> c, Optional<alq<dkj>> d) implements dl.a {
      public static final Codec<bc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(bc.a::a),
                  alq.a(mi.bp).optionalFieldOf("from").forGetter(bc.a::c),
                  alq.a(mi.bp).optionalFieldOf("to").forGetter(bc.a::d)
               )
               .apply($$0, bc.a::new)
      );

      public static ar<bc.a> b() {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<bc.a> a(alq<dkj> $$0, alq<dkj> $$1) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ar<bc.a> a(alq<dkj> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ar<bc.a> b(alq<dkj> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(alq<dkj> $$0, alq<dkj> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
