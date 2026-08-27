import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class efc {
   private final efi a;
   private final atw b;
   private final efg c;
   private final Set<efc.c<?>> d = Sets.newLinkedHashSet();

   efc(efi $$0, atw $$1, efg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ehk<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ehk<T> $$0) {
      return this.a.b($$0);
   }

   public void a(agm $$0, Consumer<clo> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ehk<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(efc.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(efc.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(efc.c<?> $$0) {
      this.d.remove($$0);
   }

   public efg a() {
      return this.c;
   }

   public atw b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public ami d() {
      return this.a.a();
   }

   public static efc.c<efk> a(efk $$0) {
      return new efc.c<>(efh.c, $$0);
   }

   public static efc.c<eib> a(eib $$0) {
      return new efc.c<>(efh.a, $$0);
   }

   public static efc.c<egp> a(egp $$0) {
      return new efc.c<>(efh.b, $$0);
   }

   public static class a {
      private final efi a;
      @Nullable
      private atw b;

      public a(efi $$0) {
         this.a = $$0;
      }

      public efc.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = atw.a($$0);
         }

         return this;
      }

      public ami a() {
         return this.a.a();
      }

      public efc a(Optional<agm> $$0) {
         ami $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         atw $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::F_);
         return new efc(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements auk {
      a("this", ehn.a),
      b("killer", ehn.d),
      c("direct_killer", ehn.e),
      d("killer_player", ehn.b);

      public static final auk.a<efc.b> e = auk.a(efc.b::values);
      private final String f;
      private final ehk<? extends bkv> g;

      private b(String $$0, ehk<? extends bkv> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ehk<? extends bkv> a() {
         return this.g;
      }

      public static efc.b a(String $$0) {
         efc.b $$1 = e.a($$0);
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

   public static record c<T>(efh<T> a, T b) {
   }
}
