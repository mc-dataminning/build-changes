import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<akj<eqt>> d, List<akk> e, Optional<el> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(aj::a),
               akj.a(lr.bb).listOf().optionalFieldOf("loot", List.of()).forGetter(aj::b),
               akk.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(aj::c),
               el.a.optionalFieldOf("function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(aql $$0) {
      $$0.d(this.c);
      eqr $$1 = new eqr.a($$0.z()).a(etk.a, $$0).a(etk.f, $$0.dn()).a(etj.m);
      boolean $$2 = false;

      for (akj<eqt> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cua $$4 = (cua)var6.next();
            if ($$0.i($$4)) {
               $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), avf.nC, avg.h, 0.2F, (($$0.dS().i() - $$0.dS().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cir $$5 = $$0.a($$4, false);
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

   public List<akj<eqt>> b() {
      return this.d;
   }

   public List<akk> c() {
      return this.e;
   }

   public Optional<el> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akj<eqt>> b = ImmutableList.builder();
      private final Builder<akk> c = ImmutableList.builder();
      private Optional<akk> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(akj<eqt> $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(akj<eqt> $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a a(akk $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(akk $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a c(akk $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(akk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(el::new));
      }
   }
}
