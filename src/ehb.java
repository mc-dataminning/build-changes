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

public class ehb extends egj {
   private static final Codec<List<ehb.b>> b = asu.a(ehb.b.a.listOf(), (Function<List<ehb.b>, DataResult<List<ehb.b>>>)($$0 -> {
      Set<ib<bkb>> $$1 = new ObjectOpenHashSet();

      for (ehb.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<ehb> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asu.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ehb::new)
   );
   private final List<ehb.b> c;

   ehb(List<ehw> $$0, List<ehb.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public egl b() {
      return egm.n;
   }

   @Override
   public Set<ehf<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      if ($$0.a(clm.vM) && !this.c.isEmpty()) {
         ehb.b $$2 = ac.a(this.c, $$1.b());
         bkb $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         cmt.b($$0, List.of(new ddb.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ehb.a c() {
      return new ehb.a();
   }

   public static class a extends egj.a<ehb.a> {
      private final Builder<ehb.b> a = ImmutableList.builder();

      protected ehb.a a() {
         return this;
      }

      public ehb.a a(bkb $$0, eir $$1) {
         this.a.add(new ehb.b($$0.j(), $$1));
         return this;
      }

      @Override
      public egk b() {
         return new ehb(this.g(), this.a.build());
      }
   }

   static record b(ib<bkb> b, eir c) {
      public static final Codec<ehb.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.e.r().fieldOf("type").forGetter(ehb.b::a), eis.a.fieldOf("duration").forGetter(ehb.b::b)).apply($$0, ehb.b::new)
      );

      public ib<bkb> a() {
         return this.b;
      }

      public eir b() {
         return this.c;
      }
   }
}
