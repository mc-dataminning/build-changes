import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqg {
   private final eqj a;
   private final azf b;
   private final jj.a c;
   private final Set<eqg.c<?>> d = Sets.newLinkedHashSet();

   eqg(eqj $$0, azf $$1, jj.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(esz<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(esz<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ale $$0, Consumer<cun> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(esz<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqg.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqg.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqg.c<?> $$0) {
      this.d.remove($$0);
   }

   public jj.a a() {
      return this.c;
   }

   public azf b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public are d() {
      return this.a.a();
   }

   public static eqg.c<eql> a(eql $$0) {
      return new eqg.c<>(eqi.c, $$0);
   }

   public static eqg.c<etq> a(etq $$0) {
      return new eqg.c<>(eqi.a, $$0);
   }

   public static eqg.c<ert> a(ert $$0) {
      return new eqg.c<>(eqi.b, $$0);
   }

   public static class a {
      private final eqj a;
      @Nullable
      private azf b;

      public a(eqj $$0) {
         this.a = $$0;
      }

      public eqg.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azf.a($$0);
         }

         return this;
      }

      public are a() {
         return this.a.a();
      }

      public eqg a(Optional<ale> $$0) {
         are $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azf $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqg(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azs {
      a("this", etc.a),
      b("killer", etc.d),
      c("direct_killer", etc.e),
      d("killer_player", etc.b);

      public static final azs.a<eqg.b> e = azs.a(eqg.b::values);
      private final String f;
      private final esz<? extends bss> g;

      private b(final String $$0, final esz<? extends bss> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public esz<? extends bss> a() {
         return this.g;
      }

      public static eqg.b a(String $$0) {
         eqg.b $$1 = e.a($$0);
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

   public static record c<T>(eqi<T> a, T b) {
   }
}
