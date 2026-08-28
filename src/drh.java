import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drh extends drs implements brs {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xd d;
   private cuj e;
   private drj f = drj.a;

   public drh(je $$0, duo $$1) {
      super(dru.t, $$0, $$1);
      this.e = ((dga)$$1.b()).b();
   }

   public drh(je $$0, duo $$1, cuj $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cvp $$0, cuj $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xd aj() {
      return (xd)(this.d != null ? this.d : xd.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xd al() {
      return this.d;
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(drj.a)) {
         $$0.a("patterns", (vc)drj.b.encodeStart($$1.a(ut.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xd.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         drj.b
            .parse($$1.a(ut.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acg a() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.d($$0);
   }

   public drj b() {
      return this.f;
   }

   public cvp c() {
      cvp $$0 = new cvp(dgo.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cuj f() {
      return this.e;
   }

   @Override
   protected void a(drs.b $$0) {
      super.a($$0);
      this.f = $$0.a(kr.ad, drj.a);
      this.d = $$0.a(kr.g);
   }

   @Override
   protected void a(kn.a $$0) {
      super.a($$0);
      $$0.a(kr.ad, this.f);
      $$0.a(kr.g, this.d);
   }

   @Override
   public void a(uf $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
