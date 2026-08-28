import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drv extends dsg implements bsb {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xh d;
   private cuu e;
   private drx f = drx.a;

   public drv(jg $$0, dvd $$1) {
      super(dsi.t, $$0, $$1);
      this.e = ((dgp)$$1.b()).b();
   }

   public drv(jg $$0, dvd $$1, cuu $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cvx $$0, cuu $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xh al() {
      return (xh)(this.d != null ? this.d : xh.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xh an() {
      return this.d;
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(drx.a)) {
         $$0.a("patterns", (vg)drx.b.encodeStart($$1.a(ux.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xh.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         drx.b
            .parse($$1.a(ux.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public ack a() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return this.d($$0);
   }

   public drx b() {
      return this.f;
   }

   public cvx c() {
      cvx $$0 = new cvx(dhd.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cuu f() {
      return this.e;
   }

   @Override
   protected void a(dsg.b $$0) {
      super.a($$0);
      this.f = $$0.a(kt.ah, drx.a);
      this.d = $$0.a(kt.g);
   }

   @Override
   protected void a(kp.a $$0) {
      super.a($$0);
      $$0.a(kt.ah, this.f);
      $$0.a(kt.g, this.d);
   }

   @Override
   public void a(uj $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
