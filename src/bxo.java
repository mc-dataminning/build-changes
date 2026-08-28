import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxo extends bwt implements bwm, byr {
   private static final akl<Float> a = akp.a(bxo.class, akn.d);
   private static final akl<Float> b = akp.a(bxo.class, akn.d);
   private static final akl<Boolean> c = akp.a(bxo.class, akn.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   private static final float i = 1.0F;
   private static final float j = 1.0F;
   private static final boolean k = false;
   @Nullable
   private bxo.a l;
   @Nullable
   private bxo.a m;

   public bxo(bxc<?> $$0, djx $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(a, 1.0F);
      $$0.a(b, 1.0F);
      $$0.a(c, false);
   }

   @Override
   protected void a(tz $$0) {
      this.a($$0.b("width", 1.0F));
      this.b($$0.b("height", 1.0F));
      this.l = $$0.<bxo.a>a("attack", bxo.a.a).orElse(null);
      this.m = $$0.<bxo.a>a("interaction", bxo.a.a).orElse(null);
      this.a($$0.b("response", false));
      this.a(this.au());
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      $$0.b("attack", bxo.a.a, this.l);
      $$0.b("interaction", bxo.a.a, this.m);
      $$0.a("response", this.m());
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (b.equals($$0) || a.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public boolean bE() {
      return false;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public ext j_() {
      return ext.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bwt $$0) {
      if ($$0 instanceof crx $$1) {
         this.l = new bxo.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof art $$2) {
            aq.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return false;
   }

   @Override
   public bur a(crx $$0, buq $$1) {
      if (this.dV().C) {
         return this.m() ? bur.a : bur.c;
      } else {
         this.m = new bxo.a($$0.cG(), this.dV().ae());
         return bur.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bxu aj() {
      return this.l != null ? this.dV().a(this.l.a()) : null;
   }

   @Nullable
   @Override
   public bxu f() {
      return this.m != null ? this.dV().a(this.m.a()) : null;
   }

   private void a(float $$0) {
      this.al.a(a, $$0);
   }

   private float g() {
      return this.al.a(a);
   }

   private void b(float $$0) {
      this.al.a(b, $$0);
   }

   private float j() {
      return this.al.a(b);
   }

   private void a(boolean $$0) {
      this.al.a(c, $$0);
   }

   private boolean m() {
      return this.al.a(c);
   }

   private bww n() {
      return bww.b(this.g(), this.j());
   }

   @Override
   public bww a(byg $$0) {
      return this.n();
   }

   @Override
   protected ffl c(ffq $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bxo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jz.a.fieldOf("player").forGetter(bxo.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bxo.a::b)).apply($$0, bxo.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
