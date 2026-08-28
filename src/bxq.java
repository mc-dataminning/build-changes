import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxq extends bwv implements bwo, byt {
   private static final akn<Float> a = akr.a(bxq.class, akp.d);
   private static final akn<Float> b = akr.a(bxq.class, akp.d);
   private static final akn<Boolean> c = akr.a(bxq.class, akp.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   private static final float i = 1.0F;
   private static final float j = 1.0F;
   private static final boolean k = false;
   @Nullable
   private bxq.a l;
   @Nullable
   private bxq.a m;

   public bxq(bxe<?> $$0, djz $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(a, 1.0F);
      $$0.a(b, 1.0F);
      $$0.a(c, false);
   }

   @Override
   protected void a(ua $$0) {
      this.a($$0.b("width", 1.0F));
      this.b($$0.b("height", 1.0F));
      this.l = $$0.<bxq.a>a("attack", bxq.a.a).orElse(null);
      this.m = $$0.<bxq.a>a("interaction", bxq.a.a).orElse(null);
      this.a($$0.b("response", false));
      this.a(this.au());
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      $$0.b("attack", bxq.a.a, this.l);
      $$0.b("interaction", bxq.a.a, this.m);
      $$0.a("response", this.m());
   }

   @Override
   public void a(akn<?> $$0) {
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
   public exv j_() {
      return exv.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bwv $$0) {
      if ($$0 instanceof crz $$1) {
         this.l = new bxq.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof arv $$2) {
            aq.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      return false;
   }

   @Override
   public but a(crz $$0, bus $$1) {
      if (this.dV().C) {
         return this.m() ? but.a : but.c;
      } else {
         this.m = new bxq.a($$0.cG(), this.dV().ae());
         return but.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bxw aj() {
      return this.l != null ? this.dV().a(this.l.a()) : null;
   }

   @Nullable
   @Override
   public bxw f() {
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

   private bwy n() {
      return bwy.b(this.g(), this.j());
   }

   @Override
   public bwy a(byi $$0) {
      return this.n();
   }

   @Override
   protected ffn c(ffs $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bxq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ka.a.fieldOf("player").forGetter(bxq.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bxq.a::b)).apply($$0, bxq.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
