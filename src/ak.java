import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record ak(int c, List<akp<erq>> d, List<akq> e, Optional<eo> f) {
   public static final Codec<ak> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(ak::a),
               akp.a(lu.bc).listOf().optionalFieldOf("loot", List.of()).forGetter(ak::b),
               akq.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(ak::c),
               eo.a.optionalFieldOf("function").forGetter(ak::d)
            )
            .apply($$0, ak::new)
   );
   public static final ak b = new ak(0, List.of(), List.of(), Optional.empty());

   public void a(aqu $$0) {
      $$0.d(this.c);
      ero $$1 = new ero.a($$0.A()).a(euh.a, $$0).a(euh.f, $$0.do()).a(eug.m);
      boolean $$2 = false;

      for (akp<erq> $$3 : this.d) {
         ObjectListIterator var6 = $$0.d.be().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cuo $$4 = (cuo)var6.next();
            if ($$0.i($$4)) {
               $$0.dQ().a(null, $$0.dv(), $$0.dx(), $$0.dB(), avo.nC, avp.h, 0.2F, (($$0.dT().i() - $$0.dT().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cjf $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.w();
                  $$5.b($$0.cA());
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
      this.f.flatMap($$1x -> $$1x.a($$6.aF())).ifPresent($$2x -> $$6.aF().a($$2x, $$0.dh().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<akp<erq>> b() {
      return this.d;
   }

   public List<akq> c() {
      return this.e;
   }

   public Optional<eo> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<akp<erq>> b = ImmutableList.builder();
      private final Builder<akq> c = ImmutableList.builder();
      private Optional<akq> d = Optional.empty();

      public static ak.a a(int $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static ak.a a(akp<erq> $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(akp<erq> $$0) {
         this.b.add($$0);
         return this;
      }

      public static ak.a a(akq $$0) {
         return new ak.a().b($$0);
      }

      public ak.a b(akq $$0) {
         this.c.add($$0);
         return this;
      }

      public static ak.a c(akq $$0) {
         return new ak.a().d($$0);
      }

      public ak.a d(akq $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ak a() {
         return new ak(this.a, this.b.build(), this.c.build(), this.d.map(eo::new));
      }
   }
}
