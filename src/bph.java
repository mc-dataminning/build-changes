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

public class bph implements Comparable<bph> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bph> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(kr.d.r().fieldOf("id").forGetter(bph::b), bph.b.a.forGetter(bph::k)).apply($$0, bph::new)
   );
   public static final ye<vr, bph> e = ye.a(yc.b(ks.Q), bph::b, bph.b.b, bph::k, bph::new);
   private final il<bpf> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bph m;
   private final bph.a n = new bph.a();

   public bph(il<bpf> $$0) {
      this($$0, 0, 0);
   }

   public bph(il<bpf> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bph(il<bpf> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bph(il<bpf> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bph(il<bpf> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bph(il<bpf> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bph $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = axk.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bph(bph $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bph(il<bpf> $$0, bph.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bph($$0, $$1x)).orElse(null));
   }

   private bph.b k() {
      return new bph.b(this.d(), this.c(), this.e(), this.f(), this.g(), Optional.ofNullable(this.m).map(bph::k));
   }

   public float a(bqo $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   void a(bph $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bph $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bph $$2 = this.m;
            this.m = new bph(this);
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
            this.m = new bph($$0);
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

   private boolean e(bph $$0) {
      return !this.a() && (this.h < $$0.h || $$0.a());
   }

   public boolean a() {
      return this.h == -1;
   }

   public boolean a(int $$0) {
      return !this.a() && this.h <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.a() && this.h != 0 ? $$0.applyAsInt(this.h) : this.h;
   }

   public il<bpf> b() {
      return this.g;
   }

   public int c() {
      return this.h;
   }

   public int d() {
      return this.i;
   }

   public boolean e() {
      return this.j;
   }

   public boolean f() {
      return this.k;
   }

   public boolean g() {
      return this.l;
   }

   public boolean a(bqo $$0, Runnable $$1) {
      if (this.l()) {
         int $$2 = this.a() ? $$0.ah : this.h;
         if (this.g.a().a($$2, this.i) && !this.g.a().a($$0, this.i)) {
            $$0.e(this.g);
         }

         this.m();
         if (this.h == 0 && this.m != null) {
            this.a(this.m);
            this.m = this.m.m;
            $$1.run();
         }
      }

      this.n.b(this);
      return this.l();
   }

   private boolean l() {
      return this.a() || this.h > 0;
   }

   private int m() {
      if (this.m != null) {
         this.m.m();
      }

      return this.h = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   public void a(bqo $$0) {
      this.g.a().b($$0, this.i);
   }

   public String h() {
      return this.g.a().d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.i > 0) {
         $$0 = this.h() + " x " + (this.i + 1) + ", Duration: " + this.n();
      } else {
         $$0 = this.h() + ", Duration: " + this.n();
      }

      if (!this.k) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.l) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String n() {
      return this.a() ? "infinite" : Integer.toString(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bph $$1) ? false : this.h == $$1.h && this.i == $$1.i && this.j == $$1.j && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.g.hashCode();
      $$0 = 31 * $$0 + this.h;
      $$0 = 31 * $$0 + this.i;
      return 31 * $$0 + (this.j ? 1 : 0);
   }

   public uj i() {
      return ac.a(d.encodeStart(ua.a, this), IllegalStateException::new);
   }

   @Nullable
   public static bph a(tm $$0) {
      return (bph)d.parse(ua.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(bph $$0) {
      int $$1 = 32147;
      return (this.c() <= 32147 || $$0.c() <= 32147) && (!this.e() || !$$0.e())
         ? ComparisonChain.start()
            .compareFalseFirst(this.e(), $$0.e())
            .compareFalseFirst(this.a(), $$0.a())
            .compare(this.c(), $$0.c())
            .compare(this.b().a().g(), $$0.b().a().g())
            .result()
         : ComparisonChain.start().compare(this.e(), $$0.e()).compare(this.b().a().g(), $$0.b().a().g()).result();
   }

   public boolean a(il<bpf> $$0) {
      return this.g.equals($$0);
   }

   public void d(bph $$0) {
      this.n.a($$0.n);
   }

   public void j() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bph $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bph.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bph $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + axk.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bph $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bph $$0) {
         return $$0.b().a().b();
      }

      public float a(bqo $$0, float $$1) {
         if ($$0.dH()) {
            this.b = this.a;
         }

         return axk.i($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bph.b> h) {
      public static final MapCodec<bph.b> a = aws.b(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        aws.a(aws.h, "amplifier", Integer.valueOf(0)).forGetter(bph.b::a),
                        aws.a(Codec.INT, "duration", Integer.valueOf(0)).forGetter(bph.b::b),
                        aws.a(Codec.BOOL, "ambient", false).forGetter(bph.b::c),
                        aws.a(Codec.BOOL, "show_particles", true).forGetter(bph.b::d),
                        aws.a(Codec.BOOL, "show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        aws.a($$0, "hidden_effect").forGetter(bph.b::f)
                     )
                     .apply($$1, bph.b::a)
            )
      );
      public static final ye<ByteBuf, bph.b> b = ye.a(
         $$0 -> ye.a(yc.f, bph.b::a, yc.f, bph.b::b, yc.b, bph.b::c, yc.b, bph.b::d, yc.b, bph.b::e, $$0.a(yc::a), bph.b::f, bph.b::new)
      );

      private static bph.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bph.b> $$5) {
         return new bph.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bph.b> f() {
         return this.h;
      }
   }
}
