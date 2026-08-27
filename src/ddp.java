import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddp extends dck implements djk.b<djr.b>, djr {
   private static final Logger b = LogUtils.getLogger();
   private djr.a c;
   private final djr.b d;
   private final djr.d e = this.c();
   private int g;

   protected ddp(dcm<?> $$0, gv $$1, dey $$2) {
      super($$0, $$1, $$2);
      this.c = new djr.a();
      this.d = new djr.b(this);
   }

   public ddp(gv $$0, dey $$1) {
      this(dcm.I, $$0, $$1);
   }

   public djr.d c() {
      return new ddp.a(this.p());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         djr.a.a.parse(new Dynamic(rd.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      djr.a.a.encodeStart(rd.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public djr.a gb() {
      return this.c;
   }

   @Override
   public djr.d gc() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public djr.b g() {
      return this.d;
   }

   protected class a implements djr.d {
      public static final int b = 8;
      protected final gv c;
      private final djm a;

      public a(gv $$1) {
         this.c = $$1;
         this.a = new dje($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djm b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aki $$0, gv $$1, dji $$2, @Nullable dji.a $$3) {
         return !$$1.equals(this.c) || $$2 != dji.f && $$2 != dji.i ? czd.n(ddp.this.q()) : false;
      }

      @Override
      public void a(aki $$0, gv $$1, dji $$2, @Nullable big $$3, @Nullable big $$4, float $$5) {
         dey $$6 = ddp.this.q();
         if (czd.n($$6)) {
            ddp.this.a(djr.a_($$2));
            int $$7 = djr.a_($$5, this.a());
            if ($$6.b() instanceof czd $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, ddp.this.f());
            }
         }
      }

      @Override
      public void e() {
         ddp.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
