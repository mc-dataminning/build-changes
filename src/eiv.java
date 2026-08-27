import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eiv {
   private final ejb a;
   private final awo b;
   private final eiz c;
   private final Set<eiv.c<?>> d = Sets.newLinkedHashSet();

   eiv(ejb $$0, awo $$1, eiz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eld<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eld<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aiy $$0, Consumer<coz> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eld<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eiv.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eiv.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eiv.c<?> $$0) {
      this.d.remove($$0);
   }

   public eiz a() {
      return this.c;
   }

   public awo b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aov d() {
      return this.a.a();
   }

   public static eiv.c<ejd> a(ejd $$0) {
      return new eiv.c<>(eja.c, $$0);
   }

   public static eiv.c<elu> a(elu $$0) {
      return new eiv.c<>(eja.a, $$0);
   }

   public static eiv.c<eki> a(eki $$0) {
      return new eiv.c<>(eja.b, $$0);
   }

   public static class a {
      private final ejb a;
      @Nullable
      private awo b;

      public a(ejb $$0) {
         this.a = $$0;
      }

      public eiv.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = awo.a($$0);
         }

         return this;
      }

      public aov a() {
         return this.a.a();
      }

      public eiv a(Optional<aiy> $$0) {
         aov $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         awo $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new eiv(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements axc {
      a("this", elg.a),
      b("killer", elg.d),
      c("direct_killer", elg.e),
      d("killer_player", elg.b);

      public static final axc.a<eiv.b> e = axc.a(eiv.b::values);
      private final String f;
      private final eld<? extends bno> g;

      private b(String $$0, eld<? extends bno> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eld<? extends bno> a() {
         return this.g;
      }

      public static eiv.b a(String $$0) {
         eiv.b $$1 = e.a($$0);
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

   public static record c<T>(eja<T> a, T b) {
   }
}
