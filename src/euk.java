import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class euk extends euy {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  lv.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dvv::f).toList())
               )
            )
            .apply($$0, euk::new)
   );
   private final jo<dhm> b;
   private final Set<dvv<?>> c;

   euk(List<eww> $$0, jo<dhm> $$1, Set<dvv<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private euk(List<eww> $$0, jo<dhm> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().k()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eva<euk> b() {
      return evb.D;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.g);
   }

   @Override
   protected cvs a(cvs $$0, etl $$1) {
      dus $$2 = $$1.c(ewh.g);
      if ($$2 != null) {
         $$0.a(ks.ah, cya.a, $$1x -> {
            for (dvv<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static euk.a a(dhm $$0) {
      return new euk.a($$0);
   }

   public static class a extends euy.a<euk.a> {
      private final jo<dhm> a;
      private final Builder<dvv<?>> b = ImmutableSet.builder();

      a(dhm $$0) {
         this.a = $$0.r();
      }

      public euk.a a(dvv<?> $$0) {
         if (!this.a.a().k().d().contains($$0)) {
            throw new IllegalStateException("Property " + $$0 + " is not present on block " + this.a);
         } else {
            this.b.add($$0);
            return this;
         }
      }

      protected euk.a a() {
         return this;
      }

      @Override
      public euz b() {
         return new euk(this.g(), this.a, this.b.build());
      }
   }
}
