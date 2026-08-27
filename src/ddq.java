import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddq extends dcl implements djl.b<djs.b>, djs {
   private static final Logger b = LogUtils.getLogger();
   private djs.a c;
   private final djs.b d;
   private final djs.d e = this.c();
   private int g;

   protected ddq(dcn<?> $$0, gu $$1, dez $$2) {
      super($$0, $$1, $$2);
      this.c = new djs.a();
      this.d = new djs.b(this);
   }

   public ddq(gu $$0, dez $$1) {
      this(dcn.I, $$0, $$1);
   }

   public djs.d c() {
      return new ddq.a(this.p());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         djs.a.a.parse(new Dynamic(rc.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      djs.a.a.encodeStart(rc.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public djs.a gc() {
      return this.c;
   }

   @Override
   public djs.d gd() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public djs.b g() {
      return this.d;
   }

   protected class a implements djs.d {
      public static final int b = 8;
      protected final gu c;
      private final djn a;

      public a(gu $$1) {
         this.c = $$1;
         this.a = new djf($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djn b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akk $$0, gu $$1, djj $$2, @Nullable djj.a $$3) {
         return !$$1.equals(this.c) || $$2 != djj.f && $$2 != djj.i ? cze.n(ddq.this.q()) : false;
      }

      @Override
      public void a(akk $$0, gu $$1, djj $$2, @Nullable bii $$3, @Nullable bii $$4, float $$5) {
         dez $$6 = ddq.this.q();
         if (cze.n($$6)) {
            ddq.this.a(djs.a_($$2));
            int $$7 = djs.a_($$5, this.a());
            if ($$6.b() instanceof cze $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, ddq.this.f());
            }
         }
      }

      @Override
      public void e() {
         ddq.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
