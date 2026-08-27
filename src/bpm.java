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

public class bpm implements Comparable<bpm> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bpm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(kt.d.r().fieldOf("id").forGetter(bpm::b), bpm.b.a.forGetter(bpm::k)).apply($$0, bpm::new)
   );
   public static final yg<vt, bpm> e = yg.a(ye.b(ku.R), bpm::b, bpm.b.b, bpm::k, bpm::new);
   private final in<bpk> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bpm m;
   private final bpm.a n = new bpm.a();

   public bpm(in<bpk> $$0) {
      this($$0, 0, 0);
   }

   public bpm(in<bpk> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bpm(in<bpk> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bpm(in<bpk> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bpm(in<bpk> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bpm(in<bpk> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bpm $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = axm.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bpm(bpm $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bpm(in<bpk> $$0, bpm.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bpm($$0, $$1x)).orElse(null));
   }

   private bpm.b k() {
      return new bpm.b(this.d(), this.c(), this.e(), this.f(), this.g(), Optional.ofNullable(this.m).map(bpm::k));
   }

   public float a(bqt $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   void a(bpm $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bpm $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bpm $$2 = this.m;
            this.m = new bpm(this);
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
            this.m = new bpm($$0);
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

   private boolean e(bpm $$0) {
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

   public in<bpk> b() {
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

   public boolean a(bqt $$0, Runnable $$1) {
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

   public void a(bqt $$0) {
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
         return !($$0 instanceof bpm $$1) ? false : this.h == $$1.h && this.i == $$1.i && this.j == $$1.j && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.g.hashCode();
      $$0 = 31 * $$0 + this.h;
      $$0 = 31 * $$0 + this.i;
      return 31 * $$0 + (this.j ? 1 : 0);
   }

   public ul i() {
      return ac.a(d.encodeStart(uc.a, this), IllegalStateException::new);
   }

   @Nullable
   public static bpm a(to $$0) {
      return (bpm)d.parse(uc.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(bpm $$0) {
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

   public boolean a(in<bpk> $$0) {
      return this.g.equals($$0);
   }

   public void d(bpm $$0) {
      this.n.a($$0.n);
   }

   public void j() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bpm $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bpm.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bpm $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + axm.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bpm $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bpm $$0) {
         return $$0.b().a().b();
      }

      public float a(bqt $$0, float $$1) {
         if ($$0.dH()) {
            this.b = this.a;
         }

         return axm.i($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bpm.b> h) {
      public static final MapCodec<bpm.b> a = awu.b(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        awu.a(awu.h, "amplifier", Integer.valueOf(0)).forGetter(bpm.b::a),
                        awu.a(Codec.INT, "duration", Integer.valueOf(0)).forGetter(bpm.b::b),
                        awu.a(Codec.BOOL, "ambient", false).forGetter(bpm.b::c),
                        awu.a(Codec.BOOL, "show_particles", true).forGetter(bpm.b::d),
                        awu.a(Codec.BOOL, "show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        awu.a($$0, "hidden_effect").forGetter(bpm.b::f)
                     )
                     .apply($$1, bpm.b::a)
            )
      );
      public static final yg<ByteBuf, bpm.b> b = yg.a(
         $$0 -> yg.a(ye.f, bpm.b::a, ye.f, bpm.b::b, ye.b, bpm.b::c, ye.b, bpm.b::d, ye.b, bpm.b::e, $$0.a(ye::a), bpm.b::f, bpm.b::new)
      );

      private static bpm.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bpm.b> $$5) {
         return new bpm.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bpm.b> f() {
         return this.h;
      }
   }
}
