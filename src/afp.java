import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afp implements zh<abw> {
   public static final yy<wl, afp> a = zh.a(afp::a, afp::new);
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
   private final Optional<afp.b> l;

   private afp(String $$0, int $$1, Optional<afp.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afp a(fgq $$0, boolean $$1) {
      return new afp($$0.c(), $$1 ? 0 : 2, Optional.of(new afp.b($$0)), (Collection<String>)($$1 ? $$0.h() : ImmutableList.of()));
   }

   public static afp a(fgq $$0) {
      return new afp($$0.c(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afp a(fgq $$0, String $$1, afp.a $$2) {
      return new afp($$0.c(), $$2 == afp.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afp(wl $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afp.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vw::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wl $$0) {
      $$0.a(this.j);
      $$0.l(this.i);
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
   public afp.a b() {
      return switch (this.i) {
         case 0, 3 -> afp.a.a;
         default -> null;
         case 4 -> afp.a.b;
      };
   }

   @Nullable
   public afp.a e() {
      return switch (this.i) {
         case 0 -> afp.a.a;
         case 1 -> afp.a.b;
         default -> null;
      };
   }

   @Override
   public zj<afp> a() {
      return agp.aO;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public String f() {
      return this.j;
   }

   public Collection<String> g() {
      return this.k;
   }

   public Optional<afp.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final xa a;
      private final xa b;
      private final xa c;
      private final fgx.b d;
      private final fgx.a e;
      private final o f;
      private final int g;

      public b(fgq $$0) {
         this.a = $$0.d();
         this.g = $$0.n();
         this.d = $$0.k();
         this.e = $$0.m();
         this.f = $$0.o();
         this.b = $$0.f();
         this.c = $$0.g();
      }

      public b(wl $$0) {
         this.a = xc.d.decode($$0);
         this.g = $$0.readByte();
         this.d = fgx.b.f.decode($$0);
         this.e = fgx.a.f.decode($$0);
         this.f = $$0.b(o.class);
         this.b = xc.d.decode($$0);
         this.c = xc.d.decode($$0);
      }

      public xa a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public o c() {
         return this.f;
      }

      public fgx.b d() {
         return this.d;
      }

      public fgx.a e() {
         return this.e;
      }

      public xa f() {
         return this.b;
      }

      public xa g() {
         return this.c;
      }

      public void a(wl $$0) {
         xc.d.encode($$0, this.a);
         $$0.l(this.g);
         fgx.b.f.encode($$0, this.d);
         fgx.a.f.encode($$0, this.e);
         $$0.a(this.f);
         xc.d.encode($$0, this.b);
         xc.d.encode($$0, this.c);
      }
   }
}
