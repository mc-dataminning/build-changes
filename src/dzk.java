import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class dzk {
   private final dzq a;
   private final apf b;
   private final dzo c;
   private final Set<dzk.c<?>> d = Sets.newLinkedHashSet();

   dzk(dzq $$0, apf $$1, dzo $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ebt<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ebt<T> $$0) {
      return this.a.b($$0);
   }

   public void a(acq $$0, Consumer<cfz> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ebt<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(dzk.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(dzk.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(dzk.c<?> $$0) {
      this.d.remove($$0);
   }

   public dzo a() {
      return this.c;
   }

   public apf b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aif d() {
      return this.a.a();
   }

   public static dzk.c<dzs> a(dzs $$0) {
      return new dzk.c<>(dzp.c, $$0);
   }

   public static dzk.c<eck> a(eck $$0) {
      return new dzk.c<>(dzp.a, $$0);
   }

   public static dzk.c<eaz> a(eaz $$0) {
      return new dzk.c<>(dzp.b, $$0);
   }

   public static class a {
      private final dzq a;
      @Nullable
      private apf b;

      public a(dzq $$0) {
         this.a = $$0;
      }

      public dzk.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = apf.a($$0);
         }

         return this;
      }

      public aif a() {
         return this.a.a();
      }

      public dzk a(@Nullable acq $$0) {
         aif $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         apf $$3;
         if (this.b != null) {
            $$3 = this.b;
         } else if ($$0 != null) {
            $$3 = $$1.a($$0);
         } else {
            $$3 = $$1.y_();
         }

         return new dzk(this.a, $$3, $$2.aH());
      }
   }

   public static enum b {
      a("this", ebw.a),
      b("killer", ebw.d),
      c("direct_killer", ebw.e),
      d("killer_player", ebw.b);

      final String e;
      private final ebt<? extends bfj> f;

      private b(String $$0, ebt<? extends bfj> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public ebt<? extends bfj> a() {
         return this.f;
      }

      public static dzk.b a(String $$0) {
         for (dzk.b $$1 : values()) {
            if ($$1.e.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid entity target " + $$0);
      }

      public static class a extends TypeAdapter<dzk.b> {
         public void a(JsonWriter $$0, dzk.b $$1) throws IOException {
            $$0.value($$1.e);
         }

         public dzk.b a(JsonReader $$0) throws IOException {
            return dzk.b.a($$0.nextString());
         }
      }
   }

   public static record c<T>(dzp<T> a, T b) {
   }
}
