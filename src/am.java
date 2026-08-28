import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record am(int c, List<akt<evu>> d, List<akt<dbc<?>>> e, Optional<es> f) {
   public static final Codec<am> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(am::a),
               akt.a(mc.bg).listOf().optionalFieldOf("loot", List.of()).forGetter(am::b),
               akt.a(mc.bk).listOf().optionalFieldOf("recipes", List.of()).forGetter(am::c),
               es.a.optionalFieldOf("function").forGetter(am::d)
            )
            .apply($$0, am::new)
   );
   public static final am b = new am(0, List.of(), List.of(), Optional.empty());

   public void a(ard $$0) {
      $$0.d(this.c);
      evs $$1 = new evs.a($$0.y()).a(eyj.a, $$0).a(eyj.f, $$0.du()).a(eyi.m);
      boolean $$2 = false;

      for (akt<evu> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cwn $$4 = (cwn)var6.next();
            if ($$0.i($$4)) {
               $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), avz.oa, awa.h, 0.2F, (($$0.dZ().i() - $$0.dZ().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cla $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cG());
               }
            }
         }
      }

      if ($$2) {
         $$0.cd.d();
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

   public List<akt<evu>> b() {
      return this.d;
   }

   public List<akt<dbc<?>>> c() {
      return this.e;
   }

   public Optional<es> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akt<evu>> b = ImmutableList.builder();
      private final Builder<akt<dbc<?>>> c = ImmutableList.builder();
      private Optional<aku> d = Optional.empty();

      public static am.a a(int $$0) {
         return new am.a().b($$0);
      }

      public am.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static am.a a(akt<evu> $$0) {
         return new am.a().b($$0);
      }

      public am.a b(akt<evu> $$0) {
         this.b.add($$0);
         return this;
      }

      public static am.a c(akt<dbc<?>> $$0) {
         return new am.a().d($$0);
      }

      public am.a d(akt<dbc<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static am.a a(aku $$0) {
         return new am.a().b($$0);
      }

      public am.a b(aku $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public am a() {
         return new am(this.a, this.b.build(), this.c.build(), this.d.map(es::new));
      }
   }
}
