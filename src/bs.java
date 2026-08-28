import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bs extends dk<bs.a> {
   @Override
   public Codec<bs.a> a() {
      return bs.a.a;
   }

   public void a(arr $$0, czn $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<cm> c, cw.d d) implements dk.a {
      public static final Codec<bs.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(bs.a::a),
                  cm.a.optionalFieldOf("item").forGetter(bs.a::c),
                  cw.d.d.optionalFieldOf("levels", cw.d.c).forGetter(bs.a::d)
               )
               .apply($$0, bs.a::new)
      );

      public static ar<bs.a> b() {
         return aq.j.a(new bs.a(Optional.empty(), Optional.empty(), cw.d.c));
      }

      public boolean a(czn $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
