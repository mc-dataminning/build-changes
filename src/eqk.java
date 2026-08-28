import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqk {
   private final eqn a;
   private final azh b;
   private final jj.a c;
   private final Set<eqk.c<?>> d = Sets.newLinkedHashSet();

   eqk(eqn $$0, azh $$1, jj.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(etd<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(etd<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alf $$0, Consumer<cur> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(etd<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqk.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqk.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqk.c<?> $$0) {
      this.d.remove($$0);
   }

   public jj.a a() {
      return this.c;
   }

   public azh b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arf d() {
      return this.a.a();
   }

   public static eqk.c<eqp> a(eqp $$0) {
      return new eqk.c<>(eqm.c, $$0);
   }

   public static eqk.c<etu> a(etu $$0) {
      return new eqk.c<>(eqm.a, $$0);
   }

   public static eqk.c<erx> a(erx $$0) {
      return new eqk.c<>(eqm.b, $$0);
   }

   public static class a {
      private final eqn a;
      @Nullable
      private azh b;

      public a(eqn $$0) {
         this.a = $$0;
      }

      public eqk.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azh.a($$0);
         }

         return this;
      }

      public arf a() {
         return this.a.a();
      }

      public eqk a(Optional<alf> $$0) {
         arf $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azh $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqk(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azu {
      a("this", etg.a),
      b("killer", etg.d),
      c("direct_killer", etg.e),
      d("killer_player", etg.b);

      public static final azu.a<eqk.b> e = azu.a(eqk.b::values);
      private final String f;
      private final etd<? extends bsw> g;

      private b(final String $$0, final etd<? extends bsw> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public etd<? extends bsw> a() {
         return this.g;
      }

      public static eqk.b a(String $$0) {
         eqk.b $$1 = e.a($$0);
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

   public static record c<T>(eqm<T> a, T b) {
   }
}
