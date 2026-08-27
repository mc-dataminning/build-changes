import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bht implements Comparable<bht> {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = -1;
   private final bhr c;
   private int d;
   private int e;
   private boolean f;
   private boolean g;
   private boolean h;
   @Nullable
   private bht i;
   private final Optional<bht.a> j;

   public bht(bhr $$0) {
      this($$0, 0, 0);
   }

   public bht(bhr $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bht(bhr $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bht(bhr $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bht(bhr $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null, $$0.b());
   }

   public bht(bhr $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bht $$6, Optional<bht.a> $$7) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
   }

   public bht(bht $$0) {
      this.c = $$0.c;
      this.j = this.c.b();
      this.a($$0);
   }

   public Optional<bht.a> a() {
      return this.j;
   }

   void a(bht $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
   }

   public boolean b(bht $$0) {
      if (this.c != $$0.c) {
         b.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.e > this.e) {
         if ($$0.d(this)) {
            bht $$2 = this.i;
            this.i = new bht(this);
            this.i.i = $$2;
         }

         this.e = $$0.e;
         this.d = $$0.d;
         $$1 = true;
      } else if (this.d($$0)) {
         if ($$0.e == this.e) {
            this.d = $$0.d;
            $$1 = true;
         } else if (this.i == null) {
            this.i = new bht($$0);
         } else {
            this.i.b($$0);
         }
      }

      if (!$$0.f && this.f || $$1) {
         this.f = $$0.f;
         $$1 = true;
      }

      if ($$0.g != this.g) {
         this.g = $$0.g;
         $$1 = true;
      }

      if ($$0.h != this.h) {
         this.h = $$0.h;
         $$1 = true;
      }

      return $$1;
   }

   private boolean d(bht $$0) {
      return !this.b() && (this.d < $$0.d || $$0.b());
   }

   public boolean b() {
      return this.d == -1;
   }

   public boolean a(int $$0) {
      return !this.b() && this.d <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.b() && this.d != 0 ? $$0.applyAsInt(this.d) : this.d;
   }

   public bhr c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.e;
   }

   public boolean f() {
      return this.f;
   }

   public boolean g() {
      return this.g;
   }

   public boolean h() {
      return this.h;
   }

   public boolean a(biw $$0, Runnable $$1) {
      if (this.j()) {
         int $$2 = this.b() ? $$0.ah : this.d;
         if (this.c.a($$2, this.e)) {
            this.c.a($$0, this.e);
         }

         this.k();
         if (this.d == 0 && this.i != null) {
            this.a(this.i);
            this.i = this.i.i;
            $$1.run();
         }
      }

      this.j.ifPresent($$0x -> $$0x.a(this));
      return this.j();
   }

   private boolean j() {
      return this.b() || this.d > 0;
   }

   private int k() {
      if (this.i != null) {
         this.i.k();
      }

      return this.d = this.a($$0 -> $$0 - 1);
   }

   public void a(biw $$0) {
      this.c.b($$0, this.e);
   }

   public String i() {
      return this.c.d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.e > 0) {
         $$0 = this.i() + " x " + (this.e + 1) + ", Duration: " + this.l();
      } else {
         $$0 = this.i() + ", Duration: " + this.l();
      }

      if (!this.g) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.h) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String l() {
      return this.b() ? "infinite" : Integer.toString(this.d);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bht $$1) ? false : this.d == $$1.d && this.e == $$1.e && this.f == $$1.f && this.c.equals($$1.c);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.c.hashCode();
      $$0 = 31 * $$0 + this.d;
      $$0 = 31 * $$0 + this.e;
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   public qs a(qs $$0) {
      $$0.a("Id", bhr.a(this.c()));
      this.c($$0);
      return $$0;
   }

   private void c(qs $$0) {
      $$0.a("Amplifier", (byte)this.e());
      $$0.a("Duration", this.d());
      $$0.a("Ambient", this.f());
      $$0.a("ShowParticles", this.g());
      $$0.a("ShowIcon", this.h());
      if (this.i != null) {
         qs $$1 = new qs();
         this.i.a($$1);
         $$0.a("HiddenEffect", $$1);
      }

      this.j.ifPresent($$1x -> bht.a.a.encodeStart(rd.a, $$1x).resultOrPartial(b::error).ifPresent($$1xx -> $$0.a("FactorCalculationData", $$1xx)));
   }

   @Nullable
   public static bht b(qs $$0) {
      int $$1 = $$0.h("Id");
      bhr $$2 = bhr.a($$1);
      return $$2 == null ? null : a($$2, $$0);
   }

   private static bht a(bhr $$0, qs $$1) {
      int $$2 = $$1.f("Amplifier");
      int $$3 = $$1.h("Duration");
      boolean $$4 = $$1.q("Ambient");
      boolean $$5 = true;
      if ($$1.b("ShowParticles", 1)) {
         $$5 = $$1.q("ShowParticles");
      }

      boolean $$6 = $$5;
      if ($$1.b("ShowIcon", 1)) {
         $$6 = $$1.q("ShowIcon");
      }

      bht $$7 = null;
      if ($$1.b("HiddenEffect", 10)) {
         $$7 = a($$0, $$1.p("HiddenEffect"));
      }

      Optional<bht.a> $$8;
      if ($$1.b("FactorCalculationData", 10)) {
         $$8 = bht.a.a.parse(new Dynamic(rd.a, $$1.p("FactorCalculationData"))).resultOrPartial(b::error);
      } else {
         $$8 = Optional.empty();
      }

      return new bht($$0, $$3, Math.max($$2, 0), $$4, $$5, $$6, $$7, $$8);
   }

   public int c(bht $$0) {
      int $$1 = 32147;
      return (this.d() <= 32147 || $$0.d() <= 32147) && (!this.f() || !$$0.f())
         ? ComparisonChain.start()
            .compareFalseFirst(this.f(), $$0.f())
            .compareFalseFirst(this.b(), $$0.b())
            .compare(this.d(), $$0.d())
            .compare(this.c().g(), $$0.c().g())
            .result()
         : ComparisonChain.start().compare(this.f(), $$0.f()).compare(this.c().g(), $$0.c().g()).result();
   }

   public static class a {
      public static final Codec<bht.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqw.i.fieldOf("padding_duration").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("factor_start").orElse(0.0F).forGetter($$0x -> $$0x.c),
                  Codec.FLOAT.fieldOf("factor_target").orElse(1.0F).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("factor_current").orElse(0.0F).forGetter($$0x -> $$0x.e),
                  aqw.i.fieldOf("ticks_active").orElse(0).forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("factor_previous_frame").orElse(0.0F).forGetter($$0x -> $$0x.g),
                  Codec.BOOL.fieldOf("had_effect_last_tick").orElse(false).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, bht.a::new)
      );
      private final int b;
      private float c;
      private float d;
      private float e;
      private int f;
      private float g;
      private boolean h;

      public a(int $$0, float $$1, float $$2, float $$3, int $$4, float $$5, boolean $$6) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = $$5;
         this.h = $$6;
      }

      public a(int $$0) {
         this($$0, 0.0F, 1.0F, 0.0F, 0, 0.0F, false);
      }

      public void a(bht $$0) {
         this.g = this.e;
         boolean $$1 = !$$0.a(this.b);
         this.f++;
         if (this.h != $$1) {
            this.h = $$1;
            this.f = 0;
            this.c = this.e;
            this.d = $$1 ? 1.0F : 0.0F;
         }

         float $$2 = aro.a((float)this.f / (float)this.b, 0.0F, 1.0F);
         this.e = aro.i($$2, this.c, this.d);
      }

      public float a(biw $$0, float $$1) {
         if ($$0.dF()) {
            this.g = this.e;
         }

         return aro.i($$1, this.g, this.e);
      }
   }
}
