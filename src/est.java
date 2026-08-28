import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class est {
   private final esw a;
   private final azk b;
   private final jo.a c;
   private final Set<est.c<?>> d = Sets.newLinkedHashSet();

   est(esw $$0, azk $$1, jo.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(evm<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(evm<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alb $$0, Consumer<cvl> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(evm<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(est.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(est.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(est.c<?> $$0) {
      this.d.remove($$0);
   }

   public jo.a a() {
      return this.c;
   }

   public azk b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arg d() {
      return this.a.a();
   }

   public static est.c<esy> a(esy $$0) {
      return new est.c<>(esv.c, $$0);
   }

   public static est.c<ewe> a(ewe $$0) {
      return new est.c<>(esv.a, $$0);
   }

   public static est.c<euh> a(euh $$0) {
      return new est.c<>(esv.b, $$0);
   }

   public static class a {
      private final esw a;
      @Nullable
      private azk b;

      public a(esw $$0) {
         this.a = $$0;
      }

      public est.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azk.a($$0);
         }

         return this;
      }

      public est.a a(azk $$0) {
         this.b = $$0;
         return this;
      }

      public arg a() {
         return this.a.a();
      }

      public est a(Optional<alb> $$0) {
         arg $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azk $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new est(this.a, $$3, $$2.bd().a());
      }
   }

   public static enum b implements azy {
      a("this", evp.a),
      b("attacker", evp.d),
      c("direct_attacker", evp.e),
      d("attacking_player", evp.b);

      public static final azy.a<est.b> e = azy.a(est.b::values);
      private final String f;
      private final evm<? extends btj> g;

      private b(final String $$0, final evm<? extends btj> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public evm<? extends btj> a() {
         return this.g;
      }

      public static est.b a(String $$0) {
         est.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public static record c<T>(esv<T> a, T b) {
   }
}
