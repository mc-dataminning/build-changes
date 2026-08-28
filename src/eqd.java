import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqd {
   private final eqg a;
   private final azc b;
   private final jj.a c;
   private final Set<eqd.c<?>> d = Sets.newLinkedHashSet();

   eqd(eqg $$0, azc $$1, jj.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(esw<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(esw<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alb $$0, Consumer<cuk> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(esw<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqd.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqd.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqd.c<?> $$0) {
      this.d.remove($$0);
   }

   public jj.a a() {
      return this.c;
   }

   public azc b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arb d() {
      return this.a.a();
   }

   public static eqd.c<eqi> a(eqi $$0) {
      return new eqd.c<>(eqf.c, $$0);
   }

   public static eqd.c<etn> a(etn $$0) {
      return new eqd.c<>(eqf.a, $$0);
   }

   public static eqd.c<erq> a(erq $$0) {
      return new eqd.c<>(eqf.b, $$0);
   }

   public static class a {
      private final eqg a;
      @Nullable
      private azc b;

      public a(eqg $$0) {
         this.a = $$0;
      }

      public eqd.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azc.a($$0);
         }

         return this;
      }

      public arb a() {
         return this.a.a();
      }

      public eqd a(Optional<alb> $$0) {
         arb $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azc $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqd(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azp {
      a("this", esz.a),
      b("killer", esz.d),
      c("direct_killer", esz.e),
      d("killer_player", esz.b);

      public static final azp.a<eqd.b> e = azp.a(eqd.b::values);
      private final String f;
      private final esw<? extends bsp> g;

      private b(final String $$0, final esw<? extends bsp> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public esw<? extends bsp> a() {
         return this.g;
      }

      public static eqd.b a(String $$0) {
         eqd.b $$1 = e.a($$0);
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

   public static record c<T>(eqf<T> a, T b) {
   }
}
