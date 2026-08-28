import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drk extends drv implements brv {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xe d;
   private cum e;
   private drm f = drm.a;

   public drk(jf $$0, dus $$1) {
      super(drx.t, $$0, $$1);
      this.e = ((dgd)$$1.b()).b();
   }

   public drk(jf $$0, dus $$1, cum $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cvs $$0, cum $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xe aj() {
      return (xe)(this.d != null ? this.d : xe.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xe al() {
      return this.d;
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(drm.a)) {
         $$0.a("patterns", (vd)drm.b.encodeStart($$1.a(uu.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xe.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         drm.b
            .parse($$1.a(uu.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public ach a() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return this.d($$0);
   }

   public drm b() {
      return this.f;
   }

   public cvs c() {
      cvs $$0 = new cvs(dgr.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cum f() {
      return this.e;
   }

   @Override
   protected void a(drv.b $$0) {
      super.a($$0);
      this.f = $$0.a(ks.ad, drm.a);
      this.d = $$0.a(ks.g);
   }

   @Override
   protected void a(ko.a $$0) {
      super.a($$0);
      $$0.a(ks.ad, this.f);
      $$0.a(ks.g, this.d);
   }

   @Override
   public void a(ug $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
