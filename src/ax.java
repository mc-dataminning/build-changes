import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class ax extends dw<ax.a> {
   @Override
   public Codec<ax.a> a() {
      return ax.a.a;
   }

   public void a(ark $$0, cgd $$1, cgd $$2, @Nullable btk $$3) {
      etl $$4 = bv.b($$0, $$1);
      etl $$5 = bv.b($$0, $$2);
      etl $$6 = $$3 != null ? bv.b($$0, $$3) : null;
      this.a($$0, $$3x -> $$3x.a($$4, $$5, $$6));
   }

   public static record a(Optional<bg> b, Optional<bg> c, Optional<bg> d, Optional<bg> e) implements dw.a {
      public static final Codec<ax.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bv.b.optionalFieldOf("player").forGetter(ax.a::a),
                  bv.b.optionalFieldOf("parent").forGetter(ax.a::c),
                  bv.b.optionalFieldOf("partner").forGetter(ax.a::d),
                  bv.b.optionalFieldOf("child").forGetter(ax.a::e)
               )
               .apply($$0, ax.a::new)
      );

      public static ao<ax.a> b() {
         return an.p.a(new ax.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<ax.a> a(bv.a $$0) {
         return an.p.a(new ax.a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bv.a($$0))));
      }

      public static ao<ax.a> a(Optional<bv> $$0, Optional<bv> $$1, Optional<bv> $$2) {
         return an.p.a(new ax.a(Optional.empty(), bv.a($$0), bv.a($$1), bv.a($$2)));
      }

      public boolean a(etl $$0, etl $$1, @Nullable etl $$2) {
         return !this.e.isPresent() || $$2 != null && this.e.get().a($$2) ? a(this.c, $$0) && a(this.d, $$1) || a(this.c, $$1) && a(this.d, $$0) : false;
      }

      private static boolean a(Optional<bg> $$0, etl $$1) {
         return $$0.isEmpty() || $$0.get().a($$1);
      }

      @Override
      public void a(bh $$0) {
         dw.a.super.a($$0);
         $$0.a(this.c, ".parent");
         $$0.a(this.d, ".partner");
         $$0.a(this.e, ".child");
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
