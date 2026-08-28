import com.google.common.annotations.VisibleForTesting;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ewb {
   public static final yt<ByteBuf, ewb> a = yr.a(ewb::a, ewb::i);
   private static final ewb[] b = af.a(() -> {
      ewb[] $$0 = new ewb[48];
      a(new ewb(jo.b, jo.c, ewb.a.a), $$0);
      return $$0;
   });
   private final jo c;
   private final jo d;
   private final jo e;
   private final ewb.a f;
   private final int g;
   private final List<jo> h;
   private final List<jo> i;
   private final List<jo> j;
   private final Map<jo, ewb> k = new EnumMap<>(jo.class);
   private final Map<jo, ewb> l = new EnumMap<>(jo.class);
   private final Map<ewb.a, ewb> m = new EnumMap<>(ewb.a.class);

   private ewb(jo $$0, jo $$1, ewb.a $$2) {
      this.c = $$0;
      this.d = $$1;
      this.f = $$2;
      this.g = b($$0, $$1, $$2);
      kn $$3 = $$1.q().d($$0.q());
      jo $$4 = jo.a($$3, null);
      Objects.requireNonNull($$4);
      if (this.f == ewb.a.b) {
         this.e = $$4;
      } else {
         this.e = $$4.g();
      }

      this.h = List.of(this.d.g(), this.d, this.e, this.e.g(), this.c.g(), this.c);
      this.i = this.h.stream().filter($$0x -> $$0x.o() != this.c.o()).toList();
      this.j = this.h.stream().filter($$0x -> $$0x.o() == this.c.o()).toList();
   }

   public static ewb a(jo $$0, jo $$1, ewb.a $$2) {
      return b[b($$0, $$1, $$2)];
   }

   public ewb a(jo $$0) {
      return this.l.get($$0);
   }

   public ewb b(jo $$0) {
      return this.k.get($$0);
   }

   public ewb c(jo $$0) {
      return $$0.o() == this.c.o() ? this : this.k.get($$0);
   }

   public ewb d(jo $$0) {
      ewb $$1 = this.b($$0);
      return this.d == $$1.e ? $$1.a() : $$1;
   }

   public ewb a(ewb.a $$0) {
      return this.m.get($$0);
   }

   public ewb a() {
      return this.a(this.f.a());
   }

   public jo b() {
      return this.d;
   }

   public jo c() {
      return this.c;
   }

   public jo d() {
      return this.e;
   }

   public ewb.a e() {
      return this.f;
   }

   public List<jo> f() {
      return this.h;
   }

   public List<jo> g() {
      return this.i;
   }

   public List<jo> h() {
      return this.j;
   }

   @Override
   public String toString() {
      return "[up=" + this.c + ",front=" + this.d + ",sideBias=" + this.f + "]";
   }

   public int i() {
      return this.g;
   }

   public static ewb a(int $$0) {
      return b[$$0];
   }

   public static ewb a(azs $$0) {
      return af.a(b, $$0);
   }

   private static ewb a(ewb $$0, ewb[] $$1) {
      if ($$1[$$0.i()] != null) {
         return $$1[$$0.i()];
      } else {
         $$1[$$0.i()] = $$0;

         for (ewb.a $$2 : ewb.a.values()) {
            $$0.m.put($$2, a(new ewb($$0.c, $$0.d, $$2), $$1));
         }

         for (jo $$3 : jo.values()) {
            jo $$4 = $$0.c;
            if ($$3 == $$0.c) {
               $$4 = $$0.d.g();
            }

            if ($$3 == $$0.c.g()) {
               $$4 = $$0.d;
            }

            $$0.k.put($$3, a(new ewb($$4, $$3, $$0.f), $$1));
         }

         for (jo $$5 : jo.values()) {
            jo $$6 = $$0.d;
            if ($$5 == $$0.d) {
               $$6 = $$0.c.g();
            }

            if ($$5 == $$0.d.g()) {
               $$6 = $$0.c;
            }

            $$0.l.put($$5, a(new ewb($$5, $$6, $$0.f), $$1));
         }

         return $$0;
      }
   }

   @VisibleForTesting
   protected static int b(jo $$0, jo $$1, ewb.a $$2) {
      if ($$0.o() == $$1.o()) {
         throw new IllegalStateException("Up-vector and front-vector can not be on the same axis");
      } else {
         int $$3;
         if ($$0.o() == jo.a.b) {
            $$3 = $$1.o() == jo.a.a ? 1 : 0;
         } else {
            $$3 = $$1.o() == jo.a.b ? 1 : 0;
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

      public ewb.a a() {
         return this == a ? b : a;
      }

      @Override
      public String toString() {
         return this.c;
      }
   }
}
