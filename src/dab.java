import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dab(float d, cya e, js<awj> f, boolean g, List<dbi> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dab> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ays.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dab::c),
               cya.l.optionalFieldOf("animation", cya.b).forGetter(dab::d),
               awj.b.optionalFieldOf("sound", awk.kD).forGetter(dab::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dab::f),
               dbi.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dab::g)
            )
            .apply($$0, dab::new)
   );
   public static final yt<wg, dab> c = yt.a(yr.l, dab::c, cya.m, dab::d, awj.d, dab::e, yr.b, dab::f, dbi.e.a(yr.a()), dab::g, dab::new);

   public btq a(bwr $$0, cxy $$1, btp $$2) {
      if (!this.a($$0, $$1)) {
         return btq.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return btq.c;
         } else {
            cxy $$4 = this.a($$0.dV(), $$0, $$1);
            return btq.c.a($$4);
         }
      }
   }

   public cxy a(dhp $$0, bwr $$1, cxy $$2) {
      azs $$3 = $$1.dY();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof aro $$4) {
         $$4.b(awu.c.b($$2.h()));
         ap.A.a($$4, $$2);
      }

      $$2.a(dac.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cya.c ? edm.l : edm.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bwr $$0, cxy $$1) {
      ctk $$2 = $$1.a(kx.w);
      return $$2 != null && $$0 instanceof cqi $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azs $$0, bwr $$1, cxy $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azk.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cya.c ? 0.5F : $$4;
      float $$9 = this.e == cya.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awj $$11 = $$1 instanceof dab.b $$10 ? $$10.k($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dab.a b() {
      return new dab.a();
   }

   public float c() {
      return this.d;
   }

   public cya d() {
      return this.e;
   }

   public js<awj> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<dbi> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cya b;
      private js<awj> c;
      private boolean d;
      private final List<dbi> e;

      a() {
         this.b = cya.b;
         this.c = awk.kD;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dab.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dab.a a(cya $$0) {
         this.b = $$0;
         return this;
      }

      public dab.a a(js<awj> $$0) {
         this.c = $$0;
         return this;
      }

      public dab.a b(js<awj> $$0) {
         return this.a(new dbj($$0));
      }

      public dab.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dab.a a(dbi $$0) {
         this.e.add($$0);
         return this;
      }

      public dab a() {
         return new dab(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awj k(cxy var1);
   }
}
