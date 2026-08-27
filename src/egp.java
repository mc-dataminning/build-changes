import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class egp {
   private final egv a;
   private final aup b;
   private final egt c;
   private final Set<egp.c<?>> d = Sets.newLinkedHashSet();

   egp(egv $$0, aup $$1, egt $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eix<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eix<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ahd $$0, Consumer<cmr> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eix<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(egp.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(egp.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(egp.c<?> $$0) {
      this.d.remove($$0);
   }

   public egt a() {
      return this.c;
   }

   public aup b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public amz d() {
      return this.a.a();
   }

   public static egp.c<egx> a(egx $$0) {
      return new egp.c<>(egu.c, $$0);
   }

   public static egp.c<ejo> a(ejo $$0) {
      return new egp.c<>(egu.a, $$0);
   }

   public static egp.c<eic> a(eic $$0) {
      return new egp.c<>(egu.b, $$0);
   }

   public static class a {
      private final egv a;
      @Nullable
      private aup b;

      public a(egv $$0) {
         this.a = $$0;
      }

      public egp.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = aup.a($$0);
         }

         return this;
      }

      public amz a() {
         return this.a.a();
      }

      public egp a(Optional<ahd> $$0) {
         amz $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         aup $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new egp(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements ave {
      a("this", eja.a),
      b("killer", eja.d),
      c("direct_killer", eja.e),
      d("killer_player", eja.b);

      public static final ave.a<egp.b> e = ave.a(egp.b::values);
      private final String f;
      private final eix<? extends blp> g;

      private b(String $$0, eix<? extends blp> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eix<? extends blp> a() {
         return this.g;
      }

      public static egp.b a(String $$0) {
         egp.b $$1 = e.a($$0);
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

   public static record c<T>(egu<T> a, T b) {
   }
}
