import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class exd {
   public static final yu<ByteBuf, exd> a = ys.a(exd::a, exd::i);
   private static final exd[] b = af.a(() -> {
      exd[] $$0 = new exd[48];
      a(new exd(ja.b, ja.c, exd.a.a), $$0);
      return $$0;
   });
   private final ja c;
   private final ja d;
   private final ja e;
   private final exd.a f;
   private final int g;
   private final List<ja> h;
   private final List<ja> i;
   private final List<ja> j;
   private final Map<ja, exd> k = new EnumMap<>(ja.class);
   private final Map<ja, exd> l = new EnumMap<>(ja.class);
   private final Map<exd.a, exd> m = new EnumMap<>(exd.a.class);

   private exd(ja $$0, ja $$1, exd.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      jz $$3 = $$1.q().d($$0.q());
      ja $$4 = ja.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == exd.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static exd a(ja $$0, ja $$1, exd.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public exd a(ja $$0) {
      return this.l.get($$0);
   }

   public exd b(ja $$0) {
      return this.k.get($$0);
   }

   public exd c(ja $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public exd d(ja $$0) {
      exd $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public exd a(exd.a $$0) {
      return this.m.get($$0);
   }

   public exd a() {
      return this.a(this.f.a());
   }

   public ja b() {
      return this.d;
   }

   public ja c() {
      return this.c;
   }

   public ja d() {
      return this.e;
   }

   public exd.a e() {
      return this.f;
   }

   public List<ja> f() {
      return this.h;
   }

   public List<ja> g() {
      return this.i;
   }

   public List<ja> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static exd a(int $$0) {
      return b[$$0];
   }

   public static exd a(azt $$0) {
      return af.a(b, $$0);
   }

   private static exd a(exd $$0, exd[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (exd.a $$2 : exd.a.values()) {
            $$0.m.put($$2, a(new exd($$0.c, $$0.d, $$2), $$1));
         }

         for (ja $$3 : ja.values()) {
            ja $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new exd($$4, $$3, $$0.f), $$1));
         }

         for (ja $$5 : ja.values()) {
            ja $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new exd($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(ja $$0, ja $$1, exd.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == ja.a.b) {
            $$3 = $$1.o() == ja.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == ja.a.b ? 1 : 0;
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

      public exd.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
