import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class aqa extends avd {
   private static final Logger h = LogUtils.getLogger();

   public aqa(aqb $$0, jp<alo> $$1, eqb $$2) {
      super($$0, $$1, $$2, $$0.a().H);
      aqc $$3 = $$0.a();
      this.a($$3.F);
      this.b($$3.G);
      super.a($$3.W.get());
      this.z();
      this.x();
      this.y();
      this.w();
      this.A();
      this.C();
      this.B();
      if (!this.i().b().exists()) {
         this.D();
      }
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      this.b().i($$0);
   }

   @Override
   public void a(GameProfile $$0) {
      super.a($$0);
      this.B();
   }

   @Override
   public void b(GameProfile $$0) {
      super.b($$0);
      this.B();
   }

   @Override
   public void a() {
      this.C();
   }

   private void w() {
      try {
         this.g().e();
      } catch (IOException var2) {
         h.warn("Failed to save ip banlist: ", var2);
      }
   }

   private void x() {
      try {
         this.f().e();
      } catch (IOException var2) {
         h.warn("Failed to save user banlist: ", var2);
      }
   }

   private void y() {
      try {
         this.g().f();
      } catch (IOException var2) {
         h.warn("Failed to load ip banlist: ", var2);
      }
   }

   private void z() {
      try {
         this.f().f();
      } catch (IOException var2) {
         h.warn("Failed to load user banlist: ", var2);
      }
   }

   private void A() {
      try {
         this.k().f();
      } catch (Exception var2) {
         h.warn("Failed to load operators list: ", var2);
      }
   }

   private void B() {
      try {
         this.k().e();
      } catch (Exception var2) {
         h.warn("Failed to save operators list: ", var2);
      }
   }

   private void C() {
      try {
         this.i().f();
      } catch (Exception var2) {
         h.warn("Failed to load white-list: ", var2);
      }
   }

   private void D() {
      try {
         this.i().e();
      } catch (Exception var2) {
         h.warn("Failed to save white-list: ", var2);
      }
   }

   @Override
   public boolean c(GameProfile $$0) {
      return !this.o() || this.f($$0) || this.i().a($$0);
   }

   public aqb b() {
      return (aqb)super.c();
   }

   @Override
   public boolean d(GameProfile $$0) {
      return this.k().a($$0);
   }
}
