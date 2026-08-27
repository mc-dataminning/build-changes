import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class aem implements yp<aba> {
   public static final yg<vt, aem> a = yp.a(aem::a, aem::new);
   private static final int b = 0;
   private static final int c = 1;
   private static final int d = 2;
   private static final int e = 3;
   private static final int f = 4;
   private static final int g = 40;
   private static final int h = 40;
   private final int i;
   private final String j;
   private final Collection<String> k;
   private final Optional<aem.b> l;

   private aem(String $$0, int $$1, Optional<aem.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static aem a(eti $$0, boolean $$1) {
      return new aem($$0.b(), $$1 ? 0 : 2, Optional.of(new aem.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static aem a(eti $$0) {
      return new aem($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static aem a(eti $$0, String $$1, aem.a $$2) {
      return new aem($$0.b(), $$2 == aem.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private aem(vt $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new aem.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vi::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(vt $$0) {
      $$0.a(this.j);
      $$0.k(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, vi::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public aem.a b() {
      return switch (this.i) {
         case 0, 3 -> aem.a.a;
         default -> null;
         case 4 -> aem.a.b;
      };
   }

   @Nullable
   public aem.a e() {
      return switch (this.i) {
         case 0 -> aem.a.a;
         case 1 -> aem.a.b;
         default -> null;
      };
   }

   @Override
   public yr<aem> a() {
      return afl.aK;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<aem.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final wi a;
      private final wi b;
      private final wi c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(eti $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(vt $$0) {
         this.a = wk.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = wk.d.decode($$0);
         this.c = wk.d.decode($$0);
      }

      public wi a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public n c() {
         return this.f;
      }

      public String d() {
         return this.d;
      }

      public String e() {
         return this.e;
      }

      public wi f() {
         return this.b;
      }

      public wi g() {
         return this.c;
      }

      public void a(vt $$0) {
         wk.d.encode($$0, this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         wk.d.encode($$0, this.b);
         wk.d.encode($$0, this.c);
      }
   }
}
