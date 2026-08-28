import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eyz {
   private final ezc a;
   private final azv b;
   private final jf.a c;
   private final Set<eyz.c<?>> d = Sets.newLinkedHashSet();

   eyz(ezc $$0, azv $$1, jf.a $$2) {
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

   public void a(alg $$0, Consumer<cyy> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(eyz.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eyz.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eyz.c<?> $$0) {
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

   public static eyz.c<eze> a(eze $$0) {
      return new eyz.c<>(ezb.c, $$0);
   }

   public static eyz.c<fci> a(fci $$0) {
      return new eyz.c<>(ezb.a, $$0);
   }

   public static eyz.c<fan> a(fan $$0) {
      return new eyz.c<>(ezb.b, $$0);
   }

   public static class a {
      private final ezc a;
      @Nullable
      private azv b;

      public a(ezc $$0) {
         this.a = $$0;
      }

      public eyz.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azv.a($$0);
         }

         return this;
      }

      public eyz.a a(azv $$0) {
         this.b = $$0;
         return this;
      }

      public arq a() {
         return this.a.a();
      }

      public eyz a(Optional<alg> $$0) {
         arq $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new eyz(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bak {
      a("this", fbt.a),
      b("attacker", fbt.d),
      c("direct_attacker", fbt.e),
      d("attacking_player", fbt.b);

      public static final bak.a<eyz.b> e = bak.a(eyz.b::values);
      private final String f;
      private final bax<? extends bwd> g;

      private b(final String $$0, final bax<? extends bwd> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bax<? extends bwd> a() {
         return this.g;
      }

      public static eyz.b a(String $$0) {
         eyz.b $$1 = e.a($$0);
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

   public static record c<T>(ezb<T> a, T b) {
   }
}
