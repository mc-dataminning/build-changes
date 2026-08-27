import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class aah implements vf<wy> {
   private static final int a = 0;
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 3;
   private static final int e = 4;
   private static final int f = 40;
   private static final int g = 40;
   private final int h;
   private final String i;
   private final Collection<String> j;
   private final Optional<aah.b> k;

   private aah(String $$0, int $$1, Optional<aah.b> $$2, Collection<String> $$3) {
      this.i = $$0;
      this.h = $$1;
      this.k = $$2;
      this.j = ImmutableList.copyOf($$3);
   }

   public static aah a(eim $$0, boolean $$1) {
      return new aah($$0.b(), $$1 ? 0 : 2, Optional.of(new aah.b($$0)), (Collection<String>)($$1 ? $$0.g() : ImmutableList.of()));
   }

   public static aah a(eim $$0) {
      return new aah($$0.b(), 1, Optional.empty(), ImmutableList.of());
   }

   public static aah a(eim $$0, String $$1, aah.a $$2) {
      return new aah($$0.b(), $$2 == aah.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   public aah(sq $$0) {
      this.i = $$0.r();
      this.h = $$0.readByte();
      if (b(this.h)) {
         this.k = Optional.of(new aah.b($$0));
      } else {
         this.k = Optional.empty();
      }

      if (a(this.h)) {
         this.j = $$0.a(sq::r);
      } else {
         this.j = ImmutableList.of();
      }
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.i);
      $$0.k(this.h);
      if (b(this.h)) {
         this.k.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.h)).a($$0);
      }

      if (a(this.h)) {
         $$0.a(this.j, sq::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public aah.a a() {
      switch (this.h) {
         case 0:
         case 3:
            return aah.a.a;
         case 1:
         case 2:
         default:
            return null;
         case 4:
            return aah.a.b;
      }
   }

   @Nullable
   public aah.a d() {
      switch (this.h) {
         case 0:
            return aah.a.a;
         case 1:
            return aah.a.b;
         default:
            return null;
      }
   }

   public void a(wy $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.i;
   }

   public Collection<String> f() {
      return this.j;
   }

   public Optional<aah.b> g() {
      return this.k;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final tn a;
      private final tn b;
      private final tn c;
      private final String d;
      private final String e;
      private final n f;
      private final int g;

      public b(eim $$0) {
         this.a = $$0.c();
         this.g = $$0.m();
         this.d = $$0.j().e;
         this.e = $$0.l().e;
         this.f = $$0.n();
         this.b = $$0.e();
         this.c = $$0.f();
      }

      public b(sq $$0) {
         this.a = $$0.l();
         this.g = $$0.readByte();
         this.d = $$0.d(40);
         this.e = $$0.d(40);
         this.f = $$0.b(n.class);
         this.b = $$0.l();
         this.c = $$0.l();
      }

      public tn a() {
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

      public tn f() {
         return this.b;
      }

      public tn g() {
         return this.c;
      }

      public void a(sq $$0) {
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
