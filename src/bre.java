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

public class bre implements Comparable<bre> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bre> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(le.d.r().fieldOf("id").forGetter(bre::c), bre.b.a.forGetter(bre::l)).apply($$0, bre::new)
   );
   public static final yv<wi, bre> e = yv.a(yt.b(lf.R), bre::c, bre.b.b, bre::l, bre::new);
   private final ix<brc> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bre m;
   private final bre.a n = new bre.a();

   public bre(ix<brc> $$0) {
      this($$0, 0, 0);
   }

   public bre(ix<brc> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bre(ix<brc> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bre(ix<brc> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bre(ix<brc> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bre(ix<brc> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bre $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = ayf.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bre(bre $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bre(ix<brc> $$0, bre.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bre($$0, $$1x)).orElse(null));
   }

   private bre.b l() {
      return new bre.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(bre::l));
   }

   public float a(bsq $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public kw a() {
      return this.g.a().a(this);
   }

   void a(bre $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bre $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bre $$2 = this.m;
            this.m = new bre(this);
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
            this.m = new bre($$0);
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

   private boolean e(bre $$0) {
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

   public ix<brc> c() {
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

   public boolean a(bsq $$0, Runnable $$1) {
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

   public void a(bsq $$0) {
      this.g.a().b($$0, this.i);
   }

   public void a(bsq $$0, brw.c $$1) {
      this.g.a().a($$0, this.i, $$1);
   }

   public void a(bsq $$0, bqp $$1, float $$2) {
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
         return !($$0 instanceof bre $$1) ? false : this.h == $$1.h && this.i == $$1.i && this.j == $$1.j && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.g.hashCode();
      $$0 = 31 * $$0 + this.h;
      $$0 = 31 * $$0 + this.i;
      return 31 * $$0 + (this.j ? 1 : 0);
   }

   public va j() {
      return (va)d.encodeStart(ur.a, this).getOrThrow();
   }

   @Nullable
   public static bre a(ud $$0) {
      return (bre)d.parse(ur.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(bre $$0) {
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

   public void b(bsq $$0) {
      this.g.a().c($$0, this.i);
   }

   public boolean a(ix<brc> $$0) {
      return this.g.equals($$0);
   }

   public void d(bre $$0) {
      this.n.a($$0.n);
   }

   public void k() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bre $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bre.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bre $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + ayf.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bre $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bre $$0) {
         return $$0.c().a().b();
      }

      public float a(bsq $$0, float $$1) {
         if ($$0.dK()) {
            this.b = this.a;
         }

         return ayf.i($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bre.b> h) {
      public static final MapCodec<bre.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        axn.h.optionalFieldOf("amplifier", 0).forGetter(bre.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(bre.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(bre.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(bre.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(bre.b::f)
                     )
                     .apply($$1, bre.b::a)
            )
      );
      public static final yv<ByteBuf, bre.b> b = yv.a(
         $$0 -> yv.a(yt.f, bre.b::a, yt.f, bre.b::b, yt.b, bre.b::c, yt.b, bre.b::d, yt.b, bre.b::e, $$0.a(yt::a), bre.b::f, bre.b::new)
      );

      private static bre.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bre.b> $$5) {
         return new bre.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bre.b> f() {
         return this.h;
      }
   }
}
