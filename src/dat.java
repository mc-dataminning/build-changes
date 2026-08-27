import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dat extends czn implements dgn.b<dgu.b>, dgu {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<amg> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, amh.zA);
      $$0.put(2, amh.zB);
      $$0.put(3, amh.zC);
      $$0.put(4, amh.zz);
   });
   private int k;
   private final dgu.d l = new dat.a();
   private dgu.a m = new dgu.a();
   private final dgu.b n = new dgu.b(this);

   public dat(gu $$0, dcb $$1) {
      super(czp.L, $$0, $$1);
   }

   @Override
   public dgu.a gb() {
      return this.m;
   }

   @Override
   public dgu.d gc() {
      return this.l;
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dgu.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      dgu.a.a.encodeStart(rc.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static aig a(@Nullable bfj $$0) {
      if ($$0 instanceof aig) {
         return (aig)$$0;
      } else {
         if ($$0 != null) {
            bfz $$6 = $$0.cL();
            if ($$6 instanceof aig) {
               return (aig)$$6;
            }
         }

         if ($$0 instanceof bzg $$3) {
            bfj var3 = $$3.v();
            if (var3 instanceof aig) {
               return (aig)var3;
            }
         }

         if ($$0 instanceof bvh $$5) {
            bfj var9 = $$5.v();
            if (var9 instanceof aig) {
               return (aig)var9;
            }
         }

         return null;
      }
   }

   public void a(aif $$0, @Nullable aig $$1) {
      if ($$1 != null) {
         dcb $$2 = this.q();
         if (!$$2.c(cwh.a)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bfj)$$1);
            }
         }
      }
   }

   private boolean b(aif $$0, aig $$1) {
      OptionalInt $$2 = bxu.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(aif $$0, @Nullable bfj $$1) {
      gu $$2 = this.p();
      dcb $$3 = this.q();
      $$0.a($$2, $$3.a(cwh.a, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dgl.O, $$2, dgl.a.a($$1));
   }

   private boolean b(aif $$0) {
      return this.q().c(cwh.c) && $$0.ai() != bdu.a && $$0.X().b(cmi.I);
   }

   public void a(aif $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cmm)$$0);
         }

         bxs.a($$0, eei.b(this.p()), null, 40);
      }
   }

   private void b(cmm $$0) {
      amg $$1 = (amg)j.get(this.k);
      if ($$1 != null) {
         gu $$2 = this.p();
         int $$3 = $$2.u() + apa.b($$0.z, -10, 10);
         int $$4 = $$2.v() + apa.b($$0.z, -10, 10);
         int $$5 = $$2.w() + apa.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, ami.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aif $$0) {
      return this.k < 4 ? false : app.a(bfn.bi, bgd.k, $$0, this.p(), 20, 5, 6, app.a.b).isPresent();
   }

   public dgu.b c() {
      return this.n;
   }

   class a implements dgu.d {
      private static final int b = 8;
      private final dgp c = new dgh(dat.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dgp b() {
         return this.c;
      }

      @Override
      public anl<dgl> c() {
         return anc.c;
      }

      @Override
      public boolean a(aif $$0, gu $$1, dgl $$2, dgl.a $$3) {
         return !dat.this.q().c(cwh.a) && dat.a($$3.a()) != null;
      }

      @Override
      public void a(aif $$0, gu $$1, dgl $$2, @Nullable bfj $$3, @Nullable bfj $$4, float $$5) {
         dat.this.a($$0, dat.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dat.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
