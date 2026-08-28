import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record al(int c, List<alo<ewn>> d, List<alo<dbv<?>>> e, Optional<er> f) {
   public static final Codec<al> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(al::a),
               alo.a(mb.bg).listOf().optionalFieldOf("loot", List.of()).forGetter(al::b),
               alo.a(mb.bk).listOf().optionalFieldOf("recipes", List.of()).forGetter(al::c),
               er.a.optionalFieldOf("function").forGetter(al::d)
            )
            .apply($$0, al::new)
   );
   public static final al b = new al(0, List.of(), List.of(), Optional.empty());

   public void a(ary $$0) {
      $$0.d(this.c);
      ewl $$1 = new ewl.a($$0.y()).a(ezc.a, $$0).a(ezc.f, $$0.du()).a(ezb.m);
      boolean $$2 = false;

      for (alo<ewn> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cxg $$4 = (cxg)var6.next();
            if ($$0.i($$4)) {
               $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), awv.oa, aww.h, 0.2F, (($$0.dZ().i() - $$0.dZ().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cls $$5 = $$0.a($$4, false);
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

   public List<alo<ewn>> b() {
      return this.d;
   }

   public List<alo<dbv<?>>> c() {
      return this.e;
   }

   public Optional<er> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alo<ewn>> b = ImmutableList.builder();
      private final Builder<alo<dbv<?>>> c = ImmutableList.builder();
      private Optional<alp> d = Optional.empty();

      public static al.a a(int $$0) {
         return new al.a().b($$0);
      }

      public al.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static al.a a(alo<ewn> $$0) {
         return new al.a().b($$0);
      }

      public al.a b(alo<ewn> $$0) {
         this.b.add($$0);
         return this;
      }

      public static al.a c(alo<dbv<?>> $$0) {
         return new al.a().d($$0);
      }

      public al.a d(alo<dbv<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static al.a a(alp $$0) {
         return new al.a().b($$0);
      }

      public al.a b(alp $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public al a() {
         return new al(this.a, this.b.build(), this.c.build(), this.d.map(er::new));
      }
   }
}
