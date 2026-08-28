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

public class bvz implements Comparable<bvz> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bvz> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(bvx.a.fieldOf("id").forGetter(bvz::c), bvz.b.a.forGetter(bvz::l)).apply($$0, bvz::new)
   );
   public static final za<wn, bvz> e = za.a(bvx.b, bvz::c, bvz.b.b, bvz::l, bvz::new);
   private final jg<bvx> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bvz m;
   private final bvz.a n = new bvz.a();

   public bvz(jg<bvx> $$0) {
      this($$0, 0, 0);
   }

   public bvz(jg<bvx> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bvz(jg<bvx> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bvz(jg<bvx> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bvz(jg<bvx> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bvz(jg<bvx> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bvz $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = azq.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bvz(bvz $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bvz(jg<bvx> $$0, bvz.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bvz($$0, $$1x)).orElse(null));
   }

   private bvz.b l() {
      return new bvz.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(bvz::l));
   }

   public float a(bxw $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public lx a() {
      return this.g.a().a(this);
   }

   void a(bvz $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bvz $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bvz $$2 = this.m;
            this.m = new bvz(this);
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
            this.m = new bvz($$0);
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

   private boolean e(bvz $$0) {
      return !this.b() && (this.h < $$0.h || $$0.b());
   }

   public boolean b() {
      return this.h == -1;
   }

   public boolean a(int $$0) {
      return !this.b() && this.h <= $$0;
   }

   public bvz a(float $$0) {
      bvz $$1 = new bvz(this);
      $$1.h = $$1.a((Int2IntFunction)($$1x -> Math.max(azq.d((float)$$1x * $$0), 1)));
      return $$1;
   }

   public int a(Int2IntFunction $$0) {
      return !this.b() && this.h != 0 ? $$0.applyAsInt(this.h) : this.h;
   }

   public jg<bvx> c() {
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

   public boolean a(aru $$0, bxw $$1, Runnable $$2) {
      if (!this.m()) {
         return false;
      } else {
         int $$3 = this.b() ? $$1.af : this.h;
         if (this.g.a().a($$3, this.i) && !this.g.a().a($$0, $$1, this.i)) {
            return false;
         } else {
            this.n();
            if (this.o()) {
               $$2.run();
            }

            return this.m();
         }
      }
   }

   public void i() {
      if (this.m()) {
         this.n();
         this.o();
      }

      this.n.b(this);
   }

   private boolean m() {
      return this.b() || this.h > 0;
   }

   private void n() {
      if (this.m != null) {
         this.m.n();
      }

      this.h = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   private boolean o() {
      if (this.h == 0 && this.m != null) {
         this.a(this.m);
         this.m = this.m.m;
         return true;
      } else {
         return false;
      }
   }

   public void a(bxw $$0) {
      this.g.a().a($$0, this.i);
   }

   public void a(aru $$0, bxw $$1, bwv.d $$2) {
      this.g.a().a($$0, $$1, this.i, $$2);
   }

   public void a(aru $$0, bxw $$1, bvk $$2, float $$3) {
      this.g.a().a($$0, $$1, this.i, $$2, $$3);
   }

   public String j() {
      return this.g.a().f();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.i > 0) {
         $$0 = this.j() + " x " + (this.i + 1) + ", Duration: " + this.p();
      } else {
         $$0 = this.j() + ", Duration: " + this.p();
      }

      if (!this.k) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.l) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String p() {
      return this.b() ? "infinite" : Integer.toString(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bvz $$1)
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

   public int c(bvz $$0) {
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

   public void b(bxw $$0) {
      this.g.a().b($$0, this.i);
   }

   public boolean a(jg<bvx> $$0) {
      return this.g.equals($$0);
   }

   public void d(bvz $$0) {
      this.n.a($$0.n);
   }

   public void k() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bvz $$0) {
         this.a = c($$0) ? 1.0F : 0.0F;
         this.b = this.a;
      }

      public void a(bvz.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bvz $$0) {
         this.b = this.a;
         boolean $$1 = c($$0);
         float $$2 = $$1 ? 1.0F : 0.0F;
         if (this.a != $$2) {
            bvx $$3 = $$0.c().a();
            int $$4 = $$1 ? $$3.b() : $$3.c();
            if ($$4 == 0) {
               this.a = $$2;
            } else {
               float $$5 = 1.0F / (float)$$4;
               this.a = this.a + azq.a($$2 - this.a, -$$5, $$5);
            }
         }
      }

      private static boolean c(bvz $$0) {
         return !$$0.a($$0.c().a().d());
      }

      public float a(bxw $$0, float $$1) {
         if ($$0.dQ()) {
            this.b = this.a;
         }

         return azq.h($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bvz.b> h) {
      public static final MapCodec<bvz.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        ayy.k.optionalFieldOf("amplifier", 0).forGetter(bvz.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(bvz.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(bvz.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(bvz.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(bvz.b::f)
                     )
                     .apply($$1, bvz.b::a)
            )
      );
      public static final za<ByteBuf, bvz.b> b = za.a(
         $$0 -> za.a(yy.h, bvz.b::a, yy.h, bvz.b::b, yy.b, bvz.b::c, yy.b, bvz.b::d, yy.b, bvz.b::e, $$0.a(yy::a), bvz.b::f, bvz.b::new)
      );

      private static bvz.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bvz.b> $$5) {
         return new bvz.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bvz.b> f() {
         return this.h;
      }
   }
}
