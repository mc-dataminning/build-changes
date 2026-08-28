import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eth {
   private final etk a;
   private final azl b;
   private final jo.a c;
   private final Set<eth.c<?>> d = Sets.newLinkedHashSet();

   eth(etk $$0, azl $$1, jo.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ewa<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ewa<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alc $$0, Consumer<cvp> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ewa<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eth.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eth.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eth.c<?> $$0) {
      this.d.remove($$0);
   }

   public jo.a a() {
      return this.c;
   }

   public azl b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arh d() {
      return this.a.a();
   }

   public static eth.c<etm> a(etm $$0) {
      return new eth.c<>(etj.c, $$0);
   }

   public static eth.c<ews> a(ews $$0) {
      return new eth.c<>(etj.a, $$0);
   }

   public static eth.c<euv> a(euv $$0) {
      return new eth.c<>(etj.b, $$0);
   }

   public static class a {
      private final etk a;
      @Nullable
      private azl b;

      public a(etk $$0) {
         this.a = $$0;
      }

      public eth.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azl.a($$0);
         }

         return this;
      }

      public eth.a a(azl $$0) {
         this.b = $$0;
         return this;
      }

      public arh a() {
         return this.a.a();
      }

      public eth a(Optional<alc> $$0) {
         arh $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azl $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new eth(this.a, $$3, $$2.bd().a());
      }
   }

   public static enum b implements azz {
      a("this", ewd.a),
      b("attacker", ewd.d),
      c("direct_attacker", ewd.e),
      d("attacking_player", ewd.b);

      public static final azz.a<eth.b> e = azz.a(eth.b::values);
      private final String f;
      private final ewa<? extends bto> g;

      private b(final String $$0, final ewa<? extends bto> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ewa<? extends bto> a() {
         return this.g;
      }

      public static eth.b a(String $$0) {
         eth.b $$1 = e.a($$0);
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

   public static record c<T>(etj<T> a, T b) {
   }
}
