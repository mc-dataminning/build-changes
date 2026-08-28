import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record an(int c, List<alf<ezt>> d, List<alf<deb<?>>> e, Optional<ee> f) {
   public static final Codec<an> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(an::a),
               ezt.a.listOf().optionalFieldOf("loot", List.of()).forGetter(an::b),
               deb.b.listOf().optionalFieldOf("recipes", List.of()).forGetter(an::c),
               ee.a.optionalFieldOf("function").forGetter(an::d)
            )
            .apply($$0, an::new)
   );
   public static final an b = new an(0, List.of(), List.of(), Optional.empty());

   public void a(arr $$0) {
      $$0.d(this.c);
      ezr $$1 = new ezr.a($$0.y()).a(fci.a, $$0).a(fci.f, $$0.ds()).a(fch.m);
      boolean $$2 = false;

      for (alf<ezt> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            czk $$4 = (czk)var6.next();
            if ($$0.h($$4)) {
               $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), awn.oj, awo.h, 0.2F, (($$0.dX().i() - $$0.dX().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cno $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.m();
                  $$5.b($$0.cF());
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

   public List<alf<ezt>> b() {
      return this.d;
   }

   public List<alf<deb<?>>> c() {
      return this.e;
   }

   public Optional<ee> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alf<ezt>> b = ImmutableList.builder();
      private final Builder<alf<deb<?>>> c = ImmutableList.builder();
      private Optional<alg> d = Optional.empty();

      public static an.a a(int $$0) {
         return new an.a().b($$0);
      }

      public an.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static an.a a(alf<ezt> $$0) {
         return new an.a().b($$0);
      }

      public an.a b(alf<ezt> $$0) {
         this.b.add($$0);
         return this;
      }

      public static an.a c(alf<deb<?>> $$0) {
         return new an.a().d($$0);
      }

      public an.a d(alf<deb<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static an.a a(alg $$0) {
         return new an.a().b($$0);
      }

      public an.a b(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public an a() {
         return new an(this.a, this.b.build(), this.c.build(), this.d.map(ee::new));
      }
   }
}
