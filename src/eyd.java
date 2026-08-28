import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class eyd {
   public static final yw<ByteBuf, eyd> a = yu.a(eyd::a, eyd::i);
   private static final eyd[] b = ag.a(() -> {
      eyd[] $$0 = new eyd[48];
      a(new eyd(jb.b, jb.c, eyd.a.a), $$0);
      return $$0;
   });
   private final jb c;
   private final jb d;
   private final jb e;
   private final eyd.a f;
   private final int g;
   private final List<jb> h;
   private final List<jb> i;
   private final List<jb> j;
   private final Map<jb, eyd> k = new EnumMap<>(jb.class);
   private final Map<jb, eyd> l = new EnumMap<>(jb.class);
   private final Map<eyd.a, eyd> m = new EnumMap<>(eyd.a.class);

   private eyd(jb $$0, jb $$1, eyd.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      ka $$3 = $$1.q().d($$0.q());
      jb $$4 = jb.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == eyd.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static eyd a(jb $$0, jb $$1, eyd.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public eyd a(jb $$0) {
      return this.l.get($$0);
   }

   public eyd b(jb $$0) {
      return this.k.get($$0);
   }

   public eyd c(jb $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public eyd d(jb $$0) {
      eyd $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public eyd a(eyd.a $$0) {
      return this.m.get($$0);
   }

   public eyd a() {
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

   public eyd.a e() {
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

   public static eyd a(int $$0) {
      return b[$$0];
   }

   public static eyd a(azv $$0) {
      return ag.a(b, $$0);
   }

   private static eyd a(eyd $$0, eyd[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (eyd.a $$2 : eyd.a.values()) {
            $$0.m.put($$2, a(new eyd($$0.c, $$0.d, $$2), $$1));
         }

         for (jb $$3 : jb.values()) {
            jb $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new eyd($$4, $$3, $$0.f), $$1));
         }

         for (jb $$5 : jb.values()) {
            jb $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new eyd($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jb $$0, jb $$1, eyd.a $$2) {
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

      public eyd.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
