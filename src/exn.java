import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class exn extends eyb {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ma.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dyw::f).toList())
               )
            )
            .apply($$0, exn::new)
   );
   private final jq<dkl> b;
   private final Set<dyw<?>> c;

   exn(List<ezx> $$0, jq<dkl> $$1, Set<dyw<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private exn(List<ezx> $$0, jq<dkl> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eyd<exn> b() {
      return eye.D;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.g);
   }

   @Override
   protected cxo a(cxo $$0, ewo $$1) {
      dxu $$2 = $$1.c(ezi.g);
      if ($$2 != null) {
         $$0.a(ku.am, czq.a, $$1x -> {
            for (dyw<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static exn.a a(dkl $$0) {
      return new exn.a($$0);
   }

   public static class a extends eyb.a<exn.a> {
      private final jq<dkl> a;
      private final Builder<dyw<?>> b = ImmutableSet.builder();

      a(dkl $$0) {
         this.a = $$0.p();
      }

      public exn.a a(dyw<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected exn.a a() {
         return this;
      }

      @Override
      public eyc b() {
         return new exn(this.g(), this.a, this.b.build());
      }
   }
}
