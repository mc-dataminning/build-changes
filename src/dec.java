import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dec extends dcx implements djx.b<dke.b>, dke {
   private static final Logger b = LogUtils.getLogger();
   private dke.a c;
   private final dke.b d;
   private final dke.d e = this.c();
   private int g;

   protected dec(dcz<?> $$0, gw $$1, dfl $$2) {
      super($$0, $$1, $$2);
      this.c = new dke.a();
      this.d = new dke.b(this);
   }

   public dec(gw $$0, dfl $$1) {
      this(dcz.I, $$0, $$1);
   }

   public dke.d c() {
      return new dec.a(this.p());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dke.a.a.parse(new Dynamic(rk.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dke.a.a.encodeStart(rk.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dke.a gf() {
      return this.c;
   }

   @Override
   public dke.d gg() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dke.b g() {
      return this.d;
   }

   protected class a implements dke.d {
      public static final int b = 8;
      protected final gw c;
      private final djz a;

      public a(gw $$1) {
         this.c = $$1;
         this.a = new djr($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djz b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aks $$0, gw $$1, djv $$2, @Nullable djv.a $$3) {
         return !$$1.equals(this.c) || $$2 != djv.f && $$2 != djv.i ? czq.n(dec.this.q()) : false;
      }

      @Override
      public void a(aks $$0, gw $$1, djv $$2, @Nullable bis $$3, @Nullable bis $$4, float $$5) {
         dfl $$6 = dec.this.q();
         if (czq.n($$6)) {
            dec.this.a(dke.a_($$2));
            int $$7 = dke.a_($$5, this.a());
            if ($$6.b() instanceof czq $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dec.this.f());
            }
         }
      }

      @Override
      public void e() {
         dec.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
