import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcp extends exz {
   private static final Logger k = LogUtils.getLogger();
   public static final dlh a = new dlh((long)"test1".hashCode(), true, false);
   protected final exz b;
   private esh l;
   private esh m;
   private esh n;
   private esh o;
   protected esq c;
   private fcu p;

   public fcp(exz $$0) {
      super(tf.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aE_() {
      this.c = new esq(this.i, this.g / 2 - 100, 22, 200, 20, this.c, tf.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.p = new fcu(this, this.f, this.g, this.h, 48, this.h - 64, 36, this.c.a(), this.p);
      this.e(this.c);
      this.e(this.p);
      this.m = this.d(esh.a(tf.c("selectWorld.select"), $$0 -> this.p.d().ifPresent(fcu.c::d)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(esh.a(tf.c("selectWorld.create"), $$0 -> fcj.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(esh.a(tf.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fcu.c::g)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(esh.a(tf.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fcu.c::e)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(esh.a(tf.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fcu.c::h)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(esh.a(te.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(false, false);
      this.c(this.c);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.c.a($$0, $$1, $$2);
   }

   @Override
   public void au_() {
      this.f.a(this.b);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.c.a($$0, $$1);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.p.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(boolean $$0, boolean $$1) {
      this.m.i = $$0;
      this.n.i = $$0;
      this.o.i = $$0;
      this.l.i = $$1;
   }

   @Override
   public void h() {
      if (this.p != null) {
         this.p.i().forEach(fcu.a::close);
      }
   }
}
