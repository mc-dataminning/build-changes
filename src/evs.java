import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class evs {
   private final evv a;
   private final azh b;
   private final js.a c;
   private final Set<evs.c<?>> d = Sets.newLinkedHashSet();

   evs(evv $$0, azh $$1, js.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bai<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bai<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bai<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(akv $$0, Consumer<cwq> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(evs.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(evs.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(evs.c<?> $$0) {
      this.d.remove($$0);
   }

   public js.a a() {
      return this.c;
   }

   public azh b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public ard d() {
      return this.a.a();
   }

   public static evs.c<evx> a(evx $$0) {
      return new evs.c<>(evu.c, $$0);
   }

   public static evs.c<ezb> a(ezb $$0) {
      return new evs.c<>(evu.a, $$0);
   }

   public static evs.c<exg> a(exg $$0) {
      return new evs.c<>(evu.b, $$0);
   }

   public static class a {
      private final evv a;
      @Nullable
      private azh b;

      public a(evv $$0) {
         this.a = $$0;
      }

      public evs.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azh.a($$0);
         }

         return this;
      }

      public evs.a a(azh $$0) {
         this.b = $$0;
         return this;
      }

      public ard a() {
         return this.a.a();
      }

      public evs a(Optional<akv> $$0) {
         ard $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azh $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new evs(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements azv {
      a("this", eym.a),
      b("attacker", eym.d),
      c("direct_attacker", eym.e),
      d("attacking_player", eym.b);

      public static final azv.a<evs.b> e = azv.a(evs.b::values);
      private final String f;
      private final bai<? extends bum> g;

      private b(final String $$0, final bai<? extends bum> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bai<? extends bum> a() {
         return this.g;
      }

      public static evs.b a(String $$0) {
         evs.b $$1 = e.a($$0);
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

   public static record c<T>(evu<T> a, T b) {
   }
}
