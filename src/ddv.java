import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ddv extends dcq implements djq.b<djx.b>, djx {
   private static final Logger b = LogUtils.getLogger();
   private djx.a c;
   private final djx.b d;
   private final djx.d e = this.c();
   private int g;

   protected ddv(dcs<?> $$0, gw $$1, dfe $$2) {
      super($$0, $$1, $$2);
      this.c = new djx.a();
      this.d = new djx.b(this);
   }

   public ddv(gw $$0, dfe $$1) {
      this(dcs.I, $$0, $$1);
   }

   public djx.d c() {
      return new ddv.a(this.p());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         djx.a.a.parse(new Dynamic(rf.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(qu $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      djx.a.a.encodeStart(rf.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public djx.a gc() {
      return this.c;
   }

   @Override
   public djx.d gd() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public djx.b g() {
      return this.d;
   }

   protected class a implements djx.d {
      public static final int b = 8;
      protected final gw c;
      private final djs a;

      public a(gw $$1) {
         this.c = $$1;
         this.a = new djk($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public djs b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(akn $$0, gw $$1, djo $$2, @Nullable djo.a $$3) {
         return !$$1.equals(this.c) || $$2 != djo.f && $$2 != djo.i ? czj.n(ddv.this.q()) : false;
      }

      @Override
      public void a(akn $$0, gw $$1, djo $$2, @Nullable bil $$3, @Nullable bil $$4, float $$5) {
         dfe $$6 = ddv.this.q();
         if (czj.n($$6)) {
            ddv.this.a(djx.a_($$2));
            int $$7 = djx.a_($$5, this.a());
            if ($$6.b() instanceof czj $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, ddv.this.f());
            }
         }
      }

      @Override
      public void e() {
         ddv.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
