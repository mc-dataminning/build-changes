import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record cyh(float d, cwd e, jq<awk> f, boolean g, List<czn> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<cyh> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayt.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(cyh::c),
               cwd.k.optionalFieldOf("animation", cwd.b).forGetter(cyh::d),
               awk.b.optionalFieldOf("sound", awl.ke).forGetter(cyh::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(cyh::f),
               czn.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(cyh::g)
            )
            .apply($$0, cyh::new)
   );
   public static final zg<wt, cyh> c = zg.a(ze.j, cyh::c, cwd.l, cyh::d, awk.d, cyh::e, ze.b, cyh::f, czn.e.a(ze.a()), cyh::g, cyh::new);

   public bsd a(bva $$0, cwb $$1, bsc $$2) {
      if (!this.a($$0, $$1)) {
         return bsd.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bsd.c;
         } else {
            cwb $$4 = this.a($$0.dX(), $$0, $$1);
            return bsd.c.a($$4);
         }
      }
   }

   public cwb a(dfb $$0, bva $$1, cwb $$2) {
      azs $$3 = $$1.ea();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof aro $$4) {
         $$4.b(awv.c.b($$2.h()));
         ao.A.a($$4, $$2);
      }

      $$2.a(cyi.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == cwd.c ? eag.l : eag.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bva $$0, cwb $$1) {
      crl $$2 = $$1.a(ku.w);
      return $$2 != null && $$0 instanceof com $$3 ? $$3.u($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azs $$0, bva $$1, cwb $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azk.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == cwd.c ? 0.5F : $$4;
      float $$9 = this.e == cwd.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awk $$11 = $$1 instanceof cyh.b $$10 ? $$10.l($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static cyh.a b() {
      return new cyh.a();
   }

   public float c() {
      return this.d;
   }

   public cwd d() {
      return this.e;
   }

   public jq<awk> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<czn> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private cwd b;
      private jq<awk> c;
      private boolean d;
      private final List<czn> e;

      a() {
         this.b = cwd.b;
         this.c = awl.ke;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public cyh.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public cyh.a a(cwd $$0) {
         this.b = $$0;
         return this;
      }

      public cyh.a a(jq<awk> $$0) {
         this.c = $$0;
         return this;
      }

      public cyh.a b(jq<awk> $$0) {
         return this.a(new czo($$0));
      }

      public cyh.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public cyh.a a(czn $$0) {
         this.e.add($$0);
         return this;
      }

      public cyh a() {
         return new cyh(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awk l(cwb var1);
   }
}
