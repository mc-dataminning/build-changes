import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ecq {
   private final ecw a;
   private final asc b;
   private final ecu c;
   private final Set<ecq.c<?>> d = Sets.newLinkedHashSet();

   ecq(ecw $$0, asc $$1, ecu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eey<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eey<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aex $$0, Consumer<cjf> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eey<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ecq.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ecq.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ecq.c<?> $$0) {
      this.d.remove($$0);
   }

   public ecu a() {
      return this.c;
   }

   public asc b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public akr d() {
      return this.a.a();
   }

   public static ecq.c<ecy> a(ecy $$0) {
      return new ecq.c<>(ecv.c, $$0);
   }

   public static ecq.c<efp> a(efp $$0) {
      return new ecq.c<>(ecv.a, $$0);
   }

   public static ecq.c<eed> a(eed $$0) {
      return new ecq.c<>(ecv.b, $$0);
   }

   public static class a {
      private final ecw a;
      @Nullable
      private asc b;

      public a(ecw $$0) {
         this.a = $$0;
      }

      public ecq.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = asc.a($$0);
         }

         return this;
      }

      public akr a() {
         return this.a.a();
      }

      public ecq a(Optional<aex> $$0) {
         akr $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         asc $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::D_);
         return new ecq(this.a, $$3, $$2.aH());
      }
   }

   public static enum b implements asp {
      a("this", efb.a),
      b("killer", efb.d),
      c("direct_killer", efb.e),
      d("killer_player", efb.b);

      public static final asp.a<ecq.b> e = asp.a(ecq.b::values);
      private final String f;
      private final eey<? extends biq> g;

      private b(String $$0, eey<? extends biq> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eey<? extends biq> a() {
         return this.g;
      }

      public static ecq.b a(String $$0) {
         ecq.b $$1 = e.a($$0);
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

   public static record c<T>(ecv<T> a, T b) {
   }
}
