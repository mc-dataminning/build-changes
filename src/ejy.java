import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ejy {
   private final eke a;
   private final awt b;
   private final ekc c;
   private final Set<ejy.c<?>> d = Sets.newLinkedHashSet();

   ejy(eke $$0, awt $$1, ekc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(emg<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(emg<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ajc $$0, Consumer<cpq> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(emg<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ejy.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ejy.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ejy.c<?> $$0) {
      this.d.remove($$0);
   }

   public ekc a() {
      return this.c;
   }

   public awt b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public apa d() {
      return this.a.a();
   }

   public static ejy.c<ekg> a(ekg $$0) {
      return new ejy.c<>(ekd.c, $$0);
   }

   public static ejy.c<emx> a(emx $$0) {
      return new ejy.c<>(ekd.a, $$0);
   }

   public static ejy.c<ell> a(ell $$0) {
      return new ejy.c<>(ekd.b, $$0);
   }

   public static class a {
      private final eke a;
      @Nullable
      private awt b;

      public a(eke $$0) {
         this.a = $$0;
      }

      public ejy.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = awt.a($$0);
         }

         return this;
      }

      public apa a() {
         return this.a.a();
      }

      public ejy a(Optional<ajc> $$0) {
         apa $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         awt $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new ejy(this.a, $$3, $$2.aM());
      }
   }

   public static enum b implements axg {
      a("this", emj.a),
      b("killer", emj.d),
      c("direct_killer", emj.e),
      d("killer_player", emj.b);

      public static final axg.a<ejy.b> e = axg.a(ejy.b::values);
      private final String f;
      private final emg<? extends bof> g;

      private b(String $$0, emg<? extends bof> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public emg<? extends bof> a() {
         return this.g;
      }

      public static ejy.b a(String $$0) {
         ejy.b $$1 = e.a($$0);
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

   public static record c<T>(ekd<T> a, T b) {
   }
}
