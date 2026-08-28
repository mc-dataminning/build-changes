import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class exl {
   private final exo a;
   private final azs b;
   private final jt.a c;
   private final Set<exl.c<?>> d = Sets.newLinkedHashSet();

   exl(exo $$0, azs $$1, jt.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bat<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bat<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bat<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(ald $$0, Consumer<cxy> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(exl.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(exl.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(exl.c<?> $$0) {
      this.d.remove($$0);
   }

   public jt.a a() {
      return this.c;
   }

   public azs b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public arn d() {
      return this.a.a();
   }

   public static exl.c<exq> a(exq $$0) {
      return new exl.c<>(exn.c, $$0);
   }

   public static exl.c<fau> a(fau $$0) {
      return new exl.c<>(exn.a, $$0);
   }

   public static exl.c<eyz> a(eyz $$0) {
      return new exl.c<>(exn.b, $$0);
   }

   public static class a {
      private final exo a;
      @Nullable
      private azs b;

      public a(exo $$0) {
         this.a = $$0;
      }

      public exl.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azs.a($$0);
         }

         return this;
      }

      public exl.a a(azs $$0) {
         this.b = $$0;
         return this;
      }

      public arn a() {
         return this.a.a();
      }

      public exl a(Optional<ald> $$0) {
         arn $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azs $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new exl(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bag {
      a("this", faf.a),
      b("attacker", faf.d),
      c("direct_attacker", faf.e),
      d("attacking_player", faf.b);

      public static final bag.a<exl.b> e = bag.a(exl.b::values);
      private final String f;
      private final bat<? extends bvs> g;

      private b(final String $$0, final bat<? extends bvs> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bat<? extends bvs> a() {
         return this.g;
      }

      public static exl.b a(String $$0) {
         exl.b $$1 = e.a($$0);
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

   public static record c<T>(exn<T> a, T b) {
   }
}
