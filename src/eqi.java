import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class eqi {
   private final eql a;
   private final azh b;
   private final jj.a c;
   private final Set<eqi.c<?>> d = Sets.newLinkedHashSet();

   eqi(eql $$0, azh $$1, jj.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(etb<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(etb<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alf $$0, Consumer<cup> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(etb<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(eqi.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(eqi.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(eqi.c<?> $$0) {
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

   public static eqi.c<eqn> a(eqn $$0) {
      return new eqi.c<>(eqk.c, $$0);
   }

   public static eqi.c<ets> a(ets $$0) {
      return new eqi.c<>(eqk.a, $$0);
   }

   public static eqi.c<erv> a(erv $$0) {
      return new eqi.c<>(eqk.b, $$0);
   }

   public static class a {
      private final eql a;
      @Nullable
      private azh b;

      public a(eql $$0) {
         this.a = $$0;
      }

      public eqi.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azh.a($$0);
         }

         return this;
      }

      public arf a() {
         return this.a.a();
      }

      public eqi a(Optional<alf> $$0) {
         arf $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azh $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new eqi(this.a, $$3, $$2.be().b());
      }
   }

   public static enum b implements azu {
      a("this", ete.a),
      b("killer", ete.d),
      c("direct_killer", ete.e),
      d("killer_player", ete.b);

      public static final azu.a<eqi.b> e = azu.a(eqi.b::values);
      private final String f;
      private final etb<? extends bsu> g;

      private b(final String $$0, final etb<? extends bsu> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public etb<? extends bsu> a() {
         return this.g;
      }

      public static eqi.b a(String $$0) {
         eqi.b $$1 = e.a($$0);
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

   public static record c<T>(eqk<T> a, T b) {
   }
}
