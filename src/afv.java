import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afv implements zq<acf> {
   public static final zh<wu, afv> a = zq.a(afv::a, afv::new);
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
   private final Optional<afv.b> l;

   private afv(String $$0, int $$1, Optional<afv.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afv a(fay $$0, boolean $$1) {
      return new afv($$0.b(), $$1 ? 0 : 2, Optional.of(new afv.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static afv a(fay $$0) {
      return new afv($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afv a(fay $$0, String $$1, afv.a $$2) {
      return new afv($$0.b(), $$2 == afv.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afv(wu $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afv.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(wg::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wu $$0) {
      $$0.a(this.j);
      $$0.l(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, wg::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public afv.a b() {
      return switch (this.i) {
         case 0, 3 -> afv.a.a;
         default -> null;
         case 4 -> afv.a.b;
      };
   }

   @Nullable
   public afv.a e() {
      return switch (this.i) {
         case 0 -> afv.a.a;
         case 1 -> afv.a.b;
         default -> null;
      };
   }

   @Override
   public zs<afv> a() {
      return agu.aL;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<afv.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xj a;
      private final xj b;
      private final xj c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(fay $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(wu $$0) {
         this.a = xl.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = xl.d.decode($$0);
         this.c = xl.d.decode($$0);
      }

      public xj a() {
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

      public xj f() {
         return this.b;
      }

      public xj g() {
         return this.c;
      }

      public void a(wu $$0) {
         xl.d.encode($$0, this.a);
         $$0.l(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         xl.d.encode($$0, this.b);
         xl.d.encode($$0, this.c);
      }
   }
}
