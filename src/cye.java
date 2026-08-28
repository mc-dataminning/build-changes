import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cye(float d, cvu e, jo<awf> f, boolean g, List<czi> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cye> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayo.m.optionalFieldOf("consume_seconds", 1.6F).forGetter(cye::c),
               cvu.k.optionalFieldOf("animation", cvu.b).forGetter(cye::d),
               awf.b.optionalFieldOf("sound", awg.ke).forGetter(cye::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cye::f),
               czi.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cye::g)
            )
            .apply($$0, cye::new)
   );
   public static final zc<wp, cye> c = zc.a(za.j, cye::c, cvu.l, cye::d, awf.d, cye::e, za.b, cye::f, czi.e.a(za.a()), cye::g, cye::new);

   public brs a(bun $$0, cvs $$1, brr $$2) {
      if (!this.a($$0, $$1)) {
         return brs.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return brs.c;
         } else {
            cvs $$4 = this.a($$0.dS(), $$0, $$1);
            return brs.c.a($$4);
         }
      }
   }

   public cvs a(dej $$0, bun $$1, cvs $$2) {
      azn $$3 = $$1.dV();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof ark $$4) {
         $$4.b(awq.c.b($$2.h()));
         an.A.a($$4, $$2);
      }

      $$2.a(cyf.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.B) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cvu.c ? dzp.l : dzp.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bun $$0, cvs $$1) {
      cqw $$2 = $$1.a(ks.v);
      return $$2 != null && $$0 instanceof cnx $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azn $$0, bun $$1, cvs $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azf.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cvu.c ? 0.5F : $$4;
      float $$9 = this.e == cvu.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awf $$11 = $$1 instanceof cye.b $$10 ? $$10.n($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cye.a b() {
      return new cye.a();
   }

   public float c() {
      return this.d;
   }

   public cvu d() {
      return this.e;
   }

   public jo<awf> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czi> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cvu b;
      private jo<awf> c;
      private boolean d;
      private final List<czi> e;

      a() {
         this.b = cvu.b;
         this.c = awg.ke;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cye.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cye.a a(cvu $$0) {
         this.b = $$0;
         return this;
      }

      public cye.a a(jo<awf> $$0) {
         this.c = $$0;
         return this;
      }

      public cye.a b(jo<awf> $$0) {
         return this.a(new czj($$0));
      }

      public cye.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cye.a a(czi $$0) {
         this.e.add($$0);
         return this;
      }

      public cye a() {
         return new cye(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awf n(cvs var1);
   }
}
