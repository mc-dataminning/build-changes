import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eex {
   private final efd a;
   private final ats b;
   private final efb c;
   private final Set<eex.c<?>> d = Sets.newLinkedHashSet();

   eex(efd $$0, ats $$1, efb $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ehf<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ehf<T> $$0) {
      return this.a.b($$0);
   }

   public void a(agi $$0, Consumer<clj> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ehf<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eex.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eex.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eex.c<?> $$0) {
      this.d.remove($$0);
   }

   public efb a() {
      return this.c;
   }

   public ats b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public ame d() {
      return this.a.a();
   }

   public static eex.c<eff> a(eff $$0) {
      return new eex.c<>(efc.c, $$0);
   }

   public static eex.c<ehw> a(ehw $$0) {
      return new eex.c<>(efc.a, $$0);
   }

   public static eex.c<egk> a(egk $$0) {
      return new eex.c<>(efc.b, $$0);
   }

   public static class a {
      private final efd a;
      @Nullable
      private ats b;

      public a(efd $$0) {
         this.a = $$0;
      }

      public eex.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = ats.a($$0);
         }

         return this;
      }

      public ame a() {
         return this.a.a();
      }

      public eex a(Optional<agi> $$0) {
         ame $$1 = this.a();
         MinecraftServer $$2 = $$1.n();
         ats $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eex(this.a, $$3, $$2.aJ());
      }
   }

   public static enum b implements aug {
      a("this", ehi.a),
      b("killer", ehi.d),
      c("direct_killer", ehi.e),
      d("killer_player", ehi.b);

      public static final aug.a<eex.b> e = aug.a(eex.b::values);
      private final String f;
      private final ehf<? extends bkq> g;

      private b(String $$0, ehf<? extends bkq> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ehf<? extends bkq> a() {
         return this.g;
      }

      public static eex.b a(String $$0) {
         eex.b $$1 = e.a($$0);
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

   public static record c<T>(efc<T> a, T b) {
   }
}
