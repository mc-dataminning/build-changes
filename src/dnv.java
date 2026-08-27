import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnv extends dmo implements dud.b<duk.b>, duk {
   private static final Logger b = LogUtils.getLogger();
   private duk.a c;
   private final duk.b d;
   private final duk.d e = this.b();
   private int h;

   protected dnv(dmq<?> $$0, id $$1, dpi $$2) {
      super($$0, $$1, $$2);
      this.c = new duk.a();
      this.d = new duk.b(this);
   }

   public dnv(id $$0, dpi $$1) {
      this(dmq.I, $$0, $$1);
   }

   public duk.d b() {
      return new dnv.a(this.az_());
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         duk.a.a.parse(new Dynamic(uc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      duk.a.a.encodeStart(uc.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public duk.a gp() {
      return this.c;
   }

   @Override
   public duk.d gq() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public duk.b f() {
      return this.d;
   }

   protected class a implements duk.d {
      public static final int b = 8;
      protected final id c;
      private final duf a;

      public a(id $$1) {
         this.c = $$1;
         this.a = new dtx($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public duf b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(apu $$0, id $$1, in<dub> $$2, @Nullable dub.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dub.f) && !$$2.a(dub.i) ? diz.n(dnv.this.n()) : false;
      }

      @Override
      public void a(apu $$0, id $$1, in<dub> $$2, @Nullable bqa $$3, @Nullable bqa $$4, float $$5) {
         dpi $$6 = dnv.this.n();
         if (diz.n($$6)) {
            dnv.this.a(duk.a_($$2));
            int $$7 = duk.a_($$5, this.a());
            if ($$6.b() instanceof diz $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dnv.this.d());
            }
         }
      }

      @Override
      public void e() {
         dnv.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
