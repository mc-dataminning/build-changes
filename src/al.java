import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record al(int c, List<alk<eul>> d, List<all> e, Optional<er> f) {
   public static final Codec<al> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(al::a),
               alk.a(ma.bd).listOf().optionalFieldOf("loot", List.of()).forGetter(al::b),
               all.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(al::c),
               er.a.optionalFieldOf("function").forGetter(al::d)
            )
            .apply($$0, al::new)
   );
   public static final al b = new al(0, List.of(), List.of(), Optional.empty());

   public void a(arr $$0) {
      $$0.d(this.c);
      euj $$1 = new euj.a($$0.B()).a(exc.a, $$0).a(exc.f, $$0.dw()).a(exb.m);
      boolean $$2 = false;

      for (alk<eul> $$3 : this.d) {
         ObjectListIterator var6 = $$0.h.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cwf $$4 = (cwf)var6.next();
            if ($$0.i($$4)) {
               $$0.dY().a(null, $$0.dD(), $$0.dF(), $$0.dJ(), awo.nB, awp.h, 0.2F, (($$0.eb().i() - $$0.eb().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               ckz $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cI());
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

      MinecraftServer $$6 = $$0.h;
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.dq().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<alk<eul>> b() {
      return this.d;
   }

   public List<all> c() {
      return this.e;
   }

   public Optional<er> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alk<eul>> b = ImmutableList.builder();
      private final Builder<all> c = ImmutableList.builder();
      private Optional<all> d = Optional.empty();

      public static al.a a(int $$0) {
         return new al.a().b($$0);
      }

      public al.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static al.a a(alk<eul> $$0) {
         return new al.a().b($$0);
      }

      public al.a b(alk<eul> $$0) {
         this.b.add($$0);
         return this;
      }

      public static al.a a(all $$0) {
         return new al.a().b($$0);
      }

      public al.a b(all $$0) {
         this.c.add($$0);
         return this;
      }

      public static al.a c(all $$0) {
         return new al.a().d($$0);
      }

      public al.a d(all $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public al a() {
         return new al(this.a, this.b.build(), this.c.build(), this.d.map(er::new));
      }
   }
}
