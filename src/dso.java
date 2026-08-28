import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dso extends dre implements dyz.b<dzg.b>, dzg {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awc> k = ad.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awd.BX);
      $$0.put(2, awd.BY);
      $$0.put(3, awd.BZ);
      $$0.put(4, awd.BW);
   });
   private int l;
   private final dzg.d m = new dso.a();
   private dzg.a n = new dzg.a();
   private final dzg.b r = new dzg.b(this);

   public dso(je $$0, dua $$1) {
      super(drg.L, $$0, $$1);
   }

   @Override
   public dzg.a gq() {
      return this.n;
   }

   @Override
   public dzg.d gr() {
      return this.m;
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      akz<vc> $$2 = $$1.a(ut.a);
      if ($$0.b("listener", 10)) {
         dzg.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> b.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      akz<vc> $$2 = $$1.a(ut.a);
      dzg.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> b.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arh a(@Nullable btj $$0) {
      if ($$0 instanceof arh) {
         return (arh)$$0;
      } else {
         if ($$0 != null) {
            buf $$6 = $$0.cU();
            if ($$6 instanceof arh) {
               return (arh)$$6;
            }
         }

         if ($$0 instanceof coi $$3) {
            btj var3 = $$3.s();
            if (var3 instanceof arh) {
               return (arh)var3;
            }
         }

         if ($$0 instanceof cjz $$5) {
            btj var9 = $$5.s();
            if (var9 instanceof arh) {
               return (arh)var9;
            }
         }

         return null;
      }
   }

   public void a(arg $$0, @Nullable arh $$1) {
      if ($$1 != null) {
         dua $$2 = this.m();
         if (!$$2.c(dnq.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (btj)$$1);
            }
         }
      }
   }

   private boolean b(arg $$0, arh $$1) {
      OptionalInt $$2 = cmv.a($$0, this.aD_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arg $$0, @Nullable btj $$1) {
      je $$2 = this.aD_();
      dua $$3 = this.m();
      $$0.a($$2, $$3.b(dnq.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dyx.N, $$2, dyx.a.a($$1));
   }

   private boolean b(arg $$0) {
      return this.m().c(dnq.d) && $$0.am() != brh.a && $$0.ac().b(ddo.M);
   }

   public void a(arg $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dds)$$0);
         }

         cmt.a($$0, eye.b(this.aD_()), null, 40);
      }
   }

   private void b(dds $$0) {
      awc $$1 = (awc)k.get(this.l);
      if ($$1 != null) {
         je $$2 = this.aD_();
         int $$3 = $$2.u() + azc.b($$0.z, -10, 10);
         int $$4 = $$2.v() + azc.b($$0.z, -10, 10);
         int $$5 = $$2.w() + azc.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awe.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arg $$0) {
      return this.l < 4 ? false : azv.a(btq.bm, btp.k, $$0, this.aD_(), 20, 5, 6, azv.a.b).isPresent();
   }

   public dzg.b b() {
      return this.r;
   }

   class a implements dzg.d {
      private static final int b = 8;
      private final dzb c = new dyt(dso.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dzb b() {
         return this.c;
      }

      @Override
      public axi<dyx> c() {
         return awz.c;
      }

      @Override
      public boolean a(arg $$0, je $$1, jn<dyx> $$2, dyx.a $$3) {
         return !dso.this.m().c(dnq.b) && dso.a($$3.a()) != null;
      }

      @Override
      public void a(arg $$0, je $$1, jn<dyx> $$2, @Nullable btj $$3, @Nullable btj $$4, float $$5) {
         dso.this.a($$0, dso.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dso.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
