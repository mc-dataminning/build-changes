import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record an(int c, List<alq<fay>> d, List<alq<dfb<?>>> e, Optional<ef> f) {
   public static final Codec<an> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(an::a),
               fay.a.listOf().optionalFieldOf("loot", List.of()).forGetter(an::b),
               dfb.b.listOf().optionalFieldOf("recipes", List.of()).forGetter(an::c),
               ef.a.optionalFieldOf("function").forGetter(an::d)
            )
            .apply($$0, an::new)
   );
   public static final an b = new an(0, List.of(), List.of(), Optional.empty());

   public void a(asc $$0) {
      $$0.d(this.c);
      faw $$1 = new faw.a($$0.x()).a(fdn.a, $$0).a(fdn.f, $$0.dt()).a(fdm.m);
      boolean $$2 = false;

      for (alq<fay> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            dak $$4 = (dak)var6.next();
            if ($$0.h($$4)) {
               $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awy.oj, awz.h, 0.2F, (($$0.dY().i() - $$0.dY().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               coo $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.l();
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
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.z().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<alq<fay>> b() {
      return this.d;
   }

   public List<alq<dfb<?>>> c() {
      return this.e;
   }

   public Optional<ef> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alq<fay>> b = ImmutableList.builder();
      private final Builder<alq<dfb<?>>> c = ImmutableList.builder();
      private Optional<alr> d = Optional.empty();

      public static an.a a(int $$0) {
         return new an.a().b($$0);
      }

      public an.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static an.a a(alq<fay> $$0) {
         return new an.a().b($$0);
      }

      public an.a b(alq<fay> $$0) {
         this.b.add($$0);
         return this;
      }

      public static an.a c(alq<dfb<?>> $$0) {
         return new an.a().d($$0);
      }

      public an.a d(alq<dfb<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static an.a a(alr $$0) {
         return new an.a().b($$0);
      }

      public an.a b(alr $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public an a() {
         return new an(this.a, this.b.build(), this.c.build(), this.d.map(ef::new));
      }
   }
}
