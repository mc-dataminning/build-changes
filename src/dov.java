import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dov extends dpg implements bqy {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xo d;
   private cth e;
   private dox f = dox.a;

   public dov(iz $$0, dsb $$1) {
      super(dpi.t, $$0, $$1);
      this.e = ((ddp)$$1.b()).b();
   }

   public dov(iz $$0, dsb $$1, cth $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuo $$0, cth $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xo af() {
      return (xo)(this.d != null ? this.d : xo.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xo ah() {
      return this.d;
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dox.a)) {
         $$0.a("patterns", (vo)dox.b.encodeStart($$1.a(vf.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xo.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = xo.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dox.b
            .parse($$1.a(vf.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public aco a() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.d($$0);
   }

   public dox b() {
      return this.f;
   }

   public cuo c() {
      cuo $$0 = new cuo(ded.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public cth f() {
      return this.e;
   }

   @Override
   protected void a(dpg.b $$0) {
      super.a($$0);
      this.f = $$0.a(km.X, dox.a);
      this.d = $$0.a(km.g);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.X, this.f);
      $$0.a(km.g, this.d);
   }

   @Override
   public void a(ur $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
