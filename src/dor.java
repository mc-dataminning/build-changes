import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dor extends dpc implements bqu {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xl d;
   private ctd e;
   private dot f = dot.a;

   public dor(iz $$0, drx $$1) {
      super(dpe.t, $$0, $$1);
      this.e = ((ddl)$$1.b()).b();
   }

   public dor(iz $$0, drx $$1, ctd $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuk $$0, ctd $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xl af() {
      return (xl)(this.d != null ? this.d : xl.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xl ah() {
      return this.d;
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dot.a)) {
         $$0.a("patterns", (vo)dot.b.encodeStart($$1.a(vf.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xl.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = xl.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dot.b
            .parse($$1.a(vf.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.e($$0);
   }

   public dot b() {
      return this.f;
   }

   public cuk c() {
      cuk $$0 = new cuk(ddz.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public ctd f() {
      return this.e;
   }

   @Override
   protected void a(dpc.b $$0) {
      super.a($$0);
      this.f = $$0.a(km.W, dot.a);
      this.d = $$0.a(km.f);
   }

   @Override
   protected void a(ki.a $$0) {
      super.a($$0);
      $$0.a(km.W, this.f);
      $$0.a(km.f, this.d);
   }

   @Override
   public void a(ur $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
