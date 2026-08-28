import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class eyy {
   public static final za<ByteBuf, eyy> a = yy.a(eyy::a, eyy::i);
   private static final eyy[] b = ag.a(() -> {
      eyy[] $$0 = new eyy[48];
      a(new eyy(jc.b, jc.c, eyy.a.a), $$0);
      return $$0;
   });
   private final jc c;
   private final jc d;
   private final jc e;
   private final eyy.a f;
   private final int g;
   private final List<jc> h;
   private final List<jc> i;
   private final List<jc> j;
   private final Map<jc, eyy> k = new EnumMap<>(jc.class);
   private final Map<jc, eyy> l = new EnumMap<>(jc.class);
   private final Map<eyy.a, eyy> m = new EnumMap<>(eyy.a.class);

   private eyy(jc $$0, jc $$1, eyy.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      kb $$3 = $$1.q().d($$0.q());
      jc $$4 = jc.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == eyy.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static eyy a(jc $$0, jc $$1, eyy.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public eyy a(jc $$0) {
      return this.l.get($$0);
   }

   public eyy b(jc $$0) {
      return this.k.get($$0);
   }

   public eyy c(jc $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public eyy d(jc $$0) {
      eyy $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public eyy a(eyy.a $$0) {
      return this.m.get($$0);
   }

   public eyy a() {
      return this.a(this.f.a());
   }

   public jc b() {
      return this.d;
   }

   public jc c() {
      return this.c;
   }

   public jc d() {
      return this.e;
   }

   public eyy.a e() {
      return this.f;
   }

   public List<jc> f() {
      return this.h;
   }

   public List<jc> g() {
      return this.i;
   }

   public List<jc> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static eyy a(int $$0) {
      return b[$$0];
   }

   public static eyy a(azz $$0) {
      return ag.a(b, $$0);
   }

   private static eyy a(eyy $$0, eyy[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (eyy.a $$2 : eyy.a.values()) {
            $$0.m.put($$2, a(new eyy($$0.c, $$0.d, $$2), $$1));
         }

         for (jc $$3 : jc.values()) {
            jc $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new eyy($$4, $$3, $$0.f), $$1));
         }

         for (jc $$5 : jc.values()) {
            jc $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new eyy($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jc $$0, jc $$1, eyy.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jc.a.b) {
            $$3 = $$1.o() == jc.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jc.a.b ? 1 : 0;
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

      public eyy.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
