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

public class evt extends euu {
   private static final Codec<List<evt.b>> b = evt.b.a.listOf().validate($$0 -> {
      Set<jn<bst>> $$1 = new ObjectOpenHashSet();

      for (evt.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, evt::new)
   );
   private final List<evt.b> c;

   evt(List<ews> $$0, List<evt.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public euw<evt> b() {
      return eux.r;
   }

   @Override
   public Set<ewa<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      if ($$0.a(cvt.vY) && !this.c.isEmpty()) {
         evt.b $$2 = ad.a(this.c, $$1.b());
         jn<bst> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cyu.a $$5 = new cyu.a($$3, $$4);
         $$0.a(kr.M, cyu.a, $$5, cyu::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static evt.a c() {
      return new evt.a();
   }

   public static class a extends euu.a<evt.a> {
      private final Builder<evt.b> a = ImmutableList.builder();

      protected evt.a a() {
         return this;
      }

      public evt.a a(jn<bst> $$0, exo $$1) {
         this.a.add(new evt.b($$0, $$1));
         return this;
      }

      @Override
      public euv b() {
         return new evt(this.g(), this.a.build());
      }
   }

   static record b(jn<bst> b, exo c) {
      public static final Codec<evt.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bst.a.fieldOf("type").forGetter(evt.b::a), exp.a.fieldOf("duration").forGetter(evt.b::b)).apply($$0, evt.b::new)
      );

      public jn<bst> a() {
         return this.b;
      }

      public exo b() {
         return this.c;
      }
   }
}
