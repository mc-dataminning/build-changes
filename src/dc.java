import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dc extends dl<dc.a> {
   @Override
   public Codec<dc.a> a() {
      return dc.a.a;
   }

   public void a(arv $$0, bwv $$1, bvk $$2, float $$3, float $$4, boolean $$5) {
      faj $$6 = bz.b($$0, $$1);
      this.a($$0, $$6x -> $$6x.a($$0, $$6, $$2, $$3, $$4, $$5));
   }

   public static record a(Optional<bj> b, Optional<bm> c, Optional<bj> d) implements dl.a {
      public static final Codec<dc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(dc.a::a),
                  bm.a.optionalFieldOf("damage").forGetter(dc.a::c),
                  bz.b.optionalFieldOf("entity").forGetter(dc.a::d)
               )
               .apply($$0, dc.a::new)
      );

      public static ar<dc.a> b() {
         return aq.h.a(new dc.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ar<dc.a> a(Optional<bm> $$0) {
         return aq.h.a(new dc.a(Optional.empty(), $$0, Optional.empty()));
      }

      public static ar<dc.a> a(bm.a $$0) {
         return aq.h.a(new dc.a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
      }

      public static ar<dc.a> b(Optional<bz> $$0) {
         return aq.h.a(new dc.a(Optional.empty(), Optional.empty(), bz.a($$0)));
      }

      public static ar<dc.a> a(Optional<bm> $$0, Optional<bz> $$1) {
         return aq.h.a(new dc.a(Optional.empty(), $$0, bz.a($$1)));
      }

      public static ar<dc.a> a(bm.a $$0, Optional<bz> $$1) {
         return aq.h.a(new dc.a(Optional.empty(), Optional.of($$0.b()), bz.a($$1)));
      }

      public boolean a(arv $$0, faj $$1, bvk $$2, float $$3, float $$4, boolean $$5) {
         return this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5) ? false : !this.d.isPresent() || this.d.get().a($$1);
      }

      @Override
      public void a(bk $$0) {
         dl.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }
   }
}
