import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ejc {
   private final eji a;
   private final awp b;
   private final ejg c;
   private final Set<ejc.c<?>> d = Sets.newLinkedHashSet();

   ejc(eji $$0, awp $$1, ejg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(elk<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(elk<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aiy $$0, Consumer<cpd> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(elk<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ejc.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ejc.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ejc.c<?> $$0) {
      this.d.remove($$0);
   }

   public ejg a() {
      return this.c;
   }

   public awp b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aow d() {
      return this.a.a();
   }

   public static ejc.c<ejk> a(ejk $$0) {
      return new ejc.c<>(ejh.c, $$0);
   }

   public static ejc.c<emb> a(emb $$0) {
      return new ejc.c<>(ejh.a, $$0);
   }

   public static ejc.c<ekp> a(ekp $$0) {
      return new ejc.c<>(ejh.b, $$0);
   }

   public static class a {
      private final eji a;
      @Nullable
      private awp b;

      public a(eji $$0) {
         this.a = $$0;
      }

      public ejc.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = awp.a($$0);
         }

         return this;
      }

      public aow a() {
         return this.a.a();
      }

      public ejc a(Optional<aiy> $$0) {
         aow $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         awp $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new ejc(this.a, $$3, $$2.aL());
      }
   }

   public static enum b implements axc {
      a("this", eln.a),
      b("killer", eln.d),
      c("direct_killer", eln.e),
      d("killer_player", eln.b);

      public static final axc.a<ejc.b> e = axc.a(ejc.b::values);
      private final String f;
      private final elk<? extends bnq> g;

      private b(String $$0, elk<? extends bnq> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public elk<? extends bnq> a() {
         return this.g;
      }

      public static ejc.b a(String $$0) {
         ejc.b $$1 = e.a($$0);
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

   public static record c<T>(ejh<T> a, T b) {
   }
}
