import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eck {
   private final ecq a;
   private final ash b;
   private final eco c;
   private final Set<eck.c<?>> d = Sets.newLinkedHashSet();

   eck(ecq $$0, ash $$1, eco $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ees<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ees<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aez $$0, Consumer<cjl> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ees<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eck.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eck.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eck.c<?> $$0) {
      this.d.remove($$0);
   }

   public eco a() {
      return this.c;
   }

   public ash b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public akt d() {
      return this.a.a();
   }

   public static eck.c<ecs> a(ecs $$0) {
      return new eck.c<>(ecp.c, $$0);
   }

   public static eck.c<efj> a(efj $$0) {
      return new eck.c<>(ecp.a, $$0);
   }

   public static eck.c<edx> a(edx $$0) {
      return new eck.c<>(ecp.b, $$0);
   }

   public static class a {
      private final ecq a;
      @Nullable
      private ash b;

      public a(ecq $$0) {
         this.a = $$0;
      }

      public eck.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ash.a($$0);
         }

         return this;
      }

      public akt a() {
         return this.a.a();
      }

      public eck a(Optional<aez> $$0) {
         akt $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         ash $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::D_);
         return new eck(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements asu {
      a("this", eev.a),
      b("killer", eev.d),
      c("direct_killer", eev.e),
      d("killer_player", eev.b);

      public static final asu.a<eck.b> e = asu.a(eck.b::values);
      private final String f;
      private final ees<? extends biw> g;

      private b(String $$0, ees<? extends biw> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ees<? extends biw> a() {
         return this.g;
      }

      public static eck.b a(String $$0) {
         eck.b $$1 = e.a($$0);
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

   public static record c<T>(ecp<T> a, T b) {
   }
}
