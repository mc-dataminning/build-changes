import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ezt {
   private final ezw a;
   private final azv b;
   private final jg.a c;
   private final Set<ezt.c<?>> d = Sets.newLinkedHashSet();

   ezt(ezw $$0, azv $$1, jg.a $$2) {
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

   public void a(alg $$0, Consumer<czn> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ezt.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ezt.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ezt.c<?> $$0) {
      this.d.remove($$0);
   }

   public jg.a a() {
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

   public static ezt.c<ezy> a(ezy $$0) {
      return new ezt.c<>(ezv.c, $$0);
   }

   public static ezt.c<fdc> a(fdc $$0) {
      return new ezt.c<>(ezv.a, $$0);
   }

   public static ezt.c<fbh> a(fbh $$0) {
      return new ezt.c<>(ezv.b, $$0);
   }

   public static class a {
      private final ezw a;
      @Nullable
      private azv b;

      public a(ezw $$0) {
         this.a = $$0;
      }

      public ezt.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azv.a($$0);
         }

         return this;
      }

      public ezt.a a(azv $$0) {
         this.b = $$0;
         return this;
      }

      public arq a() {
         return this.a.a();
      }

      public ezt a(Optional<alg> $$0) {
         arq $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new ezt(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bak {
      a("this", fcn.a),
      b("attacker", fcn.d),
      c("direct_attacker", fcn.e),
      d("attacking_player", fcn.b);

      public static final bak.a<ezt.b> e = bak.a(ezt.b::values);
      private final String f;
      private final bax<? extends bwi> g;

      private b(final String $$0, final bax<? extends bwi> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bax<? extends bwi> a() {
         return this.g;
      }

      public static ezt.b a(String $$0) {
         ezt.b $$1 = e.a($$0);
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

   public static record c<T>(ezv<T> a, T b) {
   }
}
