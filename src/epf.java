import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class epf {
   private final epi a;
   private final ayk b;
   private final iy.a c;
   private final Set<epf.c<?>> d = Sets.newLinkedHashSet();

   epf(epi $$0, ayk $$1, iy.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eru<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eru<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akm $$0, Consumer<cto> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eru<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(epf.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(epf.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(epf.c<?> $$0) {
      this.d.remove($$0);
   }

   public iy.a a() {
      return this.c;
   }

   public ayk b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqm d() {
      return this.a.a();
   }

   public static epf.c<epk> a(epk $$0) {
      return new epf.c<>(eph.c, $$0);
   }

   public static epf.c<esl> a(esl $$0) {
      return new epf.c<>(eph.a, $$0);
   }

   public static epf.c<eqr> a(eqr $$0) {
      return new epf.c<>(eph.b, $$0);
   }

   public static class a {
      private final epi a;
      @Nullable
      private ayk b;

      public a(epi $$0) {
         this.a = $$0;
      }

      public epf.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayk.a($$0);
         }

         return this;
      }

      public aqm a() {
         return this.a.a();
      }

      public epf a(Optional<akm> $$0) {
         aqm $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayk $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new epf(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements ayx {
      a("this", erx.a),
      b("killer", erx.d),
      c("direct_killer", erx.e),
      d("killer_player", erx.b);

      public static final ayx.a<epf.b> e = ayx.a(epf.b::values);
      private final String f;
      private final eru<? extends bru> g;

      private b(String $$0, eru<? extends bru> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eru<? extends bru> a() {
         return this.g;
      }

      public static epf.b a(String $$0) {
         epf.b $$1 = e.a($$0);
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

   public static record c<T>(eph<T> a, T b) {
   }
}
