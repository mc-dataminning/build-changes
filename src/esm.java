import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class esm {
   public static final zf<ByteBuf, esm> a = zd.a(esm::a, esm::i);
   private static final esm[] b = ad.a(() -> {
      esm[] $$0 = new esm[48];
      a(new esm(jl.b, jl.c, esm.a.a), $$0);
      return $$0;
   });
   private final jl c;
   private final jl d;
   private final jl e;
   private final esm.a f;
   private final int g;
   private final List<jl> h;
   private final List<jl> i;
   private final List<jl> j;
   private final Map<jl, esm> k = new EnumMap<>(jl.class);
   private final Map<jl, esm> l = new EnumMap<>(jl.class);
   private final Map<esm.a, esm> m = new EnumMap<>(esm.a.class);

   private esm(jl $$0, jl $$1, esm.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      kk $$3 = $$1.q().d($$0.q());
      jl $$4 = jl.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == esm.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static esm a(jl $$0, jl $$1, esm.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public esm a(jl $$0) {
      return this.l.get($$0);
   }

   public esm b(jl $$0) {
      return this.k.get($$0);
   }

   public esm c(jl $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public esm d(jl $$0) {
      esm $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public esm a(esm.a $$0) {
      return this.m.get($$0);
   }

   public esm a() {
      return this.a(this.f.a());
   }

   public jl b() {
      return this.d;
   }

   public jl c() {
      return this.c;
   }

   public jl d() {
      return this.e;
   }

   public esm.a e() {
      return this.f;
   }

   public List<jl> f() {
      return this.h;
   }

   public List<jl> g() {
      return this.i;
   }

   public List<jl> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static esm a(int $$0) {
      return b[$$0];
   }

   public static esm a(azr $$0) {
      return ad.a(b, $$0);
   }

   private static esm a(esm $$0, esm[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (esm.a $$2 : esm.a.values()) {
            $$0.m.put($$2, a(new esm($$0.c, $$0.d, $$2), $$1));
         }

         for (jl $$3 : jl.values()) {
            jl $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new esm($$4, $$3, $$0.f), $$1));
         }

         for (jl $$5 : jl.values()) {
            jl $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new esm($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jl $$0, jl $$1, esm.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jl.a.b) {
            $$3 = $$1.o() == jl.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jl.a.b ? 1 : 0;
         }

         int $$5 = $$3 << 1 | $$1.f().ordinal();
         return (($$0.ordinal() << 2) + $$5 << 1) + $$2.ordinal();
      }
   }

   public static enum a {
      a("left"),
      b("right");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public esm.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
