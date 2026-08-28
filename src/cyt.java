import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyt(float d, cwp e, jr<avy> f, boolean g, List<czz> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyt> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayh.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyt::c),
               cwp.l.optionalFieldOf("animation", cwp.b).forGetter(cyt::d),
               avy.b.optionalFieldOf("sound", avz.kD).forGetter(cyt::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyt::f),
               czz.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyt::g)
            )
            .apply($$0, cyt::new)
   );
   public static final ym<vz, cyt> c = ym.a(yk.l, cyt::c, cwp.m, cyt::d, avy.d, cyt::e, yk.b, cyt::f, czz.e.a(yk.a()), cyt::g, cyt::new);

   public bsi a(bvf $$0, cwn $$1, bsh $$2) {
      if (!this.a($$0, $$1)) {
         return bsi.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsi.c;
         } else {
            cwn $$4 = this.a($$0.dW(), $$0, $$1);
            return bsi.c.a($$4);
         }
      }
   }

   public cwn a(dgg $$0, bvf $$1, cwn $$2) {
      azg $$3 = $$1.dZ();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof ard $$4) {
         $$4.b(awj.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(cyu.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cwp.c ? ebr.l : ebr.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvf $$0, cwn $$1) {
      crx $$2 = $$1.a(kv.w);
      return $$2 != null && $$0 instanceof cov $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azg $$0, bvf $$1, cwn $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = ayy.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cwp.c ? 0.5F : $$4;
      float $$9 = this.e == cwp.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      avy $$11 = $$1 instanceof cyt.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyt.a b() {
      return new cyt.a();
   }

   public float c() {
      return this.d;
   }

   public cwp d() {
      return this.e;
   }

   public jr<avy> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czz> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cwp b;
      private jr<avy> c;
      private boolean d;
      private final List<czz> e;

      a() {
         this.b = cwp.b;
         this.c = avz.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyt.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyt.a a(cwp $$0) {
         this.b = $$0;
         return this;
      }

      public cyt.a a(jr<avy> $$0) {
         this.c = $$0;
         return this;
      }

      public cyt.a b(jr<avy> $$0) {
         return this.a(new daa($$0));
      }

      public cyt.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyt.a a(czz $$0) {
         this.e.add($$0);
         return this;
      }

      public cyt a() {
         return new cyt(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      avy j(cwn var1);
   }
}
