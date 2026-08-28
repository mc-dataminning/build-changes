import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aaf(aaf.a c) implements aaj {
   public static final yx<vw, aaf> a = aaj.a(aaf::a, aaf::new);
   public static final aaj.b<aaf> b = aaj.a("debug/bee");

   private aaf(vw $$0) {
      this(new aaf.a($$0));
   }

   private void a(vw $$0) {
      this.c.a($$0);
   }

   @Override
   public aaj.b<aaf> a() {
      return b;
   }

   public aaf.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, exa c, @Nullable epq d, @Nullable jd e, @Nullable jd f, int g, Set<String> h, List<jd> i) {
      public a(vw $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(epq::b), $$0.c(jd.b), $$0.c(jd.b), $$0.readInt(), $$0.a(HashSet::new, vw::p), $$0.a(jd.b));
      }

      public void a(vw $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jd.b);
         $$0.a(this.f, jd.b);
         $$0.p(this.g);
         $$0.a(this.h, vw::a);
         $$0.a(this.i, jd.b);
      }

      public boolean a(jd $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return age.a(this.a);
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

      public exa d() {
         return this.c;
      }

      @Nullable
      public epq e() {
         return this.d;
      }

      @Nullable
      public jd f() {
         return this.e;
      }

      @Nullable
      public jd g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jd> j() {
         return this.i;
      }
   }
}
