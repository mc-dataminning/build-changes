import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqo {
   private final eqr a;
   private final aym b;
   private final jk.a c;
   private final Set<eqo.c<?>> d = Sets.newLinkedHashSet();

   eqo(eqr $$0, aym $$1, jk.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eth<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eth<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akk $$0, Consumer<cua> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eth<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqo.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqo.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqo.c<?> $$0) {
      this.d.remove($$0);
   }

   public jk.a a() {
      return this.c;
   }

   public aym b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqk d() {
      return this.a.a();
   }

   public static eqo.c<eqt> a(eqt $$0) {
      return new eqo.c<>(eqq.c, $$0);
   }

   public static eqo.c<etz> a(etz $$0) {
      return new eqo.c<>(eqq.a, $$0);
   }

   public static eqo.c<esc> a(esc $$0) {
      return new eqo.c<>(eqq.b, $$0);
   }

   public static class a {
      private final eqr a;
      @Nullable
      private aym b;

      public a(eqr $$0) {
         this.a = $$0;
      }

      public eqo.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = aym.a($$0);
         }

         return this;
      }

      public aqk a() {
         return this.a.a();
      }

      public eqo a(Optional<akk> $$0) {
         aqk $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         aym $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqo(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements ayz {
      a("this", etk.a),
      b("attacker", etk.d),
      c("direct_attacker", etk.e),
      d("attacking_player", etk.b);

      public static final ayz.a<eqo.b> e = ayz.a(eqo.b::values);
      private final String f;
      private final eth<? extends bsd> g;

      private b(final String $$0, final eth<? extends bsd> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eth<? extends bsd> a() {
         return this.g;
      }

      public static eqo.b a(String $$0) {
         eqo.b $$1 = e.a($$0);
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

   public static record c<T>(eqq<T> a, T b) {
   }
}
