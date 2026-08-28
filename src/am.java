import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record am(int c, List<alf<eze>> d, List<alf<ddp<?>>> e, Optional<ed> f) {
   public static final Codec<am> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(am::a),
               alf.a(mg.bp).listOf().optionalFieldOf("loot", List.of()).forGetter(am::b),
               alf.a(mg.bt).listOf().optionalFieldOf("recipes", List.of()).forGetter(am::c),
               ed.a.optionalFieldOf("function").forGetter(am::d)
            )
            .apply($$0, am::new)
   );
   public static final am b = new am(0, List.of(), List.of(), Optional.empty());

   public void a(arr $$0) {
      $$0.d(this.c);
      ezc $$1 = new ezc.a($$0.y()).a(fbt.a, $$0).a(fbt.f, $$0.dt()).a(fbs.m);
      boolean $$2 = false;

      for (alf<eze> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cyy $$4 = (cyy)var6.next();
            if ($$0.i($$4)) {
               $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awn.og, awo.h, 0.2F, (($$0.dY().i() - $$0.dY().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cnd $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.m();
                  $$5.b($$0.cG());
               }
            }
         }
      }

      if ($$2) {
         $$0.bQ.d();
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

   public List<alf<eze>> b() {
      return this.d;
   }

   public List<alf<ddp<?>>> c() {
      return this.e;
   }

   public Optional<ed> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alf<eze>> b = ImmutableList.builder();
      private final Builder<alf<ddp<?>>> c = ImmutableList.builder();
      private Optional<alg> d = Optional.empty();

      public static am.a a(int $$0) {
         return new am.a().b($$0);
      }

      public am.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static am.a a(alf<eze> $$0) {
         return new am.a().b($$0);
      }

      public am.a b(alf<eze> $$0) {
         this.b.add($$0);
         return this;
      }

      public static am.a c(alf<ddp<?>> $$0) {
         return new am.a().d($$0);
      }

      public am.a d(alf<ddp<?>> $$0) {
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
