import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fbg extends fbu {
   public static final MapCodec<fbg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mg.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ech::f).toList())
               )
            )
            .apply($$0, fbg::new)
   );
   private final jf<dnc> b;
   private final Set<ech<?>> c;

   fbg(List<fdq> $$0, jf<dnc> $$1, Set<ech<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fbg(List<fdq> $$0, jf<dnc> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fbw<fbg> b() {
      return fbx.D;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.g);
   }

   @Override
   protected czy a(czy $$0, fah $$1) {
      ebe $$2 = $$1.c(fdb.g);
      if ($$2 != null) {
         $$0.a(kk.aq, dby.a, $$1x -> {
            for (ech<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fbg.a a(dnc $$0) {
      return new fbg.a($$0);
   }

   public static class a extends fbu.a<fbg.a> {
      private final jf<dnc> a;
      private final Builder<ech<?>> b = ImmutableSet.builder();

      a(dnc $$0) {
         this.a = $$0.p();
      }

      public fbg.a a(ech<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fbg.a a() {
         return this;
      }

      @Override
      public fbv b() {
         return new fbg(this.g(), this.a, this.b.build());
      }
   }
}
