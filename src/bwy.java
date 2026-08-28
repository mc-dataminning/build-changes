import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class bwy extends bwf implements bvy, byb {
   private static final akj<Float> a = akn.a(bwy.class, akl.d);
   private static final akj<Float> b = akn.a(bwy.class, akl.d);
   private static final akj<Boolean> c = akn.a(bwy.class, akl.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   @Nullable
   private bwy.a i;
   @Nullable
   private bwy.a j;

   public bwy(bwo<?> $$0, dja $$1) {
      super($$0, $$1);
      this.ad = true;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, 1.0F);
      $$0.a(b, 1.0F);
      $$0.a(c, false);
   }

   @Override
   protected void a(tz $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      this.i = $$0.<bwy.a>a("attack", bwy.a.a).orElse(null);
      this.j = $$0.<bwy.a>a("interaction", bwy.a.a).orElse(null);
      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      if (this.i != null) {
         $$0.a("attack", bwy.a.a, this.i);
      }

      if (this.j != null) {
         $$0.a("interaction", bwy.a.a, this.j);
      }

      $$0.a("response", this.m());
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (b.equals($$0) || a.equals($$0)) {
         this.i_();
      }
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public ewt j_() {
      return ewt.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bwf $$0) {
      if ($$0 instanceof crc $$1) {
         this.i = new bwy.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof arr $$2) {
            ap.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(arq $$0, buu $$1, float $$2) {
      return false;
   }

   @Override
   public bud a(crc $$0, buc $$1) {
      if (this.dV().C) {
         return this.m() ? bud.a : bud.c;
      } else {
         this.j = new bwy.a($$0.cG(), this.dV().ae());
         return bud.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bxe am() {
      return this.i != null ? this.dV().a(this.i.a()) : null;
   }

   @Nullable
   @Override
   public bxe f() {
      return this.j != null ? this.dV().a(this.j.a()) : null;
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

   private bwi n() {
      return bwi.b(this.g(), this.j());
   }

   @Override
   public bwi a(bxq $$0) {
      return this.n();
   }

   @Override
   protected fel c(feq $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bwy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.a.fieldOf("player").forGetter(bwy.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bwy.a::b)).apply($$0, bwy.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
