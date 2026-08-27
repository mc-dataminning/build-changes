import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class aek implements yn<aay> {
   public static final ye<vr, aek> a = yn.a(aek::a, aek::new);
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
   private final Optional<aek.b> l;

   private aek(String $$0, int $$1, Optional<aek.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static aek a(esz $$0, boolean $$1) {
      return new aek($$0.b(), $$1 ? 0 : 2, Optional.of(new aek.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static aek a(esz $$0) {
      return new aek($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static aek a(esz $$0, String $$1, aek.a $$2) {
      return new aek($$0.b(), $$2 == aek.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private aek(vr $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new aek.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vg::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(vr $$0) {
      $$0.a(this.j);
      $$0.k(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, vg::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public aek.a b() {
      return switch (this.i) {
         case 0, 3 -> aek.a.a;
         default -> null;
         case 4 -> aek.a.b;
      };
   }

   @Nullable
   public aek.a e() {
      return switch (this.i) {
         case 0 -> aek.a.a;
         case 1 -> aek.a.b;
         default -> null;
      };
   }

   @Override
   public yp<aek> a() {
      return afj.aK;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<aek.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final wg a;
      private final wg b;
      private final wg c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(esz $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(vr $$0) {
         this.a = wi.d.decode($$0);
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = wi.d.decode($$0);
         this.c = wi.d.decode($$0);
      }

      public wg a() {
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

      public wg f() {
         return this.b;
      }

      public wg g() {
         return this.c;
      }

      public void a(vr $$0) {
         wi.d.encode($$0, this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         wi.d.encode($$0, this.b);
         wi.d.encode($$0, this.c);
      }
   }
}
