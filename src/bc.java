import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bc extends dk<bc.a> {
   @Override
   public Codec<bc.a> a() {
      return bc.a.a;
   }

   public void a(art $$0, alh<djx> $$1, alh<djx> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<alh<djx>> c, Optional<alh<djx>> d) implements dk.a {
      public static final Codec<bc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(bc.a::a),
                  alh.a(mh.bp).optionalFieldOf("from").forGetter(bc.a::c),
                  alh.a(mh.bp).optionalFieldOf("to").forGetter(bc.a::d)
               )
               .apply($$0, bc.a::new)
      );

      public static ar<bc.a> b() {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<bc.a> a(alh<djx> $$0, alh<djx> $$1) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ar<bc.a> a(alh<djx> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ar<bc.a> b(alh<djx> $$0) {
         return aq.w.a(new bc.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(alh<djx> $$0, alh<djx> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
