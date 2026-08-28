import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duh extends dus implements btb {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wp d;
   private final cwe e;
   private duj f = duj.a;

   public duh(ji $$0, dxq $$1) {
      this($$0, $$1, ((div)$$1.b()).b());
   }

   public duh(ji $$0, dxq $$1, cwe $$2) {
      super(duu.u, $$0, $$1);
      this.e = $$2;
   }

   @Override
   public wp al() {
      return (wp)(this.d != null ? this.d : wp.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wp an() {
      return this.d;
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      aks<un> $$2 = $$1.a(ue.a);
      if (!this.f.equals(duj.a)) {
         $$0.a("patterns", (un)duj.b.encodeStart($$2, this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", (un)wr.a.encodeStart($$2, this.d).getOrThrow());
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("CustomName")) {
         this.d = a($$0.c("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         duj.b
            .parse($$1.a(ue.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abr a() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.d($$0);
   }

   public duj b() {
      return this.f;
   }

   public cxh c() {
      cxh $$0 = new cxh(djj.a(this.e));
      $$0.b(this.q());
      return $$0;
   }

   public cwe f() {
      return this.e;
   }

   @Override
   protected void a(dus.b $$0) {
      super.a($$0);
      this.f = $$0.a(kv.ak, duj.a);
      this.d = $$0.a(kv.g);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.ak, this.f);
      $$0.a(kv.g, this.d);
   }

   @Override
   public void a(tq $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
