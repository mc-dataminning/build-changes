import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ezo {
   private final ezr a;
   private final azv b;
   private final jg.a c;
   private final Set<ezo.c<?>> d = Sets.newLinkedHashSet();

   ezo(ezr $$0, azv $$1, jg.a $$2) {
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

   public void a(alg $$0, Consumer<czk> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ezo.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ezo.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ezo.c<?> $$0) {
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

   public static ezo.c<ezt> a(ezt $$0) {
      return new ezo.c<>(ezq.c, $$0);
   }

   public static ezo.c<fcx> a(fcx $$0) {
      return new ezo.c<>(ezq.a, $$0);
   }

   public static ezo.c<fbc> a(fbc $$0) {
      return new ezo.c<>(ezq.b, $$0);
   }

   public static class a {
      private final ezr a;
      @Nullable
      private azv b;

      public a(ezr $$0) {
         this.a = $$0;
      }

      public ezo.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azv.a($$0);
         }

         return this;
      }

      public ezo.a a(azv $$0) {
         this.b = $$0;
         return this;
      }

      public arq a() {
         return this.a.a();
      }

      public ezo a(Optional<alg> $$0) {
         arq $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new ezo(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bak {
      a("this", fci.a),
      b("attacker", fci.d),
      c("direct_attacker", fci.e),
      d("attacking_player", fci.b);

      public static final bak.a<ezo.b> e = bak.a(ezo.b::values);
      private final String f;
      private final bax<? extends bwi> g;

      private b(final String $$0, final bax<? extends bwi> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bax<? extends bwi> a() {
         return this.g;
      }

      public static ezo.b a(String $$0) {
         ezo.b $$1 = e.a($$0);
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

   public static record c<T>(ezq<T> a, T b) {
   }
}
