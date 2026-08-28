import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class faj {
   private final fam a;
   private final azz b;
   private final jh.a c;
   private final Set<faj.c<?>> d = Sets.newLinkedHashSet();

   faj(fam $$0, azz $$1, jh.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bbb<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bbb<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bbb<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(alk $$0, Consumer<daa> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(faj.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(faj.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(faj.c<?> $$0) {
      this.d.remove($$0);
   }

   public jh.a a() {
      return this.c;
   }

   public azz b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public aru d() {
      return this.a.a();
   }

   public static faj.c<fao> a(fao $$0) {
      return new faj.c<>(fal.c, $$0);
   }

   public static faj.c<fds> a(fds $$0) {
      return new faj.c<>(fal.a, $$0);
   }

   public static faj.c<fbx> a(fbx $$0) {
      return new faj.c<>(fal.b, $$0);
   }

   public static class a {
      private final fam a;
      @Nullable
      private azz b;

      public a(fam $$0) {
         this.a = $$0;
      }

      public faj.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azz.a($$0);
         }

         return this;
      }

      public faj.a a(azz $$0) {
         this.b = $$0;
         return this;
      }

      public aru a() {
         return this.a.a();
      }

      public faj a(Optional<alk> $$0) {
         aru $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azz $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::G_);
         return new faj(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bao {
      a("this", fdd.a),
      b("attacker", fdd.d),
      c("direct_attacker", fdd.e),
      d("attacking_player", fdd.b);

      public static final bao.a<faj.b> e = bao.a(faj.b::values);
      private final String f;
      private final bbb<? extends bwv> g;

      private b(final String $$0, final bbb<? extends bwv> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bbb<? extends bwv> a() {
         return this.g;
      }

      public static faj.b a(String $$0) {
         faj.b $$1 = e.a($$0);
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

   public static record c<T>(fal<T> a, T b) {
   }
}
