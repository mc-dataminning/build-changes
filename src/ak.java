import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record ak(int c, List<alb<etm>> d, List<alc> e, Optional<eo> f) {
   public static final Codec<ak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(ak::a),
               alb.a(lv.bd).listOf().optionalFieldOf("loot", List.of()).forGetter(ak::b),
               alc.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(ak::c),
               eo.a.optionalFieldOf("function").forGetter(ak::d)
            )
            .apply($$0, ak::new)
   );
   public static final ak b = new ak(0, List.of(), List.of(), Optional.empty());

   public void a(ari $$0) {
      $$0.d(this.c);
      etk $$1 = new etk.a($$0.B()).a(ewd.a, $$0).a(ewd.f, $$0.dq()).a(ewc.m);
      boolean $$2 = false;

      for (alb<etm> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.bd().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cvp $$4 = (cvp)var6.next();
            if ($$0.j($$4)) {
               $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), awe.nD, awf.h, 0.2F, (($$0.dV().i() - $$0.dV().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cke $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cD());
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

      MinecraftServer $$6 = $$0.d;
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.dk().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<alb<etm>> b() {
      return this.d;
   }

   public List<alc> c() {
      return this.e;
   }

   public Optional<eo> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alb<etm>> b = ImmutableList.builder();
      private final Builder<alc> c = ImmutableList.builder();
      private Optional<alc> d = Optional.empty();

      public static ak.a a(int $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ak.a a(alb<etm> $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(alb<etm> $$0) {
         this.b.add($$0);
         return this;
      }

      public static ak.a a(alc $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(alc $$0) {
         this.c.add($$0);
         return this;
      }

      public static ak.a c(alc $$0) {
         return new ak.a().d($$0);
      }

      public ak.a d(alc $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ak a() {
         return new ak(this.a, this.b.build(), this.c.build(), this.d.map(eo::new));
      }
   }
}
