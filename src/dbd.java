import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dbd(float d, cza e, je<awm> f, boolean g, List<dcm> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dbd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dbd::c),
               cza.l.optionalFieldOf("animation", cza.b).forGetter(dbd::d),
               awm.b.optionalFieldOf("sound", awn.kE).forGetter(dbd::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dbd::f),
               dcm.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dbd::g)
            )
            .apply($$0, dbd::new)
   );
   public static final yw<wj, dbd> c = yw.a(yu.l, dbd::c, cza.m, dbd::d, awm.d, dbd::e, yu.b, dbd::f, dcm.e.a(yu.a()), dbd::g, dbd::new);

   public bub a(bxc $$0, cyy $$1, bua $$2) {
      if (!this.a($$0, $$1)) {
         return bub.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bub.c;
         } else {
            cyy $$4 = this.a($$0.dV(), $$0, $$1);
            return bub.c.a($$4);
         }
      }
   }

   public cyy a(div $$0, bxc $$1, cyy $$2) {
      azv $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arr $$4) {
         $$4.b(awx.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(dbe.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cza.c ? eez.l : eez.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bxc $$0, cyy $$1) {
      cun $$2 = $$1.a(kj.v);
      return $$2 != null && $$0 instanceof cqy $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azv $$0, bxc $$1, cyy $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azm.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cza.c ? 0.5F : $$4;
      float $$9 = this.e == cza.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awm $$11 = $$1 instanceof dbd.b $$10 ? $$10.k($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dbd.a b() {
      return new dbd.a();
   }

   public float c() {
      return this.d;
   }

   public cza d() {
      return this.e;
   }

   public je<awm> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dcm> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cza b;
      private je<awm> c;
      private boolean d;
      private final List<dcm> e;

      a() {
         this.b = cza.b;
         this.c = awn.kE;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dbd.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dbd.a a(cza $$0) {
         this.b = $$0;
         return this;
      }

      public dbd.a a(je<awm> $$0) {
         this.c = $$0;
         return this;
      }

      public dbd.a b(je<awm> $$0) {
         return this.a(new dcn($$0));
      }

      public dbd.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dbd.a a(dcm $$0) {
         this.e.add($$0);
         return this;
      }

      public dbd a() {
         return new dbd(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awm k(cyy var1);
   }
}
