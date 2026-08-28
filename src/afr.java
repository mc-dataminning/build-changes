import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afr implements zj<aby> {
   public static final za<wn, afr> a = zj.a(afr::a, afr::new);
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

   public static afr a(fgs $$0, boolean $$1) {
      return new afr($$0.c(), $$1 ? 0 : 2, Optional.of(new afr.b($$0)), (Collection<String>)($$1 ? $$0.h() : ImmutableList.of()));
   }

   public static afr a(fgs $$0) {
      return new afr($$0.c(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afr a(fgs $$0, String $$1, afr.a $$2) {
      return new afr($$0.c(), $$2 == afr.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afr(wn $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afr.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vy::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wn $$0) {
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
   public zl<afr> a() {
      return agr.aO;
   }

   public void a(aby $$0) {
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
      private final xc a;
      private final xc b;
      private final xc c;
      private final fgz.b d;
      private final fgz.a e;
      private final o f;
      private final int g;

      public b(fgs $$0) {
         this.a = $$0.d();
         this.g = $$0.n();
         this.d = $$0.k();
         this.e = $$0.m();
         this.f = $$0.o();
         this.b = $$0.f();
         this.c = $$0.g();
      }

      public b(wn $$0) {
         this.a = xe.d.decode($$0);
         this.g = $$0.readByte();
         this.d = fgz.b.f.decode($$0);
         this.e = fgz.a.f.decode($$0);
         this.f = $$0.b(o.class);
         this.b = xe.d.decode($$0);
         this.c = xe.d.decode($$0);
      }

      public xc a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public o c() {
         return this.f;
      }

      public fgz.b d() {
         return this.d;
      }

      public fgz.a e() {
         return this.e;
      }

      public xc f() {
         return this.b;
      }

      public xc g() {
         return this.c;
      }

      public void a(wn $$0) {
         xe.d.encode($$0, this.a);
         $$0.l(this.g);
         fgz.b.f.encode($$0, this.d);
         fgz.a.f.encode($$0, this.e);
         $$0.a(this.f);
         xe.d.encode($$0, this.b);
         xe.d.encode($$0, this.c);
      }
   }
}
