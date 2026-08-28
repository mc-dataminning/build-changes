import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class equ {
   private final eqx a;
   private final ayo b;
   private final jk.a c;
   private final Set<equ.c<?>> d = Sets.newLinkedHashSet();

   equ(eqx $$0, ayo $$1, jk.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(etn<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(etn<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akk $$0, Consumer<cuc> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(etn<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(equ.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(equ.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(equ.c<?> $$0) {
      this.d.remove($$0);
   }

   public jk.a a() {
      return this.c;
   }

   public ayo b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqm d() {
      return this.a.a();
   }

   public static equ.c<eqz> a(eqz $$0) {
      return new equ.c<>(eqw.c, $$0);
   }

   public static equ.c<euf> a(euf $$0) {
      return new equ.c<>(eqw.a, $$0);
   }

   public static equ.c<esi> a(esi $$0) {
      return new equ.c<>(eqw.b, $$0);
   }

   public static class a {
      private final eqx a;
      @Nullable
      private ayo b;

      public a(eqx $$0) {
         this.a = $$0;
      }

      public equ.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayo.a($$0);
         }

         return this;
      }

      public equ.a a(ayo $$0) {
         this.b = $$0;
         return this;
      }

      public aqm a() {
         return this.a.a();
      }

      public equ a(Optional<akk> $$0) {
         aqm $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayo $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new equ(this.a, $$3, $$2.bf().b());
      }
   }

   public static enum b implements azc {
      a("this", etq.a),
      b("attacker", etq.d),
      c("direct_attacker", etq.e),
      d("attacking_player", etq.b);

      public static final azc.a<equ.b> e = azc.a(equ.b::values);
      private final String f;
      private final etn<? extends bsg> g;

      private b(final String $$0, final etn<? extends bsg> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public etn<? extends bsg> a() {
         return this.g;
      }

      public static equ.b a(String $$0) {
         equ.b $$1 = e.a($$0);
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

   public static record c<T>(eqw<T> a, T b) {
   }
}
