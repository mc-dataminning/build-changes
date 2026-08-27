import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.OptionalInt;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnw extends dmo implements dud.b<duk.b>, duk {
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 5;
   private static final int h = 6;
   private static final int i = 40;
   private static final int j = 90;
   private static final Int2ObjectMap<aun> k = ac.a(new Int2ObjectOpenHashMap(), $$0 -> {
      $$0.put(1, auo.Bu);
      $$0.put(2, auo.Bv);
      $$0.put(3, auo.Bw);
      $$0.put(4, auo.Bt);
   });
   private int l;
   private final duk.d m = new dnw.a();
   private duk.a n = new duk.a();
   private final duk.b r = new duk.b(this);

   public dnw(id $$0, dpi $$1) {
      super(dmq.L, $$0, $$1);
   }

   @Override
   public duk.a gp() {
      return this.n;
   }

   @Override
   public duk.d gq() {
      return this.m;
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("warning_level", 99)) {
         this.l = $$0.h("warning_level");
      }

      if ($$0.b("listener", 10)) {
         duk.a.a.parse(new Dynamic(uc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.n = $$0x);
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("warning_level", this.l);
      duk.a.a.encodeStart(uc.a, this.n).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Nullable
   public static apv a(@Nullable bqa $$0) {
      if ($$0 instanceof apv) {
         return (apv)$$0;
      } else {
         if ($$0 != null) {
            bqt $$6 = $$0.cN();
            if ($$6 instanceof apv) {
               return (apv)$$6;
            }
         }

         if ($$0 instanceof cks $$3) {
            bqa var3 = $$3.u();
            if (var3 instanceof apv) {
               return (apv)var3;
            }
         }

         if ($$0 instanceof cgk $$5) {
            bqa var9 = $$5.u();
            if (var9 instanceof apv) {
               return (apv)var9;
            }
         }

         return null;
      }
   }

   public void a(apu $$0, @Nullable apv $$1) {
      if ($$1 != null) {
         dpi $$2 = this.n();
         if (!$$2.c(dja.b)) {
            this.l = 0;
            if (!this.b($$0) || this.b($$0, $$1)) {
               this.a($$0, (bqa)$$1);
            }
         }
      }
   }

   private boolean b(apu $$0, apv $$1) {
      OptionalInt $$2 = cjg.a($$0, this.az_(), $$1);
      $$2.ifPresent($$0x -> this.l = $$0x);
      return $$2.isPresent();
   }

   private void a(apu $$0, @Nullable bqa $$1) {
      id $$2 = this.az_();
      dpi $$3 = this.n();
      $$0.a($$2, $$3.a(dja.b, Boolean.valueOf(true)), 2);
      $$0.a($$2, $$3.b(), 90);
      $$0.c(3007, $$2, 0);
      $$0.a(dub.N, $$2, dub.a.a($$1));
   }

   private boolean b(apu $$0) {
      return this.n().c(dja.d) && $$0.ak() != boc.a && $$0.aa().b(czc.M);
   }

   public void a(apu $$0) {
      if (this.b($$0) && this.l > 0) {
         if (!this.c($$0)) {
            this.b((czg)$$0);
         }

         cje.a($$0, esj.b(this.az_()), null, 40);
      }
   }

   private void b(czg $$0) {
      aun $$1 = (aun)k.get(this.l);
      if ($$1 != null) {
         id $$2 = this.az_();
         int $$3 = $$2.u() + axm.b($$0.z, -10, 10);
         int $$4 = $$2.v() + axm.b($$0.z, -10, 10);
         int $$5 = $$2.w() + axm.b($$0.z, -10, 10);
         $$0.a(null, (double)$$3, (double)$$4, (double)$$5, $$1, aup.f, 5.0F, 1.0F);
      }
   }

   private boolean c(apu $$0) {
      return this.l < 4 ? false : aye.a(bqg.bl, bqx.k, $$0, this.az_(), 20, 5, 6, aye.a.b).isPresent();
   }

   public duk.b b() {
      return this.r;
   }

   class a implements duk.d {
      private static final int b = 8;
      private final duf c = new dtx(dnw.this.p);

      public a() {
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public duf b() {
         return this.c;
      }

      @Override
      public avt<dub> c() {
         return avk.c;
      }

      @Override
      public boolean a(apu $$0, id $$1, in<dub> $$2, dub.a $$3) {
         return !dnw.this.n().c(dja.b) && dnw.a($$3.a()) != null;
      }

      @Override
      public void a(apu $$0, id $$1, in<dub> $$2, @Nullable bqa $$3, @Nullable bqa $$4, float $$5) {
         dnw.this.a($$0, dnw.a($$4 != null ? $$4 : $$3));
      }

      @Override
      public void e() {
         dnw.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
