import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record am(int c, List<ald<eys>> d, List<ald<ddj<?>>> e, Optional<ed> f) {
   public static final Codec<am> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(am::a),
               ald.a(mg.bo).listOf().optionalFieldOf("loot", List.of()).forGetter(am::b),
               ald.a(mg.bs).listOf().optionalFieldOf("recipes", List.of()).forGetter(am::c),
               ed.a.optionalFieldOf("function").forGetter(am::d)
            )
            .apply($$0, am::new)
   );
   public static final am b = new am(0, List.of(), List.of(), Optional.empty());

   public void a(arp $$0) {
      $$0.d(this.c);
      eyq $$1 = new eyq.a($$0.y()).a(fbh.a, $$0).a(fbh.f, $$0.dt()).a(fbg.m);
      boolean $$2 = false;

      for (ald<eys> $$3 : this.d) {
         ObjectListIterator var6 = $$0.g.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cys $$4 = (cys)var6.next();
            if ($$0.i($$4)) {
               $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), awl.of, awm.h, 0.2F, (($$0.dY().i() - $$0.dY().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cmx $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.m();
                  $$5.b($$0.cG());
               }
            }
         }
      }

      if ($$2) {
         $$0.bQ.d();
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

   public List<ald<eys>> b() {
      return this.d;
   }

   public List<ald<ddj<?>>> c() {
      return this.e;
   }

   public Optional<ed> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ald<eys>> b = ImmutableList.builder();
      private final Builder<ald<ddj<?>>> c = ImmutableList.builder();
      private Optional<ale> d = Optional.empty();

      public static am.a a(int $$0) {
         return new am.a().b($$0);
      }

      public am.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static am.a a(ald<eys> $$0) {
         return new am.a().b($$0);
      }

      public am.a b(ald<eys> $$0) {
         this.b.add($$0);
         return this;
      }

      public static am.a c(ald<ddj<?>> $$0) {
         return new am.a().d($$0);
      }

      public am.a d(ald<ddj<?>> $$0) {
         this.c.add($$0);
         return this;
      }

      public static am.a a(ale $$0) {
         return new am.a().b($$0);
      }

      public am.a b(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public am a() {
         return new am(this.a, this.b.build(), this.c.build(), this.d.map(ed::new));
      }
   }
}
