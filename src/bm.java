import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bm(List<eh<btb>> b, Optional<bx> c, Optional<bx> d, Optional<Boolean> e) {
   public static final Codec<bm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eh.a(mc.s).listOf().optionalFieldOf("tags", List.of()).forGetter(bm::a),
               bx.a.optionalFieldOf("direct_entity").forGetter(bm::b),
               bx.a.optionalFieldOf("source_entity").forGetter(bm::c),
               Codec.BOOL.optionalFieldOf("is_direct").forGetter(bm::d)
            )
            .apply($$0, bm::new)
   );

   public boolean a(ard $$0, bsz $$1) {
      return this.a($$0.y(), $$0.du(), $$1);
   }

   public boolean a(arc $$0, fay $$1, bsz $$2) {
      for (eh<btb> $$3 : this.b) {
         if (!$$3.a($$2.l())) {
            return false;
         }
      }

      if (this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c())) {
         return false;
      } else {
         return this.d.isPresent() && !this.d.get().a($$0, $$1, $$2.d()) ? false : !this.e.isPresent() || this.e.get() == $$2.b();
      }
   }

   public List<eh<btb>> a() {
      return this.b;
   }

   public Optional<bx> b() {
      return this.c;
   }

   public Optional<bx> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public static class a {
      private final Builder<eh<btb>> a = ImmutableList.builder();
      private Optional<bx> b = Optional.empty();
      private Optional<bx> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();

      public static bm.a a() {
         return new bm.a();
      }

      public bm.a a(eh<btb> $$0) {
         this.a.add($$0);
         return this;
      }

      public bm.a a(bx.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bm.a b(bx.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bm.a a(boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bm b() {
         return new bm(this.a.build(), this.b, this.c, this.d);
      }
   }
}
