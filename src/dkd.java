import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkd extends dix implements dpy.b<dqf.b>, dqf {
   private static final Logger b = LogUtils.getLogger();
   private dqf.a c;
   private final dqf.b d;
   private final dqf.d e = this.c();
   private int h;

   protected dkd(diz<?> $$0, hz $$1, dlj $$2) {
      super($$0, $$1, $$2);
      this.c = new dqf.a();
      this.d = new dqf.b(this);
   }

   public dkd(hz $$0, dlj $$1) {
      this(diz.I, $$0, $$1);
   }

   public dqf.d c() {
      return new dkd.a(this.aE_());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.h = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dqf.a.a.parse(new Dynamic(tk.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.h);
      dqf.a.a.encodeStart(tk.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dqf.a gi() {
      return this.c;
   }

   @Override
   public dqf.d gj() {
      return this.e;
   }

   public int f() {
      return this.h;
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public dqf.b g() {
      return this.d;
   }

   protected class a implements dqf.d {
      public static final int b = 8;
      protected final hz c;
      private final dqa a;

      public a(hz $$1) {
         this.c = $$1;
         this.a = new dps($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dqa b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(aow $$0, hz $$1, ij<dpw> $$2, @Nullable dpw.a $$3) {
         return !$$1.equals(this.c) || !$$2.a(dpw.f) && !$$2.a(dpw.i) ? dfk.n(dkd.this.r()) : false;
      }

      @Override
      public void a(aow $$0, hz $$1, ij<dpw> $$2, @Nullable bnq $$3, @Nullable bnq $$4, float $$5) {
         dlj $$6 = dkd.this.r();
         if (dfk.n($$6)) {
            dkd.this.a(dqf.a_($$2));
            int $$7 = dqf.a_($$5, this.a());
            if ($$6.b() instanceof dfk $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dkd.this.f());
            }
         }
      }

      @Override
      public void e() {
         dkd.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
