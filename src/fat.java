import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class fat {
   private final faw a;
   private final bai b;
   private final jh.a c;
   private final Set<fat.c<?>> d = Sets.newLinkedHashSet();

   fat(faw $$0, bai $$1, jh.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bbk<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bbk<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bbk<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(alr $$0, Consumer<dak> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(fat.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(fat.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(fat.c<?> $$0) {
      this.d.remove($$0);
   }

   public jh.a a() {
      return this.c;
   }

   public bai b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public asb d() {
      return this.a.a();
   }

   public static fat.c<fay> a(fay $$0) {
      return new fat.c<>(fav.c, $$0);
   }

   public static fat.c<fec> a(fec $$0) {
      return new fat.c<>(fav.a, $$0);
   }

   public static fat.c<fch> a(fch $$0) {
      return new fat.c<>(fav.b, $$0);
   }

   public static class a {
      private final faw a;
      @Nullable
      private bai b;

      public a(faw $$0) {
         this.a = $$0;
      }

      public fat.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = bai.a($$0);
         }

         return this;
      }

      public fat.a a(bai $$0) {
         this.b = $$0;
         return this;
      }

      public asb a() {
         return this.a.a();
      }

      public fat a(Optional<alr> $$0) {
         asb $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         bai $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::G_);
         return new fat(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bax {
      a("this", fdn.a),
      b("attacker", fdn.d),
      c("direct_attacker", fdn.e),
      d("attacking_player", fdn.b);

      public static final bax.a<fat.b> e = bax.a(fat.b::values);
      private final String f;
      private final bbk<? extends bxe> g;

      private b(final String $$0, final bbk<? extends bxe> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bbk<? extends bxe> a() {
         return this.g;
      }

      public static fat.b a(String $$0) {
         fat.b $$1 = e.a($$0);
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

   public static record c<T>(fav<T> a, T b) {
   }
}
