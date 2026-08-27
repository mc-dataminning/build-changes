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

public class eew extends eee {
   private static final Codec<List<eew.b>> b = arh.a(eew.b.a.listOf(), (Function<List<eew.b>, DataResult<List<eew.b>>>)($$0 -> {
      Set<hg<bid>> $$1 = new ObjectOpenHashSet();

      for (eew.b $$2 : $$0) {
         if (!$$1.add($$2.a())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + $$2.a() + "'");
         }
      }

      return DataResult.success($$0);
   }));
   public static final Codec<eew> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(arh.a(b, "effects", List.of()).forGetter($$0x -> $$0x.c)).apply($$0, eew::new)
   );
   private final List<eew.b> c;

   eew(List<efr> $$0, List<eew.b> $$1) {
      super($$0);
      this.c = $$1;
   }

   @Override
   public eeg b() {
      return eeh.n;
   }

   @Override
   public Set<efa<?>> a() {
      return this.c.stream().flatMap($$0 -> $$0.b().a().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      if ($$0.a(cjk.va) && !this.c.isEmpty()) {
         eew.b $$2 = ac.a(this.c, $$1.b());
         bid $$3 = $$2.a().a();
         int $$4 = $$2.b().a($$1);
         if (!$$3.a()) {
            $$4 *= 20;
         }

         ckr.b($$0, List.of(new dba.a($$3, $$4)));
         return $$0;
      } else {
         return $$0;
      }
   }

   public static eew.a c() {
      return new eew.a();
   }

   public static class a extends eee.a<eew.a> {
      private final Builder<eew.b> a = ImmutableList.builder();

      protected eew.a a() {
         return this;
      }

      public eew.a a(bid $$0, egm $$1) {
         this.a.add(new eew.b($$0.j(), $$1));
         return this;
      }

      @Override
      public eef b() {
         return new eew(this.g(), this.a.build());
      }
   }

   static record b(hg<bid> b, egm c) {
      public static final Codec<eew.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jd.e.r().fieldOf("type").forGetter(eew.b::a), egn.a.fieldOf("duration").forGetter(eew.b::b)).apply($$0, eew.b::new)
      );

      public hg<bid> a() {
         return this.b;
      }

      public egm b() {
         return this.c;
      }
   }
}
