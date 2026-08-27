import com.google.common.collect.Sets;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ech {
   private final ecn a;
   private final art b;
   private final ecl c;
   private final Set<ech.c<?>> d = Sets.newLinkedHashSet();

   ech(ecn $$0, art $$1, ecl $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eeq<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eeq<T> $$0) {
      return this.a.b($$0);
   }

   public void a(aep $$0, Consumer<ciw> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eeq<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ech.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ech.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ech.c<?> $$0) {
      this.d.remove($$0);
   }

   public ecl a() {
      return this.c;
   }

   public art b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public aki d() {
      return this.a.a();
   }

   public static ech.c<ecp> a(ecp $$0) {
      return new ech.c<>(ecm.c, $$0);
   }

   public static ech.c<efh> a(efh $$0) {
      return new ech.c<>(ecm.a, $$0);
   }

   public static ech.c<edw> a(edw $$0) {
      return new ech.c<>(ecm.b, $$0);
   }

   public static class a {
      private final ecn a;
      @Nullable
      private art b;

      public a(ecn $$0) {
         this.a = $$0;
      }

      public ech.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = art.a($$0);
         }

         return this;
      }

      public aki a() {
         return this.a.a();
      }

      public ech a(@Nullable aep $$0) {
         aki $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         art $$3;
         if (this.b != null) {
            $$3 = this.b;
         } else if ($$0 != null) {
            $$3 = $$1.a($$0);
         } else {
            $$3 = $$1.y_();
         }

         return new ech(this.a, $$3, $$2.aH());
      }
   }

   public static enum b {
      a("this", eet.a),
      b("killer", eet.d),
      c("direct_killer", eet.e),
      d("killer_player", eet.b);

      final String e;
      private final eeq<? extends big> f;

      private b(String $$0, eeq<? extends big> $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public eeq<? extends big> a() {
         return this.f;
      }

      public static ech.b a(String $$0) {
         for (ech.b $$1 : values()) {
            if ($$1.e.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid entity target " + $$0);
      }

      public static class a extends TypeAdapter<ech.b> {
         public void a(JsonWriter $$0, ech.b $$1) throws IOException {
            $$0.value($$1.e);
         }

         public ech.b a(JsonReader $$0) throws IOException {
            return ech.b.a($$0.nextString());
         }
      }
   }

   public static record c<T>(ecm<T> a, T b) {
   }
}
