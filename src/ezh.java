import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ezh {
   private final ezk a;
   private final azv b;
   private final jf.a c;
   private final Set<ezh.c<?>> d = Sets.newLinkedHashSet();

   ezh(ezk $$0, azv $$1, jf.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bax<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bax<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bax<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(alg $$0, Consumer<czd> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ezh.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ezh.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ezh.c<?> $$0) {
      this.d.remove($$0);
   }

   public jf.a a() {
      return this.c;
   }

   public azv b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public arq d() {
      return this.a.a();
   }

   public static ezh.c<ezm> a(ezm $$0) {
      return new ezh.c<>(ezj.c, $$0);
   }

   public static ezh.c<fcq> a(fcq $$0) {
      return new ezh.c<>(ezj.a, $$0);
   }

   public static ezh.c<fav> a(fav $$0) {
      return new ezh.c<>(ezj.b, $$0);
   }

   public static class a {
      private final ezk a;
      @Nullable
      private azv b;

      public a(ezk $$0) {
         this.a = $$0;
      }

      public ezh.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azv.a($$0);
         }

         return this;
      }

      public ezh.a a(azv $$0) {
         this.b = $$0;
         return this;
      }

      public arq a() {
         return this.a.a();
      }

      public ezh a(Optional<alg> $$0) {
         arq $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new ezh(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bak {
      a("this", fcb.a),
      b("attacker", fcb.d),
      c("direct_attacker", fcb.e),
      d("attacking_player", fcb.b);

      public static final bak.a<ezh.b> e = bak.a(ezh.b::values);
      private final String f;
      private final bax<? extends bwf> g;

      private b(final String $$0, final bax<? extends bwf> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bax<? extends bwf> a() {
         return this.g;
      }

      public static ezh.b a(String $$0) {
         ezh.b $$1 = e.a($$0);
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

   public static record c<T>(ezj<T> a, T b) {
   }
}
