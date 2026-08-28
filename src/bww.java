import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class bww extends bwd implements bvw, bxz {
   private static final akj<Float> a = akn.a(bww.class, akl.d);
   private static final akj<Float> b = akn.a(bww.class, akl.d);
   private static final akj<Boolean> c = akn.a(bww.class, akl.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   @Nullable
   private bww.a i;
   @Nullable
   private bww.a j;

   public bww(bwm<?> $$0, div $$1) {
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

      this.i = $$0.<bww.a>a("attack", bww.a.a).orElse(null);
      this.j = $$0.<bww.a>a("interaction", bww.a.a).orElse(null);
      this.a($$0.q("response"));
      this.a(this.ax());
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      if (this.i != null) {
         $$0.a("attack", bww.a.a, this.i);
      }

      if (this.j != null) {
         $$0.a("interaction", bww.a.a, this.j);
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
   public ewl j_() {
      return ewl.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bwd $$0) {
      if ($$0 instanceof cqy $$1) {
         this.i = new bww.a($$1.cG(), this.dV().ae());
         if ($$1 instanceof arr $$2) {
            ap.h.a($$2, this, $$1.dW().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(arq $$0, bus $$1, float $$2) {
      return false;
   }

   @Override
   public bub a(cqy $$0, bua $$1) {
      if (this.dV().C) {
         return this.m() ? bub.a : bub.c;
      } else {
         this.j = new bww.a($$0.cG(), this.dV().ae());
         return bub.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bxc am() {
      return this.i != null ? this.dV().a(this.i.a()) : null;
   }

   @Nullable
   @Override
   public bxc f() {
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

   private bwg n() {
      return bwg.b(this.g(), this.j());
   }

   @Override
   public bwg a(bxo $$0) {
      return this.n();
   }

   @Override
   protected fed c(fei $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bww.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jy.a.fieldOf("player").forGetter(bww.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bww.a::b)).apply($$0, bww.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
