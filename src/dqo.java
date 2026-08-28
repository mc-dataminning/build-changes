import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqo extends dph implements dwx.b<dxe.b>, dxe {
   private static final Logger b = LogUtils.getLogger();
   private dxe.a c;
   private final dxe.b d;
   private final dxe.d e = this.b();
   private int h;

   protected dqo(dpj<?> $$0, iz $$1, dsc $$2) {
      super($$0, $$1, $$2);
      this.c = new dxe.a();
      this.d = new dxe.b(this);
   }

   public dqo(iz $$0, dsc $$1) {
      this(dpj.I, $$0, $$1);
   }

   public dxe.d b() {
      return new dqo.a(this.ay_());
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dxe.a.a.parse(new Dynamic(vg.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dxe.a.a.encodeStart(vg.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dxe.a gs() {
      return this.c;
   }

   @Override
   public dxe.d gt() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dxe.b f() {
      return this.d;
   }

   protected class a implements dxe.d {
      public static final int b = 8;
      protected final iz c;
      private final dwz a;

      public a(final iz $$1) {
         this.c = $$1;
         this.a = new dwr($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dwz b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwv> $$2, @Nullable dwv.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dwv.f) && !$$2.a(dwv.i) ? dls.n(dqo.this.n()) : false;
      }

      @Override
      public void a(arf $$0, iz $$1, ji<dwv> $$2, @Nullable bsu $$3, @Nullable bsu $$4, float $$5) {
         dsc $$6 = dqo.this.n();
         if (dls.n($$6)) {
            dqo.this.a(dxe.a_($$2));
            int $$7 = dxe.a_($$5, this.a());
            if ($$6.b() instanceof dls $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dqo.this.d());
            }
         }
      }

      @Override
      public void e() {
         dqo.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
