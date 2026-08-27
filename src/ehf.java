import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ehf {
   private final ehl a;
   private final auw b;
   private final ehj c;
   private final Set<ehf.c<?>> d = Sets.newLinkedHashSet();

   ehf(ehl $$0, auw $$1, ehj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ejn<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ejn<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ahh $$0, Consumer<cng> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ejn<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ehf.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ehf.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ehf.c<?> $$0) {
      this.d.remove($$0);
   }

   public ehj a() {
      return this.c;
   }

   public auw b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public ane d() {
      return this.a.a();
   }

   public static ehf.c<ehn> a(ehn $$0) {
      return new ehf.c<>(ehk.c, $$0);
   }

   public static ehf.c<eke> a(eke $$0) {
      return new ehf.c<>(ehk.a, $$0);
   }

   public static ehf.c<eis> a(eis $$0) {
      return new ehf.c<>(ehk.b, $$0);
   }

   public static class a {
      private final ehl a;
      @Nullable
      private auw b;

      public a(ehl $$0) {
         this.a = $$0;
      }

      public ehf.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = auw.a($$0);
         }

         return this;
      }

      public ane a() {
         return this.a.a();
      }

      public ehf a(Optional<ahh> $$0) {
         ane $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         auw $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new ehf(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements avl {
      a("this", ejq.a),
      b("killer", ejq.d),
      c("direct_killer", ejq.e),
      d("killer_player", ejq.b);

      public static final avl.a<ehf.b> e = avl.a(ehf.b::values);
      private final String f;
      private final ejn<? extends blw> g;

      private b(String $$0, ejn<? extends blw> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ejn<? extends blw> a() {
         return this.g;
      }

      public static ehf.b a(String $$0) {
         ehf.b $$1 = e.a($$0);
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

   public static record c<T>(ehk<T> a, T b) {
   }
}
