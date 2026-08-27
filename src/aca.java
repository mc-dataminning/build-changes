import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class aca {
   private static final any<abz<?>> C = any.c(16);
   public static final abz<Byte> a = abz.a(($$0, $$1) -> $$0.writeByte($$1), sf::readByte);
   public static final abz<Integer> b = abz.a(sf::d, sf::m);
   public static final abz<Long> c = abz.a(sf::b, sf::n);
   public static final abz<Float> d = abz.a(sf::writeFloat, sf::readFloat);
   public static final abz<String> e = abz.a(sf::a, sf::s);
   public static final abz<sw> f = abz.a(sf::a, sf::l);
   public static final abz<Optional<sw>> g = abz.b(sf::a, sf::l);
   public static final abz<cfz> h = new abz<cfz>() {
      public void a(sf $$0, cfz $$1) {
         $$0.a($$1);
      }

      public cfz b(sf $$0) {
         return $$0.r();
      }

      public cfz a(cfz $$0) {
         return $$0.p();
      }
   };
   public static final abz<dcb> i = abz.a(cpn.o);
   public static final abz<Optional<dcb>> j = new abz.a<Optional<dcb>>() {
      public void a(sf $$0, Optional<dcb> $$1) {
         if ($$1.isPresent()) {
            $$0.d(cpn.i($$1.get()));
         } else {
            $$0.d(0);
         }
      }

      public Optional<dcb> b(sf $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? Optional.empty() : Optional.of(cpn.a($$1));
      }
   };
   public static final abz<Boolean> k = abz.a(sf::writeBoolean, sf::readBoolean);
   public static final abz<it> l = new abz.a<it>() {
      public void a(sf $$0, it $$1) {
         $$0.a(jb.k, $$1.b());
         $$1.a($$0);
      }

      public it b(sf $$0) {
         return this.a($$0, $$0.a(jb.k));
      }

      private <T extends it> T a(sf $$0, iu<T> $$1) {
         return $$1.d().b($$1, $$0);
      }
   };
   public static final abz<hw> m = new abz.a<hw>() {
      public void a(sf $$0, hw $$1) {
         $$0.writeFloat($$1.b());
         $$0.writeFloat($$1.c());
         $$0.writeFloat($$1.d());
      }

      public hw b(sf $$0) {
         return new hw($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
      }
   };
   public static final abz<gu> n = abz.a(sf::a, sf::f);
   public static final abz<Optional<gu>> o = abz.b(sf::a, sf::f);
   public static final abz<ha> p = abz.a(ha.class);
   public static final abz<Optional<UUID>> q = abz.b(sf::a, sf::o);
   public static final abz<Optional<hd>> r = abz.b(sf::a, sf::i);
   public static final abz<qr> s = new abz<qr>() {
      public void a(sf $$0, qr $$1) {
         $$0.a($$1);
      }

      public qr b(sf $$0) {
         return $$0.p();
      }

      public qr a(qr $$0) {
         return $$0.h();
      }
   };
   public static final abz<byc> t = new abz.a<byc>() {
      public void a(sf $$0, byc $$1) {
         $$0.a(jb.z, $$1.a());
         $$0.a(jb.A, $$1.b());
         $$0.d($$1.c());
      }

      public byc b(sf $$0) {
         return new byc($$0.a(jb.z), $$0.a(jb.A), $$0.m());
      }
   };
   public static final abz<OptionalInt> u = new abz.a<OptionalInt>() {
      public void a(sf $$0, OptionalInt $$1) {
         $$0.d($$1.orElse(-1) + 1);
      }

      public OptionalInt b(sf $$0) {
         int $$1 = $$0.m();
         return $$1 == 0 ? OptionalInt.empty() : OptionalInt.of($$1 - 1);
      }
   };
   public static final abz<bgl> v = abz.a(bgl.class);
   public static final abz<brp> w = abz.a(jb.aj);
   public static final abz<brw> x = abz.a(jb.ak);
   public static final abz<he<bvd>> y = abz.a(jb.m.t());
   public static final abz<btx.a> z = abz.a(btx.a.class);
   public static final abz<Vector3f> A = abz.a(sf::a, sf::j);
   public static final abz<Quaternionf> B = abz.a(sf::a, sf::k);

   public static void a(abz<?> $$0) {
      C.c($$0);
   }

   @Nullable
   public static abz<?> a(int $$0) {
      return C.a($$0);
   }

   public static int b(abz<?> $$0) {
      return C.a($$0);
   }

   private aca() {
   }

   static {
      a(a);
      a(b);
      a(c);
      a(d);
      a(e);
      a(f);
      a(g);
      a(h);
      a(k);
      a(m);
      a(n);
      a(o);
      a(p);
      a(q);
      a(i);
      a(j);
      a(s);
      a(l);
      a(t);
      a(u);
      a(v);
      a(w);
      a(x);
      a(r);
      a(y);
      a(z);
      a(A);
      a(B);
   }
}
