import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bk(List<ed<brm>> b, Optional<bv> c, Optional<bv> d, Optional<Boolean> e) {
   public static final Codec<bk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ed.a(lu.s).listOf().optionalFieldOf("tags", List.of()).forGetter(bk::a),
               bv.a.optionalFieldOf("direct_entity").forGetter(bk::b),
               bv.a.optionalFieldOf("source_entity").forGetter(bk::c),
               Codec.BOOL.optionalFieldOf("is_direct").forGetter(bk::d)
            )
            .apply($$0, bk::new)
   );

   public boolean a(aqv $$0, brk $$1) {
      return this.a($$0.A(), $$0.dm(), $$1);
   }

   public boolean a(aqu $$0, exc $$1, brk $$2) {
      for (ed<brm> $$3 : this.b) {
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

   public List<ed<brm>> a() {
      return this.b;
   }

   public Optional<bv> b() {
      return this.c;
   }

   public Optional<bv> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public static class a {
      private final Builder<ed<brm>> a = ImmutableList.builder();
      private Optional<bv> b = Optional.empty();
      private Optional<bv> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();

      public static bk.a a() {
         return new bk.a();
      }

      public bk.a a(ed<brm> $$0) {
         this.a.add($$0);
         return this;
      }

      public bk.a a(bv.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bk.a b(bv.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bk.a a(boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bk b() {
         return new bk(this.a.build(), this.b, this.c, this.d);
      }
   }
}
