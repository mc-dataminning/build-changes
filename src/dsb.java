import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsb extends dsm implements bsg {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xi d;
   private cuy e;
   private dsd f = dsd.a;

   public dsb(jh $$0, dvj $$1) {
      super(dso.t, $$0, $$1);
      this.e = ((dgv)$$1.b()).b();
   }

   public dsb(jh $$0, dvj $$1, cuy $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cwb $$0, cuy $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public xi am() {
      return (xi)(this.d != null ? this.d : xi.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xi ao() {
      return this.d;
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dsd.a)) {
         $$0.a("patterns", (vh)dsd.b.encodeStart($$1.a(uy.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", xi.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dsd.b
            .parse($$1.a(uy.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public acl a() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      return this.d($$0);
   }

   public dsd b() {
      return this.f;
   }

   public cwb c() {
      cwb $$0 = new cwb(dhj.a(this.e));
      $$0.b(this.r());
      return $$0;
   }

   public cuy f() {
      return this.e;
   }

   @Override
   protected void a(dsm.b $$0) {
      super.a($$0);
      this.f = $$0.a(ku.ai, dsd.a);
      this.d = $$0.a(ku.g);
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.ai, this.f);
      $$0.a(ku.g, this.d);
   }

   @Override
   public void a(uk $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
