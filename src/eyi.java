import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class eyi {
   public static final yw<ByteBuf, eyi> a = yu.a(eyi::a, eyi::i);
   private static final eyi[] b = ag.a(() -> {
      eyi[] $$0 = new eyi[48];
      a(new eyi(jb.b, jb.c, eyi.a.a), $$0);
      return $$0;
   });
   private final jb c;
   private final jb d;
   private final jb e;
   private final eyi.a f;
   private final int g;
   private final List<jb> h;
   private final List<jb> i;
   private final List<jb> j;
   private final Map<jb, eyi> k = new EnumMap<>(jb.class);
   private final Map<jb, eyi> l = new EnumMap<>(jb.class);
   private final Map<eyi.a, eyi> m = new EnumMap<>(eyi.a.class);

   private eyi(jb $$0, jb $$1, eyi.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      ka $$3 = $$1.q().d($$0.q());
      jb $$4 = jb.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == eyi.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static eyi a(jb $$0, jb $$1, eyi.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public eyi a(jb $$0) {
      return this.l.get($$0);
   }

   public eyi b(jb $$0) {
      return this.k.get($$0);
   }

   public eyi c(jb $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public eyi d(jb $$0) {
      eyi $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public eyi a(eyi.a $$0) {
      return this.m.get($$0);
   }

   public eyi a() {
      return this.a(this.f.a());
   }

   public jb b() {
      return this.d;
   }

   public jb c() {
      return this.c;
   }

   public jb d() {
      return this.e;
   }

   public eyi.a e() {
      return this.f;
   }

   public List<jb> f() {
      return this.h;
   }

   public List<jb> g() {
      return this.i;
   }

   public List<jb> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static eyi a(int $$0) {
      return b[$$0];
   }

   public static eyi a(azv $$0) {
      return ag.a(b, $$0);
   }

   private static eyi a(eyi $$0, eyi[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (eyi.a $$2 : eyi.a.values()) {
            $$0.m.put($$2, a(new eyi($$0.c, $$0.d, $$2), $$1));
         }

         for (jb $$3 : jb.values()) {
            jb $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new eyi($$4, $$3, $$0.f), $$1));
         }

         for (jb $$5 : jb.values()) {
            jb $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new eyi($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jb $$0, jb $$1, eyi.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jb.a.b) {
            $$3 = $$1.o() == jb.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jb.a.b ? 1 : 0;
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

      public eyi.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
