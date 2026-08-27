import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnn extends dmf implements dtu.b<dub.b>, dub {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<aul> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, aum.Bu);
      $$0.put(2, aum.Bv);
      $$0.put(3, aum.Bw);
      $$0.put(4, aum.Bt);
   });
   private int l;
   private final dub.d m = new dnn.a();
   private dub.a n = new dub.a();
   private final dub.b r = new dub.b(this);

   public dnn(ib $$0, doz $$1) {
      super(dmh.L, $$0, $$1);
   }

   @Override
   public dub.a gp() {
      return this.n;
   }

   @Override
   public dub.d gq() {
      return this.m;
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         dub.a.a.parse(new Dynamic(ua.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      dub.a.a.encodeStart(ua.a, this.n).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static apt a(@Nullable bpv $$0) {
      if ($$0 instanceof apt) {
         return (apt)$$0;
      } else {
         if ($$0 != null) {
            bqo $$6 = $$0.cN();
            if ($$6 instanceof apt) {
               return (apt)$$6;
            }
         }

         if ($$0 instanceof ckl $$3) {
            bpv var3 = $$3.u();
            if (var3 instanceof apt) {
               return (apt)var3;
            }
         }

         if ($$0 instanceof cgd $$5) {
            bpv var9 = $$5.u();
            if (var9 instanceof apt) {
               return (apt)var9;
            }
         }

         return null;
      }
   }

   public void a(aps $$0, @Nullable apt $$1) {
      if ($$1 != null) {
         doz $$2 = this.n();
         if (!$$2.c(dir.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bpv)$$1);
            }
         }
      }
   }

   private boolean b(aps $$0, apt $$1) {
      OptionalInt $$2 = ciz.a($$0, this.aA_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(aps $$0, @Nullable bpv $$1) {
      ib $$2 = this.aA_();
      doz $$3 = this.n();
      $$0.a($$2, $$3.a(dir.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dts.N, $$2, dts.a.a($$1));
   }

   private boolean b(aps $$0) {
      return this.n().c(dir.d) && $$0.ak() != bnx.a && $$0.aa().b(cyt.M);
   }

   public void a(aps $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((cyx)$$0);
         }

         cix.a($$0, esa.b(this.aA_()), null, 40);
      }
   }

   private void b(cyx $$0) {
      aul $$1 = (aul)k.get(this.l);
      if ($$1 != null) {
         ib $$2 = this.aA_();
         int $$3 = $$2.u() + axk.b($$0.z, -10, 10);
         int $$4 = $$2.v() + axk.b($$0.z, -10, 10);
         int $$5 = $$2.w() + axk.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aun.f, 5.0F, 1.0F);
      }
   }

   private boolean c(aps $$0) {
      return this.l < 4 ? false : ayc.a(bqb.bl, bqs.k, $$0, this.aA_(), 20, 5, 6, ayc.a.b).isPresent();
   }

   public dub.b b() {
      return this.r;
   }

   class a implements dub.d {
      private static final int b = 8;
      private final dtw c = new dto(dnn.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dtw b() {
         return this.c;
      }

      @Override
      public avr<dts> c() {
         return avi.c;
      }

      @Override
      public boolean a(aps $$0, ib $$1, il<dts> $$2, dts.a $$3) {
         return !dnn.this.n().c(dir.b) && dnn.a($$3.a()) != null;
      }

      @Override
      public void a(aps $$0, ib $$1, il<dts> $$2, @Nullable bpv $$3, @Nullable bpv $$4, float $$5) {
         dnn.this.a($$0, dnn.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dnn.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
