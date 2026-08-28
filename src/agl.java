import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class agl implements aac<acr> {
   public static final zt<xg, agl> a = aac.a(agl::a, agl::new);
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
   private final Optional<agl.b> l;

   private agl(String $$0, int $$1, Optional<agl.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static agl a(fcs $$0, boolean $$1) {
      return new agl($$0.b(), $$1 ? 0 : 2, Optional.of(new agl.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static agl a(fcs $$0) {
      return new agl($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static agl a(fcs $$0, String $$1, agl.a $$2) {
      return new agl($$0.b(), $$2 == agl.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private agl(xg $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new agl.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(ws::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(xg $$0) {
      $$0.a(this.j);
      $$0.l(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, ws::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public agl.a b() {
      return switch (this.i) {
         case 0, 3 -> agl.a.a;
         default -> null;
         case 4 -> agl.a.b;
      };
   }

   @Nullable
   public agl.a e() {
      return switch (this.i) {
         case 0 -> agl.a.a;
         case 1 -> agl.a.b;
         default -> null;
      };
   }

   @Override
   public aae<agl> a() {
      return ahk.aO;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<agl.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xv a;
      private final xv b;
      private final xv c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(fcs $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(xg $$0) {
         this.a = xx.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = xx.d.decode($$0);
         this.c = xx.d.decode($$0);
      }

      public xv a() {
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

      public xv f() {
         return this.b;
      }

      public xv g() {
         return this.c;
      }

      public void a(xg $$0) {
         xx.d.encode($$0, this.a);
         $$0.l(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         xx.d.encode($$0, this.b);
         xx.d.encode($$0, this.c);
      }
   }
}
