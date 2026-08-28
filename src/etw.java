import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class etw {
   private final etz a;
   private final azr b;
   private final jq.a c;
   private final Set<etw.c<?>> d = Sets.newLinkedHashSet();

   etw(etz $$0, azr $$1, jq.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ewp<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ewp<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alh $$0, Consumer<cvx> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ewp<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(etw.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(etw.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(etw.c<?> $$0) {
      this.d.remove($$0);
   }

   public jq.a a() {
      return this.c;
   }

   public azr b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arm d() {
      return this.a.a();
   }

   public static etw.c<eub> a(eub $$0) {
      return new etw.c<>(ety.c, $$0);
   }

   public static etw.c<exh> a(exh $$0) {
      return new etw.c<>(ety.a, $$0);
   }

   public static etw.c<evk> a(evk $$0) {
      return new etw.c<>(ety.b, $$0);
   }

   public static class a {
      private final etz a;
      @Nullable
      private azr b;

      public a(etz $$0) {
         this.a = $$0;
      }

      public etw.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azr.a($$0);
         }

         return this;
      }

      public etw.a a(azr $$0) {
         this.b = $$0;
         return this;
      }

      public arm a() {
         return this.a.a();
      }

      public etw a(Optional<alh> $$0) {
         arm $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azr $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new etw(this.a, $$3, $$2.bd().a());
      }
   }

   public static enum b implements baf {
      a("this", ews.a),
      b("attacker", ews.d),
      c("direct_attacker", ews.e),
      d("attacking_player", ews.b);

      public static final baf.a<etw.b> e = baf.a(etw.b::values);
      private final String f;
      private final ewp<? extends btz> g;

      private b(final String $$0, final ewp<? extends btz> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ewp<? extends btz> a() {
         return this.g;
      }

      public static etw.b a(String $$0) {
         etw.b $$1 = e.a($$0);
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

   public static record c<T>(ety<T> a, T b) {
   }
}
