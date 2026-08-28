import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dul extends duw implements btl {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xv d;
   private cwl e;
   private dun f = dun.a;

   public dul(jh $$0, dxu $$1) {
      super(duy.u, $$0, $$1);
      this.e = ((djc)$$1.b()).b();
   }

   public dul(jh $$0, dxu $$1, cwl $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cxo $$0, cwl $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xv al() {
      return (xv)(this.d != null ? this.d : xv.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xv an() {
      return this.d;
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dun.a)) {
         $$0.a("patterns", (vu)dun.b.encodeStart($$1.a(vl.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xv.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dun.b
            .parse($$1.a(vl.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acy a() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.d($$0);
   }

   public dun b() {
      return this.f;
   }

   public cxo c() {
      cxo $$0 = new cxo(djq.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cwl f() {
      return this.e;
   }

   @Override
   protected void a(duw.b $$0) {
      super.a($$0);
      this.f = $$0.a(ku.ai, dun.a);
      this.d = $$0.a(ku.g);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ai, this.f);
      $$0.a(ku.g, this.d);
   }

   @Override
   public void a(ux $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
