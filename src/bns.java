import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bns implements Comparable<bns> {
   private static final Logger c = LogUtils.getLogger();
   public static final int a = -1;
   public static final Codec<bns> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(kh.d.r().fieldOf("id").forGetter(bns::b), bns.b.a.forGetter(bns::k)).apply($$0, bns::new)
   );
   private final il<bnq> d;
   private int e;
   private int f;
   private boolean g;
   private boolean h;
   private boolean i;
   @Nullable
   private bns j;
   private final bns.a k = new bns.a();

   public bns(il<bnq> $$0) {
      this($$0, 0, 0);
   }

   public bns(il<bnq> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bns(il<bnq> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bns(il<bnq> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bns(il<bnq> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bns(il<bnq> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bns $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
   }

   public bns(bns $$0) {
      this.d = $$0.d;
      this.a($$0);
   }

   private bns(il<bnq> $$0, bns.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bns($$0, $$1x)).orElse(null));
   }

   private bns.b k() {
      return new bns.b(this.d(), this.c(), this.e(), this.f(), this.g(), Optional.ofNullable(this.j).map(bns::k));
   }

   public float a(box $$0, float $$1) {
      return this.k.a($$0, $$1);
   }

   void a(bns $$0) {
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public boolean b(bns $$0) {
      if (!this.d.equals($$0.d)) {
         c.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.f > this.f) {
         if ($$0.e(this)) {
            bns $$2 = this.j;
            this.j = new bns(this);
            this.j.j = $$2;
         }

         this.f = $$0.f;
         this.e = $$0.e;
         $$1 = true;
      } else if (this.e($$0)) {
         if ($$0.f == this.f) {
            this.e = $$0.e;
            $$1 = true;
         } else if (this.j == null) {
            this.j = new bns($$0);
         } else {
            this.j.b($$0);
         }
      }

      if (!$$0.g && this.g || $$1) {
         this.g = $$0.g;
         $$1 = true;
      }

      if ($$0.h != this.h) {
         this.h = $$0.h;
         $$1 = true;
      }

      if ($$0.i != this.i) {
         this.i = $$0.i;
         $$1 = true;
      }

      return $$1;
   }

   private boolean e(bns $$0) {
      return !this.a() && (this.e < $$0.e || $$0.a());
   }

   public boolean a() {
      return this.e == -1;
   }

   public boolean a(int $$0) {
      return !this.a() && this.e <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.a() && this.e != 0 ? $$0.applyAsInt(this.e) : this.e;
   }

   public il<bnq> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }

   public boolean f() {
      return this.h;
   }

   public boolean g() {
      return this.i;
   }

   public boolean a(box $$0, Runnable $$1) {
      if (this.l()) {
         int $$2 = this.a() ? $$0.ag : this.e;
         if (this.d.a().a($$2, this.f) && !this.d.a().a($$0, this.f)) {
            $$0.e(this.d);
         }

         this.m();
         if (this.e == 0 && this.j != null) {
            this.a(this.j);
            this.j = this.j.j;
            $$1.run();
         }
      }

      this.k.b(this);
      return this.l();
   }

   private boolean l() {
      return this.a() || this.e > 0;
   }

   private int m() {
      if (this.j != null) {
         this.j.m();
      }

      return this.e = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   public void a(box $$0) {
      this.d.a().b($$0, this.f);
   }

   public String h() {
      return this.d.a().d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.f > 0) {
         $$0 = this.h() + " x " + (this.f + 1) + ", Duration: " + this.n();
      } else {
         $$0 = this.h() + ", Duration: " + this.n();
      }

      if (!this.h) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.i) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String n() {
      return this.a() ? "infinite" : Integer.toString(this.e);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bns $$1) ? false : this.e == $$1.e && this.f == $$1.f && this.g == $$1.g && this.d.equals($$1.d);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      $$0 = 31 * $$0 + this.e;
      $$0 = 31 * $$0 + this.f;
      return 31 * $$0 + (this.g ? 1 : 0);
   }

   public tv i() {
      return ac.a(b.encodeStart(tm.a, this), IllegalStateException::new);
   }

   @Nullable
   public static bns a(sy $$0) {
      return (bns)b.parse(tm.a, $$0).resultOrPartial(c::error).orElse(null);
   }

   public int c(bns $$0) {
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

   public boolean a(il<bnq> $$0) {
      return this.d.equals($$0);
   }

   public void d(bns $$0) {
      this.k.a($$0.k);
   }

   public void j() {
      this.k.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bns $$0) {
         this.a = c($$0);
         this.b = this.a;
      }

      public void a(bns.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bns $$0) {
         this.b = this.a;
         int $$1 = d($$0);
         if ($$1 == 0) {
            this.a = 1.0F;
         } else {
            float $$2 = c($$0);
            if (this.a != $$2) {
               float $$3 = 1.0F / (float)$$1;
               this.a = this.a + awm.a($$2 - this.a, -$$3, $$3);
            }
         }
      }

      private static float c(bns $$0) {
         boolean $$1 = !$$0.a(d($$0));
         return $$1 ? 1.0F : 0.0F;
      }

      private static int d(bns $$0) {
         return $$0.b().a().b();
      }

      public float a(box $$0, float $$1) {
         if ($$0.dE()) {
            this.b = this.a;
         }

         return awm.i($$1, this.b, this.a);
      }
   }

   static record b(int b, int c, boolean d, boolean e, boolean f, Optional<bns.b> g) {
      private static final Codec<Integer> h = avu.a(Codec.BYTE.xmap(Byte::intValue, Integer::byteValue), Codec.checkRange(0, 127));
      public static final MapCodec<bns.b> a = avu.a(
         (Function<Codec<bns.b>, MapCodec<bns.b>>)($$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        avu.a(h, "amplifier", Integer.valueOf(0)).forGetter(bns.b::a),
                        avu.a(Codec.INT, "duration", Integer.valueOf(0)).forGetter(bns.b::b),
                        avu.a(Codec.BOOL, "ambient", false).forGetter(bns.b::c),
                        avu.a(Codec.BOOL, "show_particles", true).forGetter(bns.b::d),
                        avu.a(Codec.BOOL, "show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        avu.a($$0, "hidden_effect").forGetter(bns.b::f)
                     )
                     .apply($$1, bns.b::a)
            ))
      );

      private static bns.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bns.b> $$5) {
         return new bns.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bns.b> f() {
         return this.g;
      }
   }
}
