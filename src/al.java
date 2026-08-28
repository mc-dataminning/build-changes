import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record al(int c, List<aly<ewt>> d, List<aly<dcd<?>>> e, Optional<er> f) {
   public static final Codec<al> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(al::a),
               aly.a(mb.bg).listOf().optionalFieldOf("loot", List.of()).forGetter(al::b),
               aly.a(mb.bk).listOf().optionalFieldOf("recipes", List.of()).forGetter(al::c),
               er.a.optionalFieldOf("function").forGetter(al::d)
            )
            .apply($$0, al::new)
   );
   public static final al b = new al(0, List.of(), List.of(), Optional.empty());

   public void a(asi $$0) {
      $$0.d(this.c);
      ewr $$1 = new ewr.a($$0.y()).a(ezi.a, $$0).a(ezi.f, $$0.du()).a(ezh.m);
      boolean $$2 = false;

      for (aly<ewt> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cxo $$4 = (cxo)var6.next();
            if ($$0.i($$4)) {
               $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), axf.nU, axg.h, 0.2F, (($$0.dZ().i() - $$0.dZ().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cma $$5 = $$0.a($$4, false);
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

   public List<aly<ewt>> b() {
      return this.d;
   }

   public List<aly<dcd<?>>> c() {
      return this.e;
   }

   public Optional<er> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<aly<ewt>> b = ImmutableList.builder();
      private final Builder<aly<dcd<?>>> c = ImmutableList.builder();
      private Optional<alz> d = Optional.empty();

      public static al.a a(int $$0) {
         return new al.a().b($$0);
      }

      public al.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static al.a a(aly<ewt> $$0) {
         return new al.a().b($$0);
      }

      public al.a b(aly<ewt> $$0) {
         this.b.add($$0);
         return this;
      }

      public static al.a c(aly<dcd<?>> $$0) {
         return new al.a().d($$0);
      }

      public al.a d(aly<dcd<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static al.a a(alz $$0) {
         return new al.a().b($$0);
      }

      public al.a b(alz $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public al a() {
         return new al(this.a, this.b.build(), this.c.build(), this.d.map(er::new));
      }
   }
}
