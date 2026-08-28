import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record ak(int c, List<akq<erw>> d, List<akr> e, Optional<eo> f) {
   public static final Codec<ak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(ak::a),
               akq.a(lu.bc).listOf().optionalFieldOf("loot", List.of()).forGetter(ak::b),
               akr.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(ak::c),
               eo.a.optionalFieldOf("function").forGetter(ak::d)
            )
            .apply($$0, ak::new)
   );
   public static final ak b = new ak(0, List.of(), List.of(), Optional.empty());

   public void a(aqv $$0) {
      $$0.d(this.c);
      eru $$1 = new eru.a($$0.A()).a(eun.a, $$0).a(eun.f, $$0.dm()).a(eum.m);
      boolean $$2 = false;

      for (akq<erw> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cuq $$4 = (cuq)var6.next();
            if ($$0.i($$4)) {
               $$0.dO().a(null, $$0.dt(), $$0.dv(), $$0.dz(), avp.nC, avq.h, 0.2F, (($$0.dR().i() - $$0.dR().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cjh $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cz());
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

      MinecraftServer $$6 = $$0.d;
      this.f.flatMap($$1x -> $$1x.a($$6.aF())).ifPresent($$2x -> $$6.aF().a($$2x, $$0.dg().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<akq<erw>> b() {
      return this.d;
   }

   public List<akr> c() {
      return this.e;
   }

   public Optional<eo> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akq<erw>> b = ImmutableList.builder();
      private final Builder<akr> c = ImmutableList.builder();
      private Optional<akr> d = Optional.empty();

      public static ak.a a(int $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ak.a a(akq<erw> $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(akq<erw> $$0) {
         this.b.add($$0);
         return this;
      }

      public static ak.a a(akr $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(akr $$0) {
         this.c.add($$0);
         return this;
      }

      public static ak.a c(akr $$0) {
         return new ak.a().d($$0);
      }

      public ak.a d(akr $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ak a() {
         return new ak(this.a, this.b.build(), this.c.build(), this.d.map(eo::new));
      }
   }
}
