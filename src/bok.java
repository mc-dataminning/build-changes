import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bok implements Comparable<bok> {
   private static final Logger e = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bok> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(ki.d.r().fieldOf("id").forGetter(bok::b), bok.b.a.forGetter(bok::k)).apply($$0, bok::new)
   );
   private final il<boi> f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;
   private boolean k;
   @Nullable
   private bok l;
   private final bok.a m = new bok.a();

   public bok(il<boi> $$0) {
      this($$0, 0, 0);
   }

   public bok(il<boi> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bok(il<boi> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bok(il<boi> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bok(il<boi> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bok(il<boi> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bok $$6) {
      this.f = $$0;
      this.g = $$1;
      this.h = aww.a($$2, 0, 255);
      this.i = $$3;
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
   }

   public bok(bok $$0) {
      this.f = $$0.f;
      this.a($$0);
   }

   private bok(il<boi> $$0, bok.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bok($$0, $$1x)).orElse(null));
   }

   private bok.b k() {
      return new bok.b(this.d(), this.c(), this.e(), this.f(), this.g(), Optional.ofNullable(this.l).map(bok::k));
   }

   public float a(bpp $$0, float $$1) {
      return this.m.a($$0, $$1);
   }

   void a(bok $$0) {
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
   }

   public boolean b(bok $$0) {
      if (!this.f.equals($$0.f)) {
         e.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.h > this.h) {
         if ($$0.e(this)) {
            bok $$2 = this.l;
            this.l = new bok(this);
            this.l.l = $$2;
         }

         this.h = $$0.h;
         this.g = $$0.g;
         $$1 = true;
      } else if (this.e($$0)) {
         if ($$0.h == this.h) {
            this.g = $$0.g;
            $$1 = true;
         } else if (this.l == null) {
            this.l = new bok($$0);
         } else {
            this.l.b($$0);
         }
      }

      if (!$$0.i && this.i || $$1) {
         this.i = $$0.i;
         $$1 = true;
      }

      if ($$0.j != this.j) {
         this.j = $$0.j;
         $$1 = true;
      }

      if ($$0.k != this.k) {
         this.k = $$0.k;
         $$1 = true;
      }

      return $$1;
   }

   private boolean e(bok $$0) {
      return !this.a() && (this.g < $$0.g || $$0.a());
   }

   public boolean a() {
      return this.g == -1;
   }

   public boolean a(int $$0) {
      return !this.a() && this.g <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.a() && this.g != 0 ? $$0.applyAsInt(this.g) : this.g;
   }

   public il<boi> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public int d() {
      return this.h;
   }

   public boolean e() {
      return this.i;
   }

   public boolean f() {
      return this.j;
   }

   public boolean g() {
      return this.k;
   }

   public boolean a(bpp $$0, Runnable $$1) {
      if (this.l()) {
         int $$2 = this.a() ? $$0.ah : this.g;
         if (this.f.a().a($$2, this.h) && !this.f.a().a($$0, this.h)) {
            $$0.e(this.f);
         }

         this.m();
         if (this.g == 0 && this.l != null) {
            this.a(this.l);
            this.l = this.l.l;
            $$1.run();
         }
      }

      this.m.b(this);
      return this.l();
   }

   private boolean l() {
      return this.a() || this.g > 0;
   }

   private int m() {
      if (this.l != null) {
         this.l.m();
      }

      return this.g = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   public void a(bpp $$0) {
      this.f.a().b($$0, this.h);
   }

   public String h() {
      return this.f.a().d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.h > 0) {
         $$0 = this.h() + " x " + (this.h + 1) + ", Duration: " + this.n();
      } else {
         $$0 = this.h() + ", Duration: " + this.n();
      }

      if (!this.j) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.k) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String n() {
      return this.a() ? "infinite" : Integer.toString(this.g);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bok $$1) ? false : this.g == $$1.g && this.h == $$1.h && this.i == $$1.i && this.f.equals($$1.f);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.f.hashCode();
      $$0 = 31 * $$0 + this.g;
      $$0 = 31 * $$0 + this.h;
      return 31 * $$0 + (this.i ? 1 : 0);
   }

   public tx i() {
      return ac.a(d.encodeStart(to.a, this), IllegalStateException::new);
   }

   @Nullable
   public static bok a(ta $$0) {
      return (bok)d.parse(to.a, $$0).resultOrPartial(e::error).orElse(null);
   }

   public int c(bok $$0) {
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

   public boolean a(il<boi> $$0) {
      return this.f.equals($$0);
   }

   public void d(bok $$0) {
      this.m.a($$0.m);
   }

   public void j() {
      this.m.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bok $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bok.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bok $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + aww.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bok $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bok $$0) {
         return $$0.b().a().b();
      }

      public float a(bpp $$0, float $$1) {
         if ($$0.dH()) {
            this.b = this.a;
         }

         return aww.i($$1, this.b, this.a);
      }
   }

   static record b(int b, int c, boolean d, boolean e, boolean f, Optional<bok.b> g) {
      public static final MapCodec<bok.b> a = awe.b(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        awe.a(awe.i, "amplifier", Integer.valueOf(0)).forGetter(bok.b::a),
                        awe.a(Codec.INT, "duration", Integer.valueOf(0)).forGetter(bok.b::b),
                        awe.a(Codec.BOOL, "ambient", false).forGetter(bok.b::c),
                        awe.a(Codec.BOOL, "show_particles", true).forGetter(bok.b::d),
                        awe.a(Codec.BOOL, "show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        awe.a($$0, "hidden_effect").forGetter(bok.b::f)
                     )
                     .apply($$1, bok.b::a)
            )
      );

      private static bok.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bok.b> $$5) {
         return new bok.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public boolean c() {
         return this.d;
      }

      public boolean d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public Optional<bok.b> f() {
         return this.g;
      }
   }
}
