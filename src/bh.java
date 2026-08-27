import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bh(List<dq<bqv>> b, Optional<bs> c, Optional<bs> d) {
   public static final Codec<bh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(dq.a(li.s).listOf(), "tags", List.of()).forGetter(bh::a),
               axu.a(bs.a, "direct_entity").forGetter(bh::b),
               axu.a(bs.a, "source_entity").forGetter(bh::c)
            )
            .apply($$0, bh::new)
   );

   public boolean a(aqu $$0, bqt $$1) {
      return this.a($$0.B(), $$0.ds(), $$1);
   }

   public boolean a(aqt $$0, ewu $$1, bqt $$2) {
      for (dq<bqv> $$3 : this.b) {
         if (!$$3.a($$2.k())) {
            return false;
         }
      }

      return this.c.isPresent() && !this.c.get().a($$0, $$1, $$2.c()) ? false : !this.d.isPresent() || this.d.get().a($$0, $$1, $$2.d());
   }

   public List<dq<bqv>> a() {
      return this.b;
   }

   public Optional<bs> b() {
      return this.c;
   }

   public Optional<bs> c() {
      return this.d;
   }

   public static class a {
      private final Builder<dq<bqv>> a = ImmutableList.builder();
      private Optional<bs> b = Optional.empty();
      private Optional<bs> c = Optional.empty();

      public static bh.a a() {
         return new bh.a();
      }

      public bh.a a(dq<bqv> $$0) {
         this.a.add($$0);
         return this;
      }

      public bh.a a(bs.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bh.a b(bs.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bh b() {
         return new bh(this.a.build(), this.b, this.c);
      }
   }
}
