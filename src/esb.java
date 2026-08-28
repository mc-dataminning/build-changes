import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class esb {
   public static final zc<ByteBuf, esb> a = za.a(esb::a, esb::i);
   private static final esb[] b = ad.a(() -> {
      esb[] $$0 = new esb[48];
      a(new esb(jk.b, jk.c, esb.a.a), $$0);
      return $$0;
   });
   private final jk c;
   private final jk d;
   private final jk e;
   private final esb.a f;
   private final int g;
   private final List<jk> h;
   private final List<jk> i;
   private final List<jk> j;
   private final Map<jk, esb> k = new EnumMap<>(jk.class);
   private final Map<jk, esb> l = new EnumMap<>(jk.class);
   private final Map<esb.a, esb> m = new EnumMap<>(esb.a.class);

   private esb(jk $$0, jk $$1, esb.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      kj $$3 = $$1.q().d($$0.q());
      jk $$4 = jk.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == esb.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static esb a(jk $$0, jk $$1, esb.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public esb a(jk $$0) {
      return this.l.get($$0);
   }

   public esb b(jk $$0) {
      return this.k.get($$0);
   }

   public esb c(jk $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public esb d(jk $$0) {
      esb $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public esb a(esb.a $$0) {
      return this.m.get($$0);
   }

   public esb a() {
      return this.a(this.f.a());
   }

   public jk b() {
      return this.d;
   }

   public jk c() {
      return this.c;
   }

   public jk d() {
      return this.e;
   }

   public esb.a e() {
      return this.f;
   }

   public List<jk> f() {
      return this.h;
   }

   public List<jk> g() {
      return this.i;
   }

   public List<jk> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static esb a(int $$0) {
      return b[$$0];
   }

   public static esb a(azn $$0) {
      return ad.a(b, $$0);
   }

   private static esb a(esb $$0, esb[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (esb.a $$2 : esb.a.values()) {
            $$0.m.put($$2, a(new esb($$0.c, $$0.d, $$2), $$1));
         }

         for (jk $$3 : jk.values()) {
            jk $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new esb($$4, $$3, $$0.f), $$1));
         }

         for (jk $$5 : jk.values()) {
            jk $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new esb($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jk $$0, jk $$1, esb.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jk.a.b) {
            $$3 = $$1.o() == jk.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jk.a.b ? 1 : 0;
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

      public esb.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
