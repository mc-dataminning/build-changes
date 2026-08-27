import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eel {
   private final eer a;
   private final ato b;
   private final eep c;
   private final Set<eel.c<?>> d = Sets.newLinkedHashSet();

   eel(eer $$0, ato $$1, eep $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(egt<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(egt<T> $$0) {
      return this.a.b($$0);
   }

   public void a(agg $$0, Consumer<clb> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(egt<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eel.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eel.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eel.c<?> $$0) {
      this.d.remove($$0);
   }

   public eep a() {
      return this.c;
   }

   public ato b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public ama d() {
      return this.a.a();
   }

   public static eel.c<eet> a(eet $$0) {
      return new eel.c<>(eeq.c, $$0);
   }

   public static eel.c<ehk> a(ehk $$0) {
      return new eel.c<>(eeq.a, $$0);
   }

   public static eel.c<efy> a(efy $$0) {
      return new eel.c<>(eeq.b, $$0);
   }

   public static class a {
      private final eer a;
      @Nullable
      private ato b;

      public a(eer $$0) {
         this.a = $$0;
      }

      public eel.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ato.a($$0);
         }

         return this;
      }

      public ama a() {
         return this.a.a();
      }

      public eel a(Optional<agg> $$0) {
         ama $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         ato $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eel(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements aub {
      a("this", egw.a),
      b("killer", egw.d),
      c("direct_killer", egw.e),
      d("killer_player", egw.b);

      public static final aub.a<eel.b> e = aub.a(eel.b::values);
      private final String f;
      private final egt<? extends bki> g;

      private b(String $$0, egt<? extends bki> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public egt<? extends bki> a() {
         return this.g;
      }

      public static eel.b a(String $$0) {
         eel.b $$1 = e.a($$0);
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

   public static record c<T>(eeq<T> a, T b) {
   }
}
