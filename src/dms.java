import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dms extends dnd implements bov {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private ws d;
   private cqw e;
   private dmu f = dmu.a;

   public dms(im $$0, dpy $$1) {
      super(dnf.t, $$0, $$1);
      this.e = ((dbm)$$1.b()).b();
   }

   public dms(im $$0, dpy $$1, cqw $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(csd $$0, cqw $$1) {
      this.e = $$1;
      this.a($$0.a());
   }

   @Override
   public ws ad() {
      return (ws)(this.d != null ? this.d : ws.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public ws af() {
      return this.d;
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dmu.a)) {
         $$0.a("patterns", ac.a(dmu.b.encodeStart($$1.a(um.a), this.f), IllegalStateException::new));
      }

      if (this.d != null) {
         $$0.a("CustomName", ws.a.a(this.d, $$1));
      }
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = ws.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dmu.b
            .parse($$1.a(um.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abr a() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.d($$0);
   }

   public dmu b() {
      return this.f;
   }

   public csd c() {
      csd $$0 = new csd(dca.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public cqw f() {
      return this.e;
   }

   @Override
   public void a(jv $$0) {
      this.f = $$0.a(jz.N, dmu.a);
      this.d = $$0.a(jz.d);
   }

   @Override
   public void a(jv.a $$0) {
      $$0.a(jz.N, this.f);
      $$0.a(jz.d, this.d);
   }

   @Override
   public void a(ty $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
