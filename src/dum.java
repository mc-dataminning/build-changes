import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dum extends dux implements btm {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xv d;
   private cwm e;
   private duo f = duo.a;

   public dum(jh $$0, dxv $$1) {
      super(duz.u, $$0, $$1);
      this.e = ((djd)$$1.b()).b();
   }

   public dum(jh $$0, dxv $$1, cwm $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cxp $$0, cwm $$1) {
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
      if (!this.f.equals(duo.a)) {
         $$0.a("patterns", (vu)duo.b.encodeStart($$1.a(vl.a), this.f).getOrThrow());
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
         duo.b
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

   public duo b() {
      return this.f;
   }

   public cxp c() {
      cxp $$0 = new cxp(djr.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cwm f() {
      return this.e;
   }

   @Override
   protected void a(dux.b $$0) {
      super.a($$0);
      this.f = $$0.a(ku.ai, duo.a);
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
