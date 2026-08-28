import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;

public record al(int c, List<alh<euh>> d, List<ali> e, Optional<er> f) {
   public static final Codec<al> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("experience", 0).forGetter(al::a),
               alh.a(lz.bd).listOf().optionalFieldOf("loot", List.of()).forGetter(al::b),
               ali.a.listOf().optionalFieldOf("recipes", List.of()).forGetter(al::c),
               er.a.optionalFieldOf("function").forGetter(al::d)
            )
            .apply($$0, al::new)
   );
   public static final al b = new al(0, List.of(), List.of(), Optional.empty());

   public void a(aro $$0) {
      $$0.d(this.c);
      euf $$1 = new euf.a($$0.B()).a(ewy.a, $$0).a(ewy.f, $$0.dv()).a(ewx.m);
      boolean $$2 = false;

      for (alh<euh> $$3 : this.d) {
         ObjectListIterator var6 = $$0.h.bc().b($$3).a($$1).iterator();

         while (var6.hasNext()) {
            cwb $$4 = (cwb)var6.next();
            if ($$0.i($$4)) {
               $$0.dX().a(null, $$0.dC(), $$0.dE(), $$0.dI(), awl.nB, awm.h, 0.2F, (($$0.ea().i() - $$0.ea().i()) * 0.7F + 1.0F) * 2.0F);
               $$2 = true;
            } else {
               ckv $$5 = $$0.a($$4, false);
               if ($$5 != null) {
                  $$5.t();
                  $$5.b($$0.cH());
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
      this.f.flatMap($$1x -> $$1x.a($$6.aE())).ifPresent($$2x -> $$6.aE().a($$2x, $$0.dp().a().a(2)));
   }

   public int a() {
      return this.c;
   }

   public List<alh<euh>> b() {
      return this.d;
   }

   public List<ali> c() {
      return this.e;
   }

   public Optional<er> d() {
      return this.f;
   }

   public static class a {
      private int a;
      private final Builder<alh<euh>> b = ImmutableList.builder();
      private final Builder<ali> c = ImmutableList.builder();
      private Optional<ali> d = Optional.empty();

      public static al.a a(int $$0) {
         return new al.a().b($$0);
      }

      public al.a b(int $$0) {
         this.a += $$0;
         return this;
      }

      public static al.a a(alh<euh> $$0) {
         return new al.a().b($$0);
      }

      public al.a b(alh<euh> $$0) {
         this.b.add($$0);
         return this;
      }

      public static al.a a(ali $$0) {
         return new al.a().b($$0);
      }

      public al.a b(ali $$0) {
         this.c.add($$0);
         return this;
      }

      public static al.a c(ali $$0) {
         return new al.a().d($$0);
      }

      public al.a d(ali $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public al a() {
         return new al(this.a, this.b.build(), this.c.build(), this.d.map(er::new));
      }
   }
}
