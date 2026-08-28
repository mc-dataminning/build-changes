import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record am(int c, List<alf<ezm>> d, List<alf<ddu<?>>> e, Optional<ed> f) {
   public static final Codec<am> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(am::a),
               alf.a(mg.bq).listOf().optionalFieldOf("loot", List.of()).forGetter(am::b),
               alf.a(mg.bu).listOf().optionalFieldOf("recipes", List.of()).forGetter(am::c),
               ed.a.optionalFieldOf("function").forGetter(am::d)
            )
            .apply($$0, am::new)
   );
   public static final am b = new am(0, List.of(), List.of(), Optional.empty());

   public void a(arr $$0) {
      $$0.d(this.c);
      ezk $$1 = new ezk.a($$0.y()).a(fcb.a, $$0).a(fcb.f, $$0.dt()).a(fca.m);
      boolean $$2 = false;

      for (alf<ezm> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            czd $$4 = (czd)var6.next();
            if ($$0.h($$4)) {
               $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awn.oj, awo.h, 0.2F, (($$0.dY().i() - $$0.dY().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cnh $$5 = $$0.a($$4, false);
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

   public List<alf<ezm>> b() {
      return this.d;
   }

   public List<alf<ddu<?>>> c() {
      return this.e;
   }

   public Optional<ed> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alf<ezm>> b = ImmutableList.builder();
      private final Builder<alf<ddu<?>>> c = ImmutableList.builder();
      private Optional<alg> d = Optional.empty();

      public static am.a a(int $$0) {
         return new am.a().b($$0);
      }

      public am.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static am.a a(alf<ezm> $$0) {
         return new am.a().b($$0);
      }

      public am.a b(alf<ezm> $$0) {
         this.b.add($$0);
         return this;
      }

      public static am.a c(alf<ddu<?>> $$0) {
         return new am.a().d($$0);
      }

      public am.a d(alf<ddu<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static am.a a(alg $$0) {
         return new am.a().b($$0);
      }

      public am.a b(alg $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public am a() {
         return new am(this.a, this.b.build(), this.c.build(), this.d.map(ed::new));
      }
   }
}
