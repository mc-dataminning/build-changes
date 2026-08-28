import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class erl {
   private final ero a;
   private final ayv b;
   private final jn.a c;
   private final Set<erl.c<?>> d = Sets.newLinkedHashSet();

   erl(ero $$0, ayv $$1, jn.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eue<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eue<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akq $$0, Consumer<cuo> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eue<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(erl.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(erl.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(erl.c<?> $$0) {
      this.d.remove($$0);
   }

   public jn.a a() {
      return this.c;
   }

   public ayv b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqt d() {
      return this.a.a();
   }

   public static erl.c<erq> a(erq $$0) {
      return new erl.c<>(ern.c, $$0);
   }

   public static erl.c<euw> a(euw $$0) {
      return new erl.c<>(ern.a, $$0);
   }

   public static erl.c<esz> a(esz $$0) {
      return new erl.c<>(ern.b, $$0);
   }

   public static class a {
      private final ero a;
      @Nullable
      private ayv b;

      public a(ero $$0) {
         this.a = $$0;
      }

      public erl.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayv.a($$0);
         }

         return this;
      }

      public erl.a a(ayv $$0) {
         this.b = $$0;
         return this;
      }

      public aqt a() {
         return this.a.a();
      }

      public erl a(Optional<akq> $$0) {
         aqt $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new erl(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azj {
      a("this", euh.a),
      b("attacker", euh.d),
      c("direct_attacker", euh.e),
      d("attacking_player", euh.b);

      public static final azj.a<erl.b> e = azj.a(erl.b::values);
      private final String f;
      private final eue<? extends bsq> g;

      private b(final String $$0, final eue<? extends bsq> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eue<? extends bsq> a() {
         return this.g;
      }

      public static erl.b a(String $$0) {
         erl.b $$1 = e.a($$0);
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

   public static record c<T>(ern<T> a, T b) {
   }
}
