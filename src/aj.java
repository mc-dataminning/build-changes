import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<ajh> d, List<ajh> e, Optional<dp> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awe.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(aj::a),
               awe.a(ajh.a.listOf(), "loot", List.of()).forGetter(aj::b),
               awe.a(ajh.a.listOf(), "recipes", List.of()).forGetter(aj::c),
               awe.a(dp.a, "function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(apg $$0) {
      $$0.d(this.c);
      elc $$1 = new elc.a($$0.z()).a(enh.a, $$0).a(enh.f, $$0.dk()).a(eng.l);
      boolean $$2 = false;

      for (ajh $$3 : this.d) {
         ObjectListIterator var6 = $$0.e.aM().getLootTable($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cqm $$4 = (cqm)var6.next();
            if ($$0.i($$4)) {
               $$0.dM().a(null, $$0.dr(), $$0.dt(), $$0.dx(), aty.nl, atz.h, 0.2F, (($$0.ei().i() - $$0.ei().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cfe $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cw());
               }
            }
         }
      }

      if ($$2) {
         $$0.bZ.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      MinecraftServer $$6 = $$0.e;
      this.f.flatMap($$1x -> $$1x.a($$6.aF())).ifPresent($$2x -> $$6.aF().a($$2x, $$0.dd().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<ajh> b() {
      return this.d;
   }

   public List<ajh> c() {
      return this.e;
   }

   public Optional<dp> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ajh> b = ImmutableList.builder();
      private final Builder<ajh> c = ImmutableList.builder();
      private Optional<ajh> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(ajh $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(ajh $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(ajh $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(ajh $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(ajh $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(ajh $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dp::new));
      }
   }
}
