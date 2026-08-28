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

public class eti extends esj {
   private static final Codec<List<eti.b>> b = eti.b.a.listOf().validate($$0 -> {
      Set<jj<brn>> $$1 = new ObjectOpenHashSet();

      for (eti.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   });
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(b.optionalFieldOf("effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eti::new)
   );
   private final List<eti.b> c;

   eti(List<euh> $$0, List<eti.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public esl<eti> b() {
      return esm.r;
   }

   @Override
   public Set<etp<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      if ($$0.a(cug.vX) && !this.c.isEmpty()) {
         eti.b $$2 = ac.a(this.c, $$1.b());
         jj<brn> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cxg.a $$5 = new cxg.a($$3, $$4);
         $$0.a(kn.H, cxg.a, $$5, cxg::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eti.a c() {
      return new eti.a();
   }

   public static class a extends esj.a<eti.a> {
      private final Builder<eti.b> a = ImmutableList.builder();

      protected eti.a a() {
         return this;
      }

      public eti.a a(jj<brn> $$0, evd $$1) {
         this.a.add(new eti.b($$0, $$1));
         return this;
      }

      @Override
      public esk b() {
         return new eti(this.g(), this.a.build());
      }
   }

   static record b(jj<brn> b, evd c) {
      public static final Codec<eti.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(brn.a.fieldOf("type").forGetter(eti.b::a), eve.a.fieldOf("duration").forGetter(eti.b::b)).apply($$0, eti.b::new)
      );

      public jj<brn> a() {
         return this.b;
      }

      public evd b() {
         return this.c;
      }
   }
}
