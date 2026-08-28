import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class eza extends eyb {
   private static final Codec<List<eza.b>> b = eza.b.a.listOf().validate($$0 -> {
      Set<jr<buc>> $$1 = new ObjectOpenHashSet();

      for (eza.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eza> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eza::new)
   );
   private final List<eza.b> c;

   eza(List<ezx> $$0, List<eza.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eyd<eza> b() {
      return eye.r;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      if ($$0.a(cxl.wY) && !this.c.isEmpty()) {
         eza.b $$2 = af.a(this.c, $$1.b());
         jr<buc> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dag.a $$5 = new dag.a($$3, $$4);
         $$0.a(kv.T, dag.a, $$5, dag::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eza.a c() {
      return new eza.a();
   }

   public static class a extends eyb.a<eza.a> {
      private final Builder<eza.b> a = ImmutableList.builder();

      protected eza.a a() {
         return this;
      }

      public eza.a a(jr<buc> $$0, fat $$1) {
         this.a.add(new eza.b($$0, $$1));
         return this;
      }

      @Override
      public eyc b() {
         return new eza(this.g(), this.a.build());
      }
   }

   static record b(jr<buc> b, fat c) {
      public static final Codec<eza.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(buc.a.fieldOf("type").forGetter(eza.b::a), fau.a.fieldOf("duration").forGetter(eza.b::b)).apply($$0, eza.b::new)
      );

      public jr<buc> a() {
         return this.b;
      }

      public fat b() {
         return this.c;
      }
   }
}
