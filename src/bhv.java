import com.google.common.collect.ComparisonChain;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bhv implements Comparable<bhv> {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = -1;
   private static final String c = "id";
   private static final String d = "ambient";
   private static final String e = "hidden_effect";
   private static final String f = "amplifier";
   private static final String g = "duration";
   private static final String h = "show_particles";
   private static final String i = "show_icon";
   private static final String j = "factor_calculation_data";
   private final bht k;
   private int l;
   private int m;
   private boolean n;
   private boolean o;
   private boolean p;
   @Nullable
   private bhv q;
   private final Optional<bhv.a> r;

   public bhv(bht $$0) {
      this($$0, 0, 0);
   }

   public bhv(bht $$0, int $$1) {
      this($$0, $$1, 0);
   }

   public bhv(bht $$0, int $$1, int $$2) {
      this($$0, $$1, $$2, false, true);
   }

   public bhv(bht $$0, int $$1, int $$2, boolean $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, $$4);
   }

   public bhv(bht $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, null, $$0.b());
   }

   public bhv(bht $$0, int $$1, int $$2, boolean $$3, boolean $$4, boolean $$5, @Nullable bhv $$6, Optional<bhv.a> $$7) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
      this.o = $$4;
      this.p = $$5;
      this.q = $$6;
      this.r = $$7;
   }

   public bhv(bhv $$0) {
      this.k = $$0.k;
      this.r = this.k.b();
      this.a($$0);
   }

   public Optional<bhv.a> a() {
      return this.r;
   }

   void a(bhv $$0) {
      this.l = $$0.l;
      this.m = $$0.m;
      this.n = $$0.n;
      this.o = $$0.o;
      this.p = $$0.p;
   }

   public boolean b(bhv $$0) {
      if (this.k != $$0.k) {
         b.warn("This method should only be called for matching effects!");
      }

      boolean $$1 = false;
      if ($$0.m > this.m) {
         if ($$0.d(this)) {
            bhv $$2 = this.q;
            this.q = new bhv(this);
            this.q.q = $$2;
         }

         this.m = $$0.m;
         this.l = $$0.l;
         $$1 = true;
      } else if (this.d($$0)) {
         if ($$0.m == this.m) {
            this.l = $$0.l;
            $$1 = true;
         } else if (this.q == null) {
            this.q = new bhv($$0);
         } else {
            this.q.b($$0);
         }
      }

      if (!$$0.n && this.n || $$1) {
         this.n = $$0.n;
         $$1 = true;
      }

      if ($$0.o != this.o) {
         this.o = $$0.o;
         $$1 = true;
      }

      if ($$0.p != this.p) {
         this.p = $$0.p;
         $$1 = true;
      }

      return $$1;
   }

   private boolean d(bhv $$0) {
      return !this.b() && (this.l < $$0.l || $$0.b());
   }

   public boolean b() {
      return this.l == -1;
   }

   public boolean a(int $$0) {
      return !this.b() && this.l <= $$0;
   }

   public int a(Int2IntFunction $$0) {
      return !this.b() && this.l != 0 ? $$0.applyAsInt(this.l) : this.l;
   }

   public bht c() {
      return this.k;
   }

   public int d() {
      return this.l;
   }

   public int e() {
      return this.m;
   }

   public boolean f() {
      return this.n;
   }

   public boolean g() {
      return this.o;
   }

   public boolean h() {
      return this.p;
   }

   public boolean a(biy $$0, Runnable $$1) {
      if (this.j()) {
         int $$2 = this.b() ? $$0.ah : this.l;
         if (this.k.a($$2, this.m)) {
            this.k.a($$0, this.m);
         }

         this.k();
         if (this.l == 0 && this.q != null) {
            this.a(this.q);
            this.q = this.q.q;
            $$1.run();
         }
      }

      this.r.ifPresent($$0x -> $$0x.a(this));
      return this.j();
   }

   private boolean j() {
      return this.b() || this.l > 0;
   }

   private int k() {
      if (this.q != null) {
         this.q.k();
      }

      return this.l = this.a($$0 -> $$0 - 1);
   }

   public void a(biy $$0) {
      this.k.b($$0, this.m);
   }

   public String i() {
      return this.k.d();
   }

   @Override
   public String toString() {
      String $$0;
      if (this.m > 0) {
         $$0 = this.i() + " x " + (this.m + 1) + ", Duration: " + this.l();
      } else {
         $$0 = this.i() + ", Duration: " + this.l();
      }

      if (!this.o) {
         $$0 = $$0 + ", Particles: false";
      }

      if (!this.p) {
         $$0 = $$0 + ", Show Icon: false";
      }

      return $$0;
   }

   private String l() {
      return this.b() ? "infinite" : Integer.toString(this.l);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof bhv $$1) ? false : this.l == $$1.l && this.m == $$1.m && this.n == $$1.n && this.k.equals($$1.k);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.k.hashCode();
      $$0 = 31 * $$0 + this.l;
      $$0 = 31 * $$0 + this.m;
      return 31 * $$0 + (this.n ? 1 : 0);
   }

   public qr a(qr $$0) {
      aer $$1 = jb.e.b(this.k);
      $$0.a("id", $$1.toString());
      this.c($$0);
      return $$0;
   }

   private void c(qr $$0) {
      $$0.a("amplifier", (byte)this.e());
      $$0.a("duration", this.d());
      $$0.a("ambient", this.f());
      $$0.a("show_particles", this.g());
      $$0.a("show_icon", this.h());
      if (this.q != null) {
         qr $$1 = new qr();
         this.q.a($$1);
         $$0.a("hidden_effect", $$1);
      }

      this.r.ifPresent($$1x -> bhv.a.a.encodeStart(rc.a, $$1x).resultOrPartial(b::error).ifPresent($$1xx -> $$0.a("factor_calculation_data", $$1xx)));
   }

   @Nullable
   public static bhv b(qr $$0) {
      String $$1 = $$0.l("id");
      bht $$2 = jb.e.a(aer.a($$1));
      return $$2 == null ? null : a($$2, $$0);
   }

   private static bhv a(bht $$0, qr $$1) {
      int $$2 = $$1.f("amplifier");
      int $$3 = $$1.h("duration");
      boolean $$4 = $$1.q("ambient");
      boolean $$5 = true;
      if ($$1.b("show_particles", 1)) {
         $$5 = $$1.q("show_particles");
      }

      boolean $$6 = $$5;
      if ($$1.b("show_icon", 1)) {
         $$6 = $$1.q("show_icon");
      }

      bhv $$7 = null;
      if ($$1.b("hidden_effect", 10)) {
         $$7 = a($$0, $$1.p("hidden_effect"));
      }

      Optional<bhv.a> $$8;
      if ($$1.b("factor_calculation_data", 10)) {
         $$8 = bhv.a.a.parse(new Dynamic(rc.a, $$1.p("factor_calculation_data"))).resultOrPartial(b::error);
      } else {
         $$8 = Optional.empty();
      }

      return new bhv($$0, $$3, Math.max($$2, 0), $$4, $$5, $$6, $$7, $$8);
   }

   public int c(bhv $$0) {
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
      public static final Codec<bhv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  aqy.i.fieldOf("padding_duration").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("factor_start").orElse(0.0F).forGetter($$0x -> $$0x.c),
                  Codec.FLOAT.fieldOf("factor_target").orElse(1.0F).forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("factor_current").orElse(0.0F).forGetter($$0x -> $$0x.e),
                  aqy.i.fieldOf("ticks_active").orElse(0).forGetter($$0x -> $$0x.f),
                  Codec.FLOAT.fieldOf("factor_previous_frame").orElse(0.0F).forGetter($$0x -> $$0x.g),
                  Codec.BOOL.fieldOf("had_effect_last_tick").orElse(false).forGetter($$0x -> $$0x.h)
               )
               .apply($$0, bhv.a::new)
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

      public void a(bhv $$0) {
         this.g = this.e;
         boolean $$1 = !$$0.a(this.b);
         this.f++;
         if (this.h != $$1) {
            this.h = $$1;
            this.f = 0;
            this.c = this.e;
            this.d = $$1 ? 1.0F : 0.0F;
         }

         float $$2 = arp.a((float)this.f / (float)this.b, 0.0F, 1.0F);
         this.e = arp.i($$2, this.c, this.d);
      }

      public float a(biy $$0, float $$1) {
         if ($$0.dF()) {
            this.g = this.e;
         }

         return arp.i($$1, this.g, this.e);
      }
   }
}
