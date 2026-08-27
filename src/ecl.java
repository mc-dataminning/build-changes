import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ecl {
   private final ecr a;
   private final arx b;
   private final ecp c;
   private final Set<ecl.c<?>> d = Sets.newLinkedHashSet();

   ecl(ecr $$0, arx $$1, ecp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eet<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eet<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aeu $$0, Consumer<cja> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eet<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ecl.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ecl.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ecl.c<?> $$0) {
      this.d.remove($$0);
   }

   public ecp a() {
      return this.c;
   }

   public arx b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public akn d() {
      return this.a.a();
   }

   public static ecl.c<ect> a(ect $$0) {
      return new ecl.c<>(ecq.c, $$0);
   }

   public static ecl.c<efk> a(efk $$0) {
      return new ecl.c<>(ecq.a, $$0);
   }

   public static ecl.c<edy> a(edy $$0) {
      return new ecl.c<>(ecq.b, $$0);
   }

   public static class a {
      private final ecr a;
      @Nullable
      private arx b;

      public a(ecr $$0) {
         this.a = $$0;
      }

      public ecl.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = arx.a($$0);
         }

         return this;
      }

      public akn a() {
         return this.a.a();
      }

      public ecl a(Optional<aeu> $$0) {
         akn $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         arx $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::y_);
         return new ecl(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements ask {
      a("this", eew.a),
      b("killer", eew.d),
      c("direct_killer", eew.e),
      d("killer_player", eew.b);

      public static final ask.a<ecl.b> e = ask.a(ecl.b::values);
      private final String f;
      private final eet<? extends bil> g;

      private b(String $$0, eet<? extends bil> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eet<? extends bil> a() {
         return this.g;
      }

      public static ecl.b a(String $$0) {
         ecl.b $$1 = e.a($$0);
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

   public static record c<T>(ecq<T> a, T b) {
   }
}
