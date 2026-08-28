import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record bl(List<eg<buc>> b, Optional<bw> c, Optional<bw> d, Optional<Boolean> e) {
   public static final Codec<bl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eg.a(mb.s).listOf().optionalFieldOf("tags", List.of()).forGetter(bl::a),
               bw.a.optionalFieldOf("direct_entity").forGetter(bl::b),
               bw.a.optionalFieldOf("source_entity").forGetter(bl::c),
               Codec.BOOL.optionalFieldOf("is_direct").forGetter(bl::d)
            )
            .apply($$0, bl::new)
   );

   public boolean a(asi $$0, bua $$1) {
      return this.a($$0.y(), $$0.du(), $$1);
   }

   public boolean a(ash $$0, fby $$1, bua $$2) {
      for (eg<buc> $$3 : this.b) {
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

   public List<eg<buc>> a() {
      return this.b;
   }

   public Optional<bw> b() {
      return this.c;
   }

   public Optional<bw> c() {
      return this.d;
   }

   public Optional<Boolean> d() {
      return this.e;
   }

   public static class a {
      private final Builder<eg<buc>> a = ImmutableList.builder();
      private Optional<bw> b = Optional.empty();
      private Optional<bw> c = Optional.empty();
      private Optional<Boolean> d = Optional.empty();

      public static bl.a a() {
         return new bl.a();
      }

      public bl.a a(eg<buc> $$0) {
         this.a.add($$0);
         return this;
      }

      public bl.a a(bw.a $$0) {
         this.b = Optional.of($$0.b());
         return this;
      }

      public bl.a b(bw.a $$0) {
         this.c = Optional.of($$0.b());
         return this;
      }

      public bl.a a(boolean $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public bl b() {
         return new bl(this.a.build(), this.b, this.c, this.d);
      }
   }
}
