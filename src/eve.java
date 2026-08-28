import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class eve {
   public static final zt<ByteBuf, eve> a = zr.a(eve::a, eve::i);
   private static final eve[] b = ae.a(() -> {
      eve[] $$0 = new eve[48];
      a(new eve(jm.b, jm.c, eve.a.a), $$0);
      return $$0;
   });
   private final jm c;
   private final jm d;
   private final jm e;
   private final eve.a f;
   private final int g;
   private final List<jm> h;
   private final List<jm> i;
   private final List<jm> j;
   private final Map<jm, eve> k = new EnumMap<>(jm.class);
   private final Map<jm, eve> l = new EnumMap<>(jm.class);
   private final Map<eve.a, eve> m = new EnumMap<>(eve.a.class);

   private eve(jm $$0, jm $$1, eve.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      kl $$3 = $$1.q().d($$0.q());
      jm $$4 = jm.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == eve.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static eve a(jm $$0, jm $$1, eve.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public eve a(jm $$0) {
      return this.l.get($$0);
   }

   public eve b(jm $$0) {
      return this.k.get($$0);
   }

   public eve c(jm $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public eve d(jm $$0) {
      eve $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public eve a(eve.a $$0) {
      return this.m.get($$0);
   }

   public eve a() {
      return this.a(this.f.a());
   }

   public jm b() {
      return this.d;
   }

   public jm c() {
      return this.c;
   }

   public jm d() {
      return this.e;
   }

   public eve.a e() {
      return this.f;
   }

   public List<jm> f() {
      return this.h;
   }

   public List<jm> g() {
      return this.i;
   }

   public List<jm> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static eve a(int $$0) {
      return b[$$0];
   }

   public static eve a(bam $$0) {
      return ae.a(b, $$0);
   }

   private static eve a(eve $$0, eve[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (eve.a $$2 : eve.a.values()) {
            $$0.m.put($$2, a(new eve($$0.c, $$0.d, $$2), $$1));
         }

         for (jm $$3 : jm.values()) {
            jm $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new eve($$4, $$3, $$0.f), $$1));
         }

         for (jm $$5 : jm.values()) {
            jm $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new eve($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jm $$0, jm $$1, eve.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jm.a.b) {
            $$3 = $$1.o() == jm.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jm.a.b ? 1 : 0;
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

      public eve.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
