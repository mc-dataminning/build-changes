import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ejh {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<ejh> a = Codec.INT_STREAM
      .comapFlatMap(
         $$0 -> ad.a($$0, 6).map($$0x -> new ejh($$0x[0], $$0x[1], $$0x[2], $$0x[3], $$0x[4], $$0x[5])),
         $$0 -> IntStream.of($$0.c, $$0.d, $$0.e, $$0.f, $$0.g, $$0.h)
      )
      .stable();
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;

   public ejh(jd $$0) {
      this($$0.u(), $$0.v(), $$0.w(), $$0.u(), $$0.v(), $$0.w());
   }

   public ejh(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      if ($$3 < $$0 || $$4 < $$1 || $$5 < $$2) {
         String $$6 = "Invalid bounding box data, inverted bounds for: " + this;
         if (ab.aU) {
            throw new IllegalStateException($$6);
         }

         b.error($$6);
         this.c = Math.min($$0, $$3);
         this.d = Math.min($$1, $$4);
         this.e = Math.min($$2, $$5);
         this.f = Math.max($$0, $$3);
         this.g = Math.max($$1, $$4);
         this.h = Math.max($$2, $$5);
      }
   }

   public static ejh a(kh $$0, kh $$1) {
      return new ejh(
         Math.min($$0.u(), $$1.u()),
         Math.min($$0.v(), $$1.v()),
         Math.min($$0.w(), $$1.w()),
         Math.max($$0.u(), $$1.u()),
         Math.max($$0.v(), $$1.v()),
         Math.max($$0.w(), $$1.w())
      );
   }

   public static ejh a() {
      return new ejh(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public static ejh a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, ji $$9) {
      switch ($$9) {
         case d:
         default:
            return new ejh($$0 + $$3, $$1 + $$4, $$2 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$8 - 1 + $$5);
         case c:
            return new ejh($$0 + $$3, $$1 + $$4, $$2 - $$8 + 1 + $$5, $$0 + $$6 - 1 + $$3, $$1 + $$7 - 1 + $$4, $$2 + $$5);
         case e:
            return new ejh($$0 - $$8 + 1 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
         case f:
            return new ejh($$0 + $$5, $$1 + $$4, $$2 + $$3, $$0 + $$8 - 1 + $$5, $$1 + $$7 - 1 + $$4, $$2 + $$6 - 1 + $$3);
      }
   }

   public Stream<dcd> b() {
      int $$0 = kf.a(this.h());
      int $$1 = kf.a(this.j());
      int $$2 = kf.a(this.k());
      int $$3 = kf.a(this.m());
      return dcd.a(new dcd($$0, $$1), new dcd($$2, $$3));
   }

   public boolean a(ejh $$0) {
      return this.f >= $$0.c && this.c <= $$0.f && this.h >= $$0.e && this.e <= $$0.h && this.g >= $$0.d && this.d <= $$0.g;
   }

   public boolean a(int $$0, int $$1, int $$2, int $$3) {
      return this.f >= $$0 && this.c <= $$2 && this.h >= $$1 && this.e <= $$3;
   }

   public static Optional<ejh> a(Iterable<jd> $$0) {
      Iterator<jd> $$1 = $$0.iterator();
      if (!$$1.hasNext()) {
         return Optional.empty();
      } else {
         ejh $$2 = new ejh($$1.next());
         $$1.forEachRemaining($$2::a);
         return Optional.of($$2);
      }
   }

   public static Optional<ejh> b(Iterable<ejh> $$0) {
      Iterator<ejh> $$1 = $$0.iterator();
      if (!$$1.hasNext()) {
         return Optional.empty();
      } else {
         ejh $$2 = $$1.next();
         ejh $$3 = new ejh($$2.c, $$2.d, $$2.e, $$2.f, $$2.g, $$2.h);
         $$1.forEachRemaining($$3::b);
         return Optional.of($$3);
      }
   }

   @Deprecated
   public ejh b(ejh $$0) {
      this.c = Math.min(this.c, $$0.c);
      this.d = Math.min(this.d, $$0.d);
      this.e = Math.min(this.e, $$0.e);
      this.f = Math.max(this.f, $$0.f);
      this.g = Math.max(this.g, $$0.g);
      this.h = Math.max(this.h, $$0.h);
      return this;
   }

   @Deprecated
   public ejh a(jd $$0) {
      this.c = Math.min(this.c, $$0.u());
      this.d = Math.min(this.d, $$0.v());
      this.e = Math.min(this.e, $$0.w());
      this.f = Math.max(this.f, $$0.u());
      this.g = Math.max(this.g, $$0.v());
      this.h = Math.max(this.h, $$0.w());
      return this;
   }

   @Deprecated
   public ejh a(int $$0, int $$1, int $$2) {
      this.c += $$0;
      this.d += $$1;
      this.e += $$2;
      this.f += $$0;
      this.g += $$1;
      this.h += $$2;
      return this;
   }

   @Deprecated
   public ejh a(kh $$0) {
      return this.a($$0.u(), $$0.v(), $$0.w());
   }

   public ejh b(int $$0, int $$1, int $$2) {
      return new ejh(this.c + $$0, this.d + $$1, this.e + $$2, this.f + $$0, this.g + $$1, this.h + $$2);
   }

   public ejh a(int $$0) {
      return this.c($$0, $$0, $$0);
   }

   public ejh c(int $$0, int $$1, int $$2) {
      return new ejh(this.h() - $$0, this.i() - $$1, this.j() - $$2, this.k() + $$0, this.l() + $$1, this.m() + $$2);
   }

   public boolean b(kh $$0) {
      return this.d($$0.u(), $$0.v(), $$0.w());
   }

   public boolean d(int $$0, int $$1, int $$2) {
      return $$0 >= this.c && $$0 <= this.f && $$2 >= this.e && $$2 <= this.h && $$1 >= this.d && $$1 <= this.g;
   }

   public kh c() {
      return new kh(this.f - this.c, this.g - this.d, this.h - this.e);
   }

   public int d() {
      return this.f - this.c + 1;
   }

   public int e() {
      return this.g - this.d + 1;
   }

   public int f() {
      return this.h - this.e + 1;
   }

   public jd g() {
      return new jd(this.c + (this.f - this.c + 1) / 2, this.d + (this.g - this.d + 1) / 2, this.e + (this.h - this.e + 1) / 2);
   }

   public void a(Consumer<jd> $$0) {
      jd.a $$1 = new jd.a();
      $$0.accept($$1.d(this.f, this.g, this.h));
      $$0.accept($$1.d(this.c, this.g, this.h));
      $$0.accept($$1.d(this.f, this.d, this.h));
      $$0.accept($$1.d(this.c, this.d, this.h));
      $$0.accept($$1.d(this.f, this.g, this.e));
      $$0.accept($$1.d(this.c, this.g, this.e));
      $$0.accept($$1.d(this.f, this.d, this.e));
      $$0.accept($$1.d(this.c, this.d, this.e));
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("minX", this.c)
         .add("minY", this.d)
         .add("minZ", this.e)
         .add("maxX", this.f)
         .add("maxY", this.g)
         .add("maxZ", this.h)
         .toString();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ejh $$1)
            ? false
            : this.c == $$1.c && this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.g == $$1.g && this.h == $$1.h;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h);
   }

   public int h() {
      return this.c;
   }

   public int i() {
      return this.d;
   }

   public int j() {
      return this.e;
   }

   public int k() {
      return this.f;
   }

   public int l() {
      return this.g;
   }

   public int m() {
      return this.h;
   }
}
