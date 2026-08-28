import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eun {
   private final euq a;
   private final azu b;
   private final jr.a c;
   private final Set<eun.c<?>> d = Sets.newLinkedHashSet();

   eun(euq $$0, azu $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(exg<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(exg<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alj $$0, Consumer<cwm> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(exg<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eun.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eun.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eun.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public azu b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arp d() {
      return this.a.a();
   }

   public static eun.c<eus> a(eus $$0) {
      return new eun.c<>(eup.c, $$0);
   }

   public static eun.c<exy> a(exy $$0) {
      return new eun.c<>(eup.a, $$0);
   }

   public static eun.c<ewb> a(ewb $$0) {
      return new eun.c<>(eup.b, $$0);
   }

   public static class a {
      private final euq a;
      @Nullable
      private azu b;

      public a(euq $$0) {
         this.a = $$0;
      }

      public eun.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azu.a($$0);
         }

         return this;
      }

      public eun.a a(azu $$0) {
         this.b = $$0;
         return this;
      }

      public arp a() {
         return this.a.a();
      }

      public eun a(Optional<alj> $$0) {
         arp $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azu $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::G_);
         return new eun(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bai {
      a("this", exj.a),
      b("attacker", exj.d),
      c("direct_attacker", exj.e),
      d("attacking_player", exj.b);

      public static final bai.a<eun.b> e = bai.a(eun.b::values);
      private final String f;
      private final exg<? extends bul> g;

      private b(final String $$0, final exg<? extends bul> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public exg<? extends bul> a() {
         return this.g;
      }

      public static eun.b a(String $$0) {
         eun.b $$1 = e.a($$0);
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

   public static record c<T>(eup<T> a, T b) {
   }
}
