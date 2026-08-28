import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<ala<eqi>> d, List<alb> e, Optional<ek> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(aj::a),
               ala.a(lq.aU).listOf().optionalFieldOf("loot", List.of()).forGetter(aj::b),
               alb.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(aj::c),
               ek.a.optionalFieldOf("function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(arc $$0) {
      $$0.d(this.c);
      eqg $$1 = new eqg.a($$0.z()).a(esz.a, $$0).a(esz.f, $$0.dn()).a(esy.m);
      boolean $$2 = false;

      for (ala<eqi> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cuk $$4 = (cuk)var6.next();
            if ($$0.i($$4)) {
               $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), avw.nC, avx.h, 0.2F, (($$0.el().i() - $$0.el().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cjc $$5 = $$0.a($$4, false);
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

   public List<ala<eqi>> b() {
      return this.d;
   }

   public List<alb> c() {
      return this.e;
   }

   public Optional<ek> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ala<eqi>> b = ImmutableList.builder();
      private final Builder<alb> c = ImmutableList.builder();
      private Optional<alb> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(ala<eqi> $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(ala<eqi> $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a a(alb $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(alb $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a c(alb $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(alb $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(ek::new));
      }
   }
}
