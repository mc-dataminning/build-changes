import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buw implements Comparable<buw> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<buw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(buu.a.fieldOf("id").forGetter(buw::c), buw.b.a.forGetter(buw::m)).apply($$0, buw::new)
   );
   public static final yt<wg, buw> e = yt.a(buu.b, buw::c, buw.b.b, buw::m, buw::new);
   private final js<buu> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private buw m;
   private final buw.a n = new buw.a();

   public buw(js<buu> $$0) {
      this($$0, 0, 0);
   }

   public buw(js<buu> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public buw(js<buu> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public buw(js<buu> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public buw(js<buu> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public buw(js<buu> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable buw $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = azk.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public buw(buw $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private buw(js<buu> $$0, buw.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new buw($$0, $$1x)).orElse(null));
   }

   private buw.b m() {
      return new buw.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(buw::m));
   }

   public float a(bwr $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public lt a() {
      return this.g.a().a(this);
   }

   void a(buw $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(buw $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            buw $$2 = this.m;
            this.m = new buw(this);
            this.m.m = $$2;
         }

         this.i = $$0.i;
         this.h = $$0.h;
         $$1 = true;
      } else if (this.e($$0)) {
         if ($$0.i == this.i) {
            this.h = $$0.h;
            $$1 = true;
         } else if (this.m == null) {
            this.m = new buw($$0);
         } else {
            this.m.b($$0);
         }
      }

      if (!$$0.j && this.j || $$1) {
         this.j = $$0.j;
         $$1 = true;
      }

      if ($$0.k != this.k) {
         this.k = $$0.k;
         $$1 = true;
      }

      if ($$0.l != this.l) {
         this.l = $$0.l;
         $$1 = true;
      }

      return $$1;
   }

   private boolean e(buw $$0) {
      return !this.b() && (this.h < $$0.h || $$0.b());
   }

   public boolean b() {
      return this.h == -1;
   }

   public boolean a(int $$0) {
      return !this.b() && this.h <= $$0;
   }

   public buw a(float $$0) {
      buw $$1 = new buw(this);
      $$1.h = $$1.a((Int2IntFunction)($$1x -> Math.max(azk.d((float)$$1x * $$0), 1)));
      return $$1;
   }

   public int a(Int2IntFunction $$0) {
      return !this.b() && this.h != 0 ? $$0.applyAsInt(this.h) : this.h;
   }

   public js<buu> c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public int e() {
      return this.i;
   }

   public boolean f() {
      return this.j;
   }

   public boolean g() {
      return this.k;
   }

   public boolean h() {
      return this.l;
   }

   public boolean a(arn $$0, bwr $$1, Runnable $$2) {
      if (!this.n()) {
         return false;
      } else {
         int $$3 = this.b() ? $$1.af : this.h;
         if (this.g.a().a($$3, this.i) && !this.g.a().a($$0, $$1, this.i)) {
            return false;
         } else {
            this.o();
            if (this.p()) {
               $$2.run();
            }

            return this.n();
         }
      }
   }

   public void i() {
      if (this.n()) {
         this.o();
         this.p();
      }

      this.n.b(this);
   }

   private boolean n() {
      return this.b() || this.h > 0;
   }

   private void o() {
      if (this.m != null) {
         this.m.o();
      }

      this.h = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   private boolean p() {
      if (this.h == 0 && this.m != null) {
         this.a(this.m);
         this.m = this.m.m;
         return true;
      } else {
         return false;
      }
   }

   public void a(bwr $$0) {
      this.g.a().a($$0, this.i);
   }

   public void a(arn $$0, bwr $$1, bvs.e $$2) {
      this.g.a().a($$0, $$1, this.i, $$2);
   }

   public void a(arn $$0, bwr $$1, buh $$2, float $$3) {
      this.g.a().a($$0, $$1, this.i, $$2, $$3);
   }

   public String j() {
      return this.g.a().f();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.i > 0) {
         $$0 = this.j() + " x " + (this.i + 1) + ", Duration: " + this.q();
      } else {
         $$0 = this.j() + ", Duration: " + this.q();
      }

      if (!this.k) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.l) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String q() {
      return this.b() ? "infinite" : Integer.toString(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof buw $$1)
            ? false
            : this.h == $$1.h && this.i == $$1.i && this.j == $$1.j && this.k == $$1.k && this.l == $$1.l && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.g.hashCode();
      $$0 = 31 * $$0 + this.h;
      $$0 = 31 * $$0 + this.i;
      $$0 = 31 * $$0 + (this.j ? 1 : 0);
      $$0 = 31 * $$0 + (this.k ? 1 : 0);
      return 31 * $$0 + (this.l ? 1 : 0);
   }

   public ut k() {
      return (ut)d.encodeStart(uk.a, this).getOrThrow();
   }

   @Nullable
   public static buw a(tw $$0) {
      return (buw)d.parse(uk.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(buw $$0) {
      int $$1 = 32147;
      return (this.d() <= 32147 || $$0.d() <= 32147) && (!this.f() || !$$0.f())
         ? ComparisonChain.start()
            .compareFalseFirst(this.f(), $$0.f())
            .compareFalseFirst(this.b(), $$0.b())
            .compare(this.d(), $$0.d())
            .compare(this.c().a().i(), $$0.c().a().i())
            .result()
         : ComparisonChain.start().compare(this.f(), $$0.f()).compare(this.c().a().i(), $$0.c().a().i()).result();
   }

   public void b(bwr $$0) {
      this.g.a().b($$0, this.i);
   }

   public boolean a(js<buu> $$0) {
      return this.g.equals($$0);
   }

   public void d(buw $$0) {
      this.n.a($$0.n);
   }

   public void l() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(buw $$0) {
         this.a = c($$0) ? 1.0F : 0.0F;
         this.b = this.a;
      }

      public void a(buw.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(buw $$0) {
         this.b = this.a;
         boolean $$1 = c($$0);
         float $$2 = $$1 ? 1.0F : 0.0F;
         if (this.a != $$2) {
            buu $$3 = $$0.c().a();
            int $$4 = $$1 ? $$3.b() : $$3.c();
            if ($$4 == 0) {
               this.a = $$2;
            } else {
               float $$5 = 1.0F / (float)$$4;
               this.a = this.a + azk.a($$2 - this.a, -$$5, $$5);
            }
         }
      }

      private static boolean c(buw $$0) {
         return !$$0.a($$0.c().a().d());
      }

      public float a(bwr $$0, float $$1) {
         if ($$0.dQ()) {
            this.b = this.a;
         }

         return azk.h($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<buw.b> h) {
      public static final MapCodec<buw.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        ays.k.optionalFieldOf("amplifier", 0).forGetter(buw.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(buw.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(buw.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(buw.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(buw.b::f)
                     )
                     .apply($$1, buw.b::a)
            )
      );
      public static final yt<ByteBuf, buw.b> b = yt.a(
         $$0 -> yt.a(yr.h, buw.b::a, yr.h, buw.b::b, yr.b, buw.b::c, yr.b, buw.b::d, yr.b, buw.b::e, $$0.a(yr::a), buw.b::f, buw.b::new)
      );

      private static buw.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<buw.b> $$5) {
         return new buw.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
      }

      public int a() {
         return this.c;
      }

      public int b() {
         return this.d;
      }

      public boolean c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public boolean e() {
         return this.g;
      }

      public Optional<buw.b> f() {
         return this.h;
      }
   }
}
