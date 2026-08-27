import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlu extends dmf implements bof {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wg d;
   private cqc e;
   private dlw f = dlw.a;
   private dlw g = dlw.a;

   public dlu(ib $$0, doz $$1) {
      super(dmh.t, $$0, $$1);
      this.e = ((dap)$$1.b()).b();
      this.a(dlw.a);
   }

   public dlu(ib $$0, doz $$1, cqc $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(crj $$0, cqc $$1) {
      this.e = $$1;
      this.a($$0.a());
   }

   @Override
   public wg ad() {
      return (wg)(this.d != null ? this.d : wg.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wg af() {
      return this.d;
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dlw.a)) {
         $$0.a("patterns", ac.a(dlw.b.encodeStart(ua.a, this.f), IllegalStateException::new));
      }

      if (this.d != null) {
         $$0.a("CustomName", wg.a.a(this.d, $$1));
      }
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = wg.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dlw.b.parse(ua.a, $$0.c("patterns")).resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x)).ifPresent(this::a);
      }
   }

   public abf a() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.d($$0);
   }

   public dlw b() {
      return this.g;
   }

   public crj c() {
      crj $$0 = new crj(dbd.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public cqc f() {
      return this.e;
   }

   @Override
   public void a(jl $$0) {
      this.a($$0.a(jp.N, dlw.a));
      this.d = $$0.a(jp.d);
   }

   @Override
   public void a(jl.a $$0) {
      $$0.a(jp.N, this.f);
      $$0.a(jp.d, this.d);
   }

   @Override
   public void a(tm $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }

   private void a(dlw $$0) {
      this.f = $$0;
      this.g = this.f.a(this.e);
   }
}
