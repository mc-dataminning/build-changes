import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ba extends dk<ba.a> {
   @Override
   public Codec<ba.a> a() {
      return ba.a.a;
   }

   public void a(art $$0, cjk $$1, cjk $$2, @Nullable bwj $$3) {
      fah $$4 = by.b($$0, $$1);
      fah $$5 = by.b($$0, $$2);
      fah $$6 = $$3 != null ? by.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bj> b, Optional<bj> c, Optional<bj> d, Optional<bj> e) implements dk.a {
      public static final Codec<ba.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(ba.a::a),
                  by.b.optionalFieldOf("parent").forGetter(ba.a::c),
                  by.b.optionalFieldOf("partner").forGetter(ba.a::d),
                  by.b.optionalFieldOf("child").forGetter(ba.a::e)
               )
               .apply($$0, ba.a::new)
      );

      public static ar<ba.a> b() {
         return aq.p.a(new ba.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<ba.a> a(by.a $$0) {
         return aq.p.a(new ba.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(by.a($$0))));
      }

      public static ar<ba.a> a(Optional<by> $$0, Optional<by> $$1, Optional<by> $$2) {
         return aq.p.a(new ba.a(Optional.empty(), by.a($$0), by.a($$1), by.a($$2)));
      }

      public boolean a(fah $$0, fah $$1, @Nullable fah $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bj> $$0, fah $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dk.a.super.a($$0);
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
