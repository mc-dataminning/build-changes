import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<ale<eqp>> d, List<alf> e, Optional<ek> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(aj::a),
               ale.a(lq.aU).listOf().optionalFieldOf("loot", List.of()).forGetter(aj::b),
               alf.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(aj::c),
               ek.a.optionalFieldOf("function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(arg $$0) {
      $$0.d(this.c);
      eqn $$1 = new eqn.a($$0.z()).a(etg.a, $$0).a(etg.f, $$0.dn()).a(etf.m);
      boolean $$2 = false;

      for (ale<eqp> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cur $$4 = (cur)var6.next();
            if ($$0.i($$4)) {
               $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), awa.nC, awb.h, 0.2F, (($$0.el().i() - $$0.el().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cjj $$5 = $$0.a($$4, false);
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

   public List<ale<eqp>> b() {
      return this.d;
   }

   public List<alf> c() {
      return this.e;
   }

   public Optional<ek> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ale<eqp>> b = ImmutableList.builder();
      private final Builder<alf> c = ImmutableList.builder();
      private Optional<alf> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(ale<eqp> $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(ale<eqp> $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a a(alf $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(alf $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a c(alf $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(alf $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(ek::new));
      }
   }
}
