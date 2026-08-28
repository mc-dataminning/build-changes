import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;

public class bxd extends bwi implements bwb, byg {
   private static final akj<Float> a = akn.a(bxd.class, akl.d);
   private static final akj<Float> b = akn.a(bxd.class, akl.d);
   private static final akj<Boolean> c = akn.a(bxd.class, akl.k);
   private static final String d = "width";
   private static final String e = "height";
   private static final String f = "attack";
   private static final String g = "interaction";
   private static final String h = "response";
   @Nullable
   private bxd.a i;
   @Nullable
   private bxd.a j;

   public bxd(bwr<?> $$0, djm $$1) {
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
         this.a($$0.h("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.h("height"));
      }

      this.i = $$0.<bxd.a>a("attack", bxd.a.a).orElse(null);
      this.j = $$0.<bxd.a>a("interaction", bxd.a.a).orElse(null);
      this.a($$0.o("response"));
      this.a(this.au());
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("width", this.g());
      $$0.a("height", this.j());
      $$0.b("attack", bxd.a.a, this.i);
      $$0.b("interaction", bxd.a.a, this.j);
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
   public boolean bD() {
      return false;
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public exf j_() {
      return exf.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Override
   public boolean v(bwi $$0) {
      if ($$0 instanceof crm $$1) {
         this.i = new bxd.a($$1.cF(), this.dU().ae());
         if ($$1 instanceof arr $$2) {
            aq.h.a($$2, this, $$1.dV().p(), 1.0F, 1.0F, false);
         }

         return !this.m();
      } else {
         return false;
      }
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }

   @Override
   public bug a(crm $$0, buf $$1) {
      if (this.dU().C) {
         return this.m() ? bug.a : bug.c;
      } else {
         this.j = new bxd.a($$0.cF(), this.dU().ae());
         return bug.c;
      }
   }

   @Override
   public void h() {
   }

   @Nullable
   @Override
   public bxj aj() {
      return this.i != null ? this.dU().a(this.i.a()) : null;
   }

   @Nullable
   @Override
   public bxj f() {
      return this.j != null ? this.dU().a(this.j.a()) : null;
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

   private bwl n() {
      return bwl.b(this.g(), this.j());
   }

   @Override
   public bwl a(bxv $$0) {
      return this.n();
   }

   @Override
   protected fex c(ffc $$0) {
      return this.n().a($$0);
   }

   static record a(UUID b, long c) {
      public static final Codec<bxd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jz.a.fieldOf("player").forGetter(bxd.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bxd.a::b)).apply($$0, bxd.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}
