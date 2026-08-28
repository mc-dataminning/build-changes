import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aab(aab.a c) implements aaf {
   public static final yt<vr, aab> a = aaf.a(aab::a, aab::new);
   public static final aaf.b<aab> b = aaf.a("debug/bee");

   private aab(vr $$0) {
      this(new aab.a($$0));
   }

   private void a(vr $$0) {
      this.c.a($$0);
   }

   @Override
   public aaf.b<aab> a() {
      return b;
   }

   public aab.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, fcu c, @Nullable evh d, @Nullable jj e, @Nullable jj f, int g, Set<String> h, List<jj> i) {
      public a(vr $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(evh::b), $$0.c(jj.b), $$0.c(jj.b), $$0.readInt(), $$0.a(HashSet::new, vr::p), $$0.a(jj.b));
      }

      public void a(vr $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jj.b);
         $$0.a(this.f, jj.b);
         $$0.q(this.g);
         $$0.a(this.h, vr::a);
         $$0.a(this.i, jj.b);
      }

      public boolean a(jj $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agi.a(this.a);
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

      public fcu d() {
         return this.c;
      }

      @Nullable
      public evh e() {
         return this.d;
      }

      @Nullable
      public jj f() {
         return this.e;
      }

      @Nullable
      public jj g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jj> j() {
         return this.i;
      }
   }
}
