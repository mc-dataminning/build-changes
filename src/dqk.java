import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqk extends dpc implements dws.b<dwz.b>, dwz {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avv> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avw.BN);
      $$0.put(2, avw.BO);
      $$0.put(3, avw.BP);
      $$0.put(4, avw.BM);
   });
   private int l;
   private final dwz.d m = new dqk.a();
   private dwz.a q = new dwz.a();
   private final dwz.b r = new dwz.b(this);

   public dqk(iz $$0, drx $$1) {
      super(dpe.L, $$0, $$1);
   }

   @Override
   public dwz.a gs() {
      return this.q;
   }

   @Override
   public dwz.d gt() {
      return this.m;
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dwz.a.a.parse(new Dynamic(vf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dwz.a.a.encodeStart(vf.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static arc a(@Nullable bsp $$0) {
      if ($$0 instanceof arc) {
         return (arc)$$0;
      } else {
         if ($$0 != null) {
            btk $$6 = $$0.cQ();
            if ($$6 instanceof arc) {
               return (arc)$$6;
            }
         }

         if ($$0 instanceof cnk $$3) {
            bsp var3 = $$3.s();
            if (var3 instanceof arc) {
               return (arc)var3;
            }
         }

         if ($$0 instanceof cjc $$5) {
            bsp var9 = $$5.s();
            if (var9 instanceof arc) {
               return (arc)var9;
            }
         }

         return null;
      }
   }

   public void a(arb $$0, @Nullable arc $$1) {
      if ($$1 != null) {
         drx $$2 = this.n();
         if (!$$2.c(dlo.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsp)$$1);
            }
         }
      }
   }

   private boolean b(arb $$0, arc $$1) {
      OptionalInt $$2 = cly.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(arb $$0, @Nullable bsp $$1) {
      iz $$2 = this.aA_();
      drx $$3 = this.n();
      $$0.a($$2, $$3.a(dlo.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dwq.N, $$2, dwq.a.a($$1));
   }

   private boolean b(arb $$0) {
      return this.n().c(dlo.d) && $$0.al() != bqm.a && $$0.ab().b(dbp.M);
   }

   public void a(arb $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dbt)$$0);
         }

         clw.a($$0, evm.b(this.aA_()), null, 40);
      }
   }

   private void b(dbt $$0) {
      avv $$1 = (avv)k.get(this.l);
      if ($$1 != null) {
         iz $$2 = this.aA_();
         int $$3 = $$2.u() + ayu.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayu.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayu.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avx.f, 5.0F, 1.0F);
      }
   }

   private boolean c(arb $$0) {
      return this.l < 4 ? false : azn.a(bsv.bm, bto.k, $$0, this.aA_(), 20, 5, 6, azn.a.b).isPresent();
   }

   public dwz.b b() {
      return this.r;
   }

   class a implements dwz.d {
      private static final int b = 8;
      private final dwu c = new dwm(dqk.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwu b() {
         return this.c;
      }

      @Override
      public axb<dwq> c() {
         return aws.c;
      }

      @Override
      public boolean a(arb $$0, iz $$1, ji<dwq> $$2, dwq.a $$3) {
         return !dqk.this.n().c(dlo.b) && dqk.a($$3.a()) != null;
      }

      @Override
      public void a(arb $$0, iz $$1, ji<dwq> $$2, @Nullable bsp $$3, @Nullable bsp $$4, float $$5) {
         dqk.this.a($$0, dqk.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqk.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
