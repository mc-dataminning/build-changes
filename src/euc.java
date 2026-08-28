import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class euc {
   private final euf a;
   private final azs b;
   private final jr.a c;
   private final Set<euc.c<?>> d = Sets.newLinkedHashSet();

   euc(euf $$0, azs $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(ewv<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(ewv<T> $$0) {
      return this.a.b($$0);
   }

   public void a(ali $$0, Consumer<cwb> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(ewv<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(euc.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(euc.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(euc.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public azs b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public arn d() {
      return this.a.a();
   }

   public static euc.c<euh> a(euh $$0) {
      return new euc.c<>(eue.c, $$0);
   }

   public static euc.c<exn> a(exn $$0) {
      return new euc.c<>(eue.a, $$0);
   }

   public static euc.c<evq> a(evq $$0) {
      return new euc.c<>(eue.b, $$0);
   }

   public static class a {
      private final euf a;
      @Nullable
      private azs b;

      public a(euf $$0) {
         this.a = $$0;
      }

      public euc.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = azs.a($$0);
         }

         return this;
      }

      public euc.a a(azs $$0) {
         this.b = $$0;
         return this;
      }

      public arn a() {
         return this.a.a();
      }

      public euc a(Optional<ali> $$0) {
         arn $$1 = this.a();
         MinecraftServer $$2 = $$1.o();
         azs $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::E_);
         return new euc(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bag {
      a("this", ewy.a),
      b("attacker", ewy.d),
      c("direct_attacker", ewy.e),
      d("attacking_player", ewy.b);

      public static final bag.a<euc.b> e = bag.a(euc.b::values);
      private final String f;
      private final ewv<? extends bue> g;

      private b(final String $$0, final ewv<? extends bue> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public ewv<? extends bue> a() {
         return this.g;
      }

      public static euc.b a(String $$0) {
         euc.b $$1 = e.a($$0);
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

   public static record c<T>(eue<T> a, T b) {
   }
}
