import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpu extends dqf implements bqv {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wy d;
   private ctg e;
   private dpw f = dpw.a;

   public dpu(jd $$0, dta $$1) {
      super(dqh.t, $$0, $$1);
      this.e = ((den)$$1.b()).b();
   }

   public dpu(jd $$0, dta $$1, ctg $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuo $$0, ctg $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public wy ah() {
      return (wy)(this.d != null ? this.d : wy.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wy aj() {
      return this.d;
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dpw.a)) {
         $$0.a("patterns", (ux)dpw.b.encodeStart($$1.a(uo.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", wy.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dpw.b
            .parse($$1.a(uo.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return this.d($$0);
   }

   public dpw b() {
      return this.f;
   }

   public cuo c() {
      cuo $$0 = new cuo(dfb.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public ctg f() {
      return this.e;
   }

   @Override
   protected void a(dqf.b $$0) {
      super.a($$0);
      this.f = $$0.a(kq.Y, dpw.a);
      this.d = $$0.a(kq.g);
   }

   @Override
   protected void a(km.a $$0) {
      super.a($$0);
      $$0.a(kq.Y, this.f);
      $$0.a(kq.g, this.d);
   }

   @Override
   public void a(ua $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
