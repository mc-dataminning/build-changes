import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cx extends dh<cx.a> {
   @Override
   public Codec<cx.a> a() {
      return cx.a.a;
   }

   public void a(aqu $$0, cuh $$1, @Nullable brv $$2) {
      erp $$3 = bs.b($$0, $$2);
      this.a($$0, $$3x -> $$3x.a($$0, $$1, $$3));
   }

   public static record a(Optional<bd> b, Optional<ci> c, Optional<bd> d) implements dh.a {
      public static final Codec<cx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(cx.a::a), axu.a(ci.a, "item").forGetter(cx.a::b), axu.a(bs.b, "entity").forGetter(cx.a::c))
               .apply($$0, cx.a::new)
      );

      public static ao<cx.a> a(bd $$0, Optional<ci> $$1, Optional<bd> $$2) {
         return an.R.a(new cx.a(Optional.of($$0), $$1, $$2));
      }

      public static ao<cx.a> a(Optional<bd> $$0, Optional<ci> $$1, Optional<bd> $$2) {
         return an.S.a(new cx.a($$0, $$1, $$2));
      }

      public boolean a(aqu $$0, cuh $$1, erp $$2) {
         return this.c.isPresent() && !this.c.get().a($$1) ? false : !this.d.isPresent() || this.d.get().a($$2);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }

      public Optional<bd> c() {
         return this.d;
      }
   }
}
