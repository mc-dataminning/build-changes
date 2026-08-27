import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dia extends dgu implements dns.b<dnz.b>, dnz {
   private static final Logger b = LogUtils.getLogger();
   private dnz.a c;
   private final dnz.b d;
   private final dnz.d e = this.c();
   private int g;

   protected dia(dgw<?> $$0, hx $$1, djg $$2) {
      super($$0, $$1, $$2);
      this.c = new dnz.a();
      this.d = new dnz.b(this);
   }

   public dia(hx $$0, djg $$1) {
      this(dgw.I, $$0, $$1);
   }

   public dnz.d c() {
      return new dia.a(this.aB_());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dnz.a.a.parse(new Dynamic(tb.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dnz.a.a.encodeStart(tb.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dnz.a gg() {
      return this.c;
   }

   @Override
   public dnz.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dnz.b g() {
      return this.d;
   }

   protected class a implements dnz.d {
      public static final int b = 8;
      protected final hx c;
      private final dnu a;

      public a(hx $$1) {
         this.c = $$1;
         this.a = new dnm($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dnu b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnq $$2, @Nullable dnq.a $$3) {
         return !$$1.equals(this.c) || $$2 != dnq.f && $$2 != dnq.i ? ddh.n(dia.this.r()) : false;
      }

      @Override
      public void a(and $$0, hx $$1, dnq $$2, @Nullable blu $$3, @Nullable blu $$4, float $$5) {
         djg $$6 = dia.this.r();
         if (ddh.n($$6)) {
            dia.this.a(dnz.a_($$2));
            int $$7 = dnz.a_($$5, this.a());
            if ($$6.b() instanceof ddh $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dia.this.f());
            }
         }
      }

      @Override
      public void e() {
         dia.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
