import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dok extends dnd implements dut.b<dva.b>, dva {
   private static final Logger b = LogUtils.getLogger();
   private dva.a c;
   private final dva.b d;
   private final dva.d e = this.b();
   private int h;

   protected dok(dnf<?> $$0, im $$1, dpy $$2) {
      super($$0, $$1, $$2);
      this.c = new dva.a();
      this.d = new dva.b(this);
   }

   public dok(im $$0, dpy $$1) {
      this(dnf.I, $$0, $$1);
   }

   public dva.d b() {
      return new dok.a(this.az_());
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dva.a.a.parse(new Dynamic(um.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      $$0.a("last_vibration_frequency", this.h);
      dva.a.a.encodeStart(um.a, this.c).resultOrPartial(b::error).ifPresent($$1x -> $$0.a("listener", $$1x));
   }

   @Override
   public dva.a gr() {
      return this.c;
   }

   @Override
   public dva.d gs() {
      return this.e;
   }

   public int d() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dva.b f() {
      return this.d;
   }

   protected class a implements dva.d {
      public static final int b = 8;
      protected final im c;
      private final duv a;

      public a(im $$1) {
         this.c = $$1;
         this.a = new dun($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public duv b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aqe $$0, im $$1, iv<dur> $$2, @Nullable dur.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dur.f) && !$$2.a(dur.i) ? djo.n(dok.this.n()) : false;
      }

      @Override
      public void a(aqe $$0, im $$1, iv<dur> $$2, @Nullable bql $$3, @Nullable bql $$4, float $$5) {
         dpy $$6 = dok.this.n();
         if (djo.n($$6)) {
            dok.this.a(dva.a_($$2));
            int $$7 = dva.a_($$5, this.a());
            if ($$6.b() instanceof djo $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dok.this.d());
            }
         }
      }

      @Override
      public void e() {
         dok.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
