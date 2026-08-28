import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class evr {
   private final evu a;
   private final azh b;
   private final js.a c;
   private final Set<evr.c<?>> d = Sets.newLinkedHashSet();

   evr(evu $$0, azh $$1, js.a $$2) {
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

   public void a(aku $$0, Consumer<cwp> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(evr.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(evr.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(evr.c<?> $$0) {
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

   public arc d() {
      return this.a.a();
   }

   public static evr.c<evw> a(evw $$0) {
      return new evr.c<>(evt.c, $$0);
   }

   public static evr.c<eza> a(eza $$0) {
      return new evr.c<>(evt.a, $$0);
   }

   public static evr.c<exf> a(exf $$0) {
      return new evr.c<>(evt.b, $$0);
   }

   public static class a {
      private final evu a;
      @Nullable
      private azh b;

      public a(evu $$0) {
         this.a = $$0;
      }

      public evr.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azh.a($$0);
         }

         return this;
      }

      public evr.a a(azh $$0) {
         this.b = $$0;
         return this;
      }

      public arc a() {
         return this.a.a();
      }

      public evr a(Optional<aku> $$0) {
         arc $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azh $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new evr(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements azv {
      a("this", eyl.a),
      b("attacker", eyl.d),
      c("direct_attacker", eyl.e),
      d("attacking_player", eyl.b);

      public static final azv.a<evr.b> e = azv.a(evr.b::values);
      private final String f;
      private final bai<? extends buk> g;

      private b(final String $$0, final bai<? extends buk> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bai<? extends buk> a() {
         return this.g;
      }

      public static evr.b a(String $$0) {
         evr.b $$1 = e.a($$0);
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

   public static record c<T>(evt<T> a, T b) {
   }
}
