import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgk extends dfd implements dlu.b<dmb.b>, dmb {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<aqq> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aqr.Al);
      $$0.put(2, aqr.Am);
      $$0.put(3, aqr.An);
      $$0.put(4, aqr.Ak);
   });
   private int k;
   private final dmb.d l = new dgk.a();
   private dmb.a m = new dmb.a();
   private final dmb.b n = new dmb.b(this);

   public dgk(ht $$0, dhi $$1) {
      super(dff.L, $$0, $$1);
   }

   @Override
   public dmb.a gh() {
      return this.m;
   }

   @Override
   public dmb.d gi() {
      return this.l;
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dmb.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dmb.a.a.encodeStart(sn.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static amf a(@Nullable bkq $$0) {
      if ($$0 instanceof amf) {
         return (amf)$$0;
      } else {
         if ($$0 != null) {
            blg $$6 = $$0.cO();
            if ($$6 instanceof amf) {
               return (amf)$$6;
            }
         }

         if ($$0 instanceof cem $$3) {
            bkq var3 = $$3.w();
            if (var3 instanceof amf) {
               return (amf)var3;
            }
         }

         if ($$0 instanceof can $$5) {
            bkq var9 = $$5.w();
            if (var9 instanceof amf) {
               return (amf)var9;
            }
         }

         return null;
      }
   }

   public void a(ame $$0, @Nullable amf $$1) {
      if ($$1 != null) {
         dhi $$2 = this.q();
         if (!$$2.c(dbt.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bkq)$$1);
            }
         }
      }
   }

   private boolean b(ame $$0, amf $$1) {
      OptionalInt $$2 = cda.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(ame $$0, @Nullable bkq $$1) {
      ht $$2 = this.p();
      dhi $$3 = this.q();
      $$0.a($$2, $$3.a(dbt.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dls.N, $$2, dls.a.a($$1));
   }

   private boolean b(ame $$0) {
      return this.q().c(dbt.d) && $$0.aj() != biu.a && $$0.Y().b(crw.M);
   }

   public void a(ame $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((csa)$$0);
         }

         ccy.a($$0, eju.b(this.p()), null, 40);
      }
   }

   private void b(csa $$0) {
      aqq $$1 = (aqq)j.get(this.k);
      if ($$1 != null) {
         ht $$2 = this.p();
         int $$3 = $$2.u() + atm.b($$0.z, -10, 10);
         int $$4 = $$2.v() + atm.b($$0.z, -10, 10);
         int $$5 = $$2.w() + atm.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aqs.f, 5.0F, 1.0F);
      }
   }

   private boolean c(ame $$0) {
      return this.k < 4 ? false : aue.a(bku.bi, blk.k, $$0, this.p(), 20, 5, 6, aue.a.b).isPresent();
   }

   public dmb.b c() {
      return this.n;
   }

   class a implements dmb.d {
      private static final int b = 8;
      private final dlw c = new dlo(dgk.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dlw b() {
         return this.c;
      }

      @Override
      public arv<dls> c() {
         return arm.c;
      }

      @Override
      public boolean a(ame $$0, ht $$1, dls $$2, dls.a $$3) {
         return !dgk.this.q().c(dbt.b) && dgk.a($$3.a()) != null;
      }

      @Override
      public void a(ame $$0, ht $$1, dls $$2, @Nullable bkq $$3, @Nullable bkq $$4, float $$5) {
         dgk.this.a($$0, dgk.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dgk.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
