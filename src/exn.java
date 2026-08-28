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
                  mb.e.r().fieldOf("block").forGetter($$0x -> $$0x.b),
                  Codec.STRING.listOf().fieldOf("properties").forGetter($$0x -> $$0x.c.stream().map(dyt::f).toList())
               )
            )
            .apply($$0, exn::new)
   );
   private final jr<dke> b;
   private final Set<dyt<?>> c;

   exn(List<ezx> $$0, jr<dke> $$1, Set<dyt<?>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   private exn(List<ezx> $$0, jr<dke> $$1, List<String> $$2) {
      this($$0, $$1, $$2.stream().map($$1.a().l()::a).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public eyd<exn> b() {
      return eye.D;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.g);
   }

   @Override
   protected cxh a(cxh $$0, ewo $$1) {
      dxq $$2 = $$1.c(ezi.g);
      if ($$2 != null) {
         $$0.a(kv.ao, czh.a, $$1x -> {
            for (dyt<?> $$2x : this.c) {
               if ($$2.b($$2x)) {
                  $$1x = $$1x.a($$2x, $$2);
               }
            }

            return $$1x;
         });
      }

      return $$0;
   }

   public static exn.a a(dke $$0) {
      return new exn.a($$0);
   }

   public static class a extends eyb.a<exn.a> {
      private final jr<dke> a;
      private final Builder<dyt<?>> b = ImmutableSet.builder();

      a(dke $$0) {
         this.a = $$0.p();
      }

      public exn.a a(dyt<?> $$0) {
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
