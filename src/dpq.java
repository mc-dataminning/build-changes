import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpq extends doi implements dvy.b<dwf.b>, dwf {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<avh> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, avi.BN);
      $$0.put(2, avi.BO);
      $$0.put(3, avi.BP);
      $$0.put(4, avi.BM);
   });
   private int l;
   private final dwf.d m = new dpq.a();
   private dwf.a q = new dwf.a();
   private final dwf.b r = new dwf.b(this);

   public dpq(io $$0, drd $$1) {
      super(dok.L, $$0, $$1);
   }

   @Override
   public dwf.a gr() {
      return this.q;
   }

   @Override
   public dwf.d gs() {
      return this.m;
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dwf.a.a.parse(new Dynamic(ur.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.q = $$0x);
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dwf.a.a.encodeStart(ur.a, this.q).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static aqo a(@Nullable brw $$0) {
      if ($$0 instanceof aqo) {
         return (aqo)$$0;
      } else {
         if ($$0 != null) {
            bsq $$6 = $$0.cQ();
            if ($$6 instanceof aqo) {
               return (aqo)$$6;
            }
         }

         if ($$0 instanceof cmq $$3) {
            brw var3 = $$3.s();
            if (var3 instanceof aqo) {
               return (aqo)var3;
            }
         }

         if ($$0 instanceof cii $$5) {
            brw var9 = $$5.s();
            if (var9 instanceof aqo) {
               return (aqo)var9;
            }
         }

         return null;
      }
   }

   public void a(aqn $$0, @Nullable aqo $$1) {
      if ($$1 != null) {
         drd $$2 = this.n();
         if (!$$2.c(dku.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (brw)$$1);
            }
         }
      }
   }

   private boolean b(aqn $$0, aqo $$1) {
      OptionalInt $$2 = cle.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aqn $$0, @Nullable brw $$1) {
      io $$2 = this.aA_();
      drd $$3 = this.n();
      $$0.a($$2, $$3.a(dku.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dvw.N, $$2, dvw.a.a($$1));
   }

   private boolean b(aqn $$0) {
      return this.n().c(dku.d) && $$0.ak() != bpt.a && $$0.aa().b(dav.M);
   }

   public void a(aqn $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((daz)$$0);
         }

         clc.a($$0, eum.b(this.aA_()), null, 40);
      }
   }

   private void b(daz $$0) {
      avh $$1 = (avh)k.get(this.l);
      if ($$1 != null) {
         io $$2 = this.aA_();
         int $$3 = $$2.u() + ayf.b($$0.z, -10, 10);
         int $$4 = $$2.v() + ayf.b($$0.z, -10, 10);
         int $$5 = $$2.w() + ayf.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, avj.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aqn $$0) {
      return this.l < 4 ? false : ayx.a(bsc.bm, bsu.k, $$0, this.aA_(), 20, 5, 6, ayx.a.b).isPresent();
   }

   public dwf.b b() {
      return this.r;
   }

   class a implements dwf.d {
      private static final int b = 8;
      private final dwa c = new dvs(dpq.this.o);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwa b() {
         return this.c;
      }

      @Override
      public awm<dvw> c() {
         return awd.c;
      }

      @Override
      public boolean a(aqn $$0, io $$1, ix<dvw> $$2, dvw.a $$3) {
         return !dpq.this.n().c(dku.b) && dpq.a($$3.a()) != null;
      }

      @Override
      public void a(aqn $$0, io $$1, ix<dvw> $$2, @Nullable brw $$3, @Nullable brw $$4, float $$5) {
         dpq.this.a($$0, dpq.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dpq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
