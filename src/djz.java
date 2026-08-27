import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class djz extends dit implements dpr.b<dpy.b>, dpy {
   private static final Logger b = LogUtils.getLogger();
   private dpy.a c;
   private final dpy.b d;
   private final dpy.d e = this.c();
   private int h;

   protected djz(div<?> $$0, hz $$1, dlf $$2) {
      super($$0, $$1, $$2);
      this.c = new dpy.a();
      this.d = new dpy.b(this);
   }

   public djz(hz $$0, dlf $$1) {
      this(div.I, $$0, $$1);
   }

   public dpy.d c() {
      return new djz.a(this.aE_());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dpy.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.h);
      dpy.a.a.encodeStart(tk.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dpy.a gi() {
      return this.c;
   }

   @Override
   public dpy.d gj() {
      return this.e;
   }

   public int f() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dpy.b g() {
      return this.d;
   }

   protected class a implements dpy.d {
      public static final int b = 8;
      protected final hz c;
      private final dpt a;

      public a(hz $$1) {
         this.c = $$1;
         this.a = new dpl($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dpt b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aov $$0, hz $$1, ij<dpp> $$2, @Nullable dpp.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dpp.f) && !$$2.a(dpp.i) ? dfg.n(djz.this.r()) : false;
      }

      @Override
      public void a(aov $$0, hz $$1, ij<dpp> $$2, @Nullable bno $$3, @Nullable bno $$4, float $$5) {
         dlf $$6 = djz.this.r();
         if (dfg.n($$6)) {
            djz.this.a(dpy.a_($$2));
            int $$7 = dpy.a_($$5, this.a());
            if ($$6.b() instanceof dfg $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, djz.this.f());
            }
         }
      }

      @Override
      public void e() {
         djz.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
