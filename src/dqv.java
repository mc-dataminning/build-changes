import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqv extends dpn implements dxc.b<dxj.b>, dxj {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<ave> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avf.BQ);
      $$0.put(2, avf.BR);
      $$0.put(3, avf.BS);
      $$0.put(4, avf.BP);
   });
   private int l;
   private final dxj.d m = new dqv.a();
   private dxj.a q = new dxj.a();
   private final dxj.b r = new dxj.b(this);

   public dqv(ja $$0, dsh $$1) {
      super(dpp.L, $$0, $$1);
   }

   @Override
   public dxj.a gp() {
      return this.q;
   }

   @Override
   public dxj.d gq() {
      return this.m;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dxj.a.a.parse(new Dynamic(ul.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dxj.a.a.encodeStart(ul.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aql a(@Nullable bsd $$0) {
      if ($$0 instanceof aql) {
         return (aql)$$0;
      } else {
         if ($$0 != null) {
            bsy $$6 = $$0.cQ();
            if ($$6 instanceof aql) {
               return (aql)$$6;
            }
         }

         if ($$0 instanceof cmz $$3) {
            bsd var3 = $$3.s();
            if (var3 instanceof aql) {
               return (aql)var3;
            }
         }

         if ($$0 instanceof cir $$5) {
            bsd var9 = $$5.s();
            if (var9 instanceof aql) {
               return (aql)var9;
            }
         }

         return null;
      }
   }

   public void a(aqk $$0, @Nullable aql $$1) {
      if ($$1 != null) {
         dsh $$2 = this.n();
         if (!$$2.c(dlz.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bsd)$$1);
            }
         }
      }
   }

   private boolean b(aqk $$0, aql $$1) {
      OptionalInt $$2 = cln.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqk $$0, @Nullable bsd $$1) {
      ja $$2 = this.az_();
      dsh $$3 = this.n();
      $$0.a($$2, $$3.a(dlz.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dxa.N, $$2, dxa.a.a($$1));
   }

   private boolean b(aqk $$0) {
      return this.n().c(dlz.d) && $$0.al() != bqa.a && $$0.ab().b(dbz.M);
   }

   public void a(aqk $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((dcd)$$0);
         }

         cll.a($$0, evz.b(this.az_()), null, 40);
      }
   }

   private void b(dcd $$0) {
      ave $$1 = (ave)k.get(this.l);
      if ($$1 != null) {
         ja $$2 = this.az_();
         int $$3 = $$2.u() + aye.b($$0.z, -10, 10);
         int $$4 = $$2.v() + aye.b($$0.z, -10, 10);
         int $$5 = $$2.w() + aye.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avg.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqk $$0) {
      return this.l < 4 ? false : ayx.a(bsj.bm, btc.k, $$0, this.az_(), 20, 5, 6, ayx.a.b).isPresent();
   }

   public dxj.b b() {
      return this.r;
   }

   class a implements dxj.d {
      private static final int b = 8;
      private final dxe c = new dww(dqv.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dxe b() {
         return this.c;
      }

      @Override
      public awk<dxa> c() {
         return awb.c;
      }

      @Override
      public boolean a(aqk $$0, ja $$1, jj<dxa> $$2, dxa.a $$3) {
         return !dqv.this.n().c(dlz.b) && dqv.a($$3.a()) != null;
      }

      @Override
      public void a(aqk $$0, ja $$1, jj<dxa> $$2, @Nullable bsd $$3, @Nullable bsd $$4, float $$5) {
         dqv.this.a($$0, dqv.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dqv.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
