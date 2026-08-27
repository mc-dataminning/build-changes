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

public class eqk extends epo {
   private static final Codec<List<eqk.b>> b = axe.b(eqk.b.a.listOf(), (Function<List<eqk.b>, DataResult<List<eqk.b>>>)($$0 -> {
      Set<iv<bpv>> $$1 = new ObjectOpenHashSet();

      for (eqk.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eqk> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(axe.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eqk::new)
   );
   private final List<eqk.b> c;

   eqk(List<erh> $$0, List<eqk.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public epq b() {
      return epr.o;
   }

   @Override
   public Set<eqq<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$0.a(csg.vU) && !this.c.isEmpty()) {
         eqk.b $$2 = ac.a(this.c, $$1.b());
         iv<bpv> $$3 = $$2.a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a().a()) {
            $$4 *= 20;
         }

         cvf.a $$5 = new cvf.a($$3, $$4);
         $$0.a(jz.y, cvf.a, $$5, cvf::a);
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eqk.a c() {
      return new eqk.a();
   }

   public static class a extends epo.a<eqk.a> {
      private final Builder<eqk.b> a = ImmutableList.builder();

      protected eqk.a a() {
         return this;
      }

      public eqk.a a(iv<bpv> $$0, esc $$1) {
         this.a.add(new eqk.b($$0, $$1));
         return this;
      }

      @Override
      public epp b() {
         return new eqk(this.g(), this.a.build());
      }
   }

   static record b(iv<bpv> b, esc c) {
      public static final Codec<eqk.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(lc.d.r().fieldOf("type").forGetter(eqk.b::a), esd.a.fieldOf("duration").forGetter(eqk.b::b)).apply($$0, eqk.b::new)
      );

      public iv<bpv> a() {
         return this.b;
      }

      public esc b() {
         return this.c;
      }
   }
}
