import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ecg {
   private final ecm a;
   private final aru b;
   private final eck c;
   private final Set<ecg.c<?>> d = Sets.newLinkedHashSet();

   ecg(ecm $$0, aru $$1, eck $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eeo<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eeo<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aer $$0, Consumer<cix> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eeo<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ecg.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ecg.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ecg.c<?> $$0) {
      this.d.remove($$0);
   }

   public eck a() {
      return this.c;
   }

   public aru b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public akk d() {
      return this.a.a();
   }

   public static ecg.c<eco> a(eco $$0) {
      return new ecg.c<>(ecl.c, $$0);
   }

   public static ecg.c<eff> a(eff $$0) {
      return new ecg.c<>(ecl.a, $$0);
   }

   public static ecg.c<edt> a(edt $$0) {
      return new ecg.c<>(ecl.b, $$0);
   }

   public static class a {
      private final ecm a;
      @Nullable
      private aru b;

      public a(ecm $$0) {
         this.a = $$0;
      }

      public ecg.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = aru.a($$0);
         }

         return this;
      }

      public akk a() {
         return this.a.a();
      }

      public ecg a(Optional<aer> $$0) {
         akk $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         aru $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::y_);
         return new ecg(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements ash {
      a("this", eer.a),
      b("killer", eer.d),
      c("direct_killer", eer.e),
      d("killer_player", eer.b);

      public static final ash.a<ecg.b> e = ash.a(ecg.b::values);
      private final String f;
      private final eeo<? extends bii> g;

      private b(String $$0, eeo<? extends bii> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eeo<? extends bii> a() {
         return this.g;
      }

      public static ecg.b a(String $$0) {
         ecg.b $$1 = e.a($$0);
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

   public static record c<T>(ecl<T> a, T b) {
   }
}
