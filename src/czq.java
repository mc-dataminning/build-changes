import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record czq(float d, cxm e, jq<axe> f, boolean g, List<daw> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<czq> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azn.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(czq::c),
               cxm.k.optionalFieldOf("animation", cxm.b).forGetter(czq::d),
               axe.b.optionalFieldOf("sound", axf.kw).forGetter(czq::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(czq::f),
               daw.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(czq::g)
            )
            .apply($$0, czq::new)
   );
   public static final zt<xg, czq> c = zt.a(zr.l, czq::c, cxm.l, czq::d, axe.d, czq::e, zr.b, czq::f, daw.e.a(zr.a()), czq::g, czq::new);

   public bte a(bwb $$0, cxk $$1, btd $$2) {
      if (!this.a($$0, $$1)) {
         return bte.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bte.c;
         } else {
            cxk $$4 = this.a($$0.dV(), $$0, $$1);
            return bte.c.a($$4);
         }
      }
   }

   public cxk a(dha $$0, bwb $$1, cxk $$2) {
      bam $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof asi $$4) {
         $$4.b(axp.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(czr.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cxm.c ? ecj.l : ecj.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bwb $$0, cxk $$1) {
      csu $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof cps $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(bam $$0, bwb $$1, cxk $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = bae.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cxm.c ? 0.5F : $$4;
      float $$9 = this.e == cxm.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      axe $$11 = $$1 instanceof czq.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static czq.a b() {
      return new czq.a();
   }

   public float c() {
      return this.d;
   }

   public cxm d() {
      return this.e;
   }

   public jq<axe> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<daw> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cxm b;
      private jq<axe> c;
      private boolean d;
      private final List<daw> e;

      a() {
         this.b = cxm.b;
         this.c = axf.kw;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public czq.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public czq.a a(cxm $$0) {
         this.b = $$0;
         return this;
      }

      public czq.a a(jq<axe> $$0) {
         this.c = $$0;
         return this;
      }

      public czq.a b(jq<axe> $$0) {
         return this.a(new dax($$0));
      }

      public czq.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public czq.a a(daw $$0) {
         this.e.add($$0);
         return this;
      }

      public czq a() {
         return new czq(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      axe j(cxk var1);
   }
}
