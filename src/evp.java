import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class evp {
   private final evs a;
   private final azg b;
   private final js.a c;
   private final Set<evp.c<?>> d = Sets.newLinkedHashSet();

   evp(evs $$0, azg $$1, js.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bah<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bah<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bah<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(aku $$0, Consumer<cwn> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(evp.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(evp.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(evp.c<?> $$0) {
      this.d.remove($$0);
   }

   public js.a a() {
      return this.c;
   }

   public azg b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public arc d() {
      return this.a.a();
   }

   public static evp.c<evu> a(evu $$0) {
      return new evp.c<>(evr.c, $$0);
   }

   public static evp.c<eyy> a(eyy $$0) {
      return new evp.c<>(evr.a, $$0);
   }

   public static evp.c<exd> a(exd $$0) {
      return new evp.c<>(evr.b, $$0);
   }

   public static class a {
      private final evs a;
      @Nullable
      private azg b;

      public a(evs $$0) {
         this.a = $$0;
      }

      public evp.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azg.a($$0);
         }

         return this;
      }

      public evp.a a(azg $$0) {
         this.b = $$0;
         return this;
      }

      public arc a() {
         return this.a.a();
      }

      public evp a(Optional<aku> $$0) {
         arc $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azg $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new evp(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements azu {
      a("this", eyj.a),
      b("attacker", eyj.d),
      c("direct_attacker", eyj.e),
      d("attacking_player", eyj.b);

      public static final azu.a<evp.b> e = azu.a(evp.b::values);
      private final String f;
      private final bah<? extends buj> g;

      private b(final String $$0, final bah<? extends buj> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bah<? extends buj> a() {
         return this.g;
      }

      public static evp.b a(String $$0) {
         evp.b $$1 = e.a($$0);
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

   public static record c<T>(evr<T> a, T b) {
   }
}
