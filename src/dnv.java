import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnv extends dog implements bpz {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wx d;
   private csh e;
   private dnx f = dnx.a;

   public dnv(io $$0, drb $$1) {
      super(doi.t, $$0, $$1);
      this.e = ((dcp)$$1.b()).b();
   }

   public dnv(io $$0, drb $$1, csh $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cto $$0, csh $$1) {
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
      if (!this.f.equals(dnx.a)) {
         $$0.a("patterns", (va)dnx.b.encodeStart($$1.a(ur.a), this.f).getOrThrow());
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
         dnx.b
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

   public dnx b() {
      return this.f;
   }

   public cto c() {
      cto $$0 = new cto(ddd.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public csh f() {
      return this.e;
   }

   @Override
   protected void a(dog.b $$0) {
      super.a($$0);
      this.f = $$0.a(kb.W, dnx.a);
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
