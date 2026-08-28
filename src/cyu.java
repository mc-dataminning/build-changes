import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyu(float d, cwq e, jr<avz> f, boolean g, List<daa> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyu> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyu::c),
               cwq.l.optionalFieldOf("animation", cwq.b).forGetter(cyu::d),
               avz.b.optionalFieldOf("sound", awa.kD).forGetter(cyu::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyu::f),
               daa.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyu::g)
            )
            .apply($$0, cyu::new)
   );
   public static final yn<wa, cyu> c = yn.a(yl.l, cyu::c, cwq.m, cyu::d, avz.d, cyu::e, yl.b, cyu::f, daa.e.a(yl.a()), cyu::g, cyu::new);

   public bsj a(bvg $$0, cwo $$1, bsi $$2) {
      if (!this.a($$0, $$1)) {
         return bsj.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsj.c;
         } else {
            cwo $$4 = this.a($$0.dV(), $$0, $$1);
            return bsj.c.a($$4);
         }
      }
   }

   public cwo a(dgh $$0, bvg $$1, cwo $$2) {
      azh $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof are $$4) {
         $$4.b(awk.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(cyv.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cwq.c ? ebs.l : ebs.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvg $$0, cwo $$1) {
      cry $$2 = $$1.a(kv.w);
      return $$2 != null && $$0 instanceof cow $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azh $$0, bvg $$1, cwo $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = ayz.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cwq.c ? 0.5F : $$4;
      float $$9 = this.e == cwq.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      avz $$11 = $$1 instanceof cyu.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyu.a b() {
      return new cyu.a();
   }

   public float c() {
      return this.d;
   }

   public cwq d() {
      return this.e;
   }

   public jr<avz> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<daa> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cwq b;
      private jr<avz> c;
      private boolean d;
      private final List<daa> e;

      a() {
         this.b = cwq.b;
         this.c = awa.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyu.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyu.a a(cwq $$0) {
         this.b = $$0;
         return this;
      }

      public cyu.a a(jr<avz> $$0) {
         this.c = $$0;
         return this;
      }

      public cyu.a b(jr<avz> $$0) {
         return this.a(new dab($$0));
      }

      public cyu.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyu.a a(daa $$0) {
         this.e.add($$0);
         return this;
      }

      public cyu a() {
         return new cyu(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      avz j(cwo var1);
   }
}
