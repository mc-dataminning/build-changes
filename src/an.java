import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record an(int c, List<alj<fao>> d, List<alj<der<?>>> e, Optional<ef> f) {
   public static final Codec<an> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(an::a),
               fao.a.listOf().optionalFieldOf("loot", List.of()).forGetter(an::b),
               der.b.listOf().optionalFieldOf("recipes", List.of()).forGetter(an::c),
               ef.a.optionalFieldOf("function").forGetter(an::d)
            )
            .apply($$0, an::new)
   );
   public static final an b = new an(0, List.of(), List.of(), Optional.empty());

   public void a(arv $$0) {
      $$0.d(this.c);
      fam $$1 = new fam.a($$0.y()).a(fdd.a, $$0).a(fdd.f, $$0.dt()).a(fdc.m);
      boolean $$2 = false;

      for (alj<fao> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            daa $$4 = (daa)var6.next();
            if ($$0.h($$4)) {
               $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awr.oj, aws.h, 0.2F, (($$0.dY().i() - $$0.dY().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               coe $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.m();
                  $$5.b($$0.cG());
               }
            }
         }
      }

      if ($$2) {
         $$0.bR.d();
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

   public List<alj<fao>> b() {
      return this.d;
   }

   public List<alj<der<?>>> c() {
      return this.e;
   }

   public Optional<ef> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alj<fao>> b = ImmutableList.builder();
      private final Builder<alj<der<?>>> c = ImmutableList.builder();
      private Optional<alk> d = Optional.empty();

      public static an.a a(int $$0) {
         return new an.a().b($$0);
      }

      public an.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static an.a a(alj<fao> $$0) {
         return new an.a().b($$0);
      }

      public an.a b(alj<fao> $$0) {
         this.b.add($$0);
         return this;
      }

      public static an.a c(alj<der<?>> $$0) {
         return new an.a().d($$0);
      }

      public an.a d(alj<der<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static an.a a(alk $$0) {
         return new an.a().b($$0);
      }

      public an.a b(alk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public an a() {
         return new an(this.a, this.b.build(), this.c.build(), this.d.map(ef::new));
      }
   }
}
