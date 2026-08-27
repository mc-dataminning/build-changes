import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dmd extends dmo implements bok {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wi d;
   private cql e;
   private dmf f = dmf.a;

   public dmd(id $$0, dpi $$1) {
      super(dmq.t, $$0, $$1);
      this.e = ((day)$$1.b()).b();
   }

   public dmd(id $$0, dpi $$1, cql $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(crs $$0, cql $$1) {
      this.e = $$1;
      this.a($$0.a());
   }

   @Override
   public wi ad() {
      return (wi)(this.d != null ? this.d : wi.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wi af() {
      return this.d;
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dmf.a)) {
         $$0.a("patterns", ac.a(dmf.b.encodeStart($$1.a(uc.a), this.f), IllegalStateException::new));
      }

      if (this.d != null) {
         $$0.a("CustomName", wi.a.a(this.d, $$1));
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = wi.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dmf.b
            .parse($$1.a(uc.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abh a() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   public dmf b() {
      return this.f;
   }

   public crs c() {
      crs $$0 = new crs(dbm.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public cql f() {
      return this.e;
   }

   @Override
   public void a(jn $$0) {
      this.f = $$0.a(jr.N, dmf.a);
      this.d = $$0.a(jr.d);
   }

   @Override
   public void a(jn.a $$0) {
      $$0.a(jr.N, this.f);
      $$0.a(jr.d, this.d);
   }

   @Override
   public void a(to $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
