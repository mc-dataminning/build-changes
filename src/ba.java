import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ba extends dl<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(asc $$0, cjv $$1, cjv $$2, @Nullable bwu $$3) {
      fat $$4 = bz.b($$0, $$1);
      fat $$5 = bz.b($$0, $$2);
      fat $$6 = $$3 != null ? bz.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bj> d, Optional<bj> e) implements dl.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(ba.a::a),
                  bz.b.optionalFieldOf("parent").forGetter(ba.a::c),
                  bz.b.optionalFieldOf("partner").forGetter(ba.a::d),
                  bz.b.optionalFieldOf("child").forGetter(ba.a::e)
               )
               .apply($$0, ba.a::new)
      );

      public static ar<ba.a> b() {
         return aq.p.a(new ba.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<ba.a> a(bz.a $$0) {
         return aq.p.a(new ba.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bz.a($$0))));
      }

      public static ar<ba.a> a(Optional<bz> $$0, Optional<bz> $$1, Optional<bz> $$2) {
         return aq.p.a(new ba.a(Optional.empty(), bz.a($$0), bz.a($$1), bz.a($$2)));
      }

      public boolean a(fat $$0, fat $$1, @Nullable fat $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bj> $$0, fat $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
