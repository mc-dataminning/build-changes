import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dyr extends dwx {
   private static final Logger a = LogUtils.getLogger();
   private ebk b;
   private String c = "";
   private boolean d;
   private boolean e;

   public dyr(iu $$0, dzz $$1) {
      super(dwz.T, $$0, $$1);
      this.b = $$1.c(dur.b);
   }

   @Override
   public void b(tz $$0, jg.a $$1) {
      $$0.a("mode", this.b.c());
      $$0.a("message", this.c);
      $$0.a("powered", this.d);
   }

   @Override
   public void a(tz $$0, jg.a $$1) {
      String $$2 = $$0.l("mode");
      ebk $$3 = ebk.e.a($$2);
      this.b = $$3 != null ? $$3 : ebk.c;
      this.c = $$0.l("message");
      this.d = $$0.q("powered");
   }

   private void u() {
      if (this.n != null) {
         iu $$0 = this.aw_();
         dzz $$1 = this.n.a_($$0);
         if ($$1.a(dmc.pF)) {
            this.n.a($$0, $$1.b(dur.b, this.b), 2);
         }
      }
   }

   @Nullable
   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.e($$0);
   }

   public boolean c() {
      return this.d;
   }

   public void a(boolean $$0) {
      this.d = $$0;
   }

   public ebk d() {
      return this.b;
   }

   public void a(ebk $$0) {
      this.b = $$0;
      this.u();
   }

   private dma v() {
      return this.m().b();
   }

   public void f() {
      this.e = false;
      if (this.b == ebk.a && this.n != null) {
         this.a(false);
         this.n.a(this.aw_(), this.v());
      }
   }

   public void j() {
      if (this.b == ebk.a && this.n != null) {
         this.a(true);
         iu $$0 = this.aw_();
         this.n.a($$0, this.v());
         this.n.U().b($$0, this.v());
         this.k();
      } else {
         if (this.b == ebk.b) {
            this.k();
         }

         this.e = true;
      }
   }

   public void k() {
      if (!this.c.isBlank()) {
         a.info("Test {} (at {}): {}", new Object[]{this.b.c(), this.aw_(), this.c});
      }
   }

   public boolean s() {
      return this.e;
   }

   public String t() {
      return this.c;
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
