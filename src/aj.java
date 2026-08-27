import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<agt> d, List<agt> e, Optional<dm> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atg.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(aj::a),
               atg.a(agt.a.listOf(), "loot", List.of()).forGetter(aj::b),
               atg.a(agt.a.listOf(), "recipes", List.of()).forGetter(aj::c),
               atg.a(dm.a, "function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(amq $$0) {
      $$0.d(this.c);
      egk $$1 = new egk.a($$0.z()).a(eip.a, $$0).a(eip.f, $$0.dk()).a(eio.k);
      boolean $$2 = false;

      for (agt $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.aJ().getLootTable($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cmh $$4 = (cmh)var6.next();
            if ($$0.i($$4)) {
               $$0.dM().a(null, $$0.dr(), $$0.dt(), $$0.dx(), arc.mO, ard.h, 0.2F, (($$0.eg().i() - $$0.eg().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cbe $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.x();
                  $$5.b($$0.cw());
               }
            }
         }
      }

      if ($$2) {
         $$0.bS.d();
      }

      if (!this.e.isEmpty()) {
         $$0.a(this.e);
      }

      MinecraftServer $$6 = $$0.d;
      this.f.flatMap($$1x -> $$1x.a($$6.aC())).ifPresent($$2x -> $$6.aC().a($$2x, $$0.dd().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<agt> b() {
      return this.d;
   }

   public List<agt> c() {
      return this.e;
   }

   public Optional<dm> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<agt> b = ImmutableList.builder();
      private final Builder<agt> c = ImmutableList.builder();
      private Optional<agt> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(agt $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(agt $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(agt $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(agt $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(agt $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(agt $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dm::new));
      }
   }
}
