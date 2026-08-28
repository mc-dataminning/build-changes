import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Optional;
import javax.annotation.Nullable;

public class afn implements zf<abu> {
   public static final yw<wj, afn> a = zf.a(afn::a, afn::new);
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
   private final Optional<afn.b> l;

   private afn(String $$0, int $$1, Optional<afn.b> $$2, Collection<String> $$3) {
      this.j = $$0;
      this.i = $$1;
      this.l = $$2;
      this.k = ImmutableList.copyOf($$3);
   }

   public static afn a(ffx $$0, boolean $$1) {
      return new afn($$0.c(), $$1 ? 0 : 2, Optional.of(new afn.b($$0)), (Collection<String>)($$1 ? $$0.h() : ImmutableList.of()));
   }

   public static afn a(ffx $$0) {
      return new afn($$0.c(), 1, Optional.empty(), ImmutableList.of());
   }

   public static afn a(ffx $$0, String $$1, afn.a $$2) {
      return new afn($$0.c(), $$2 == afn.a.a ? 3 : 4, Optional.empty(), ImmutableList.of($$1));
   }

   private afn(wj $$0) {
      this.j = $$0.p();
      this.i = $$0.readByte();
      if (b(this.i)) {
         this.l = Optional.of(new afn.b($$0));
      } else {
         this.l = Optional.empty();
      }

      if (a(this.i)) {
         this.k = $$0.a(vu::p);
      } else {
         this.k = ImmutableList.of();
      }
   }

   private void a(wj $$0) {
      $$0.a(this.j);
      $$0.l(this.i);
      if (b(this.i)) {
         this.l.orElseThrow(() -> new IllegalStateException("Parameters not present, but method is" + this.i)).a($$0);
      }

      if (a(this.i)) {
         $$0.a(this.k, vu::a);
      }
   }

   private static boolean a(int $$0) {
      return $$0 == 0 || $$0 == 3 || $$0 == 4;
   }

   private static boolean b(int $$0) {
      return $$0 == 0 || $$0 == 2;
   }

   @Nullable
   public afn.a b() {
      return switch (this.i) {
         case 0, 3 -> afn.a.a;
         default -> null;
         case 4 -> afn.a.b;
      };
   }

   @Nullable
   public afn.a e() {
      return switch (this.i) {
         case 0 -> afn.a.a;
         case 1 -> afn.a.b;
         default -> null;
      };
   }

   @Override
   public zh<afn> a() {
      return agn.aO;
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

   public Optional<afn.b> h() {
      return this.l;
   }

   public static enum a {
      a,
      b;
   }

   public static class b {
      private final wy a;
      private final wy b;
      private final wy c;
      private final fge.b d;
      private final fge.a e;
      private final o f;
      private final int g;

      public b(ffx $$0) {
         this.a = $$0.d();
         this.g = $$0.n();
         this.d = $$0.k();
         this.e = $$0.m();
         this.f = $$0.o();
         this.b = $$0.f();
         this.c = $$0.g();
      }

      public b(wj $$0) {
         this.a = xa.d.decode($$0);
         this.g = $$0.readByte();
         this.d = fge.b.f.decode($$0);
         this.e = fge.a.f.decode($$0);
         this.f = $$0.b(o.class);
         this.b = xa.d.decode($$0);
         this.c = xa.d.decode($$0);
      }

      public wy a() {
         return this.a;
      }

      public int b() {
         return this.g;
      }

      public o c() {
         return this.f;
      }

      public fge.b d() {
         return this.d;
      }

      public fge.a e() {
         return this.e;
      }

      public wy f() {
         return this.b;
      }

      public wy g() {
         return this.c;
      }

      public void a(wj $$0) {
         xa.d.encode($$0, this.a);
         $$0.l(this.g);
         fge.b.f.encode($$0, this.d);
         fge.a.f.encode($$0, this.e);
         $$0.a(this.f);
         xa.d.encode($$0, this.b);
         xa.d.encode($$0, this.c);
      }
   }
}
