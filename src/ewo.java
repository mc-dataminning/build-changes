import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ewo {
   private final ewr a;
   private final azh b;
   private final js.a c;
   private final Set<ewo.c<?>> d = Sets.newLinkedHashSet();

   ewo(ewr $$0, azh $$1, js.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bai<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bai<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bai<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(aku $$0, Consumer<cxh> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ewo.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ewo.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ewo.c<?> $$0) {
      this.d.remove($$0);
   }

   public js.a a() {
      return this.c;
   }

   public azh b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public ard d() {
      return this.a.a();
   }

   public static ewo.c<ewt> a(ewt $$0) {
      return new ewo.c<>(ewq.c, $$0);
   }

   public static ewo.c<ezx> a(ezx $$0) {
      return new ewo.c<>(ewq.a, $$0);
   }

   public static ewo.c<eyc> a(eyc $$0) {
      return new ewo.c<>(ewq.b, $$0);
   }

   public static class a {
      private final ewr a;
      @Nullable
      private azh b;

      public a(ewr $$0) {
         this.a = $$0;
      }

      public ewo.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azh.a($$0);
         }

         return this;
      }

      public ewo.a a(azh $$0) {
         this.b = $$0;
         return this;
      }

      public ard a() {
         return this.a.a();
      }

      public ewo a(Optional<aku> $$0) {
         ard $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         azh $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::C_);
         return new ewo(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements azv {
      a("this", ezi.a),
      b("attacker", ezi.d),
      c("direct_attacker", ezi.e),
      d("attacking_player", ezi.b);

      public static final azv.a<ewo.b> e = azv.a(ewo.b::values);
      private final String f;
      private final bai<? extends bva> g;

      private b(final String $$0, final bai<? extends bva> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bai<? extends bva> a() {
         return this.g;
      }

      public static ewo.b a(String $$0) {
         ewo.b $$1 = e.a($$0);
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

   public static record c<T>(ewq<T> a, T b) {
   }
}
