import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class erp {
   private final ers a;
   private final ayt b;
   private final jb.a c;
   private final Set<erp.c<?>> d = Sets.newLinkedHashSet();

   erp(ers $$0, ayt $$1, jb.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eud<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eud<T> $$0) {
      return this.a.b($$0);
   }

   public void a(akt $$0, Consumer<cuh> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eud<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(erp.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(erp.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(erp.c<?> $$0) {
      this.d.remove($$0);
   }

   public jb.a a() {
      return this.c;
   }

   public ayt b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aqt d() {
      return this.a.a();
   }

   public static erp.c<eru> a(eru $$0) {
      return new erp.c<>(err.c, $$0);
   }

   public static erp.c<euu> a(euu $$0) {
      return new erp.c<>(err.a, $$0);
   }

   public static erp.c<etb> a(etb $$0) {
      return new erp.c<>(err.b, $$0);
   }

   public static class a {
      private final ers a;
      @Nullable
      private ayt b;

      public a(ers $$0) {
         this.a = $$0;
      }

      public erp.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ayt.a($$0);
         }

         return this;
      }

      public aqt a() {
         return this.a.a();
      }

      public erp a(Optional<akt> $$0) {
         aqt $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         ayt $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new erp(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azg {
      a("this", eug.a),
      b("killer", eug.d),
      c("direct_killer", eug.e),
      d("killer_player", eug.b);

      public static final azg.a<erp.b> e = azg.a(erp.b::values);
      private final String f;
      private final eud<? extends brv> g;

      private b(String $$0, eud<? extends brv> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eud<? extends brv> a() {
         return this.g;
      }

      public static erp.b a(String $$0) {
         erp.b $$1 = e.a($$0);
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

   public static record c<T>(err<T> a, T b) {
   }
}
