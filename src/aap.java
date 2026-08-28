import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aap(aap.a c) implements aat {
   public static final zh<wg, aap> a = aat.a(aap::a, aap::new);
   public static final aat.b<aap> b = aat.a("debug/bee");

   private aap(wg $$0) {
      this(new aap.a($$0));
   }

   private void a(wg $$0) {
      this.c.a($$0);
   }

   @Override
   public aat.b<aap> a() {
      return b;
   }

   public aap.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ezy c, @Nullable esj d, @Nullable jh e, @Nullable jh f, int g, Set<String> h, List<jh> i) {
      public a(wg $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(esj::b), $$0.c(jh.b), $$0.c(jh.b), $$0.readInt(), $$0.a(HashSet::new, wg::p), $$0.a(jh.b));
      }

      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jh.b);
         $$0.a(this.f, jh.b);
         $$0.q(this.g);
         $$0.a(this.h, wg::a);
         $$0.a(this.i, jh.b);
      }

      public boolean a(jh $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ags.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public ezy d() {
         return this.c;
      }

      @Nullable
      public esj e() {
         return this.d;
      }

      @Nullable
      public jh f() {
         return this.e;
      }

      @Nullable
      public jh g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jh> j() {
         return this.i;
      }
   }
}
