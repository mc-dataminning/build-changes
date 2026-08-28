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

public class eyu extends exv {
   private static final Codec<List<eyu.b>> b = eyu.b.a.listOf().validate($$0 -> {
      Set<jq<bue>> $$1 = new ObjectOpenHashSet();

      for (eyu.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eyu::new)
   );
   private final List<eyu.b> c;

   eyu(List<ezr> $$0, List<eyu.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exx<eyu> b() {
      return exy.r;
   }

   @Override
   public Set<bbd<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      if ($$0.a(cxk.wW) && !this.c.isEmpty()) {
         eyu.b $$2 = ae.a(this.c, $$1.b());
         jq<bue> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         dah.a $$5 = new dah.a($$3, $$4);
         $$0.a(ku.R, dah.a, $$5, dah::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eyu.a c() {
      return new eyu.a();
   }

   public static class a extends exv.a<eyu.a> {
      private final Builder<eyu.b> a = ImmutableList.builder();

      protected eyu.a a() {
         return this;
      }

      public eyu.a a(jq<bue> $$0, fan $$1) {
         this.a.add(new eyu.b($$0, $$1));
         return this;
      }

      @Override
      public exw b() {
         return new eyu(this.g(), this.a.build());
      }
   }

   static record b(jq<bue> b, fan c) {
      public static final Codec<eyu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bue.a.fieldOf("type").forGetter(eyu.b::a), fao.a.fieldOf("duration").forGetter(eyu.b::b)).apply($$0, eyu.b::new)
      );

      public jq<bue> a() {
         return this.b;
      }

      public fan b() {
         return this.c;
      }
   }
}
