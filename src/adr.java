import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class adr implements xx<aag> {
   public static final xo<uq, adr> a = xx.a(adr::a, adr::new);
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
   private final Optional<adr.b> l;

   private adr(String $$0, int $$1, Optional<adr.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static adr a(eoy $$0, boolean $$1) {
      return new adr($$0.b(), $$1 ? 0 : 2, Optional.of(new adr.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static adr a(eoy $$0) {
      return new adr($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static adr a(eoy $$0, String $$1, adr.a $$2) {
      return new adr($$0.b(), $$2 == adr.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private adr(uq $$0) {
      this.j = $$0.r();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new adr.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(uq::r);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(uq $$0) {
      $$0.a(this.j);
      $$0.k(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, uq::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public adr.a b() {
      switch (this.i) {
         case 0:
         case 3:
            return adr.a.a;
         case 1:
         case 2:
         default:
            return null;
         case 4:
            return adr.a.b;
      }
   }

   @Nullable
   public adr.a e() {
      switch (this.i) {
         case 0:
            return adr.a.a;
         case 1:
            return adr.a.b;
         default:
            return null;
      }
   }

   @Override
   public xz<adr> a() {
      return aeq.aJ;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<adr.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final vq a;
      private final vq b;
      private final vq c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(eoy $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(uq $$0) {
         this.a = $$0.m();
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = $$0.m();
         this.c = $$0.m();
      }

      public vq a() {
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

      public vq f() {
         return this.b;
      }

      public vq g() {
         return this.c;
      }

      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.k(this.g);
         $$0.a(this.d);
         $$0.a(this.e);
         $$0.a(this.f);
         $$0.a(this.b);
         $$0.a(this.c);
      }
   }
}
