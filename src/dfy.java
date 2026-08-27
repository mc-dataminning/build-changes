import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfy extends der implements dli.b<dlp.b>, dlp {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aqm> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aqn.zK);
      $$0.put(2, aqn.zL);
      $$0.put(3, aqn.zM);
      $$0.put(4, aqn.zJ);
   });
   private int k;
   private final dlp.d l = new dfy.a();
   private dlp.a m = new dlp.a();
   private final dlp.b n = new dlp.b(this);

   public dfy(ht $$0, dgw $$1) {
      super(det.L, $$0, $$1);
   }

   @Override
   public dlp.a gg() {
      return this.m;
   }

   @Override
   public dlp.d gh() {
      return this.l;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dlp.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dlp.a.a.encodeStart(sn.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static amb a(@Nullable bki $$0) {
      if ($$0 instanceof amb) {
         return (amb)$$0;
      } else {
         if ($$0 != null) {
            bky $$6 = $$0.cN();
            if ($$6 instanceof amb) {
               return (amb)$$6;
            }
         }

         if ($$0 instanceof cee $$3) {
            bki var3 = $$3.v();
            if (var3 instanceof amb) {
               return (amb)var3;
            }
         }

         if ($$0 instanceof caf $$5) {
            bki var9 = $$5.v();
            if (var9 instanceof amb) {
               return (amb)var9;
            }
         }

         return null;
      }
   }

   public void a(ama $$0, @Nullable amb $$1) {
      if ($$1 != null) {
         dgw $$2 = this.q();
         if (!$$2.c(dbm.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bki)$$1);
            }
         }
      }
   }

   private boolean b(ama $$0, amb $$1) {
      OptionalInt $$2 = ccs.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(ama $$0, @Nullable bki $$1) {
      ht $$2 = this.p();
      dgw $$3 = this.q();
      $$0.a($$2, $$3.a(dbm.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dlg.N, $$2, dlg.a.a($$1));
   }

   private boolean b(ama $$0) {
      return this.q().c(dbm.d) && $$0.ai() != bin.a && $$0.X().b(cro.M);
   }

   public void a(ama $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((crs)$$0);
         }

         ccq.a($$0, eji.b(this.p()), null, 40);
      }
   }

   private void b(crs $$0) {
      aqm $$1 = (aqm)j.get(this.k);
      if ($$1 != null) {
         ht $$2 = this.p();
         int $$3 = $$2.u() + ati.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ati.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ati.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aqo.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ama $$0) {
      return this.k < 4 ? false : atz.a(bkm.bi, blc.k, $$0, this.p(), 20, 5, 6, atz.a.b).isPresent();
   }

   public dlp.b c() {
      return this.n;
   }

   class a implements dlp.d {
      private static final int b = 8;
      private final dlk c = new dlc(dfy.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dlk b() {
         return this.c;
      }

      @Override
      public arr<dlg> c() {
         return ari.c;
      }

      @Override
      public boolean a(ama $$0, ht $$1, dlg $$2, dlg.a $$3) {
         return !dfy.this.q().c(dbm.b) && dfy.a($$3.a()) != null;
      }

      @Override
      public void a(ama $$0, ht $$1, dlg $$2, @Nullable bki $$3, @Nullable bki $$4, float $$5) {
         dfy.this.a($$0, dfy.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dfy.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
