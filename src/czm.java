import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record czm(float d, cxi e, jq<awu> f, boolean g, List<das> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<czm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azd.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(czm::c),
               cxi.k.optionalFieldOf("animation", cxi.b).forGetter(czm::d),
               awu.b.optionalFieldOf("sound", awv.kD).forGetter(czm::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(czm::f),
               das.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(czm::g)
            )
            .apply($$0, czm::new)
   );
   public static final zi<wv, czm> c = zi.a(zg.l, czm::c, cxi.l, czm::d, awu.d, czm::e, zg.b, czm::f, das.e.a(zg.a()), czm::g, czm::new);

   public bta a(bvx $$0, cxg $$1, bsz $$2) {
      if (!this.a($$0, $$1)) {
         return bta.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bta.c;
         } else {
            cxg $$4 = this.a($$0.dW(), $$0, $$1);
            return bta.c.a($$4);
         }
      }
   }

   public cxg a(dgz $$0, bvx $$1, cxg $$2) {
      bac $$3 = $$1.dZ();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof ary $$4) {
         $$4.b(axf.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(czn.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cxi.c ? eck.l : eck.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvx $$0, cxg $$1) {
      csq $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof cpo $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(bac $$0, bvx $$1, cxg $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azu.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cxi.c ? 0.5F : $$4;
      float $$9 = this.e == cxi.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awu $$11 = $$1 instanceof czm.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static czm.a b() {
      return new czm.a();
   }

   public float c() {
      return this.d;
   }

   public cxi d() {
      return this.e;
   }

   public jq<awu> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<das> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cxi b;
      private jq<awu> c;
      private boolean d;
      private final List<das> e;

      a() {
         this.b = cxi.b;
         this.c = awv.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public czm.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public czm.a a(cxi $$0) {
         this.b = $$0;
         return this;
      }

      public czm.a a(jq<awu> $$0) {
         this.c = $$0;
         return this;
      }

      public czm.a b(jq<awu> $$0) {
         return this.a(new dat($$0));
      }

      public czm.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public czm.a a(das $$0) {
         this.e.add($$0);
         return this;
      }

      public czm a() {
         return new czm(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awu j(cxg var1);
   }
}
