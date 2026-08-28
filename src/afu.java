import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afu implements zv<ach> {
   public static final zm<wz, afu> a = zv.a(afu::a, afu::new);
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
   private final Optional<afu.b> l;

   private afu(String $$0, int $$1, Optional<afu.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afu a(ewp $$0, boolean $$1) {
      return new afu($$0.b(), $$1 ? 0 : 2, Optional.of(new afu.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static afu a(ewp $$0) {
      return new afu($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afu a(ewp $$0, String $$1, afu.a $$2) {
      return new afu($$0.b(), $$2 == afu.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afu(wz $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afu.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(wl::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wz $$0) {
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
   public afu.a b() {
      return switch (this.i) {
         case 0, 3 -> afu.a.a;
         default -> null;
         case 4 -> afu.a.b;
      };
   }

   @Nullable
   public afu.a e() {
      return switch (this.i) {
         case 0 -> afu.a.a;
         case 1 -> afu.a.b;
         default -> null;
      };
   }

   @Override
   public zx<afu> a() {
      return agt.aK;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<afu.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xo a;
      private final xo b;
      private final xo c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(ewp $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(wz $$0) {
         this.a = xq.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = xq.d.decode($$0);
         this.c = xq.d.decode($$0);
      }

      public xo a() {
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

      public xo f() {
         return this.b;
      }

      public xo g() {
         return this.c;
      }

      public void a(wz $$0) {
         xq.d.encode($$0, this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         xq.d.encode($$0, this.b);
         xq.d.encode($$0, this.c);
      }
   }
}
