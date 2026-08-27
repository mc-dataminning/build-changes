import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record aj(int c, List<aiy> d, List<aiy> e, Optional<dp> f) {
   public static final Codec<aj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avp.a(Codec.INT, "experience", Integer.valueOf(0)).forGetter(aj::a),
               avp.a(aiy.a.listOf(), "loot", List.of()).forGetter(aj::b),
               avp.a(aiy.a.listOf(), "recipes", List.of()).forGetter(aj::c),
               avp.a(dp.a, "function").forGetter(aj::d)
            )
            .apply($$0, aj::new)
   );
   public static final aj b = new aj(0, List.of(), List.of(), Optional.empty());

   public void a(aow $$0) {
      $$0.d(this.c);
      ejb $$1 = new ejb.a($$0.z()).a(elg.a, $$0).a(elg.f, $$0.dk()).a(elf.k);
      boolean $$2 = false;

      for (aiy $$3 : this.d) {
         ObjectListIterator var6 = $$0.e.aJ().getLootTable($$3).a($$1).iterator();

         while (var6.hasNext()) {
            coz $$4 = (coz)var6.next();
            if ($$0.i($$4)) {
               $$0.dM().a(null, $$0.dr(), $$0.dt(), $$0.dx(), atk.nd, atl.h, 0.2F, (($$0.eh().i() - $$0.eh().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               cds $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.x();
                  $$5.b($$0.cw());
               }
            }
         }
      }

      if ($$2) {
         $$0.bW.d();
      }

      if (!this.e.isEmpty()) {
         $$0.a(this.e);
      }

      MinecraftServer $$6 = $$0.e;
      this.f.flatMap($$1x -> $$1x.a($$6.aC())).ifPresent($$2x -> $$6.aC().a($$2x, $$0.dd().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<aiy> b() {
      return this.d;
   }

   public List<aiy> c() {
      return this.e;
   }

   public Optional<dp> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<aiy> b = ImmutableList.builder();
      private final Builder<aiy> c = ImmutableList.builder();
      private Optional<aiy> d = Optional.empty();

      public static aj.a a(int $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static aj.a a(aiy $$0) {
         return new aj.a().b($$0);
      }

      public aj.a b(aiy $$0) {
         this.b.add($$0);
         return this;
      }

      public static aj.a c(aiy $$0) {
         return new aj.a().d($$0);
      }

      public aj.a d(aiy $$0) {
         this.c.add($$0);
         return this;
      }

      public static aj.a e(aiy $$0) {
         return new aj.a().f($$0);
      }

      public aj.a f(aiy $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public aj a() {
         return new aj(this.a, this.b.build(), this.c.build(), this.d.map(dp::new));
      }
   }
}
