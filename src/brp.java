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

public class brp implements Comparable<brp> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<brp> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(brn.a.fieldOf("id").forGetter(brp::c), brp.b.a.forGetter(brp::l)).apply($$0, brp::new)
   );
   public static final ys<wf, brp> e = ys.a(brn.b, brp::c, brp.b.b, brp::l, brp::new);
   private final jj<brn> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private brp m;
   private final brp.a n = new brp.a();

   public brp(jj<brn> $$0) {
      this($$0, 0, 0);
   }

   public brp(jj<brn> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public brp(jj<brn> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public brp(jj<brn> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public brp(jj<brn> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public brp(jj<brn> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable brp $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = ayg.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public brp(brp $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private brp(jj<brn> $$0, brp.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new brp($$0, $$1x)).orElse(null));
   }

   private brp.b l() {
      return new brp.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(brp::l));
   }

   public float a(btc $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public lh a() {
      return this.g.a().a(this);
   }

   void a(brp $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(brp $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            brp $$2 = this.m;
            this.m = new brp(this);
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
            this.m = new brp($$0);
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

   private boolean e(brp $$0) {
      return !this.b() && (this.h < $$0.h || $$0.b());
   }

   public boolean b() {
      return this.h == -1;
   }

   public boolean a(int $$0) {
      return !this.b() && this.h <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.b() && this.h != 0 ? $$0.applyAsInt(this.h) : this.h;
   }

   public jj<brn> c() {
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

   public boolean a(btc $$0, Runnable $$1) {
      if (this.m()) {
         int $$2 = this.b() ? $$0.ai : this.h;
         if (this.g.a().a($$2, this.i) && !this.g.a().a($$0, this.i)) {
            $$0.e(this.g);
         }

         this.n();
         if (this.h == 0 && this.m != null) {
            this.a(this.m);
            this.m = this.m.m;
            $$1.run();
         }
      }

      this.n.b(this);
      return this.m();
   }

   private boolean m() {
      return this.b() || this.h > 0;
   }

   private int n() {
      if (this.m != null) {
         this.m.n();
      }

      return this.h = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   public void a(btc $$0) {
      this.g.a().b($$0, this.i);
   }

   public void a(btc $$0, bsh.d $$1) {
      this.g.a().a($$0, this.i, $$1);
   }

   public void a(btc $$0, bra $$1, float $$2) {
      this.g.a().a($$0, this.i, $$1, $$2);
   }

   public String i() {
      return this.g.a().d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.i > 0) {
         $$0 = this.i() + " x " + (this.i + 1) + ", Duration: " + this.o();
      } else {
         $$0 = this.i() + ", Duration: " + this.o();
      }

      if (!this.k) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.l) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String o() {
      return this.b() ? "infinite" : Integer.toString(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof brp $$1)
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

   public uu j() {
      return (uu)d.encodeStart(ul.a, this).getOrThrow();
   }

   @Nullable
   public static brp a(tx $$0) {
      return (brp)d.parse(ul.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(brp $$0) {
      int $$1 = 32147;
      return (this.d() <= 32147 || $$0.d() <= 32147) && (!this.f() || !$$0.f())
         ? ComparisonChain.start()
            .compareFalseFirst(this.f(), $$0.f())
            .compareFalseFirst(this.b(), $$0.b())
            .compare(this.d(), $$0.d())
            .compare(this.c().a().g(), $$0.c().a().g())
            .result()
         : ComparisonChain.start().compare(this.f(), $$0.f()).compare(this.c().a().g(), $$0.c().a().g()).result();
   }

   public void b(btc $$0) {
      this.g.a().c($$0, this.i);
   }

   public boolean a(jj<brn> $$0) {
      return this.g.equals($$0);
   }

   public void d(brp $$0) {
      this.n.a($$0.n);
   }

   public void k() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(brp $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(brp.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(brp $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + ayg.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(brp $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(brp $$0) {
         return $$0.c().a().b();
      }

      public float a(btc $$0, float $$1) {
         if ($$0.dM()) {
            this.b = this.a;
         }

         return ayg.i($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<brp.b> h) {
      public static final MapCodec<brp.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        axo.j.optionalFieldOf("amplifier", 0).forGetter(brp.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(brp.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(brp.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(brp.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(brp.b::f)
                     )
                     .apply($$1, brp.b::a)
            )
      );
      public static final ys<ByteBuf, brp.b> b = ys.a(
         $$0 -> ys.a(yq.g, brp.b::a, yq.g, brp.b::b, yq.b, brp.b::c, yq.b, brp.b::d, yq.b, brp.b::e, $$0.a(yq::a), brp.b::f, brp.b::new)
      );

      private static brp.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<brp.b> $$5) {
         return new brp.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<brp.b> f() {
         return this.h;
      }
   }
}
