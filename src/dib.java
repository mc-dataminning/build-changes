import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dib extends dgv implements dnt.b<doa.b>, doa {
   private static final Logger b = LogUtils.getLogger();
   private doa.a c;
   private final doa.b d;
   private final doa.d e = this.c();
   private int g;

   protected dib(dgx<?> $$0, hx $$1, djh $$2) {
      super($$0, $$1, $$2);
      this.c = new doa.a();
      this.d = new doa.b(this);
   }

   public dib(hx $$0, djh $$1) {
      this(dgx.I, $$0, $$1);
   }

   public doa.d c() {
      return new dib.a(this.aB_());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         doa.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      doa.a.a.encodeStart(tb.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public doa.a gg() {
      return this.c;
   }

   @Override
   public doa.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public doa.b g() {
      return this.d;
   }

   protected class a implements doa.d {
      public static final int b = 8;
      protected final hx c;
      private final dnv a;

      public a(hx $$1) {
         this.c = $$1;
         this.a = new dnn($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dnv b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnr $$2, @Nullable dnr.a $$3) {
         return !$$1.equals(this.c) || $$2 != dnr.f && $$2 != dnr.i ? ddi.n(dib.this.r()) : false;
      }

      @Override
      public void a(and $$0, hx $$1, dnr $$2, @Nullable blv $$3, @Nullable blv $$4, float $$5) {
         djh $$6 = dib.this.r();
         if (ddi.n($$6)) {
            dib.this.a(doa.a_($$2));
            int $$7 = doa.a_($$5, this.a());
            if ($$6.b() instanceof ddi $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dib.this.f());
            }
         }
      }

      @Override
      public void e() {
         dib.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
