import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ecs {
   private final ecy a;
   private final ase b;
   private final ecw c;
   private final Set<ecs.c<?>> d = Sets.newLinkedHashSet();

   ecs(ecy $$0, ase $$1, ecw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(efa<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(efa<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aey $$0, Consumer<cjh> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(efa<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ecs.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ecs.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ecs.c<?> $$0) {
      this.d.remove($$0);
   }

   public ecw a() {
      return this.c;
   }

   public ase b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aks d() {
      return this.a.a();
   }

   public static ecs.c<eda> a(eda $$0) {
      return new ecs.c<>(ecx.c, $$0);
   }

   public static ecs.c<efr> a(efr $$0) {
      return new ecs.c<>(ecx.a, $$0);
   }

   public static ecs.c<eef> a(eef $$0) {
      return new ecs.c<>(ecx.b, $$0);
   }

   public static class a {
      private final ecy a;
      @Nullable
      private ase b;

      public a(ecy $$0) {
         this.a = $$0;
      }

      public ecs.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ase.a($$0);
         }

         return this;
      }

      public aks a() {
         return this.a.a();
      }

      public ecs a(Optional<aey> $$0) {
         aks $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         ase $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::D_);
         return new ecs(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements asr {
      a("this", efd.a),
      b("killer", efd.d),
      c("direct_killer", efd.e),
      d("killer_player", efd.b);

      public static final asr.a<ecs.b> e = asr.a(ecs.b::values);
      private final String f;
      private final efa<? extends bis> g;

      private b(String $$0, efa<? extends bis> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public efa<? extends bis> a() {
         return this.g;
      }

      public static ecs.b a(String $$0) {
         ecs.b $$1 = e.a($$0);
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

   public static record c<T>(ecx<T> a, T b) {
   }
}
