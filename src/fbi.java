import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class fbi extends fbw {
   public static final MapCodec<fbi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  mh.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(ecj::f).toList())
               )
            )
            .apply($$0, fbi::new)
   );
   private final jg<dne> b;
   private final Set<ecj<?>> c;

   fbi(List<fds> $$0, jg<dne> $$1, Set<ecj<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private fbi(List<fds> $$0, jg<dne> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public fby<fbi> b() {
      return fbz.D;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.g);
   }

   @Override
   protected daa a(daa $$0, faj $$1) {
      ebg $$2 = $$1.c(fdd.g);
      if ($$2 != null) {
         $$0.a(kl.aq, dca.a, $$1x -> {
            for (ecj<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static fbi.a a(dne $$0) {
      return new fbi.a($$0);
   }

   public static class a extends fbw.a<fbi.a> {
      private final jg<dne> a;
      private final Builder<ecj<?>> b = ImmutableSet.builder();

      a(dne $$0) {
         this.a = $$0.p();
      }

      public fbi.a a(ecj<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected fbi.a a() {
         return this;
      }

      @Override
      public fbx b() {
         return new fbi(this.g(), this.a, this.b.build());
      }
   }
}
