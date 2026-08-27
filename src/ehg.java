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

public class ehg extends ego {
   private static final Codec<List<ehg.b>> b = asy.a(ehg.b.a.listOf(), (Function<List<ehg.b>, DataResult<List<ehg.b>>>)($$0 -> {
      Set<ig<bkg>> $$1 = new ObjectOpenHashSet();

      for (ehg.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<ehg> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asy.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, ehg::new)
   );
   private final List<ehg.b> c;

   ehg(List<eib> $$0, List<ehg.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public egq b() {
      return egr.n;
   }

   @Override
   public Set<ehk<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      if ($$0.a(clr.vM) && !this.c.isEmpty()) {
         ehg.b $$2 = ac.a(this.c, $$1.b());
         bkg $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         cmy.b($$0, List.of(new ddg.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static ehg.a c() {
      return new ehg.a();
   }

   public static class a extends ego.a<ehg.a> {
      private final Builder<ehg.b> a = ImmutableList.builder();

      protected ehg.a a() {
         return this;
      }

      public ehg.a a(bkg $$0, eiw $$1) {
         this.a.add(new ehg.b($$0.j(), $$1));
         return this;
      }

      @Override
      public egp b() {
         return new ehg(this.g(), this.a.build());
      }
   }

   static record b(ig<bkg> b, eiw c) {
      public static final Codec<ehg.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kc.e.r().fieldOf("type").forGetter(ehg.b::a), eix.a.fieldOf("duration").forGetter(ehg.b::b)).apply($$0, ehg.b::new)
      );

      public ig<bkg> a() {
         return this.b;
      }

      public eiw b() {
         return this.c;
      }
   }
}
