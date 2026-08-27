import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eol {
   private final eoo a;
   private final ayg b;
   private final ix.a c;
   private final Set<eol.c<?>> d = Sets.newLinkedHashSet();

   eol(eoo $$0, ayg $$1, ix.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eqz<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eqz<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akh $$0, Consumer<csz> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eqz<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eol.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eol.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eol.c<?> $$0) {
      this.d.remove($$0);
   }

   public ix.a a() {
      return this.c;
   }

   public ayg b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqh d() {
      return this.a.a();
   }

   public static eol.c<eoq> a(eoq $$0) {
      return new eol.c<>(eon.c, $$0);
   }

   public static eol.c<erq> a(erq $$0) {
      return new eol.c<>(eon.a, $$0);
   }

   public static eol.c<epx> a(epx $$0) {
      return new eol.c<>(eon.b, $$0);
   }

   public static class a {
      private final eoo a;
      @Nullable
      private ayg b;

      public a(eoo $$0) {
         this.a = $$0;
      }

      public eol.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayg.a($$0);
         }

         return this;
      }

      public aqh a() {
         return this.a.a();
      }

      public eol a(Optional<akh> $$0) {
         aqh $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayg $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eol(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements ayt {
      a("this", erc.a),
      b("killer", erc.d),
      c("direct_killer", erc.e),
      d("killer_player", erc.b);

      public static final ayt.a<eol.b> e = ayt.a(eol.b::values);
      private final String f;
      private final eqz<? extends brh> g;

      private b(String $$0, eqz<? extends brh> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eqz<? extends brh> a() {
         return this.g;
      }

      public static eol.b a(String $$0) {
         eol.b $$1 = e.a($$0);
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

   public static record c<T>(eon<T> a, T b) {
   }
}
