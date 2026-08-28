import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duf extends duq implements btd {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xk d;
   private cwd e;
   private duh f = duh.a;

   public duf(jh $$0, dxo $$1) {
      super(dus.u, $$0, $$1);
      this.e = ((diu)$$1.b()).b();
   }

   public duf(jh $$0, dxo $$1, cwd $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cxg $$0, cwd $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xk al() {
      return (xk)(this.d != null ? this.d : xk.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xk an() {
      return this.d;
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(duh.a)) {
         $$0.a("patterns", (vj)duh.b.encodeStart($$1.a(va.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xk.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         duh.b
            .parse($$1.a(va.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acn a() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      return this.d($$0);
   }

   public duh b() {
      return this.f;
   }

   public cxg c() {
      cxg $$0 = new cxg(dji.a(this.e));
      $$0.b(this.q());
      return $$0;
   }

   public cwd f() {
      return this.e;
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      this.f = $$0.a(ku.ai, duh.a);
      this.d = $$0.a(ku.g);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ai, this.f);
      $$0.a(ku.g, this.d);
   }

   @Override
   public void a(um $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
