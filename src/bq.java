import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bq extends dy<bq.a> {
   @Override
   public Codec<bq.a> a() {
      return bq.a.a;
   }

   public void a(aro $$0, cwb $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bh> b, Optional<cu> c, dj.d d) implements dy.a {
      public static final Codec<bq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bw.b.optionalFieldOf("player").forGetter(bq.a::a),
                  cu.a.optionalFieldOf("item").forGetter(bq.a::c),
                  dj.d.d.optionalFieldOf("levels", dj.d.c).forGetter(bq.a::d)
               )
               .apply($$0, bq.a::new)
      );

      public static ap<bq.a> b() {
         return ao.j.a(new bq.a(Optional.empty(), Optional.empty(), dj.d.c));
      }

      public boolean a(cwb $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }
   }
}
