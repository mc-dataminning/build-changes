import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class eek extends eds {
   private static final Codec<List<eek.b>> b = aqy.a(eek.b.a.listOf(), (Function<List<eek.b>, DataResult<List<eek.b>>>)($$0 -> {
      Set<he<bht>> $$1 = new ObjectOpenHashSet();

      for (eek.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(aqy.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eek::new)
   );
   private final List<eek.b> c;

   eek(List<eff> $$0, List<eek.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public edu b() {
      return edv.n;
   }

   @Override
   public Set<eeo<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      if ($$0.a(cja.va) && !this.c.isEmpty()) {
         eek.b $$2 = ac.a(this.c, $$1.b());
         bht $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         ckh.b($$0, List.of(new dao.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eek.a c() {
      return new eek.a();
   }

   public static class a extends eds.a<eek.a> {
      private final Builder<eek.b> a = ImmutableList.builder();

      protected eek.a a() {
         return this;
      }

      public eek.a a(bht $$0, ega $$1) {
         this.a.add(new eek.b($$0.j(), $$1));
         return this;
      }

      @Override
      public edt b() {
         return new eek(this.g(), this.a.build());
      }
   }

   static record b(he<bht> b, ega c) {
      public static final Codec<eek.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jb.e.r().fieldOf("type").forGetter(eek.b::a), egb.a.fieldOf("duration").forGetter(eek.b::b)).apply($$0, eek.b::new)
      );

      public he<bht> a() {
         return this.b;
      }

      public ega b() {
         return this.c;
      }
   }
}
