import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dax(float d, cyu e, je<awk> f, boolean g, List<dcg> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dax> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dax::c),
               cyu.l.optionalFieldOf("animation", cyu.b).forGetter(dax::d),
               awk.b.optionalFieldOf("sound", awl.kD).forGetter(dax::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dax::f),
               dcg.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dax::g)
            )
            .apply($$0, dax::new)
   );
   public static final yu<wh, dax> c = yu.a(ys.l, dax::c, cyu.m, dax::d, awk.d, dax::e, ys.b, dax::f, dcg.e.a(ys.a()), dax::g, dax::new);

   public bty a(bwz $$0, cys $$1, btx $$2) {
      if (!this.a($$0, $$1)) {
         return bty.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bty.c;
         } else {
            cys $$4 = this.a($$0.dV(), $$0, $$1);
            return bty.c.a($$4);
         }
      }
   }

   public cys a(dip $$0, bwz $$1, cys $$2) {
      azt $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arp $$4) {
         $$4.b(awv.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(day.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cyu.c ? eeo.l : eeo.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bwz $$0, cys $$1) {
      cuh $$2 = $$1.a(kj.v);
      return $$2 != null && $$0 instanceof cqs $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azt $$0, bwz $$1, cys $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azk.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cyu.c ? 0.5F : $$4;
      float $$9 = this.e == cyu.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awk $$11 = $$1 instanceof dax.b $$10 ? $$10.k($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dax.a b() {
      return new dax.a();
   }

   public float c() {
      return this.d;
   }

   public cyu d() {
      return this.e;
   }

   public je<awk> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dcg> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cyu b;
      private je<awk> c;
      private boolean d;
      private final List<dcg> e;

      a() {
         this.b = cyu.b;
         this.c = awl.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dax.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dax.a a(cyu $$0) {
         this.b = $$0;
         return this;
      }

      public dax.a a(je<awk> $$0) {
         this.c = $$0;
         return this;
      }

      public dax.a b(je<awk> $$0) {
         return this.a(new dch($$0));
      }

      public dax.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dax.a a(dcg $$0) {
         this.e.add($$0);
         return this;
      }

      public dax a() {
         return new dax(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awk k(cys var1);
   }
}
