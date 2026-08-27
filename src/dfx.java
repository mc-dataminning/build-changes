import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dfx extends der implements dli.b<dlp.b>, dlp {
   private static final Logger b = LogUtils.getLogger();
   private dlp.a c;
   private final dlp.b d;
   private final dlp.d e = this.c();
   private int g;

   protected dfx(det<?> $$0, ht $$1, dgw $$2) {
      super($$0, $$1, $$2);
      this.c = new dlp.a();
      this.d = new dlp.b(this);
   }

   public dfx(ht $$0, dgw $$1) {
      this(det.I, $$0, $$1);
   }

   public dlp.d c() {
      return new dfx.a(this.p());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dlp.a.a.parse(new Dynamic(sn.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dlp.a.a.encodeStart(sn.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dlp.a gg() {
      return this.c;
   }

   @Override
   public dlp.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dlp.b g() {
      return this.d;
   }

   protected class a implements dlp.d {
      public static final int b = 8;
      protected final ht c;
      private final dlk a;

      public a(ht $$1) {
         this.c = $$1;
         this.a = new dlc($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dlk b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ama $$0, ht $$1, dlg $$2, @Nullable dlg.a $$3) {
         return !$$1.equals(this.c) || $$2 != dlg.f && $$2 != dlg.i ? dbl.n(dfx.this.q()) : false;
      }

      @Override
      public void a(ama $$0, ht $$1, dlg $$2, @Nullable bki $$3, @Nullable bki $$4, float $$5) {
         dgw $$6 = dfx.this.q();
         if (dbl.n($$6)) {
            dfx.this.a(dlp.a_($$2));
            int $$7 = dlp.a_($$5, this.a());
            if ($$6.b() instanceof dbl $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dfx.this.f());
            }
         }
      }

      @Override
      public void e() {
         dfx.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
