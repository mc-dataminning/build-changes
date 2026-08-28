import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record ak(int c, List<alg<eub>> d, List<alh> e, Optional<eq> f) {
   public static final Codec<ak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(ak::a),
               alg.a(ly.bd).listOf().optionalFieldOf("loot", List.of()).forGetter(ak::b),
               alh.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(ak::c),
               eq.a.optionalFieldOf("function").forGetter(ak::d)
            )
            .apply($$0, ak::new)
   );
   public static final ak b = new ak(0, List.of(), List.of(), Optional.empty());

   public void a(arn $$0) {
      $$0.d(this.c);
      etz $$1 = new etz.a($$0.B()).a(ews.a, $$0).a(ews.f, $$0.dv()).a(ewr.m);
      boolean $$2 = false;

      for (alg<eub> $$3 : this.d) {
         ObjectListIterator var6 = $$0.e.bd().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cvx $$4 = (cvx)var6.next();
            if ($$0.i($$4)) {
               $$0.dX().a(null, $$0.dC(), $$0.dE(), $$0.dI(), awk.nB, awl.h, 0.2F, (($$0.ea().i() - $$0.ea().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               ckq $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cH());
               }
            }
         }
      }

      if ($$2) {
         $$0.ca.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      MinecraftServer $$6 = $$0.e;
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.dp().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<alg<eub>> b() {
      return this.d;
   }

   public List<alh> c() {
      return this.e;
   }

   public Optional<eq> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alg<eub>> b = ImmutableList.builder();
      private final Builder<alh> c = ImmutableList.builder();
      private Optional<alh> d = Optional.empty();

      public static ak.a a(int $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ak.a a(alg<eub> $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(alg<eub> $$0) {
         this.b.add($$0);
         return this;
      }

      public static ak.a a(alh $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(alh $$0) {
         this.c.add($$0);
         return this;
      }

      public static ak.a c(alh $$0) {
         return new ak.a().d($$0);
      }

      public ak.a d(alh $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ak a() {
         return new ak(this.a, this.b.build(), this.c.build(), this.d.map(eq::new));
      }
   }
}
