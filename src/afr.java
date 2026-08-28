import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afr implements zs<ace> {
   public static final zj<ww, afr> a = zs.a(afr::a, afr::new);
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
   private final Optional<afr.b> l;

   private afr(String $$0, int $$1, Optional<afr.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afr a(ewl $$0, boolean $$1) {
      return new afr($$0.b(), $$1 ? 0 : 2, Optional.of(new afr.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static afr a(ewl $$0) {
      return new afr($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afr a(ewl $$0, String $$1, afr.a $$2) {
      return new afr($$0.b(), $$2 == afr.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afr(ww $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afr.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(wl::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(ww $$0) {
      $$0.a(this.j);
      $$0.k(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, wl::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public afr.a b() {
      return switch (this.i) {
         case 0, 3 -> afr.a.a;
         default -> null;
         case 4 -> afr.a.b;
      };
   }

   @Nullable
   public afr.a e() {
      return switch (this.i) {
         case 0 -> afr.a.a;
         case 1 -> afr.a.b;
         default -> null;
      };
   }

   @Override
   public zu<afr> a() {
      return agq.aK;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<afr.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xl a;
      private final xl b;
      private final xl c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(ewl $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(ww $$0) {
         this.a = xn.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = xn.d.decode($$0);
         this.c = xn.d.decode($$0);
      }

      public xl a() {
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

      public xl f() {
         return this.b;
      }

      public xl g() {
         return this.c;
      }

      public void a(ww $$0) {
         xn.d.encode($$0, this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         xn.d.encode($$0, this.b);
         xn.d.encode($$0, this.c);
      }
   }
}
