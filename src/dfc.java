import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfc extends ddx implements dkn.b<dku.b>, dku {
   private static final Logger b = LogUtils.getLogger();
   private dku.a c;
   private final dku.b d;
   private final dku.d e = this.c();
   private int g;

   protected dfc(ddz<?> $$0, ht $$1, dgb $$2) {
      super($$0, $$1, $$2);
      this.c = new dku.a();
      this.d = new dku.b(this);
   }

   public dfc(ht $$0, dgb $$1) {
      this(ddz.I, $$0, $$1);
   }

   public dku.d c() {
      return new dfc.a(this.p());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dku.a.a.parse(new Dynamic(sf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dku.a.a.encodeStart(sf.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dku.a gg() {
      return this.c;
   }

   @Override
   public dku.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dku.b g() {
      return this.d;
   }

   protected class a implements dku.d {
      public static final int b = 8;
      protected final ht c;
      private final dkp a;

      public a(ht $$1) {
         this.c = $$1;
         this.a = new dkh($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dkp b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(alq $$0, ht $$1, dkl $$2, @Nullable dkl.a $$3) {
         return !$$1.equals(this.c) || $$2 != dkl.f && $$2 != dkl.i ? dar.n(dfc.this.q()) : false;
      }

      @Override
      public void a(alq $$0, ht $$1, dkl $$2, @Nullable bjt $$3, @Nullable bjt $$4, float $$5) {
         dgb $$6 = dfc.this.q();
         if (dar.n($$6)) {
            dfc.this.a(dku.a_($$2));
            int $$7 = dku.a_($$5, this.a());
            if ($$6.b() instanceof dar $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dfc.this.f());
            }
         }
      }

      @Override
      public void e() {
         dfc.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
