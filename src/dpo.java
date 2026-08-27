import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpo extends dog implements dvw.b<dwd.b>, dwd {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avg> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avh.BN);
      $$0.put(2, avh.BO);
      $$0.put(3, avh.BP);
      $$0.put(4, avh.BM);
   });
   private int l;
   private final dwd.d m = new dpo.a();
   private dwd.a q = new dwd.a();
   private final dwd.b r = new dwd.b(this);

   public dpo(io $$0, drb $$1) {
      super(doi.L, $$0, $$1);
   }

   @Override
   public dwd.a gr() {
      return this.q;
   }

   @Override
   public dwd.d gs() {
      return this.m;
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dwd.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dwd.a.a.encodeStart(ur.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqn a(@Nullable bru $$0) {
      if ($$0 instanceof aqn) {
         return (aqn)$$0;
      } else {
         if ($$0 != null) {
            bso $$6 = $$0.cQ();
            if ($$6 instanceof aqn) {
               return (aqn)$$6;
            }
         }

         if ($$0 instanceof cmo $$3) {
            bru var3 = $$3.s();
            if (var3 instanceof aqn) {
               return (aqn)var3;
            }
         }

         if ($$0 instanceof cig $$5) {
            bru var9 = $$5.s();
            if (var9 instanceof aqn) {
               return (aqn)var9;
            }
         }

         return null;
      }
   }

   public void a(aqm $$0, @Nullable aqn $$1) {
      if ($$1 != null) {
         drb $$2 = this.n();
         if (!$$2.c(dks.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bru)$$1);
            }
         }
      }
   }

   private boolean b(aqm $$0, aqn $$1) {
      OptionalInt $$2 = clc.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqm $$0, @Nullable bru $$1) {
      io $$2 = this.az_();
      drb $$3 = this.n();
      $$0.a($$2, $$3.a(dks.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dvu.N, $$2, dvu.a.a($$1));
   }

   private boolean b(aqm $$0) {
      return this.n().c(dks.d) && $$0.ak() != bpr.a && $$0.aa().b(dat.M);
   }

   public void a(aqm $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dax)$$0);
         }

         cla.a($$0, euk.b(this.az_()), null, 40);
      }
   }

   private void b(dax $$0) {
      avg $$1 = (avg)k.get(this.l);
      if ($$1 != null) {
         io $$2 = this.az_();
         int $$3 = $$2.u() + ayd.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayd.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayd.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avi.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqm $$0) {
      return this.l < 4 ? false : ayv.a(bsa.bm, bss.k, $$0, this.az_(), 20, 5, 6, ayv.a.b).isPresent();
   }

   public dwd.b b() {
      return this.r;
   }

   class a implements dwd.d {
      private static final int b = 8;
      private final dvy c = new dvq(dpo.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dvy b() {
         return this.c;
      }

      @Override
      public awl<dvu> c() {
         return awc.c;
      }

      @Override
      public boolean a(aqm $$0, io $$1, ix<dvu> $$2, dvu.a $$3) {
         return !dpo.this.n().c(dks.b) && dpo.a($$3.a()) != null;
      }

      @Override
      public void a(aqm $$0, io $$1, ix<dvu> $$2, @Nullable bru $$3, @Nullable bru $$4, float $$5) {
         dpo.this.a($$0, dpo.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dpo.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
