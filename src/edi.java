import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class edi {
   private final edo a;
   private final ate b;
   private final edm c;
   private final Set<edi.c<?>> d = Sets.newLinkedHashSet();

   edi(edo $$0, ate $$1, edm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(efq<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(efq<T> $$0) {
      return this.a.b($$0);
   }

   public void a(afw $$0, Consumer<ckj> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(efq<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(edi.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(edi.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(edi.c<?> $$0) {
      this.d.remove($$0);
   }

   public edm a() {
      return this.c;
   }

   public ate b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public alq d() {
      return this.a.a();
   }

   public static edi.c<edq> a(edq $$0) {
      return new edi.c<>(edn.c, $$0);
   }

   public static edi.c<egh> a(egh $$0) {
      return new edi.c<>(edn.a, $$0);
   }

   public static edi.c<eev> a(eev $$0) {
      return new edi.c<>(edn.b, $$0);
   }

   public static class a {
      private final edo a;
      @Nullable
      private ate b;

      public a(edo $$0) {
         this.a = $$0;
      }

      public edi.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ate.a($$0);
         }

         return this;
      }

      public alq a() {
         return this.a.a();
      }

      public edi a(Optional<afw> $$0) {
         alq $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         ate $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new edi(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements atr {
      a("this", eft.a),
      b("killer", eft.d),
      c("direct_killer", eft.e),
      d("killer_player", eft.b);

      public static final atr.a<edi.b> e = atr.a(edi.b::values);
      private final String f;
      private final efq<? extends bjt> g;

      private b(String $$0, efq<? extends bjt> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public efq<? extends bjt> a() {
         return this.g;
      }

      public static edi.b a(String $$0) {
         edi.b $$1 = e.a($$0);
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

   public static record c<T>(edn<T> a, T b) {
   }
}
