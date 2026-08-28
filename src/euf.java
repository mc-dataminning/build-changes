import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class euf {
   public static final ym<ByteBuf, euf> a = yk.a(euf::a, euf::i);
   private static final euf[] b = af.a(() -> {
      euf[] $$0 = new euf[48];
      a(new euf(jn.b, jn.c, euf.a.a), $$0);
      return $$0;
   });
   private final jn c;
   private final jn d;
   private final jn e;
   private final euf.a f;
   private final int g;
   private final List<jn> h;
   private final List<jn> i;
   private final List<jn> j;
   private final Map<jn, euf> k = new EnumMap<>(jn.class);
   private final Map<jn, euf> l = new EnumMap<>(jn.class);
   private final Map<euf.a, euf> m = new EnumMap<>(euf.a.class);

   private euf(jn $$0, jn $$1, euf.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      km $$3 = $$1.q().d($$0.q());
      jn $$4 = jn.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == euf.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static euf a(jn $$0, jn $$1, euf.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public euf a(jn $$0) {
      return this.l.get($$0);
   }

   public euf b(jn $$0) {
      return this.k.get($$0);
   }

   public euf c(jn $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public euf d(jn $$0) {
      euf $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public euf a(euf.a $$0) {
      return this.m.get($$0);
   }

   public euf a() {
      return this.a(this.f.a());
   }

   public jn b() {
      return this.d;
   }

   public jn c() {
      return this.c;
   }

   public jn d() {
      return this.e;
   }

   public euf.a e() {
      return this.f;
   }

   public List<jn> f() {
      return this.h;
   }

   public List<jn> g() {
      return this.i;
   }

   public List<jn> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static euf a(int $$0) {
      return b[$$0];
   }

   public static euf a(azg $$0) {
      return af.a(b, $$0);
   }

   private static euf a(euf $$0, euf[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (euf.a $$2 : euf.a.values()) {
            $$0.m.put($$2, a(new euf($$0.c, $$0.d, $$2), $$1));
         }

         for (jn $$3 : jn.values()) {
            jn $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new euf($$4, $$3, $$0.f), $$1));
         }

         for (jn $$5 : jn.values()) {
            jn $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new euf($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jn $$0, jn $$1, euf.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jn.a.b) {
            $$3 = $$1.o() == jn.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jn.a.b ? 1 : 0;
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

      public euf.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
