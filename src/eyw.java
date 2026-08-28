import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class eyw {
   public static final yy<ByteBuf, eyw> a = yw.a(eyw::a, eyw::i);
   private static final eyw[] b = ag.a(() -> {
      eyw[] $$0 = new eyw[48];
      a(new eyw(jb.b, jb.c, eyw.a.a), $$0);
      return $$0;
   });
   private final jb c;
   private final jb d;
   private final jb e;
   private final eyw.a f;
   private final int g;
   private final List<jb> h;
   private final List<jb> i;
   private final List<jb> j;
   private final Map<jb, eyw> k = new EnumMap<>(jb.class);
   private final Map<jb, eyw> l = new EnumMap<>(jb.class);
   private final Map<eyw.a, eyw> m = new EnumMap<>(eyw.a.class);

   private eyw(jb $$0, jb $$1, eyw.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      ka $$3 = $$1.q().d($$0.q());
      jb $$4 = jb.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == eyw.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static eyw a(jb $$0, jb $$1, eyw.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public eyw a(jb $$0) {
      return this.l.get($$0);
   }

   public eyw b(jb $$0) {
      return this.k.get($$0);
   }

   public eyw c(jb $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public eyw d(jb $$0) {
      eyw $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public eyw a(eyw.a $$0) {
      return this.m.get($$0);
   }

   public eyw a() {
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

   public eyw.a e() {
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

   public static eyw a(int $$0) {
      return b[$$0];
   }

   public static eyw a(azx $$0) {
      return ag.a(b, $$0);
   }

   private static eyw a(eyw $$0, eyw[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (eyw.a $$2 : eyw.a.values()) {
            $$0.m.put($$2, a(new eyw($$0.c, $$0.d, $$2), $$1));
         }

         for (jb $$3 : jb.values()) {
            jb $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new eyw($$4, $$3, $$0.f), $$1));
         }

         for (jb $$5 : jb.values()) {
            jb $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new eyw($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jb $$0, jb $$1, eyw.a $$2) {
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

      public eyw.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
