import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgy extends fcc {
   private static final Logger k = LogUtils.getLogger();
   public static final dow a = new dow((long)"test1".hashCode(), true, false);
   protected final fcc b;
   private ewh l;
   private ewh m;
   private ewh n;
   private ewh o;
   protected ewq c;
   private fhd p;

   public fgy(fcc $$0) {
      super(vb.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aP_() {
      this.c = new ewq(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vb.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.p = new fhd(this, this.f, this.g, this.h, 48, this.h - 64, 36, this.c.a(), this.p);
      this.e(this.c);
      this.e(this.p);
      this.m = this.d(ewh.a(efv.a, $$0 -> this.p.e().ifPresent(fhd.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(ewh.a(vb.c("selectWorld.create"), $$0 -> fgs.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(ewh.a(vb.c("selectWorld.edit"), $$0 -> this.p.e().ifPresent(fhd.c::g)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(ewh.a(vb.c("selectWorld.delete"), $$0 -> this.p.e().ifPresent(fhd.c::e)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(ewh.a(vb.c("selectWorld.recreate"), $$0 -> this.p.e().ifPresent(fhd.c::h)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(ewh.a(va.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
      this.c(this.c);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.c.a($$0, $$1, $$2);
   }

   @Override
   public void aF_() {
      this.f.a(this.b);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.c.a($$0, $$1);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.p.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable efv $$0) {
      if ($$0 == null) {
         this.m.b(efv.a);
         this.m.i = false;
         this.n.i = false;
         this.o.i = false;
         this.l.i = false;
      } else {
         this.m.b($$0.t());
         this.m.i = $$0.u();
         this.n.i = $$0.v();
         this.o.i = $$0.w();
         this.l.i = $$0.x();
      }
   }

   @Override
   public void aG_() {
      if (this.p != null) {
         this.p.i().forEach(fhd.a::close);
      }
   }
}
