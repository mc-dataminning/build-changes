import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record ak(int c, List<ald<etq>> d, List<ale> e, Optional<ep> f) {
   public static final Codec<ak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(ak::a),
               ald.a(lw.be).listOf().optionalFieldOf("loot", List.of()).forGetter(ak::b),
               ale.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(ak::c),
               ep.a.optionalFieldOf("function").forGetter(ak::d)
            )
            .apply($$0, ak::new)
   );
   public static final ak b = new ak(0, List.of(), List.of(), Optional.empty());

   public void a(ark $$0) {
      $$0.d(this.c);
      eto $$1 = new eto.a($$0.B()).a(ewh.a, $$0).a(ewh.f, $$0.dq()).a(ewg.m);
      boolean $$2 = false;

      for (ald<etq> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.bd().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cvs $$4 = (cvs)var6.next();
            if ($$0.j($$4)) {
               $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), awg.nD, awh.h, 0.2F, (($$0.dV().i() - $$0.dV().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               ckh $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cD());
               }
            }
         }
      }

      if ($$2) {
         $$0.bZ.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      MinecraftServer $$6 = $$0.d;
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.dk().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<ald<etq>> b() {
      return this.d;
   }

   public List<ale> c() {
      return this.e;
   }

   public Optional<ep> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<ald<etq>> b = ImmutableList.builder();
      private final Builder<ale> c = ImmutableList.builder();
      private Optional<ale> d = Optional.empty();

      public static ak.a a(int $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ak.a a(ald<etq> $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(ald<etq> $$0) {
         this.b.add($$0);
         return this;
      }

      public static ak.a a(ale $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(ale $$0) {
         this.c.add($$0);
         return this;
      }

      public static ak.a c(ale $$0) {
         return new ak.a().d($$0);
      }

      public ak.a d(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ak a() {
         return new ak(this.a, this.b.build(), this.c.build(), this.d.map(ep::new));
      }
   }
}
