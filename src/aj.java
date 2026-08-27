import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<akm<epm>> d, List<akn> e, Optional<dz> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(aj::a),
               akm.a(lf.aU).listOf().optionalFieldOf("loot", List.of()).forGetter(aj::b),
               akn.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(aj::c),
               dz.a.optionalFieldOf("function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(aqo $$0) {
      $$0.d(this.c);
      epk $$1 = new epk.a($$0.z()).a(erz.a, $$0).a(erz.f, $$0.dn()).a(ery.m);
      boolean $$2 = false;

      for (akm<epm> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            ctq $$4 = (ctq)var6.next();
            if ($$0.i($$4)) {
               $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), avi.nC, avj.h, 0.2F, (($$0.el().i() - $$0.el().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cii $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cz());
               }
            }
         }
      }

      if ($$2) {
         $$0.cb.d();
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

   public List<akm<epm>> b() {
      return this.d;
   }

   public List<akn> c() {
      return this.e;
   }

   public Optional<dz> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akm<epm>> b = ImmutableList.builder();
      private final Builder<akn> c = ImmutableList.builder();
      private Optional<akn> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(akm<epm> $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(akm<epm> $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a a(akn $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(akn $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a c(akn $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(akn $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dz::new));
      }
   }
}
