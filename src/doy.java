import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doy extends dpj implements brb {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xp d;
   private ctk e;
   private dpa f = dpa.a;

   public doy(iz $$0, dse $$1) {
      super(dpl.t, $$0, $$1);
      this.e = ((dds)$$1.b()).b();
   }

   public doy(iz $$0, dse $$1, ctk $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cur $$0, ctk $$1) {
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
      if (!this.f.equals(dpa.a)) {
         $$0.a("patterns", (vp)dpa.b.encodeStart($$1.a(vg.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xp.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dpa.b
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

   public dpa b() {
      return this.f;
   }

   public cur c() {
      cur $$0 = new cur(deg.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public ctk f() {
      return this.e;
   }

   @Override
   protected void a(dpj.b $$0) {
      super.a($$0);
      this.f = $$0.a(km.X, dpa.a);
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
