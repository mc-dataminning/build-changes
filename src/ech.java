import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ech {
   private final ecn a;
   private final aru b;
   private final ecl c;
   private final Set<ech.c<?>> d = Sets.newLinkedHashSet();

   ech(ecn $$0, aru $$1, ecl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eep<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eep<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aer $$0, Consumer<ciy> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eep<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ech.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ech.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ech.c<?> $$0) {
      this.d.remove($$0);
   }

   public ecl a() {
      return this.c;
   }

   public aru b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public akk d() {
      return this.a.a();
   }

   public static ech.c<ecp> a(ecp $$0) {
      return new ech.c<>(ecm.c, $$0);
   }

   public static ech.c<efg> a(efg $$0) {
      return new ech.c<>(ecm.a, $$0);
   }

   public static ech.c<edu> a(edu $$0) {
      return new ech.c<>(ecm.b, $$0);
   }

   public static class a {
      private final ecn a;
      @Nullable
      private aru b;

      public a(ecn $$0) {
         this.a = $$0;
      }

      public ech.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = aru.a($$0);
         }

         return this;
      }

      public akk a() {
         return this.a.a();
      }

      public ech a(Optional<aer> $$0) {
         akk $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         aru $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::y_);
         return new ech(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements ash {
      a("this", ees.a),
      b("killer", ees.d),
      c("direct_killer", ees.e),
      d("killer_player", ees.b);

      public static final ash.a<ech.b> e = ash.a(ech.b::values);
      private final String f;
      private final eep<? extends bii> g;

      private b(String $$0, eep<? extends bii> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eep<? extends bii> a() {
         return this.g;
      }

      public static ech.b a(String $$0) {
         ech.b $$1 = e.a($$0);
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

   public static record c<T>(ecm<T> a, T b) {
   }
}
