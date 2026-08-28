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

public class bue implements Comparable<bue> {
   private static final Logger f = LogUtils.getLogger();
   public static final int a = -1;
   public static final int b = 0;
   public static final int c = 255;
   public static final Codec<bue> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(buc.a.fieldOf("id").forGetter(bue::c), bue.b.a.forGetter(bue::m)).apply($$0, bue::new)
   );
   public static final yn<wa, bue> e = yn.a(buc.b, bue::c, bue.b.b, bue::m, bue::new);
   private final jr<buc> g;
   private int h;
   private int i;
   private boolean j;
   private boolean k;
   private boolean l;
   @Nullable
   private bue m;
   private final bue.a n = new bue.a();

   public bue(jr<buc> $$0) {
      this($$0, 0, 0);
   }

   public bue(jr<buc> $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bue(jr<buc> $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bue(jr<buc> $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bue(jr<buc> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null);
   }

   public bue(jr<buc> $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bue $$6) {
      this.g = $$0;
      this.h = $$1;
      this.i = ayz.a($$2, 0, 255);
      this.j = $$3;
      this.k = $$4;
      this.l = $$5;
      this.m = $$6;
   }

   public bue(bue $$0) {
      this.g = $$0.g;
      this.a($$0);
   }

   private bue(jr<buc> $$0, bue.b $$1) {
      this($$0, $$1.b(), $$1.a(), $$1.c(), $$1.d(), $$1.e(), $$1.f().map($$1x -> new bue($$0, $$1x)).orElse(null));
   }

   private bue.b m() {
      return new bue.b(this.e(), this.d(), this.f(), this.g(), this.h(), Optional.ofNullable(this.m).map(bue::m));
   }

   public float a(bvy $$0, float $$1) {
      return this.n.a($$0, $$1);
   }

   public lr a() {
      return this.g.a().a(this);
   }

   void a(bue $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.k = $$0.k;
      this.l = $$0.l;
   }

   public boolean b(bue $$0) {
      if (!this.g.equals($$0.g)) {
         f.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.i > this.i) {
         if ($$0.e(this)) {
            bue $$2 = this.m;
            this.m = new bue(this);
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
            this.m = new bue($$0);
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

   private boolean e(bue $$0) {
      return !this.b() && (this.h < $$0.h || $$0.b());
   }

   public boolean b() {
      return this.h == -1;
   }

   public boolean a(int $$0) {
      return !this.b() && this.h <= $$0;
   }

   public bue a(float $$0) {
      bue $$1 = new bue(this);
      $$1.h = $$1.a((Int2IntFunction)($$1x -> Math.max(ayz.d((float)$$1x * $$0), 1)));
      return $$1;
   }

   public int a(Int2IntFunction $$0) {
      return !this.b() && this.h != 0 ? $$0.applyAsInt(this.h) : this.h;
   }

   public jr<buc> c() {
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

   public boolean a(ard $$0, bvy $$1, Runnable $$2) {
      if (!this.n()) {
         return false;
      } else {
         int $$3 = this.b() ? $$1.af : this.h;
         if (this.g.a().a($$3, this.i) && !this.g.a().a($$0, $$1, this.i)) {
            return false;
         } else {
            this.o();
            if (this.p()) {
               $$2.run();
            }

            return this.n();
         }
      }
   }

   public void i() {
      if (this.n()) {
         this.o();
         this.p();
      }

      this.n.b(this);
   }

   private boolean n() {
      return this.b() || this.h > 0;
   }

   private void o() {
      if (this.m != null) {
         this.m.o();
      }

      this.h = this.a((Int2IntFunction)($$0 -> $$0 - 1));
   }

   private boolean p() {
      if (this.h == 0 && this.m != null) {
         this.a(this.m);
         this.m = this.m.m;
         return true;
      } else {
         return false;
      }
   }

   public void a(bvy $$0) {
      this.g.a().a($$0, this.i);
   }

   public void a(ard $$0, bvy $$1, bva.d $$2) {
      this.g.a().a($$0, $$1, this.i, $$2);
   }

   public void a(ard $$0, bvy $$1, btp $$2, float $$3) {
      this.g.a().a($$0, $$1, this.i, $$2, $$3);
   }

   public String j() {
      return this.g.a().f();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.i > 0) {
         $$0 = this.j() + " x " + (this.i + 1) + ", Duration: " + this.q();
      } else {
         $$0 = this.j() + ", Duration: " + this.q();
      }

      if (!this.k) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.l) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String q() {
      return this.b() ? "infinite" : Integer.toString(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bue $$1)
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

   public un k() {
      return (un)d.encodeStart(ue.a, this).getOrThrow();
   }

   @Nullable
   public static bue a(tq $$0) {
      return (bue)d.parse(ue.a, $$0).resultOrPartial(f::error).orElse(null);
   }

   public int c(bue $$0) {
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

   public void b(bvy $$0) {
      this.g.a().b($$0, this.i);
   }

   public boolean a(jr<buc> $$0) {
      return this.g.equals($$0);
   }

   public void d(bue $$0) {
      this.n.a($$0.n);
   }

   public void l() {
      this.n.a(this);
   }

   static class a {
      private float a;
      private float b;

      public void a(bue $$0) {
         this.a = c($$0) ? 1.0F : 0.0F;
         this.b = this.a;
      }

      public void a(bue.a $$0) {
         this.a = $$0.a;
         this.b = $$0.b;
      }

      public void b(bue $$0) {
         this.b = this.a;
         boolean $$1 = c($$0);
         float $$2 = $$1 ? 1.0F : 0.0F;
         if (this.a != $$2) {
            buc $$3 = $$0.c().a();
            int $$4 = $$1 ? $$3.b() : $$3.c();
            if ($$4 == 0) {
               this.a = $$2;
            } else {
               float $$5 = 1.0F / (float)$$4;
               this.a = this.a + ayz.a($$2 - this.a, -$$5, $$5);
            }
         }
      }

      private static boolean c(bue $$0) {
         return !$$0.a($$0.c().a().d());
      }

      public float a(bvy $$0, float $$1) {
         if ($$0.dP()) {
            this.b = this.a;
         }

         return ayz.h($$1, this.b, this.a);
      }
   }

   static record b(int c, int d, boolean e, boolean f, boolean g, Optional<bue.b> h) {
      public static final MapCodec<bue.b> a = MapCodec.recursive(
         "MobEffectInstance.Details",
         $$0 -> RecordCodecBuilder.mapCodec(
               $$1 -> $$1.group(
                        ayi.k.optionalFieldOf("amplifier", 0).forGetter(bue.b::a),
                        Codec.INT.optionalFieldOf("duration", 0).forGetter(bue.b::b),
                        Codec.BOOL.optionalFieldOf("ambient", false).forGetter(bue.b::c),
                        Codec.BOOL.optionalFieldOf("show_particles", true).forGetter(bue.b::d),
                        Codec.BOOL.optionalFieldOf("show_icon").forGetter($$0xx -> Optional.of($$0xx.e())),
                        $$0.optionalFieldOf("hidden_effect").forGetter(bue.b::f)
                     )
                     .apply($$1, bue.b::a)
            )
      );
      public static final yn<ByteBuf, bue.b> b = yn.a(
         $$0 -> yn.a(yl.h, bue.b::a, yl.h, bue.b::b, yl.b, bue.b::c, yl.b, bue.b::d, yl.b, bue.b::e, $$0.a(yl::a), bue.b::f, bue.b::new)
      );

      private static bue.b a(int $$0, int $$1, boolean $$2, boolean $$3, Optional<Boolean> $$4, Optional<bue.b> $$5) {
         return new bue.b($$0, $$1, $$2, $$3, $$4.orElse($$3), $$5);
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

      public Optional<bue.b> f() {
         return this.h;
      }
   }
}
