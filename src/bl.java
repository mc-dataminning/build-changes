import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bl extends dh<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(aqu $$0, @Nullable brv $$1) {
      erp $$2 = $$1 != null ? bs.b($$0, $$1) : null;
      this.a($$0, $$2x -> $$2x.a($$0, $$2));
   }

   public static record a(Optional<bd> b, Optional<cv> c, Optional<bd> d) implements dh.a {
      public static final Codec<bl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bl.a::a), axu.a(cv.a, "effects").forGetter(bl.a::b), axu.a(bs.b, "source").forGetter(bl.a::c))
               .apply($$0, bl.a::new)
      );

      public static ao<bl.a> a(cv.a $$0) {
         return an.B.a(new bl.a(Optional.empty(), $$0.b(), Optional.empty()));
      }

      public static ao<bl.a> a(bs.a $$0) {
         return an.B.a(new bl.a(Optional.empty(), Optional.empty(), Optional.of(bs.a($$0.b()))));
      }

      public boolean a(aqu $$0, @Nullable erp $$1) {
         return this.c.isPresent() && !this.c.get().a((bso)$$0) ? false : !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d, ".source");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }

      public Optional<bd> c() {
         return this.d;
      }
   }
}
