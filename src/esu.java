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

public class esu extends eru {
   private static final Codec<List<esu.b>> b = esu.b.a.listOf().validate($$0 -> {
      Set<ji<bsa>> $$1 = new ObjectOpenHashSet();

      for (esu.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, esu::new)
   );
   private final List<esu.b> c;

   esu(List<ets> $$0, List<esu.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public erw<esu> b() {
      return erx.r;
   }

   @Override
   public Set<etb<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      if ($$0.a(cus.vU) && !this.c.isEmpty()) {
         esu.b $$2 = ac.a(this.c, $$1.b());
         ji<bsa> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxt.a $$5 = new cxt.a($$3, $$4);
         $$0.a(km.H, cxt.a, $$5, cxt::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static esu.a c() {
      return new esu.a();
   }

   public static class a extends eru.a<esu.a> {
      private final Builder<esu.b> a = ImmutableList.builder();

      protected esu.a a() {
         return this;
      }

      public esu.a a(ji<bsa> $$0, eun $$1) {
         this.a.add(new esu.b($$0, $$1));
         return this;
      }

      @Override
      public erv b() {
         return new esu(this.g(), this.a.build());
      }
   }

   static record b(ji<bsa> b, eun c) {
      public static final Codec<esu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lp.d.r().fieldOf("type").forGetter(esu.b::a), euo.a.fieldOf("duration").forGetter(esu.b::b)).apply($$0, esu.b::new)
      );

      public ji<bsa> a() {
         return this.b;
      }

      public eun b() {
         return this.c;
      }
   }
}
