import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dtm extends dtx implements bsl {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wo d;
   private final cvk e;
   private dto f = dto.a;

   public dtm(ji $$0, dwv $$1) {
      this($$0, $$1, ((dib)$$1.b()).b());
   }

   public dtm(ji $$0, dwv $$1, cvk $$2) {
      super(dtz.u, $$0, $$1);
      this.e = $$2;
   }

   @Override
   public wo al() {
      return (wo)(this.d != null ? this.d : wo.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wo an() {
      return this.d;
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dto.a)) {
         $$0.a("patterns", (un)dto.b.encodeStart($$1.a(ue.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", wo.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dto.b
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

   public dto b() {
      return this.f;
   }

   public cwn c() {
      cwn $$0 = new cwn(dip.a(this.e));
      $$0.b(this.q());
      return $$0;
   }

   public cvk f() {
      return this.e;
   }

   @Override
   protected void a(dtx.b $$0) {
      super.a($$0);
      this.f = $$0.a(kv.ai, dto.a);
      this.d = $$0.a(kv.g);
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.ai, this.f);
      $$0.a(kv.g, this.d);
   }

   @Override
   public void a(tq $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
