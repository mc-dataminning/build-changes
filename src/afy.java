import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afy implements zo<acf> {
   public static final ze<wp, afy> a = zo.a(afy::a, afy::new);
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
   private final Optional<afy.b> l;

   private afy(String $$0, int $$1, Optional<afy.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afy a(fhc $$0, boolean $$1) {
      return new afy($$0.c(), $$1 ? 0 : 2, Optional.of(new afy.b($$0)), (Collection<String>)($$1 ? $$0.h() : ImmutableList.of()));
   }

   public static afy a(fhc $$0) {
      return new afy($$0.c(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afy a(fhc $$0, String $$1, afy.a $$2) {
      return new afy($$0.c(), $$2 == afy.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afy(wp $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afy.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vy::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wp $$0) {
      $$0.a(this.j);
      $$0.l(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, vy::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public afy.a b() {
      return switch (this.i) {
         case 0, 3 -> afy.a.a;
         default -> null;
         case 4 -> afy.a.b;
      };
   }

   @Nullable
   public afy.a e() {
      return switch (this.i) {
         case 0 -> afy.a.a;
         case 1 -> afy.a.b;
         default -> null;
      };
   }

   @Override
   public zq<afy> a() {
      return agy.aO;
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

   public Optional<afy.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xg a;
      private final xg b;
      private final xg c;
      private final fhj.b d;
      private final fhj.a e;
      private final o f;
      private final int g;

      public b(fhc $$0) {
         this.a = $$0.d();
         this.g = $$0.n();
         this.d = $$0.k();
         this.e = $$0.m();
         this.f = $$0.o();
         this.b = $$0.f();
         this.c = $$0.g();
      }

      public b(wp $$0) {
         this.a = xi.d.decode($$0);
         this.g = $$0.readByte();
         this.d = fhj.b.f.decode($$0);
         this.e = fhj.a.f.decode($$0);
         this.f = $$0.b(o.class);
         this.b = xi.d.decode($$0);
         this.c = xi.d.decode($$0);
      }

      public xg a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public o c() {
         return this.f;
      }

      public fhj.b d() {
         return this.d;
      }

      public fhj.a e() {
         return this.e;
      }

      public xg f() {
         return this.b;
      }

      public xg g() {
         return this.c;
      }

      public void a(wp $$0) {
         xi.d.encode($$0, this.a);
         $$0.l(this.g);
         fhj.b.f.encode($$0, this.d);
         fhj.a.f.encode($$0, this.e);
         $$0.a(this.f);
         xi.d.encode($$0, this.b);
         xi.d.encode($$0, this.c);
      }
   }
}
