import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ege {
   private final egk a;
   private final auf b;
   private final egi c;
   private final Set<ege.c<?>> d = Sets.newLinkedHashSet();

   ege(egk $$0, auf $$1, egi $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eim<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eim<T> $$0) {
      return this.a.b($$0);
   }

   public void a(agt $$0, Consumer<cmh> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eim<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ege.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ege.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ege.c<?> $$0) {
      this.d.remove($$0);
   }

   public egi a() {
      return this.c;
   }

   public auf b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public amp d() {
      return this.a.a();
   }

   public static ege.c<egm> a(egm $$0) {
      return new ege.c<>(egj.c, $$0);
   }

   public static ege.c<ejd> a(ejd $$0) {
      return new ege.c<>(egj.a, $$0);
   }

   public static ege.c<ehr> a(ehr $$0) {
      return new ege.c<>(egj.b, $$0);
   }

   public static class a {
      private final egk a;
      @Nullable
      private auf b;

      public a(egk $$0) {
         this.a = $$0;
      }

      public ege.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = auf.a($$0);
         }

         return this;
      }

      public amp a() {
         return this.a.a();
      }

      public ege a(Optional<agt> $$0) {
         amp $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         auf $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new ege(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements aut {
      a("this", eip.a),
      b("killer", eip.d),
      c("direct_killer", eip.e),
      d("killer_player", eip.b);

      public static final aut.a<ege.b> e = aut.a(ege.b::values);
      private final String f;
      private final eim<? extends blf> g;

      private b(String $$0, eim<? extends blf> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eim<? extends blf> a() {
         return this.g;
      }

      public static ege.b a(String $$0) {
         ege.b $$1 = e.a($$0);
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

   public static record c<T>(egj<T> a, T b) {
   }
}
