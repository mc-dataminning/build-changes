import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsg extends dsr implements bsk {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xl d;
   private cvc e;
   private dsi f = dsi.a;

   public dsg(jh $$0, dvo $$1) {
      super(dst.t, $$0, $$1);
      this.e = ((dha)$$1.b()).b();
   }

   public dsg(jh $$0, dvo $$1, cvc $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cwf $$0, cvc $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xl am() {
      return (xl)(this.d != null ? this.d : xl.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xl ao() {
      return this.d;
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dsi.a)) {
         $$0.a("patterns", (vk)dsi.b.encodeStart($$1.a(vb.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xl.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dsi.b
            .parse($$1.a(vb.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public aco a() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.d($$0);
   }

   public dsi b() {
      return this.f;
   }

   public cwf c() {
      cwf $$0 = new cwf(dho.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cvc f() {
      return this.e;
   }

   @Override
   protected void a(dsr.b $$0) {
      super.a($$0);
      this.f = $$0.a(ku.ai, dsi.a);
      this.d = $$0.a(ku.g);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ai, this.f);
      $$0.a(ku.g, this.d);
   }

   @Override
   public void a(un $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
