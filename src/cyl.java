import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyl(float d, cwh e, jq<awn> f, boolean g, List<czr> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyl> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyl::c),
               cwh.k.optionalFieldOf("animation", cwh.b).forGetter(cyl::d),
               awn.b.optionalFieldOf("sound", awo.ke).forGetter(cyl::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyl::f),
               czr.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyl::g)
            )
            .apply($$0, cyl::new)
   );
   public static final zj<ww, cyl> c = zj.a(zh.j, cyl::c, cwh.l, cyl::d, awn.d, cyl::e, zh.b, cyl::f, czr.e.a(zh.a()), cyl::g, cyl::new);

   public bsh a(bve $$0, cwf $$1, bsg $$2) {
      if (!this.a($$0, $$1)) {
         return bsh.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsh.c;
         } else {
            cwf $$4 = this.a($$0.dY(), $$0, $$1);
            return bsh.c.a($$4);
         }
      }
   }

   public cwf a(dff $$0, bve $$1, cwf $$2) {
      azv $$3 = $$1.eb();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arr $$4) {
         $$4.b(awy.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(cym.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cwh.c ? eak.l : eak.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bve $$0, cwf $$1) {
      crp $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof cor $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azv $$0, bve $$1, cwf $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azn.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cwh.c ? 0.5F : $$4;
      float $$9 = this.e == cwh.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awn $$11 = $$1 instanceof cyl.b $$10 ? $$10.l($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyl.a b() {
      return new cyl.a();
   }

   public float c() {
      return this.d;
   }

   public cwh d() {
      return this.e;
   }

   public jq<awn> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czr> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cwh b;
      private jq<awn> c;
      private boolean d;
      private final List<czr> e;

      a() {
         this.b = cwh.b;
         this.c = awo.ke;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyl.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyl.a a(cwh $$0) {
         this.b = $$0;
         return this;
      }

      public cyl.a a(jq<awn> $$0) {
         this.c = $$0;
         return this;
      }

      public cyl.a b(jq<awn> $$0) {
         return this.a(new czs($$0));
      }

      public cyl.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyl.a a(czr $$0) {
         this.e.add($$0);
         return this;
      }

      public cyl a() {
         return new cyl(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awn l(cwf var1);
   }
}
