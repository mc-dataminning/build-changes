import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aak(aak.a c) implements aao {
   public static final zc<wb, aak> a = aao.a(aak::a, aak::new);
   public static final aao.b<aak> b = aao.a("debug/bee");

   private aak(wb $$0) {
      this(new aak.a($$0));
   }

   private void a(wb $$0) {
      this.c.a($$0);
   }

   @Override
   public aao.b<aak> a() {
      return b;
   }

   public aak.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, eyw c, @Nullable erh d, @Nullable jf e, @Nullable jf f, int g, Set<String> h, List<jf> i) {
      public a(wb $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(erh::b), $$0.c(jf.b), $$0.c(jf.b), $$0.readInt(), $$0.a(HashSet::new, wb::p), $$0.a(jf.b));
      }

      public void a(wb $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jf.b);
         $$0.a(this.f, jf.b);
         $$0.q(this.g);
         $$0.a(this.h, wb::a);
         $$0.a(this.i, jf.b);
      }

      public boolean a(jf $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agn.a(this.a);
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

      public eyw d() {
         return this.c;
      }

      @Nullable
      public erh e() {
         return this.d;
      }

      @Nullable
      public jf f() {
         return this.e;
      }

      @Nullable
      public jf g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jf> j() {
         return this.i;
      }
   }
}
