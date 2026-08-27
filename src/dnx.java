import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnx extends doi implements bqb {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wx d;
   private csj e;
   private dnz f = dnz.a;

   public dnx(io $$0, drd $$1) {
      super(dok.t, $$0, $$1);
      this.e = ((dcr)$$1.b()).b();
   }

   public dnx(io $$0, drd $$1, csj $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(ctq $$0, csj $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public wx af() {
      return (wx)(this.d != null ? this.d : wx.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wx ah() {
      return this.d;
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dnz.a)) {
         $$0.a("patterns", (va)dnz.b.encodeStart($$1.a(ur.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", wx.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = wx.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dnz.b
            .parse($$1.a(ur.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   public dnz b() {
      return this.f;
   }

   public ctq c() {
      ctq $$0 = new ctq(ddf.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public csj f() {
      return this.e;
   }

   @Override
   protected void a(doi.b $$0) {
      super.a($$0);
      this.f = $$0.a(kb.W, dnz.a);
      this.d = $$0.a(kb.f);
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.W, this.f);
      $$0.a(kb.f, this.d);
   }

   @Override
   public void a(ud $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
