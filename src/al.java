import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record al(int c, List<aly<ewm>> d, List<aly<dbz<?>>> e, Optional<er> f) {
   public static final Codec<al> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(al::a),
               aly.a(mb.bf).listOf().optionalFieldOf("loot", List.of()).forGetter(al::b),
               aly.a(mb.bj).listOf().optionalFieldOf("recipes", List.of()).forGetter(al::c),
               er.a.optionalFieldOf("function").forGetter(al::d)
            )
            .apply($$0, al::new)
   );
   public static final al b = new al(0, List.of(), List.of(), Optional.empty());

   public void a(asi $$0) {
      $$0.d(this.c);
      ewk $$1 = new ewk.a($$0.y()).a(ezd.a, $$0).a(ezd.f, $$0.dt()).a(ezc.m);
      boolean $$2 = false;

      for (aly<ewm> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cxk $$4 = (cxk)var6.next();
            if ($$0.i($$4)) {
               $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), axf.nT, axg.h, 0.2F, (($$0.dY().i() - $$0.dY().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               clw $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cG());
               }
            }
         }
      }

      if ($$2) {
         $$0.cd.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      MinecraftServer $$6 = $$0.g;
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.A().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<aly<ewm>> b() {
      return this.d;
   }

   public List<aly<dbz<?>>> c() {
      return this.e;
   }

   public Optional<er> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<aly<ewm>> b = ImmutableList.builder();
      private final Builder<aly<dbz<?>>> c = ImmutableList.builder();
      private Optional<alz> d = Optional.empty();

      public static al.a a(int $$0) {
         return new al.a().b($$0);
      }

      public al.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static al.a a(aly<ewm> $$0) {
         return new al.a().b($$0);
      }

      public al.a b(aly<ewm> $$0) {
         this.b.add($$0);
         return this;
      }

      public static al.a c(aly<dbz<?>> $$0) {
         return new al.a().d($$0);
      }

      public al.a d(aly<dbz<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static al.a a(alz $$0) {
         return new al.a().b($$0);
      }

      public al.a b(alz $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public al a() {
         return new al(this.a, this.b.build(), this.c.build(), this.d.map(er::new));
      }
   }
}
