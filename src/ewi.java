import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ewi {
   private final ewl a;
   private final bac b;
   private final jr.a c;
   private final Set<ewi.c<?>> d = Sets.newLinkedHashSet();

   ewi(ewl $$0, bac $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bbd<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bbd<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bbd<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(alp $$0, Consumer<cxg> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ewi.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ewi.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ewi.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public bac b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public arx d() {
      return this.a.a();
   }

   public static ewi.c<ewn> a(ewn $$0) {
      return new ewi.c<>(ewk.c, $$0);
   }

   public static ewi.c<ezr> a(ezr $$0) {
      return new ewi.c<>(ewk.a, $$0);
   }

   public static ewi.c<exw> a(exw $$0) {
      return new ewi.c<>(ewk.b, $$0);
   }

   public static class a {
      private final ewl a;
      @Nullable
      private bac b;

      public a(ewl $$0) {
         this.a = $$0;
      }

      public ewi.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = bac.a($$0);
         }

         return this;
      }

      public ewi.a a(bac $$0) {
         this.b = $$0;
         return this;
      }

      public arx a() {
         return this.a.a();
      }

      public ewi a(Optional<alp> $$0) {
         arx $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         bac $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new ewi(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements baq {
      a("this", ezc.a),
      b("attacker", ezc.d),
      c("direct_attacker", ezc.e),
      d("attacking_player", ezc.b);

      public static final baq.a<ewi.b> e = baq.a(ewi.b::values);
      private final String f;
      private final bbd<? extends bvb> g;

      private b(final String $$0, final bbd<? extends bvb> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bbd<? extends bvb> a() {
         return this.g;
      }

      public static ewi.b a(String $$0) {
         ewi.b $$1 = e.a($$0);
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

   public static record c<T>(ewk<T> a, T b) {
   }
}
