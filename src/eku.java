import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eku {
   private final ela a;
   private final axd b;
   private final eky c;
   private final Set<eku.c<?>> d = Sets.newLinkedHashSet();

   eku(ela $$0, axd $$1, eky $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(enc<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(enc<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ajh $$0, Consumer<cqk> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(enc<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eku.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eku.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eku.c<?> $$0) {
      this.d.remove($$0);
   }

   public eky a() {
      return this.c;
   }

   public axd b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public apf d() {
      return this.a.a();
   }

   public static eku.c<elc> a(elc $$0) {
      return new eku.c<>(ekz.c, $$0);
   }

   public static eku.c<ent> a(ent $$0) {
      return new eku.c<>(ekz.a, $$0);
   }

   public static eku.c<emh> a(emh $$0) {
      return new eku.c<>(ekz.b, $$0);
   }

   public static class a {
      private final ela a;
      @Nullable
      private axd b;

      public a(ela $$0) {
         this.a = $$0;
      }

      public eku.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = axd.a($$0);
         }

         return this;
      }

      public apf a() {
         return this.a.a();
      }

      public eku a(Optional<ajh> $$0) {
         apf $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         axd $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eku(this.a, $$3, $$2.aM());
      }
   }

   public static enum b implements axq {
      a("this", enf.a),
      b("killer", enf.d),
      c("direct_killer", enf.e),
      d("killer_player", enf.b);

      public static final axq.a<eku.b> e = axq.a(eku.b::values);
      private final String f;
      private final enc<? extends bow> g;

      private b(String $$0, enc<? extends bow> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public enc<? extends bow> a() {
         return this.g;
      }

      public static eku.b a(String $$0) {
         eku.b $$1 = e.a($$0);
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

   public static record c<T>(ekz<T> a, T b) {
   }
}
