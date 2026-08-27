import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ax extends dh<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(aqu $$0, cee $$1, cee $$2, @Nullable brp $$3) {
      erp $$4 = bs.b($$0, $$1);
      erp $$5 = bs.b($$0, $$2);
      erp $$6 = $$3 != null ? bs.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bd> b, Optional<bd> c, Optional<bd> d, Optional<bd> e) implements dh.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(ax.a::a),
                  axu.a(bs.b, "parent").forGetter(ax.a::c),
                  axu.a(bs.b, "partner").forGetter(ax.a::d),
                  axu.a(bs.b, "child").forGetter(ax.a::e)
               )
               .apply($$0, ax.a::new)
      );

      public static ao<ax.a> b() {
         return an.p.a(new ax.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<ax.a> a(bs.a $$0) {
         return an.p.a(new ax.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bs.a($$0))));
      }

      public static ao<ax.a> a(Optional<bs> $$0, Optional<bs> $$1, Optional<bs> $$2) {
         return an.p.a(new ax.a(Optional.empty(), bs.a($$0), bs.a($$1), bs.a($$2)));
      }

      public boolean a(erp $$0, erp $$1, @Nullable erp $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bd> $$0, erp $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
