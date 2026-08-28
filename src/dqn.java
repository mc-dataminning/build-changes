import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqn extends dpf implements dwv.b<dxc.b>, dxc {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avy> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avz.BN);
      $$0.put(2, avz.BO);
      $$0.put(3, avz.BP);
      $$0.put(4, avz.BM);
   });
   private int l;
   private final dxc.d m = new dqn.a();
   private dxc.a q = new dxc.a();
   private final dxc.b r = new dxc.b(this);

   public dqn(iz $$0, dsa $$1) {
      super(dph.L, $$0, $$1);
   }

   @Override
   public dxc.a gs() {
      return this.q;
   }

   @Override
   public dxc.d gt() {
      return this.m;
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dxc.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dxc.a.a.encodeStart(vf.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arf a(@Nullable bss $$0) {
      if ($$0 instanceof arf) {
         return (arf)$$0;
      } else {
         if ($$0 != null) {
            btn $$6 = $$0.cQ();
            if ($$6 instanceof arf) {
               return (arf)$$6;
            }
         }

         if ($$0 instanceof cnn $$3) {
            bss var3 = $$3.s();
            if (var3 instanceof arf) {
               return (arf)var3;
            }
         }

         if ($$0 instanceof cjf $$5) {
            bss var9 = $$5.s();
            if (var9 instanceof arf) {
               return (arf)var9;
            }
         }

         return null;
      }
   }

   public void a(are $$0, @Nullable arf $$1) {
      if ($$1 != null) {
         dsa $$2 = this.n();
         if (!$$2.c(dlr.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bss)$$1);
            }
         }
      }
   }

   private boolean b(are $$0, arf $$1) {
      OptionalInt $$2 = cmb.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(are $$0, @Nullable bss $$1) {
      iz $$2 = this.az_();
      dsa $$3 = this.n();
      $$0.a($$2, $$3.a(dlr.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dwt.N, $$2, dwt.a.a($$1));
   }

   private boolean b(are $$0) {
      return this.n().c(dlr.d) && $$0.al() != bqp.a && $$0.ab().b(dbs.M);
   }

   public void a(are $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dbw)$$0);
         }

         clz.a($$0, evp.b(this.az_()), null, 40);
      }
   }

   private void b(dbw $$0) {
      avy $$1 = (avy)k.get(this.l);
      if ($$1 != null) {
         iz $$2 = this.az_();
         int $$3 = $$2.u() + ayx.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayx.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayx.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, awa.f, 5.0F, 1.0F);
      }
   }

   private boolean c(are $$0) {
      return this.l < 4 ? false : azq.a(bsy.bm, btr.k, $$0, this.az_(), 20, 5, 6, azq.a.b).isPresent();
   }

   public dxc.b b() {
      return this.r;
   }

   class a implements dxc.d {
      private static final int b = 8;
      private final dwx c = new dwp(dqn.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwx b() {
         return this.c;
      }

      @Override
      public axe<dwt> c() {
         return awv.c;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwt> $$2, dwt.a $$3) {
         return !dqn.this.n().c(dlr.b) && dqn.a($$3.a()) != null;
      }

      @Override
      public void a(are $$0, iz $$1, ji<dwt> $$2, @Nullable bss $$3, @Nullable bss $$4, float $$5) {
         dqn.this.a($$0, dqn.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
