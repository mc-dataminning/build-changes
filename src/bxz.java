import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxz extends bxe implements bwx, bzc {
   private static final aku<Float> a = aky.a(bxz.class, akw.d);
   private static final aku<Float> b = aky.a(bxz.class, akw.d);
   private static final aku<Boolean> c = aky.a(bxz.class, akw.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   private static final float i = 1.0F;
   private static final float j = 1.0F;
   private static final boolean k = false;
   @Nullable
   private bxz.a l;
   @Nullable
   private bxz.a m;

   public bxz(bxn<?> $$0, dkj $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(a, 1.0F);
      $$0.a(b, 1.0F);
      $$0.a(c, false);
   }

   @Override
   protected void a(ua $$0) {
      this.a($$0.b("width", 1.0F));
      this.b($$0.b("height", 1.0F));
      this.l = $$0.<bxz.a>a("attack", bxz.a.a).orElse(null);
      this.m = $$0.<bxz.a>a("interaction", bxz.a.a).orElse(null);
      this.a($$0.b("response", false));
      this.a(this.au());
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      $$0.b("attack", bxz.a.a, this.l);
      $$0.b("interaction", bxz.a.a, this.m);
      $$0.a("response", this.m());
   }

   @Override
   public void a(aku<?> $$0) {
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
   public eyf j_() {
      return eyf.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bxe $$0) {
      if ($$0 instanceof csi $$1) {
         this.l = new bxz.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof asc $$2) {
            aq.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      if (this.dV().C) {
         return this.m() ? bvc.a : bvc.c;
      } else {
         this.m = new bxz.a($$0.cG(), this.dV().ae());
         return bvc.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public byf aj() {
      return this.l != null ? this.dV().a(this.l.a()) : null;
   }

   @Nullable
   @Override
   public byf f() {
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

   private bxh n() {
      return bxh.b(this.g(), this.j());
   }

   @Override
   public bxh a(byr $$0) {
      return this.n();
   }

   @Override
   protected ffx c(fgc $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bxz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ka.a.fieldOf("player").forGetter(bxz.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bxz.a::b)).apply($$0, bxz.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
