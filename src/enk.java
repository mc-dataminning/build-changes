import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class enk {
   private final enq a;
   private final axt b;
   private final eno c;
   private final Set<enk.c<?>> d = Sets.newLinkedHashSet();

   enk(enq $$0, axt $$1, eno $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(epu<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(epu<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ajv $$0, Consumer<crs> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(epu<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(enk.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(enk.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(enk.c<?> $$0) {
      this.d.remove($$0);
   }

   public eno a() {
      return this.c;
   }

   public axt b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public apu d() {
      return this.a.a();
   }

   public static enk.c<ens> a(ens $$0) {
      return new enk.c<>(enp.c, $$0);
   }

   public static enk.c<eql> a(eql $$0) {
      return new enk.c<>(enp.a, $$0);
   }

   public static enk.c<eoy> a(eoy $$0) {
      return new enk.c<>(enp.b, $$0);
   }

   public static class a {
      private final enq a;
      @Nullable
      private axt b;

      public a(enq $$0) {
         this.a = $$0;
      }

      public enk.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = axt.a($$0);
         }

         return this;
      }

      public apu a() {
         return this.a.a();
      }

      public enk a(Optional<ajv> $$0) {
         apu $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         axt $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new enk(this.a, $$3, $$2.aM());
      }
   }

   public static enum b implements ayg {
      a("this", epx.a),
      b("killer", epx.d),
      c("direct_killer", epx.e),
      d("killer_player", epx.b);

      public static final ayg.a<enk.b> e = ayg.a(enk.b::values);
      private final String f;
      private final epu<? extends bqa> g;

      private b(String $$0, epu<? extends bqa> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public epu<? extends bqa> a() {
         return this.g;
      }

      public static enk.b a(String $$0) {
         enk.b $$1 = e.a($$0);
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

   public static record c<T>(enp<T> a, T b) {
   }
}
