import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class err {
   private final eru a;
   private final ayw b;
   private final jn.a c;
   private final Set<err.c<?>> d = Sets.newLinkedHashSet();

   err(eru $$0, ayw $$1, jn.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(euk<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(euk<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akr $$0, Consumer<cuq> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(euk<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(err.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(err.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(err.c<?> $$0) {
      this.d.remove($$0);
   }

   public jn.a a() {
      return this.c;
   }

   public ayw b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqu d() {
      return this.a.a();
   }

   public static err.c<erw> a(erw $$0) {
      return new err.c<>(ert.c, $$0);
   }

   public static err.c<evc> a(evc $$0) {
      return new err.c<>(ert.a, $$0);
   }

   public static err.c<etf> a(etf $$0) {
      return new err.c<>(ert.b, $$0);
   }

   public static class a {
      private final eru a;
      @Nullable
      private ayw b;

      public a(eru $$0) {
         this.a = $$0;
      }

      public err.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayw.a($$0);
         }

         return this;
      }

      public err.a a(ayw $$0) {
         this.b = $$0;
         return this;
      }

      public aqu a() {
         return this.a.a();
      }

      public err a(Optional<akr> $$0) {
         aqu $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayw $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new err(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azk {
      a("this", eun.a),
      b("attacker", eun.d),
      c("direct_attacker", eun.e),
      d("attacking_player", eun.b);

      public static final azk.a<err.b> e = azk.a(err.b::values);
      private final String f;
      private final euk<? extends bsr> g;

      private b(final String $$0, final euk<? extends bsr> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public euk<? extends bsr> a() {
         return this.g;
      }

      public static err.b a(String $$0) {
         err.b $$1 = e.a($$0);
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

   public static record c<T>(ert<T> a, T b) {
   }
}
