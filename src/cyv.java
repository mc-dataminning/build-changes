import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyv(float d, cwr e, jr<avz> f, boolean g, List<dab> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyv::c),
               cwr.l.optionalFieldOf("animation", cwr.b).forGetter(cyv::d),
               avz.b.optionalFieldOf("sound", awa.kD).forGetter(cyv::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyv::f),
               dab.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyv::g)
            )
            .apply($$0, cyv::new)
   );
   public static final yn<wa, cyv> c = yn.a(yl.l, cyv::c, cwr.m, cyv::d, avz.d, cyv::e, yl.b, cyv::f, dab.e.a(yl.a()), cyv::g, cyv::new);

   public bsk a(bvh $$0, cwp $$1, bsj $$2) {
      if (!this.a($$0, $$1)) {
         return bsk.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsk.c;
         } else {
            cwp $$4 = this.a($$0.dV(), $$0, $$1);
            return bsk.c.a($$4);
         }
      }
   }

   public cwp a(dgi $$0, bvh $$1, cwp $$2) {
      azh $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof are $$4) {
         $$4.b(awk.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(cyw.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cwr.c ? ebt.l : ebt.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvh $$0, cwp $$1) {
      crz $$2 = $$1.a(kv.w);
      return $$2 != null && $$0 instanceof cox $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azh $$0, bvh $$1, cwp $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = ayz.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cwr.c ? 0.5F : $$4;
      float $$9 = this.e == cwr.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      avz $$11 = $$1 instanceof cyv.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyv.a b() {
      return new cyv.a();
   }

   public float c() {
      return this.d;
   }

   public cwr d() {
      return this.e;
   }

   public jr<avz> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dab> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cwr b;
      private jr<avz> c;
      private boolean d;
      private final List<dab> e;

      a() {
         this.b = cwr.b;
         this.c = awa.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyv.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyv.a a(cwr $$0) {
         this.b = $$0;
         return this;
      }

      public cyv.a a(jr<avz> $$0) {
         this.c = $$0;
         return this;
      }

      public cyv.a b(jr<avz> $$0) {
         return this.a(new dac($$0));
      }

      public cyv.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyv.a a(dab $$0) {
         this.e.add($$0);
         return this;
      }

      public cyv a() {
         return new cyv(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      avz j(cwp var1);
   }
}
