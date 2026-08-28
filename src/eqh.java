import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqh {
   private final eqk a;
   private final azg b;
   private final jj.a c;
   private final Set<eqh.c<?>> d = Sets.newLinkedHashSet();

   eqh(eqk $$0, azg $$1, jj.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eta<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eta<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ale $$0, Consumer<cuo> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eta<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqh.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqh.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqh.c<?> $$0) {
      this.d.remove($$0);
   }

   public jj.a a() {
      return this.c;
   }

   public azg b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public are d() {
      return this.a.a();
   }

   public static eqh.c<eqm> a(eqm $$0) {
      return new eqh.c<>(eqj.c, $$0);
   }

   public static eqh.c<etr> a(etr $$0) {
      return new eqh.c<>(eqj.a, $$0);
   }

   public static eqh.c<eru> a(eru $$0) {
      return new eqh.c<>(eqj.b, $$0);
   }

   public static class a {
      private final eqk a;
      @Nullable
      private azg b;

      public a(eqk $$0) {
         this.a = $$0;
      }

      public eqh.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azg.a($$0);
         }

         return this;
      }

      public are a() {
         return this.a.a();
      }

      public eqh a(Optional<ale> $$0) {
         are $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azg $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqh(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azt {
      a("this", etd.a),
      b("killer", etd.d),
      c("direct_killer", etd.e),
      d("killer_player", etd.b);

      public static final azt.a<eqh.b> e = azt.a(eqh.b::values);
      private final String f;
      private final eta<? extends bst> g;

      private b(final String $$0, final eta<? extends bst> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eta<? extends bst> a() {
         return this.g;
      }

      public static eqh.b a(String $$0) {
         eqh.b $$1 = e.a($$0);
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

   public static record c<T>(eqj<T> a, T b) {
   }
}
