import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afh implements zg<abu> {
   public static final yx<wk, afh> a = zg.a(afh::a, afh::new);
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
   private final Optional<afh.b> l;

   private afh(String $$0, int $$1, Optional<afh.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afh a(eyb $$0, boolean $$1) {
      return new afh($$0.b(), $$1 ? 0 : 2, Optional.of(new afh.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static afh a(eyb $$0) {
      return new afh($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afh a(eyb $$0, String $$1, afh.a $$2) {
      return new afh($$0.b(), $$2 == afh.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afh(wk $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afh.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vw::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wk $$0) {
      $$0.a(this.j);
      $$0.k(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, vw::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public afh.a b() {
      return switch (this.i) {
         case 0, 3 -> afh.a.a;
         default -> null;
         case 4 -> afh.a.b;
      };
   }

   @Nullable
   public afh.a e() {
      return switch (this.i) {
         case 0 -> afh.a.a;
         case 1 -> afh.a.b;
         default -> null;
      };
   }

   @Override
   public zi<afh> a() {
      return agg.aK;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<afh.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final wz a;
      private final wz b;
      private final wz c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(eyb $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(wk $$0) {
         this.a = xb.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = xb.d.decode($$0);
         this.c = xb.d.decode($$0);
      }

      public wz a() {
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

      public wz f() {
         return this.b;
      }

      public wz g() {
         return this.c;
      }

      public void a(wk $$0) {
         xb.d.encode($$0, this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         xb.d.encode($$0, this.b);
         xb.d.encode($$0, this.c);
      }
   }
}
