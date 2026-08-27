import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record ak(int c, List<aks<eru>> d, List<akt> e, Optional<ec> f) {
   public static final Codec<ak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axu.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(ak::a),
               axu.a(aks.a(li.aU).listOf(), "loot", List.of()).forGetter(ak::b),
               axu.a(akt.a.listOf(), "recipes", List.of()).forGetter(ak::c),
               axu.a(ec.a, "function").forGetter(ak::d)
            )
            .apply($$0, ak::new)
   );
   public static final ak b = new ak(0, List.of(), List.of(), Optional.empty());

   public void a(aqu $$0) {
      $$0.d(this.c);
      ers $$1 = new ers.a($$0.B()).a(eug.a, $$0).a(eug.f, $$0.ds()).a(euf.l);
      boolean $$2 = false;

      for (aks<eru> $$3 : this.d) {
         ObjectListIterator var6 = $$0.e.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cuh $$4 = (cuh)var6.next();
            if ($$0.i($$4)) {
               $$0.dU().a(null, $$0.dz(), $$0.dB(), $$0.dF(), avo.nS, avq.h, 0.2F, (($$0.et().i() - $$0.et().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cig $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cE());
               }
            }
         }
      }

      if ($$2) {
         $$0.cq.d();
      }

      if (!this.e.isEmpty()) {
         $$0.b(this.e);
      }

      MinecraftServer $$6 = $$0.e;
      this.f.flatMap($$1x -> $$1x.a($$6.aF())).ifPresent($$2x -> $$6.aF().a($$2x, $$0.dl().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<aks<eru>> b() {
      return this.d;
   }

   public List<akt> c() {
      return this.e;
   }

   public Optional<ec> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<aks<eru>> b = ImmutableList.builder();
      private final Builder<akt> c = ImmutableList.builder();
      private Optional<akt> d = Optional.empty();

      public static ak.a a(int $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ak.a a(aks<eru> $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(aks<eru> $$0) {
         this.b.add($$0);
         return this;
      }

      public static ak.a a(akt $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(akt $$0) {
         this.c.add($$0);
         return this;
      }

      public static ak.a c(akt $$0) {
         return new ak.a().d($$0);
      }

      public ak.a d(akt $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ak a() {
         return new ak(this.a, this.b.build(), this.c.build(), this.d.map(ec::new));
      }
   }
}
