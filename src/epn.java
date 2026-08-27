import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class epn extends eox {
   public static final Codec<epn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.BOOL.fieldOf("replace").orElse(false).forGetter($$0x -> $$0x.b),
                  wk.a.listOf().fieldOf("lore").forGetter($$0x -> $$0x.c),
                  awu.a(enk.b.e, "entity").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, epn::new)
   );
   private final boolean b;
   private final List<wi> c;
   private final Optional<enk.b> d;

   public epn(List<eql> $$0, boolean $$1, List<wi> $$2, Optional<enk.b> $$3) {
      super($$0);
      this.b = $$1;
      this.c = List.copyOf($$2);
      this.d = $$3;
   }

   @Override
   public eoz b() {
      return epa.v;
   }

   @Override
   public Set<epu<?>> a() {
      return this.d.<Set<epu<?>>>map($$0 -> Set.of($$0.a())).orElseGet(Set::of);
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      $$0.a(jr.e, cuk.a, $$1x -> new cuk(this.a($$1x, $$1)));
      return $$0;
   }

   private List<wi> a(@Nullable cuk $$0, enk $$1) {
      if ($$0 == null && this.c.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator<wi> $$2 = epo.a($$1, this.d.orElse(null));
         Stream<wi> $$3 = this.c.stream().map($$2);
         return !this.b && $$0 != null ? Stream.concat($$0.a().stream(), $$3).toList() : $$3.toList();
      }
   }

   public static epn.a c() {
      return new epn.a();
   }

   public static class a extends eox.a<epn.a> {
      private boolean a;
      private Optional<enk.b> b = Optional.empty();
      private final Builder<wi> c = ImmutableList.builder();

      public epn.a a(boolean $$0) {
         this.a = $$0;
         return this;
      }

      public epn.a a(enk.b $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public epn.a a(wi $$0) {
         this.c.add($$0);
         return this;
      }

      protected epn.a a() {
         return this;
      }

      @Override
      public eoy b() {
         return new epn(this.g(), this.a, this.c.build(), this.b);
      }
   }
}
