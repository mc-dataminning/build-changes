import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpw extends dqh implements bqw {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wz d;
   private cti e;
   private dpy f = dpy.a;

   public dpw(jd $$0, dtc $$1) {
      super(dqj.t, $$0, $$1);
      this.e = ((dep)$$1.b()).b();
   }

   public dpw(jd $$0, dtc $$1, cti $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuq $$0, cti $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public wz ah() {
      return (wz)(this.d != null ? this.d : wz.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wz aj() {
      return this.d;
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dpy.a)) {
         $$0.a("patterns", (uy)dpy.b.encodeStart($$1.a(up.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", wz.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dpy.b
            .parse($$1.a(up.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acb a() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return this.d($$0);
   }

   public dpy b() {
      return this.f;
   }

   public cuq c() {
      cuq $$0 = new cuq(dfd.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public cti f() {
      return this.e;
   }

   @Override
   protected void a(dqh.b $$0) {
      super.a($$0);
      this.f = $$0.a(kq.Y, dpy.a);
      this.d = $$0.a(kq.g);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.Y, this.f);
      $$0.a(kq.g, this.d);
   }

   @Override
   public void a(ub $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
