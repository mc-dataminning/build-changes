import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bt extends dl<bt.a> {
   @Override
   public Codec<bt.a> a() {
      return bt.a.a;
   }

   public void a(asc $$0, dak $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bj> b, Optional<cn> c, cx.d d) implements dl.a {
      public static final Codec<bt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(bt.a::a),
                  cn.a.optionalFieldOf("item").forGetter(bt.a::c),
                  cx.d.d.optionalFieldOf("levels", cx.d.c).forGetter(bt.a::d)
               )
               .apply($$0, bt.a::new)
      );

      public static ar<bt.a> b() {
         return aq.j.a(new bt.a(Optional.empty(), Optional.empty(), cx.d.c));
      }

      public boolean a(dak $$0, int $$1) {
         return this.c.isPresent() && !this.c.get().a($$0) ? false : this.d.d($$1);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
