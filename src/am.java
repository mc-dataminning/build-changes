import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record am(int c, List<akt<evw>> d, List<akt<dbe<?>>> e, Optional<es> f) {
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
      evu $$1 = new evu.a($$0.y()).a(eyl.a, $$0).a(eyl.f, $$0.du()).a(eyk.m);
      boolean $$2 = false;

      for (akt<evw> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cwp $$4 = (cwp)var6.next();
            if ($$0.i($$4)) {
               $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), awa.oa, awb.h, 0.2F, (($$0.dZ().i() - $$0.dZ().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               clb $$5 = $$0.a($$4, false);
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

   public List<akt<evw>> b() {
      return this.d;
   }

   public List<akt<dbe<?>>> c() {
      return this.e;
   }

   public Optional<es> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akt<evw>> b = ImmutableList.builder();
      private final Builder<akt<dbe<?>>> c = ImmutableList.builder();
      private Optional<aku> d = Optional.empty();

      public static am.a a(int $$0) {
         return new am.a().b($$0);
      }

      public am.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static am.a a(akt<evw> $$0) {
         return new am.a().b($$0);
      }

      public am.a b(akt<evw> $$0) {
         this.b.add($$0);
         return this;
      }

      public static am.a c(akt<dbe<?>> $$0) {
         return new am.a().d($$0);
      }

      public am.a d(akt<dbe<?>> $$0) {
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
