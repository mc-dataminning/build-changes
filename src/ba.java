import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ba extends dy<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(asi $$0, aly<dhh> $$1, aly<dhh> $$2) {
      this.a($$0, $$2x -> $$2x.b($$1, $$2));
   }

   public static record a(Optional<bh> b, Optional<aly<dhh>> c, Optional<aly<dhh>> d) implements dy.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(ba.a::a),
                  aly.a(mb.be).optionalFieldOf("from").forGetter(ba.a::c),
                  aly.a(mb.be).optionalFieldOf("to").forGetter(ba.a::d)
               )
               .apply($$0, ba.a::new)
      );

      public static ap<ba.a> b() {
         return ao.w.a(new ba.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ap<ba.a> a(aly<dhh> $$0, aly<dhh> $$1) {
         return ao.w.a(new ba.a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
      }

      public static ap<ba.a> a(aly<dhh> $$0) {
         return ao.w.a(new ba.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public static ap<ba.a> b(aly<dhh> $$0) {
         return ao.w.a(new ba.a(Optional.empty(), Optional.of($$0), Optional.empty()));
      }

      public boolean b(aly<dhh> $$0, aly<dhh> $$1) {
         return this.c.isPresent() && this.c.get() != $$0 ? false : !this.d.isPresent() || this.d.get() == $$1;
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
