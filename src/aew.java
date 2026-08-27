import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class aew implements yz<abk> {
   public static final yq<wd, aew> a = yz.a(aew::a, aew::new);
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
   private final Optional<aew.b> l;

   private aew(String $$0, int $$1, Optional<aew.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static aew a(eue $$0, boolean $$1) {
      return new aew($$0.b(), $$1 ? 0 : 2, Optional.of(new aew.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static aew a(eue $$0) {
      return new aew($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static aew a(eue $$0, String $$1, aew.a $$2) {
      return new aew($$0.b(), $$2 == aew.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private aew(wd $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new aew.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vs::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wd $$0) {
      $$0.a(this.j);
      $$0.k(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, vs::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public aew.a b() {
      return switch (this.i) {
         case 0, 3 -> aew.a.a;
         default -> null;
         case 4 -> aew.a.b;
      };
   }

   @Nullable
   public aew.a e() {
      return switch (this.i) {
         case 0 -> aew.a.a;
         case 1 -> aew.a.b;
         default -> null;
      };
   }

   @Override
   public zb<aew> a() {
      return afv.aK;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<aew.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final ws a;
      private final ws b;
      private final ws c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(eue $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(wd $$0) {
         this.a = wu.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = wu.d.decode($$0);
         this.c = wu.d.decode($$0);
      }

      public ws a() {
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

      public ws f() {
         return this.b;
      }

      public ws g() {
         return this.c;
      }

      public void a(wd $$0) {
         wu.d.encode($$0, this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         wu.d.encode($$0, this.b);
         wu.d.encode($$0, this.c);
      }
   }
}
