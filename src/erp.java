import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class erp {
   private final ers a;
   private final ayw b;
   private final jn.a c;
   private final Set<erp.c<?>> d = Sets.newLinkedHashSet();

   erp(ers $$0, ayw $$1, jn.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eui<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eui<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akr $$0, Consumer<cuq> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eui<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(erp.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(erp.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(erp.c<?> $$0) {
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

   public static erp.c<eru> a(eru $$0) {
      return new erp.c<>(err.c, $$0);
   }

   public static erp.c<eva> a(eva $$0) {
      return new erp.c<>(err.a, $$0);
   }

   public static erp.c<etd> a(etd $$0) {
      return new erp.c<>(err.b, $$0);
   }

   public static class a {
      private final ers a;
      @Nullable
      private ayw b;

      public a(ers $$0) {
         this.a = $$0;
      }

      public erp.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayw.a($$0);
         }

         return this;
      }

      public erp.a a(ayw $$0) {
         this.b = $$0;
         return this;
      }

      public aqu a() {
         return this.a.a();
      }

      public erp a(Optional<akr> $$0) {
         aqu $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayw $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new erp(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azk {
      a("this", eul.a),
      b("attacker", eul.d),
      c("direct_attacker", eul.e),
      d("attacking_player", eul.b);

      public static final azk.a<erp.b> e = azk.a(erp.b::values);
      private final String f;
      private final eui<? extends bsr> g;

      private b(final String $$0, final eui<? extends bsr> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eui<? extends bsr> a() {
         return this.g;
      }

      public static erp.b a(String $$0) {
         erp.b $$1 = e.a($$0);
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

   public static record c<T>(err<T> a, T b) {
   }
}
