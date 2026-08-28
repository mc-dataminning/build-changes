import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsn extends dsy implements bsn {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xj d;
   private cvj e;
   private dsp f = dsp.a;

   public dsn(jh $$0, dvv $$1) {
      super(dta.t, $$0, $$1);
      this.e = ((dhh)$$1.b()).b();
   }

   public dsn(jh $$0, dvv $$1, cvj $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cwm $$0, cvj $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xj al() {
      return (xj)(this.d != null ? this.d : xj.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xj an() {
      return this.d;
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dsp.a)) {
         $$0.a("patterns", (vi)dsp.b.encodeStart($$1.a(uz.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xj.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dsp.b
            .parse($$1.a(uz.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acm a() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
      return this.d($$0);
   }

   public dsp b() {
      return this.f;
   }

   public cwm c() {
      cwm $$0 = new cwm(dhv.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cvj f() {
      return this.e;
   }

   @Override
   protected void a(dsy.b $$0) {
      super.a($$0);
      this.f = $$0.a(ku.ai, dsp.a);
      this.d = $$0.a(ku.g);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ai, this.f);
      $$0.a(ku.g, this.d);
   }

   @Override
   public void a(ul $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
