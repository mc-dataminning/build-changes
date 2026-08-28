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

public class bto implements Comparable<bto> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bto> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(btm.a.fieldOf("id").forGetter(bto::c), bto.b.a.forGetter(bto::l)).apply($$0, bto::new)
   );
   public static final ym<vz, bto> e = ym.a(btm.b, bto::c, bto.b.b, bto::l, bto::new);
   private final jr<btm> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bto m;
   private final bto.a n = new bto.a();

   public bto(jr<btm> $$0) {
      this($$0, 0, 0);
   }

   public bto(jr<btm> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bto(jr<btm> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bto(jr<btm> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bto(jr<btm> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bto(jr<btm> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bto $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = ayy.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bto(bto $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bto(jr<btm> $$0, bto.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bto($$0, $$1x)).orElse(null));
   }

   private bto.b l() {
      return new bto.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(bto::l));
   }

   public float a(bvf $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public lr a() {
      return this.g.a().a(this);
   }

   void a(bto $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bto $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bto $$2 = this.m;
            this.m = new bto(this);
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
            this.m = new bto($$0);
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

   private boolean e(bto $$0) {
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

   public jr<btm> c() {
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

   public boolean a(bvf $$0, Runnable $$1) {
      if (this.m()) {
         int $$2 = this.b() ? $$0.af : this.h;
         if ($$0.dW() instanceof arc $$3 && this.g.a().a($$2, this.i) && !this.g.a().a($$3, $$0, this.i)) {
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

   public void a(bvf $$0) {
      this.g.a().a($$0, this.i);
   }

   public void a(arc $$0, bvf $$1, buj.d $$2) {
      this.g.a().a($$0, $$1, this.i, $$2);
   }

   public void a(arc $$0, bvf $$1, bsz $$2, float $$3) {
      this.g.a().a($$0, $$1, this.i, $$2, $$3);
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
         return !($$0 instanceof bto $$1)
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

   public un j() {
      return (un)d.encodeStart(ue.a, this).getOrThrow();
   }

   @Nullable
   public static bto a(tq $$0) {
      return (bto)d.parse(ue.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(bto $$0) {
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

   public void b(bvf $$0) {
      this.g.a().b($$0, this.i);
   }

   public boolean a(jr<btm> $$0) {
      return this.g.equals($$0);
   }

   public void d(bto $$0) {
      this.n.a($$0.n);
   }

   public void k() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bto $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bto.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bto $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + ayy.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bto $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bto $$0) {
         return $$0.c().a().b();
      }

      public float a(bvf $$0, float $$1) {
         if ($$0.dR()) {
            this.b = this.a;
         }

         return ayy.h($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bto.b> h) {
      public static final MapCodec<bto.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        ayh.k.optionalFieldOf("amplifier", 0).forGetter(bto.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(bto.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(bto.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(bto.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(bto.b::f)
                     )
                     .apply($$1, bto.b::a)
            )
      );
      public static final ym<ByteBuf, bto.b> b = ym.a(
         $$0 -> ym.a(yk.h, bto.b::a, yk.h, bto.b::b, yk.b, bto.b::c, yk.b, bto.b::d, yk.b, bto.b::e, $$0.a(yk::a), bto.b::f, bto.b::new)
      );

      private static bto.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bto.b> $$5) {
         return new bto.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bto.b> f() {
         return this.h;
      }
   }
}
