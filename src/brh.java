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

public class brh implements Comparable<brh> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<brh> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(lh.d.r().fieldOf("id").forGetter(brh::c), brh.b.a.forGetter(brh::l)).apply($$0, brh::new)
   );
   public static final zc<wp, brh> e = zc.a(za.b(li.R), brh::c, brh.b.b, brh::l, brh::new);
   private final ja<brf> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private brh m;
   private final brh.a n = new brh.a();

   public brh(ja<brf> $$0) {
      this($$0, 0, 0);
   }

   public brh(ja<brf> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public brh(ja<brf> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public brh(ja<brf> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public brh(ja<brf> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public brh(ja<brf> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable brh $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = aym.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public brh(brh $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private brh(ja<brf> $$0, brh.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new brh($$0, $$1x)).orElse(null));
   }

   private brh.b l() {
      return new brh.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(brh::l));
   }

   public float a(bso $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public kz a() {
      return this.g.a().a(this);
   }

   void a(brh $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(brh $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            brh $$2 = this.m;
            this.m = new brh(this);
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
            this.m = new brh($$0);
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

   private boolean e(brh $$0) {
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

   public ja<brf> c() {
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

   public boolean a(bso $$0, Runnable $$1) {
      if (this.m()) {
         int $$2 = this.b() ? $$0.am : this.h;
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

   public void a(bso $$0) {
      this.g.a().b($$0, this.i);
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
         return !($$0 instanceof brh $$1) ? false : this.h == $$1.h && this.i == $$1.i && this.j == $$1.j && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.g.hashCode();
      $$0 = 31 * $$0 + this.h;
      $$0 = 31 * $$0 + this.i;
      return 31 * $$0 + (this.j ? 1 : 0);
   }

   public vh j() {
      return ad.a(d.encodeStart(uy.a, this), IllegalStateException::new);
   }

   @Nullable
   public static brh a(uk $$0) {
      return (brh)d.parse(uy.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(brh $$0) {
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

   public boolean a(ja<brf> $$0) {
      return this.g.equals($$0);
   }

   public void d(brh $$0) {
      this.n.a($$0.n);
   }

   public void k() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(brh $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(brh.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(brh $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + aym.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(brh $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(brh $$0) {
         return $$0.c().a().b();
      }

      public float a(bso $$0, float $$1) {
         if ($$0.dP()) {
            this.b = this.a;
         }

         return aym.i($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<brh.b> h) {
      public static final MapCodec<brh.b> a = axu.b(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        axu.a(axu.h, "amplifier", Integer.valueOf(0)).forGetter(brh.b::a),
                        axu.a(Codec.INT, "duration", Integer.valueOf(0)).forGetter(brh.b::b),
                        axu.a(Codec.BOOL, "ambient", false).forGetter(brh.b::c),
                        axu.a(Codec.BOOL, "show_particles", true).forGetter(brh.b::d),
                        axu.a(Codec.BOOL, "show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        axu.a($$0, "hidden_effect").forGetter(brh.b::f)
                     )
                     .apply($$1, brh.b::a)
            )
      );
      public static final zc<ByteBuf, brh.b> b = zc.a(
         $$0 -> zc.a(za.g, brh.b::a, za.g, brh.b::b, za.b, brh.b::c, za.b, brh.b::d, za.b, brh.b::e, $$0.a(za::a), brh.b::f, brh.b::new)
      );

      private static brh.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<brh.b> $$5) {
         return new brh.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<brh.b> f() {
         return this.h;
      }
   }
}
