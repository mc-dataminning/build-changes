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

public class eyb extends exc {
   private static final Codec<List<eyb.b>> b = eyb.b.a.listOf().validate($$0 -> {
      Set<jr<btm>> $$1 = new ObjectOpenHashSet();

      for (eyb.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eyb> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eyb::new)
   );
   private final List<eyb.b> c;

   eyb(List<eyy> $$0, List<eyb.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public exe<eyb> b() {
      return exf.r;
   }

   @Override
   public Set<bah<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      if ($$0.a(cwr.wW) && !this.c.isEmpty()) {
         eyb.b $$2 = af.a(this.c, $$1.b());
         jr<btm> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         czo.a $$5 = new czo.a($$3, $$4);
         $$0.a(kv.R, czo.a, $$5, czo::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eyb.a c() {
      return new eyb.a();
   }

   public static class a extends exc.a<eyb.a> {
      private final Builder<eyb.b> a = ImmutableList.builder();

      protected eyb.a a() {
         return this;
      }

      public eyb.a a(jr<btm> $$0, ezu $$1) {
         this.a.add(new eyb.b($$0, $$1));
         return this;
      }

      @Override
      public exd b() {
         return new eyb(this.g(), this.a.build());
      }
   }

   static record b(jr<btm> b, ezu c) {
      public static final Codec<eyb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(btm.a.fieldOf("type").forGetter(eyb.b::a), ezv.a.fieldOf("duration").forGetter(eyb.b::b)).apply($$0, eyb.b::new)
      );

      public jr<btm> a() {
         return this.b;
      }

      public ezu b() {
         return this.c;
      }
   }
}
