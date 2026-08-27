import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class egw {
   private final ehc a;
   private final auv b;
   private final eha c;
   private final Set<egw.c<?>> d = Sets.newLinkedHashSet();

   egw(ehc $$0, auv $$1, eha $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eje<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eje<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ahg $$0, Consumer<cmy> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eje<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(egw.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(egw.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(egw.c<?> $$0) {
      this.d.remove($$0);
   }

   public eha a() {
      return this.c;
   }

   public auv b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public and d() {
      return this.a.a();
   }

   public static egw.c<ehe> a(ehe $$0) {
      return new egw.c<>(ehb.c, $$0);
   }

   public static egw.c<ejv> a(ejv $$0) {
      return new egw.c<>(ehb.a, $$0);
   }

   public static egw.c<eij> a(eij $$0) {
      return new egw.c<>(ehb.b, $$0);
   }

   public static class a {
      private final ehc a;
      @Nullable
      private auv b;

      public a(ehc $$0) {
         this.a = $$0;
      }

      public egw.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = auv.a($$0);
         }

         return this;
      }

      public and a() {
         return this.a.a();
      }

      public egw a(Optional<ahg> $$0) {
         and $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         auv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new egw(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements avk {
      a("this", ejh.a),
      b("killer", ejh.d),
      c("direct_killer", ejh.e),
      d("killer_player", ejh.b);

      public static final avk.a<egw.b> e = avk.a(egw.b::values);
      private final String f;
      private final eje<? extends blv> g;

      private b(String $$0, eje<? extends blv> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eje<? extends blv> a() {
         return this.g;
      }

      public static egw.b a(String $$0) {
         egw.b $$1 = e.a($$0);
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

   public static record c<T>(ehb<T> a, T b) {
   }
}
