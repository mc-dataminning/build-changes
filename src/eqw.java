import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqw {
   private final eqz a;
   private final ayo b;
   private final jk.a c;
   private final Set<eqw.c<?>> d = Sets.newLinkedHashSet();

   eqw(eqz $$0, ayo $$1, jk.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(etp<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(etp<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akk $$0, Consumer<cud> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(etp<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqw.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqw.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqw.c<?> $$0) {
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

   public static eqw.c<erb> a(erb $$0) {
      return new eqw.c<>(eqy.c, $$0);
   }

   public static eqw.c<euh> a(euh $$0) {
      return new eqw.c<>(eqy.a, $$0);
   }

   public static eqw.c<esk> a(esk $$0) {
      return new eqw.c<>(eqy.b, $$0);
   }

   public static class a {
      private final eqz a;
      @Nullable
      private ayo b;

      public a(eqz $$0) {
         this.a = $$0;
      }

      public eqw.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayo.a($$0);
         }

         return this;
      }

      public eqw.a a(ayo $$0) {
         this.b = $$0;
         return this;
      }

      public aqm a() {
         return this.a.a();
      }

      public eqw a(Optional<akk> $$0) {
         aqm $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayo $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqw(this.a, $$3, $$2.bf().b());
      }
   }

   public static enum b implements azc {
      a("this", ets.a),
      b("attacker", ets.d),
      c("direct_attacker", ets.e),
      d("attacking_player", ets.b);

      public static final azc.a<eqw.b> e = azc.a(eqw.b::values);
      private final String f;
      private final etp<? extends bsh> g;

      private b(final String $$0, final etp<? extends bsh> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public etp<? extends bsh> a() {
         return this.g;
      }

      public static eqw.b a(String $$0) {
         eqw.b $$1 = e.a($$0);
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

   public static record c<T>(eqy<T> a, T b) {
   }
}
