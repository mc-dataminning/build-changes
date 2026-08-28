import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cys(float d, cwo e, jq<awm> f, boolean g, List<czy> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cys> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayv.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cys::c),
               cwo.k.optionalFieldOf("animation", cwo.b).forGetter(cys::d),
               awm.b.optionalFieldOf("sound", awn.ke).forGetter(cys::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cys::f),
               czy.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cys::g)
            )
            .apply($$0, cys::new)
   );
   public static final zh<wu, cys> c = zh.a(zf.k, cys::c, cwo.l, cys::d, awm.d, cys::e, zf.b, cys::f, czy.e.a(zf.a()), cys::g, cys::new);

   public bsk a(bvh $$0, cwm $$1, bsj $$2) {
      if (!this.a($$0, $$1)) {
         return bsk.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsk.c;
         } else {
            cwm $$4 = this.a($$0.dV(), $$0, $$1);
            return bsk.c.a($$4);
         }
      }
   }

   public cwm a(dfm $$0, bvh $$1, cwm $$2) {
      azu $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arq $$4) {
         $$4.b(awx.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(cyt.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cwo.c ? ear.l : ear.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvh $$0, cwm $$1) {
      crw $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof cou $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azu $$0, bvh $$1, cwm $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azm.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cwo.c ? 0.5F : $$4;
      float $$9 = this.e == cwo.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awm $$11 = $$1 instanceof cys.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cys.a b() {
      return new cys.a();
   }

   public float c() {
      return this.d;
   }

   public cwo d() {
      return this.e;
   }

   public jq<awm> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czy> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cwo b;
      private jq<awm> c;
      private boolean d;
      private final List<czy> e;

      a() {
         this.b = cwo.b;
         this.c = awn.ke;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cys.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cys.a a(cwo $$0) {
         this.b = $$0;
         return this;
      }

      public cys.a a(jq<awm> $$0) {
         this.c = $$0;
         return this;
      }

      public cys.a b(jq<awm> $$0) {
         return this.a(new czz($$0));
      }

      public cys.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cys.a a(czy $$0) {
         this.e.add($$0);
         return this;
      }

      public cys a() {
         return new cys(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awm j(cwm var1);
   }
}
