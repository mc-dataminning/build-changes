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

public class bte implements Comparable<bte> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bte> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(btc.a.fieldOf("id").forGetter(bte::c), bte.b.a.forGetter(bte::l)).apply($$0, bte::new)
   );
   public static final zf<ws, bte> e = zf.a(btc.b, bte::c, bte.b.b, bte::l, bte::new);
   private final jp<btc> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bte m;
   private final bte.a n = new bte.a();

   public bte(jp<btc> $$0) {
      this($$0, 0, 0);
   }

   public bte(jp<btc> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bte(jp<btc> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bte(jp<btc> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bte(jp<btc> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bte(jp<btc> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bte $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = azj.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bte(bte $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bte(jp<btc> $$0, bte.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bte($$0, $$1x)).orElse(null));
   }

   private bte.b l() {
      return new bte.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(bte::l));
   }

   public float a(buv $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public lo a() {
      return this.g.a().a(this);
   }

   void a(bte $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bte $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bte $$2 = this.m;
            this.m = new bte(this);
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
            this.m = new bte($$0);
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

   private boolean e(bte $$0) {
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

   public jp<btc> c() {
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

   public boolean a(buv $$0, Runnable $$1) {
      if (this.m()) {
         int $$2 = this.b() ? $$0.ag : this.h;
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

   public void a(buv $$0) {
      this.g.a().b($$0, this.i);
   }

   public void a(buv $$0, btz.c $$1) {
      this.g.a().a($$0, this.i, $$1);
   }

   public void a(buv $$0, bsp $$1, float $$2) {
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
         return !($$0 instanceof bte $$1)
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

   public vg j() {
      return (vg)d.encodeStart(ux.a, this).getOrThrow();
   }

   @Nullable
   public static bte a(uj $$0) {
      return (bte)d.parse(ux.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(bte $$0) {
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

   public void b(buv $$0) {
      this.g.a().c($$0, this.i);
   }

   public boolean a(jp<btc> $$0) {
      return this.g.equals($$0);
   }

   public void d(bte $$0) {
      this.n.a($$0.n);
   }

   public void k() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bte $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bte.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bte $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + azj.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bte $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bte $$0) {
         return $$0.c().a().b();
      }

      public float a(buv $$0, float $$1) {
         if ($$0.dS()) {
            this.b = this.a;
         }

         return azj.h($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bte.b> h) {
      public static final MapCodec<bte.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        ays.k.optionalFieldOf("amplifier", 0).forGetter(bte.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(bte.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(bte.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(bte.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(bte.b::f)
                     )
                     .apply($$1, bte.b::a)
            )
      );
      public static final zf<ByteBuf, bte.b> b = zf.a(
         $$0 -> zf.a(zd.h, bte.b::a, zd.h, bte.b::b, zd.b, bte.b::c, zd.b, bte.b::d, zd.b, bte.b::e, $$0.a(zd::a), bte.b::f, bte.b::new)
      );

      private static bte.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bte.b> $$5) {
         return new bte.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bte.b> f() {
         return this.h;
      }
   }
}
