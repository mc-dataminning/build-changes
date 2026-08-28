import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class etl {
   private final eto a;
   private final azn b;
   private final jp.a c;
   private final Set<etl.c<?>> d = Sets.newLinkedHashSet();

   etl(eto $$0, azn $$1, jp.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ewe<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ewe<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ale $$0, Consumer<cvs> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ewe<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(etl.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(etl.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(etl.c<?> $$0) {
      this.d.remove($$0);
   }

   public jp.a a() {
      return this.c;
   }

   public azn b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arj d() {
      return this.a.a();
   }

   public static etl.c<etq> a(etq $$0) {
      return new etl.c<>(etn.c, $$0);
   }

   public static etl.c<eww> a(eww $$0) {
      return new etl.c<>(etn.a, $$0);
   }

   public static etl.c<euz> a(euz $$0) {
      return new etl.c<>(etn.b, $$0);
   }

   public static class a {
      private final eto a;
      @Nullable
      private azn b;

      public a(eto $$0) {
         this.a = $$0;
      }

      public etl.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azn.a($$0);
         }

         return this;
      }

      public etl.a a(azn $$0) {
         this.b = $$0;
         return this;
      }

      public arj a() {
         return this.a.a();
      }

      public etl a(Optional<ale> $$0) {
         arj $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azn $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::D_);
         return new etl(this.a, $$3, $$2.bd().a());
      }
   }

   public static enum b implements bab {
      a("this", ewh.a),
      b("attacker", ewh.d),
      c("direct_attacker", ewh.e),
      d("attacking_player", ewh.b);

      public static final bab.a<etl.b> e = bab.a(etl.b::values);
      private final String f;
      private final ewe<? extends btr> g;

      private b(final String $$0, final ewe<? extends btr> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ewe<? extends btr> a() {
         return this.g;
      }

      public static etl.b a(String $$0) {
         etl.b $$1 = e.a($$0);
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

   public static record c<T>(etn<T> a, T b) {
   }
}
