import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dui extends dsy implements eat.b<eba.b>, eba {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 10;
   private static final int c = 20;
   private static final int d = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<awm> k = ae.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awn.BV);
      $$0.put(2, awn.BW);
      $$0.put(3, awn.BX);
      $$0.put(4, awn.BU);
   });
   private int l;
   private final eba.d m = new dui.a();
   private eba.a n = new eba.a();
   private final eba.b r = new eba.b(this);

   public dui(jh $$0, dvv $$1) {
      super(dta.L, $$0, $$1);
   }

   @Override
   public eba.a go() {
      return this.n;
   }

   @Override
   public eba.d gp() {
      return this.m;
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      alh<vi> $$2 = $$1.a(uz.a);
      if ($$0.b("listener", 10)) {
         eba.a.a
            .parse($$2, $$0.p("listener"))
            .resultOrPartial($$0x -> a.error("Failed to parse vibration listener for Sculk Shrieker: '{}'", $$0x))
            .ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      alh<vi> $$2 = $$1.a(uz.a);
      eba.a.a
         .encodeStart($$2, this.n)
         .resultOrPartial($$0x -> a.error("Failed to encode vibration listener for Sculk Shrieker: '{}'", $$0x))
         .ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arq a(@Nullable bul $$0) {
      if ($$0 instanceof arq) {
         return (arq)$$0;
      } else {
         if ($$0 != null) {
            bvh $$6 = $$0.cX();
            if ($$6 instanceof arq) {
               return (arq)$$6;
            }
         }

         if ($$0 instanceof cpn $$3) {
            bul var3 = $$3.p();
            if (var3 instanceof arq) {
               return (arq)var3;
            }
         }

         if ($$0 instanceof clc $$5) {
            bul var9 = $$5.p();
            if (var9 instanceof arq) {
               return (arq)var9;
            }
         }

         return null;
      }
   }

   public void a(arp $$0, @Nullable arq $$1) {
      if ($$1 != null) {
         dvv $$2 = this.m();
         if (!$$2.c(dpk.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bul)$$1);
            }
         }
      }
   }

   private boolean b(arp $$0, arq $$1) {
      OptionalInt $$2 = cny.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arp $$0, @Nullable bul $$1) {
      jh $$2 = this.aA_();
      dvv $$3 = this.m();
      $$0.a($$2, $$3.b(dpk.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(ear.N, $$2, ear.a.a($$1));
   }

   private boolean b(arp $$0) {
      return this.m().c(dpk.d) && $$0.ak() != bsh.a && $$0.N().b(dfi.M);
   }

   public void a(arp $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dfm)$$0);
         }

         cnw.a($$0, ezy.b(this.aA_()), null, 40);
      }
   }

   private void b(dfm $$0) {
      awm $$1 = (awm)k.get(this.l);
      if ($$1 != null) {
         jh $$2 = this.aA_();
         int $$3 = $$2.u() + azm.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azm.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azm.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awo.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arp $$0) {
      return this.l < 4 ? false : baf.a(bus.bC, bur.k, $$0, this.aA_(), 20, 5, 6, baf.a.b).isPresent();
   }

   public eba.b b() {
      return this.r;
   }

   class a implements eba.d {
      private static final int b = 8;
      private final eav c = new ean(dui.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public eav b() {
         return this.c;
      }

      @Override
      public axs<ear> c() {
         return axj.c;
      }

      @Override
      public boolean a(arp $$0, jh $$1, jq<ear> $$2, ear.a $$3) {
         return !dui.this.m().c(dpk.b) && dui.a($$3.a()) != null;
      }

      @Override
      public void a(arp $$0, jh $$1, jq<ear> $$2, @Nullable bul $$3, @Nullable bul $$4, float $$5) {
         dui.this.a($$0, dui.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dui.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
