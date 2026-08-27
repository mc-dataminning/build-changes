import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<akf> d, List<akf> e, Optional<dx> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axe.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(aj::a),
               axe.a(akf.a.listOf(), "loot", List.of()).forGetter(aj::b),
               axe.a(akf.a.listOf(), "recipes", List.of()).forGetter(aj::c),
               axe.a(dx.a, "function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(aqf $$0) {
      $$0.d(this.c);
      eog $$1 = new eog.a($$0.z()).a(eqt.a, $$0).a(eqt.f, $$0.dl()).a(eqs.l);
      boolean $$2 = false;

      for (akf $$3 : this.d) {
         ObjectListIterator var6 = $$0.e.aM().getLootTable($$3).a($$1).iterator();

         while (var6.hasNext()) {
            csd $$4 = (csd)var6.next();
            if ($$0.i($$4)) {
               $$0.dN().a(null, $$0.ds(), $$0.du(), $$0.dy(), auz.ns, ava.h, 0.2F, (($$0.ej().i() - $$0.ej().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cgv $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cx());
               }
            }
         }
      }

      if ($$2) {
         $$0.cc.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      MinecraftServer $$6 = $$0.e;
      this.f.flatMap($$1x -> $$1x.a($$6.aF())).ifPresent($$2x -> $$6.aF().a($$2x, $$0.de().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<akf> b() {
      return this.d;
   }

   public List<akf> c() {
      return this.e;
   }

   public Optional<dx> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akf> b = ImmutableList.builder();
      private final Builder<akf> c = ImmutableList.builder();
      private Optional<akf> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(akf $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(akf $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(akf $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(akf $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(akf $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(akf $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dx::new));
      }
   }
}
