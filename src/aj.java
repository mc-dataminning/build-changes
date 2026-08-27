import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<ajt> d, List<ajt> e, Optional<dp> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aws.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(aj::a),
               aws.a(ajt.a.listOf(), "loot", List.of()).forGetter(aj::b),
               aws.a(ajt.a.listOf(), "recipes", List.of()).forGetter(aj::c),
               aws.a(dp.a, "function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(apt $$0) {
      $$0.d(this.c);
      enh $$1 = new enh.a($$0.z()).a(epo.a, $$0).a(epo.f, $$0.dk()).a(epn.l);
      boolean $$2 = false;

      for (ajt $$3 : this.d) {
         ObjectListIterator var6 = $$0.e.aM().getLootTable($$3).a($$1).iterator();

         while (var6.hasNext()) {
            crj $$4 = (crj)var6.next();
            if ($$0.i($$4)) {
               $$0.dM().a(null, $$0.dr(), $$0.dt(), $$0.dx(), aum.nn, aun.h, 0.2F, (($$0.ei().i() - $$0.ei().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cgd $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cw());
               }
            }
         }
      }

      if ($$2) {
         $$0.bY.d();
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

   public List<ajt> b() {
      return this.d;
   }

   public List<ajt> c() {
      return this.e;
   }

   public Optional<dp> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ajt> b = ImmutableList.builder();
      private final Builder<ajt> c = ImmutableList.builder();
      private Optional<ajt> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(ajt $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(ajt $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(ajt $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(ajt $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(ajt $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(ajt $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dp::new));
      }
   }
}
