import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyw(float d, cws e, jr<avz> f, boolean g, List<dac> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyw> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayi.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyw::c),
               cws.l.optionalFieldOf("animation", cws.b).forGetter(cyw::d),
               avz.b.optionalFieldOf("sound", awa.kD).forGetter(cyw::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyw::f),
               dac.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyw::g)
            )
            .apply($$0, cyw::new)
   );
   public static final yn<wa, cyw> c = yn.a(yl.l, cyw::c, cws.m, cyw::d, avz.d, cyw::e, yl.b, cyw::f, dac.e.a(yl.a()), cyw::g, cyw::new);

   public bsl a(bvi $$0, cwq $$1, bsk $$2) {
      if (!this.a($$0, $$1)) {
         return bsl.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsl.c;
         } else {
            cwq $$4 = this.a($$0.dV(), $$0, $$1);
            return bsl.c.a($$4);
         }
      }
   }

   public cwq a(dgj $$0, bvi $$1, cwq $$2) {
      azh $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof are $$4) {
         $$4.b(awk.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(cyx.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cws.c ? ebu.l : ebu.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bvi $$0, cwq $$1) {
      csa $$2 = $$1.a(kv.w);
      return $$2 != null && $$0 instanceof coy $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azh $$0, bvi $$1, cwq $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = ayz.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cws.c ? 0.5F : $$4;
      float $$9 = this.e == cws.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      avz $$11 = $$1 instanceof cyw.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyw.a b() {
      return new cyw.a();
   }

   public float c() {
      return this.d;
   }

   public cws d() {
      return this.e;
   }

   public jr<avz> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dac> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cws b;
      private jr<avz> c;
      private boolean d;
      private final List<dac> e;

      a() {
         this.b = cws.b;
         this.c = awa.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyw.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyw.a a(cws $$0) {
         this.b = $$0;
         return this;
      }

      public cyw.a a(jr<avz> $$0) {
         this.c = $$0;
         return this;
      }

      public cyw.a b(jr<avz> $$0) {
         return this.a(new dad($$0));
      }

      public cyw.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyw.a a(dac $$0) {
         this.e.add($$0);
         return this;
      }

      public cyw a() {
         return new cyw(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      avz j(cwq var1);
   }
}
