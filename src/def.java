import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class def extends dcz implements djp.b<djw.b>, djw {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int g = 6;
   private static final int h = 40;
   private static final int i = 90;
   private static final Int2ObjectMap<apf> j = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, apg.zG);
      $$0.put(2, apg.zH);
      $$0.put(3, apg.zI);
      $$0.put(4, apg.zF);
   });
   private int k;
   private final djw.d l = new def.a();
   private djw.a m = new djw.a();
   private final djw.b n = new djw.b(this);

   public def(gw $$0, dfd $$1) {
      super(ddb.L, $$0, $$1);
   }

   @Override
   public djw.a gg() {
      return this.m;
   }

   @Override
   public djw.d gh() {
      return this.l;
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("warning_level", 99)) {
         this.k = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         djw.a.a.parse(new Dynamic(ri.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.m = $$0x);
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("warning_level", this.k);
      djw.a.a.encodeStart(ri.a, this.m).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Nullable
   public static aku a(@Nullable biw $$0) {
      if ($$0 instanceof aku) {
         return (aku)$$0;
      } else {
         if ($$0 != null) {
            bjm $$6 = $$0.cN();
            if ($$6 instanceof aku) {
               return (aku)$$6;
            }
         }

         if ($$0 instanceof ccs $$3) {
            biw var3 = $$3.v();
            if (var3 instanceof aku) {
               return (aku)var3;
            }
         }

         if ($$0 instanceof byt $$5) {
            biw var9 = $$5.v();
            if (var9 instanceof aku) {
               return (aku)var9;
            }
         }

         return null;
      }
   }

   public void a(akt $$0, @Nullable aku $$1) {
      if ($$1 != null) {
         dfd $$2 = this.q();
         if (!$$2.c(czu.b)) {
            this.k = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (biw)$$1);
            }
         }
      }
   }

   private boolean b(akt $$0, aku $$1) {
      OptionalInt $$2 = cbg.a($$0, this.p(), $$1);
      $$2.ifPresent($$0x -> this.k = $$0x);
      return $$2.isPresent();
   }

   private void a(akt $$0, @Nullable biw $$1) {
      gw $$2 = this.p();
      dfd $$3 = this.q();
      $$0.a($$2, $$3.a(czu.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(djn.N, $$2, djn.a.a($$1));
   }

   private boolean b(akt $$0) {
      return this.q().c(czu.d) && $$0.ai() != bhb.a && $$0.X().b(cpx.I);
   }

   public void a(akt $$0) {
      if (this.b($$0) && this.k > 0) {
         if (!this.c($$0)) {
            this.b((cqb)$$0);
         }

         cbe.a($$0, ehh.b(this.p()), null, 40);
      }
   }

   private void b(cqb $$0) {
      apf $$1 = (apf)j.get(this.k);
      if ($$1 != null) {
         gw $$2 = this.p();
         int $$3 = $$2.u() + asb.b($$0.z, -10, 10);
         int $$4 = $$2.v() + asb.b($$0.z, -10, 10);
         int $$5 = $$2.w() + asb.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aph.f, 5.0F, 1.0F);
      }
   }

   private boolean c(akt $$0) {
      return this.k < 4 ? false : ass.a(bja.bi, bjq.k, $$0, this.p(), 20, 5, 6, ass.a.b).isPresent();
   }

   public djw.b c() {
      return this.n;
   }

   class a implements djw.d {
      private static final int b = 8;
      private final djr c = new djj(def.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djr b() {
         return this.c;
      }

      @Override
      public aqk<djn> c() {
         return aqb.c;
      }

      @Override
      public boolean a(akt $$0, gw $$1, djn $$2, djn.a $$3) {
         return !def.this.q().c(czu.b) && def.a($$3.a()) != null;
      }

      @Override
      public void a(akt $$0, gw $$1, djn $$2, @Nullable biw $$3, @Nullable biw $$4, float $$5) {
         def.this.a($$0, def.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         def.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
