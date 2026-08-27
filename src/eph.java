import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eph {
   private final epk a;
   private final aym b;
   private final iy.a c;
   private final Set<eph.c<?>> d = Sets.newLinkedHashSet();

   eph(epk $$0, aym $$1, iy.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(erw<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(erw<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akn $$0, Consumer<ctq> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(erw<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eph.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eph.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eph.c<?> $$0) {
      this.d.remove($$0);
   }

   public iy.a a() {
      return this.c;
   }

   public aym b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqn d() {
      return this.a.a();
   }

   public static eph.c<epm> a(epm $$0) {
      return new eph.c<>(epj.c, $$0);
   }

   public static eph.c<esn> a(esn $$0) {
      return new eph.c<>(epj.a, $$0);
   }

   public static eph.c<eqt> a(eqt $$0) {
      return new eph.c<>(epj.b, $$0);
   }

   public static class a {
      private final epk a;
      @Nullable
      private aym b;

      public a(epk $$0) {
         this.a = $$0;
      }

      public eph.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = aym.a($$0);
         }

         return this;
      }

      public aqn a() {
         return this.a.a();
      }

      public eph a(Optional<akn> $$0) {
         aqn $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         aym $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eph(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements ayz {
      a("this", erz.a),
      b("killer", erz.d),
      c("direct_killer", erz.e),
      d("killer_player", erz.b);

      public static final ayz.a<eph.b> e = ayz.a(eph.b::values);
      private final String f;
      private final erw<? extends brw> g;

      private b(String $$0, erw<? extends brw> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public erw<? extends brw> a() {
         return this.g;
      }

      public static eph.b a(String $$0) {
         eph.b $$1 = e.a($$0);
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

   public static record c<T>(epj<T> a, T b) {
   }
}
