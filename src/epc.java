import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class epc extends epo {
   public static final Codec<epc> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lc.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(drb::f).toList())
               )
            )
            .apply($$0, epc::new)
   );
   private final iv<dcv> b;
   private final Set<drb<?>> c;

   epc(List<erh> $$0, iv<dcv> $$1, Set<drb<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private epc(List<erh> $$0, iv<dcv> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public epq b() {
      return epr.y;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.g);
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      dpy $$2 = $$1.c(eqt.g);
      if ($$2 != null) {
         $$0.a(jz.R, cum.a, $$1x -> {
            for (drb<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static epc.a a(dcv $$0) {
      return new epc.a($$0);
   }

   public static class a extends epo.a<epc.a> {
      private final iv<dcv> a;
      private final Builder<drb<?>> b = ImmutableSet.builder();

      a(dcv $$0) {
         this.a = $$0.r();
      }

      public epc.a a(drb<?> $$0) {
         if (!this.a.a().l().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected epc.a a() {
         return this;
      }

      @Override
      public epp b() {
         return new epc(this.g(), this.a, this.b.build());
      }
   }
}
