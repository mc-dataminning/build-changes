import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public record dbs(float d, czp e, jf<awm> f, boolean g, List<ddb> h) {
   public static final float a = 1.6F;
   private static final int i = 4;
   private static final float j = 0.21875F;
   public static final Codec<dbs> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayu.n.optionalFieldOf("consume_seconds", 1.6F).forGetter(dbs::c),
               czp.l.optionalFieldOf("animation", czp.b).forGetter(dbs::d),
               awm.b.optionalFieldOf("sound", awn.kH).forGetter(dbs::e),
               Codec.BOOL.optionalFieldOf("has_consume_particles", true).forGetter(dbs::f),
               ddb.d.listOf().optionalFieldOf("on_consume_effects", List.of()).forGetter(dbs::g)
            )
            .apply($$0, dbs::new)
   );
   public static final yw<wj, dbs> c = yw.a(yu.l, dbs::c, czp.m, dbs::d, awm.d, dbs::e, yu.b, dbs::f, ddb.e.a(yu.a()), dbs::g, dbs::new);

   public bug a(bxj $$0, czn $$1, buf $$2) {
      if (!this.a($$0, $$1)) {
         return bug.d;
      } else {
         boolean $$3 = this.a() > 0;
         if ($$3) {
            $$0.c($$2);
            return bug.c;
         } else {
            czn $$4 = this.a($$0.dU(), $$0, $$1);
            return bug.c.a($$4);
         }
      }
   }

   public czn a(djm $$0, bxj $$1, czn $$2) {
      azv $$3 = $$1.dX();
      this.a($$3, $$1, $$2, 16);
      if ($$1 instanceof arr $$4) {
         $$4.b(awx.c.b($$2.h()));
         aq.A.a($$4, $$2);
      }

      $$2.a(dbt.class).forEach($$3x -> $$3x.a($$0, $$1, $$2, this));
      if (!$$0.C) {
         this.h.forEach($$3x -> $$3x.a($$0, $$2, $$1));
      }

      $$1.a(this.e == czp.c ? eft.l : eft.m);
      $$2.a(1, $$1);
      return $$2;
   }

   public boolean a(bxj $$0, czn $$1) {
      cvc $$2 = $$1.a(kk.v);
      return $$2 != null && $$0 instanceof crm $$3 ? $$3.t($$2.c()) : true;
   }

   public int a() {
      return (int)(this.d * 20.0F);
   }

   public void a(azv $$0, bxj $$1, czn $$2, int $$3) {
      float $$4 = $$0.h() ? 0.5F : 1.0F;
      float $$5 = $$0.a(1.0F, 0.2F);
      float $$6 = 0.5F;
      float $$7 = azm.b($$0, 0.9F, 1.0F);
      float $$8 = this.e == czp.c ? 0.5F : $$4;
      float $$9 = this.e == czp.c ? $$7 : $$5;
      if (this.g) {
         $$1.b($$2, $$3);
      }

      awm $$11 = $$1 instanceof dbs.b $$10 ? $$10.j($$2) : this.f.a();
      $$1.a($$11, $$8, $$9);
   }

   public boolean a(int $$0) {
      int $$1 = this.a() - $$0;
      int $$2 = (int)((float)this.a() * 0.21875F);
      boolean $$3 = $$1 > $$2;
      return $$3 && $$0 % 4 == 0;
   }

   public static dbs.a b() {
      return new dbs.a();
   }

   public float c() {
      return this.d;
   }

   public czp d() {
      return this.e;
   }

   public jf<awm> e() {
      return this.f;
   }

   public boolean f() {
      return this.g;
   }

   public List<ddb> g() {
      return this.h;
   }

   public static class a {
      private float a = 1.6F;
      private czp b;
      private jf<awm> c;
      private boolean d;
      private final List<ddb> e;

      a() {
         this.b = czp.b;
         this.c = awn.kH;
         this.d = true;
         this.e = new ArrayList<>();
      }

      public dbs.a a(float $$0) {
         this.a = $$0;
         return this;
      }

      public dbs.a a(czp $$0) {
         this.b = $$0;
         return this;
      }

      public dbs.a a(jf<awm> $$0) {
         this.c = $$0;
         return this;
      }

      public dbs.a b(jf<awm> $$0) {
         return this.a(new ddc($$0));
      }

      public dbs.a a(boolean $$0) {
         this.d = $$0;
         return this;
      }

      public dbs.a a(ddb $$0) {
         this.e.add($$0);
         return this;
      }

      public dbs a() {
         return new dbs(this.a, this.b, this.c, this.d, this.e);
      }
   }

   public interface b {
      awm j(czn var1);
   }
}
