import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class dyj extends dwx implements efb.b<efi.b>, efi {
   private static final int a = 10;
   private static final int b = 20;
   private static final int c = 5;
   private static final int d = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<awm> j = af.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, awn.CS);
      $$0.put(2, awn.CT);
      $$0.put(3, awn.CU);
      $$0.put(4, awn.CR);
   });
   private int k;
   private final efi.d l = new dyj.a();
   private efi.a m = new efi.a();
   private final efi.b q = new efi.b(this);

   public dyj(iu $$0, dzz $$1) {
      super(dwz.M, $$0, $$1);
   }

   @Override
   public efi.a x() {
      return this.m;
   }

   @Override
   public efi.d gq() {
      return this.l;
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      ale<uw> $$2 = $$1.a(un.a);
      this.m = $$0.<efi.a>a("listener", efi.a.a, $$2).orElseGet(efi.a::new);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.k);
      ale<uw> $$2 = $$1.a(un.a);
      $$0.a("listener", efi.a.a, $$2, this.m);
   }

   @Nullable
   public static arr a(@Nullable bwd $$0) {
      if ($$0 instanceof arr) {
         return (arr)$$0;
      } else {
         if ($$0 != null) {
            bxc $$6 = $$0.cW();
            if ($$6 instanceof arr) {
               return (arr)$$6;
            }
         }

         if ($$0 instanceof crs $$3) {
            bwd var3 = $$3.q();
            if (var3 instanceof arr) {
               return (arr)var3;
            }
         }

         if ($$0 instanceof cnd $$5) {
            bwd var9 = $$5.q();
            if (var9 instanceof arr) {
               return (arr)var9;
            }
         }

         return null;
      }
   }

   public void a(arq $$0, @Nullable arr $$1) {
      if ($$1 != null) {
         dzz $$2 = this.m();
         if (!$$2.c(dtb.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bwd)$$1);
            }
         }
      }
   }

   private boolean b(arq $$0, arr $$1) {
      OptionalInt $$2 = cqd.a($$0, this.aw_(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(arq $$0, @Nullable bwd $$1) {
      iu $$2 = this.aw_();
      dzz $$3 = this.m();
      $$0.a($$2, $$3.b(dtb.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(eez.N, $$2, eez.a.a($$1));
   }

   private boolean b(arq $$0) {
      return this.m().c(dtb.d) && $$0.an() != bty.a && $$0.O().c(dir.N);
   }

   @Override
   public void a(iu $$0, dzz $$1) {
      if ($$1.c(dtb.b) && this.n instanceof arq $$2) {
         this.a($$2);
      }
   }

   public void a(arq $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((div)$$0);
         }

         cqb.a($$0, fei.b(this.aw_()), null, 40);
      }
   }

   private void b(div $$0) {
      awm $$1 = (awm)j.get(this.k);
      if ($$1 != null) {
         iu $$2 = this.aw_();
         int $$3 = $$2.u() + azm.b($$0.A, -10, 10);
         int $$4 = $$2.v() + azm.b($$0.A, -10, 10);
         int $$5 = $$2.w() + azm.b($$0.A, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awo.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arq $$0) {
      return this.k < 4 ? false : bah.a(bwm.bG, bwl.k, $$0, this.aw_(), 20, 5, 6, bah.a.b, false).isPresent();
   }

   public efi.b a() {
      return this.q;
   }

   class a implements efi.d {
      private static final int b = 8;
      private final efd c = new eev(dyj.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public efd b() {
         return this.c;
      }

      @Override
      public axr<eez> c() {
         return axi.c;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<eez> $$2, eez.a $$3) {
         return !dyj.this.m().c(dtb.b) && dyj.a($$3.a()) != null;
      }

      @Override
      public void a(arq $$0, iu $$1, je<eez> $$2, @Nullable bwd $$3, @Nullable bwd $$4, float $$5) {
         dyj.this.a($$0, dyj.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dyj.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
