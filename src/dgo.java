import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dgo extends dfi implements dlz.b<dmg.b>, dmg {
   private static final Logger b = LogUtils.getLogger();
   private dmg.a c;
   private final dmg.b d;
   private final dmg.d e = this.c();
   private int g;

   protected dgo(dfk<?> $$0, hx $$1, dhn $$2) {
      super($$0, $$1, $$2);
      this.c = new dmg.a();
      this.d = new dmg.b(this);
   }

   public dgo(hx $$0, dhn $$1) {
      this(dfk.I, $$0, $$1);
   }

   public dmg.d c() {
      return new dgo.a(this.aC_());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.g = $$0.h("last_vibration_frequency");
      if ($$0.b("listener", 10)) {
         dmg.a.a.parse(new Dynamic(sr.a, $$0.p("listener"))).resultOrPartial(b::error).ifPresent($$0x -> this.c = $$0x);
      }
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("last_vibration_frequency", this.g);
      dmg.a.a.encodeStart(sr.a, this.c).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("listener", $$1));
   }

   @Override
   public dmg.a gh() {
      return this.c;
   }

   @Override
   public dmg.d gi() {
      return this.e;
   }

   public int f() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public dmg.b g() {
      return this.d;
   }

   protected class a implements dmg.d {
      public static final int b = 8;
      protected final hx c;
      private final dmb a;

      public a(hx $$1) {
         this.c = $$1;
         this.a = new dlt($$1);
      }

      @Override
      public int a() {
         return 8;
      }

      @Override
      public dmb b() {
         return this.a;
      }

      @Override
      public boolean d() {
         return true;
      }

      @Override
      public boolean a(ami $$0, hx $$1, dlx $$2, @Nullable dlx.a $$3) {
         return !$$1.equals(this.c) || $$2 != dlx.f && $$2 != dlx.i ? dbx.n(dgo.this.r()) : false;
      }

      @Override
      public void a(ami $$0, hx $$1, dlx $$2, @Nullable bkv $$3, @Nullable bkv $$4, float $$5) {
         dhn $$6 = dgo.this.r();
         if (dbx.n($$6)) {
            dgo.this.a(dmg.a_($$2));
            int $$7 = dmg.a_($$5, this.a());
            if ($$6.b() instanceof dbx $$8) {
               $$8.a($$3, $$0, this.c, $$6, $$7, dgo.this.f());
            }
         }
      }

      @Override
      public void e() {
         dgo.this.e();
      }

      @Override
      public boolean f() {
         return true;
      }
   }
}
