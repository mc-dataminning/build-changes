import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<ahh> d, List<ahh> e, Optional<dm> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(aj::a),
               atx.a(ahh.a.listOf(), "loot", List.of()).forGetter(aj::b),
               atx.a(ahh.a.listOf(), "recipes", List.of()).forGetter(aj::c),
               atx.a(dm.a, "function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(anf $$0) {
      $$0.d(this.c);
      ehl $$1 = new ehl.a($$0.z()).a(ejq.a, $$0).a(ejq.f, $$0.dj()).a(ejp.k);
      boolean $$2 = false;

      for (ahh $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.aJ().getLootTable($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cng $$4 = (cng)var6.next();
            if ($$0.i($$4)) {
               $$0.dL().a(null, $$0.dq(), $$0.ds(), $$0.dw(), art.nd, aru.h, 0.2F, (($$0.eg().i() - $$0.eg().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               ccb $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.x();
                  $$5.b($$0.cw());
               }
            }
         }
      }

      if ($$2) {
         $$0.bW.d();
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

   public List<ahh> b() {
      return this.d;
   }

   public List<ahh> c() {
      return this.e;
   }

   public Optional<dm> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ahh> b = ImmutableList.builder();
      private final Builder<ahh> c = ImmutableList.builder();
      private Optional<ahh> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(ahh $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(ahh $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(ahh $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(ahh $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(ahh $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(ahh $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dm::new));
      }
   }
}
