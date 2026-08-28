import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class fah {
   private final fak a;
   private final azx b;
   private final jg.a c;
   private final Set<fah.c<?>> d = Sets.newLinkedHashSet();

   fah(fak $$0, azx $$1, jg.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(baz<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(baz<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(baz<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(ali $$0, Consumer<czy> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(fah.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(fah.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(fah.c<?> $$0) {
      this.d.remove($$0);
   }

   public jg.a a() {
      return this.c;
   }

   public azx b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public ars d() {
      return this.a.a();
   }

   public static fah.c<fam> a(fam $$0) {
      return new fah.c<>(faj.c, $$0);
   }

   public static fah.c<fdq> a(fdq $$0) {
      return new fah.c<>(faj.a, $$0);
   }

   public static fah.c<fbv> a(fbv $$0) {
      return new fah.c<>(faj.b, $$0);
   }

   public static class a {
      private final fak a;
      @Nullable
      private azx b;

      public a(fak $$0) {
         this.a = $$0;
      }

      public fah.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azx.a($$0);
         }

         return this;
      }

      public fah.a a(azx $$0) {
         this.b = $$0;
         return this;
      }

      public ars a() {
         return this.a.a();
      }

      public fah a(Optional<ali> $$0) {
         ars $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azx $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::G_);
         return new fah(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bam {
      a("this", fdb.a),
      b("attacker", fdb.d),
      c("direct_attacker", fdb.e),
      d("attacking_player", fdb.b);

      public static final bam.a<fah.b> e = bam.a(fah.b::values);
      private final String f;
      private final baz<? extends bwt> g;

      private b(final String $$0, final baz<? extends bwt> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public baz<? extends bwt> a() {
         return this.g;
      }

      public static fah.b a(String $$0) {
         fah.b $$1 = e.a($$0);
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

   public static record c<T>(faj<T> a, T b) {
   }
}
