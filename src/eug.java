import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eug {
   private final euj a;
   private final azv b;
   private final jr.a c;
   private final Set<eug.c<?>> d = Sets.newLinkedHashSet();

   eug(euj $$0, azv $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ewz<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ewz<T> $$0) {
      return this.a.b($$0);
   }

   public void a(all $$0, Consumer<cwf> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ewz<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eug.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eug.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eug.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public azv b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arq d() {
      return this.a.a();
   }

   public static eug.c<eul> a(eul $$0) {
      return new eug.c<>(eui.c, $$0);
   }

   public static eug.c<exr> a(exr $$0) {
      return new eug.c<>(eui.a, $$0);
   }

   public static eug.c<evu> a(evu $$0) {
      return new eug.c<>(eui.b, $$0);
   }

   public static class a {
      private final euj a;
      @Nullable
      private azv b;

      public a(euj $$0) {
         this.a = $$0;
      }

      public eug.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azv.a($$0);
         }

         return this;
      }

      public eug.a a(azv $$0) {
         this.b = $$0;
         return this;
      }

      public arq a() {
         return this.a.a();
      }

      public eug a(Optional<all> $$0) {
         arq $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azv $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eug(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements baj {
      a("this", exc.a),
      b("attacker", exc.d),
      c("direct_attacker", exc.e),
      d("attacking_player", exc.b);

      public static final baj.a<eug.b> e = baj.a(eug.b::values);
      private final String f;
      private final ewz<? extends bui> g;

      private b(final String $$0, final ewz<? extends bui> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ewz<? extends bui> a() {
         return this.g;
      }

      public static eug.b a(String $$0) {
         eug.b $$1 = e.a($$0);
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

   public static record c<T>(eui<T> a, T b) {
   }
}
