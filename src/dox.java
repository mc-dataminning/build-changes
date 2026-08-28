import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dox extends dpi implements bra {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xp d;
   private ctj e;
   private doz f = doz.a;

   public dox(iz $$0, dsd $$1) {
      super(dpk.t, $$0, $$1);
      this.e = ((ddr)$$1.b()).b();
   }

   public dox(iz $$0, dsd $$1, ctj $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuq $$0, ctj $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xp af() {
      return (xp)(this.d != null ? this.d : xp.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xp ah() {
      return this.d;
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(doz.a)) {
         $$0.a("patterns", (vp)doz.b.encodeStart($$1.a(vg.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xp.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = xp.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         doz.b
            .parse($$1.a(vg.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acp a() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.d($$0);
   }

   public doz b() {
      return this.f;
   }

   public cuq c() {
      cuq $$0 = new cuq(def.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public ctj f() {
      return this.e;
   }

   @Override
   protected void a(dpi.b $$0) {
      super.a($$0);
      this.f = $$0.a(km.X, doz.a);
      this.d = $$0.a(km.g);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.X, this.f);
      $$0.a(km.g, this.d);
   }

   @Override
   public void a(us $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
