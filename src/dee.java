import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dee extends dcz implements djp.b<djw.b>, djw {
   private static final Logger b = LogUtils.getLogger();
   private djw.a c;
   private final djw.b d;
   private final djw.d e = this.c();
   private int g;

   protected dee(ddb<?> $$0, gw $$1, dfd $$2) {
      super($$0, $$1, $$2);
      this.c = new djw.a();
      this.d = new djw.b(this);
   }

   public dee(gw $$0, dfd $$1) {
      this(ddb.I, $$0, $$1);
   }

   public djw.d c() {
      return new dee.a(this.p());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         djw.a.a.parse(new Dynamic(ri.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qw $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      djw.a.a.encodeStart(ri.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public djw.a gg() {
      return this.c;
   }

   @Override
   public djw.d gh() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public djw.b g() {
      return this.d;
   }

   protected class a implements djw.d {
      public static final int b = 8;
      protected final gw c;
      private final djr a;

      public a(gw $$1) {
         this.c = $$1;
         this.a = new djj($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djr b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akt $$0, gw $$1, djn $$2, @Nullable djn.a $$3) {
         return !$$1.equals(this.c) || $$2 != djn.f && $$2 != djn.i ? czt.n(dee.this.q()) : false;
      }

      @Override
      public void a(akt $$0, gw $$1, djn $$2, @Nullable biw $$3, @Nullable biw $$4, float $$5) {
         dfd $$6 = dee.this.q();
         if (czt.n($$6)) {
            dee.this.a(djw.a_($$2));
            int $$7 = djw.a_($$5, this.a());
            if ($$6.b() instanceof czt $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dee.this.f());
            }
         }
      }

      @Override
      public void e() {
         dee.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
