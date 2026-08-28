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

public class eyd extends exe {
   private static final Codec<List<eyd.b>> b = eyd.b.a.listOf().validate($$0 -> {
      Set<jr<bto>> $$1 = new ObjectOpenHashSet();

      for (eyd.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eyd::new)
   );
   private final List<eyd.b> c;

   eyd(List<eza> $$0, List<eyd.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exg<eyd> b() {
      return exh.r;
   }

   @Override
   public Set<bai<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      if ($$0.a(cwt.wW) && !this.c.isEmpty()) {
         eyd.b $$2 = af.a(this.c, $$1.b());
         jr<bto> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czq.a $$5 = new czq.a($$3, $$4);
         $$0.a(kv.R, czq.a, $$5, czq::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eyd.a c() {
      return new eyd.a();
   }

   public static class a extends exe.a<eyd.a> {
      private final Builder<eyd.b> a = ImmutableList.builder();

      protected eyd.a a() {
         return this;
      }

      public eyd.a a(jr<bto> $$0, ezw $$1) {
         this.a.add(new eyd.b($$0, $$1));
         return this;
      }

      @Override
      public exf b() {
         return new eyd(this.g(), this.a.build());
      }
   }

   static record b(jr<bto> b, ezw c) {
      public static final Codec<eyd.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bto.a.fieldOf("type").forGetter(eyd.b::a), ezx.a.fieldOf("duration").forGetter(eyd.b::b)).apply($$0, eyd.b::new)
      );

      public jr<bto> a() {
         return this.b;
      }

      public ezw b() {
         return this.c;
      }
   }
}
