import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dbi(float d, czf e, je<awm> f, boolean g, List<dcr> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dbi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dbi::c),
               czf.l.optionalFieldOf("animation", czf.b).forGetter(dbi::d),
               awm.b.optionalFieldOf("sound", awn.kH).forGetter(dbi::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dbi::f),
               dcr.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dbi::g)
            )
            .apply($$0, dbi::new)
   );
   public static final yw<wj, dbi> c = yw.a(yu.l, dbi::c, czf.m, dbi::d, awm.d, dbi::e, yu.b, dbi::f, dcr.e.a(yu.a()), dbi::g, dbi::new);

   public bud a(bxe $$0, czd $$1, buc $$2) {
      if (!this.a($$0, $$1)) {
         return bud.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bud.c;
         } else {
            czd $$4 = this.a($$0.dV(), $$0, $$1);
            return bud.c.a($$4);
         }
      }
   }

   public czd a(dja $$0, bxe $$1, czd $$2) {
      azv $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arr $$4) {
         $$4.b(awx.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(dbj.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == czf.c ? efh.l : efh.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bxe $$0, czd $$1) {
      cus $$2 = $$1.a(kj.v);
      return $$2 != null && $$0 instanceof crc $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azv $$0, bxe $$1, czd $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azm.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == czf.c ? 0.5F : $$4;
      float $$9 = this.e == czf.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awm $$11 = $$1 instanceof dbi.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dbi.a b() {
      return new dbi.a();
   }

   public float c() {
      return this.d;
   }

   public czf d() {
      return this.e;
   }

   public je<awm> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dcr> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private czf b;
      private je<awm> c;
      private boolean d;
      private final List<dcr> e;

      a() {
         this.b = czf.b;
         this.c = awn.kH;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dbi.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dbi.a a(czf $$0) {
         this.b = $$0;
         return this;
      }

      public dbi.a a(je<awm> $$0) {
         this.c = $$0;
         return this;
      }

      public dbi.a b(je<awm> $$0) {
         return this.a(new dcs($$0));
      }

      public dbi.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dbi.a a(dcr $$0) {
         this.e.add($$0);
         return this;
      }

      public dbi a() {
         return new dbi(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awm j(czd var1);
   }
}
