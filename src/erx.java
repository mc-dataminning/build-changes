import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class erx {
   public static final zb<ByteBuf, erx> a = yz.a(erx::a, erx::i);
   private static final erx[] b = ad.a(() -> {
      erx[] $$0 = new erx[48];
      a(new erx(jj.b, jj.c, erx.a.a), $$0);
      return $$0;
   });
   private final jj c;
   private final jj d;
   private final jj e;
   private final erx.a f;
   private final int g;
   private final List<jj> h;
   private final List<jj> i;
   private final List<jj> j;
   private final Map<jj, erx> k = new EnumMap<>(jj.class);
   private final Map<jj, erx> l = new EnumMap<>(jj.class);
   private final Map<erx.a, erx> m = new EnumMap<>(erx.a.class);

   private erx(jj $$0, jj $$1, erx.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      ki $$3 = $$1.q().d($$0.q());
      jj $$4 = jj.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == erx.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static erx a(jj $$0, jj $$1, erx.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public erx a(jj $$0) {
      return this.l.get($$0);
   }

   public erx b(jj $$0) {
      return this.k.get($$0);
   }

   public erx c(jj $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public erx d(jj $$0) {
      erx $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public erx a(erx.a $$0) {
      return this.m.get($$0);
   }

   public erx a() {
      return this.a(this.f.a());
   }

   public jj b() {
      return this.d;
   }

   public jj c() {
      return this.c;
   }

   public jj d() {
      return this.e;
   }

   public erx.a e() {
      return this.f;
   }

   public List<jj> f() {
      return this.h;
   }

   public List<jj> g() {
      return this.i;
   }

   public List<jj> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static erx a(int $$0) {
      return b[$$0];
   }

   public static erx a(azl $$0) {
      return ad.a(b, $$0);
   }

   private static erx a(erx $$0, erx[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (erx.a $$2 : erx.a.values()) {
            $$0.m.put($$2, a(new erx($$0.c, $$0.d, $$2), $$1));
         }

         for (jj $$3 : jj.values()) {
            jj $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new erx($$4, $$3, $$0.f), $$1));
         }

         for (jj $$5 : jj.values()) {
            jj $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new erx($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jj $$0, jj $$1, erx.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jj.a.b) {
            $$3 = $$1.o() == jj.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jj.a.b ? 1 : 0;
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

      public erx.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
