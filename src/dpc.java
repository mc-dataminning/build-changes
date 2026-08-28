import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpc extends dpn implements bqi {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wu d;
   private cst e;
   private dpe f = dpe.a;

   public dpc(ja $$0, dsh $$1) {
      super(dpp.t, $$0, $$1);
      this.e = ((ddw)$$1.b()).b();
   }

   public dpc(ja $$0, dsh $$1, cst $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cua $$0, cst $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public wu af() {
      return (wu)(this.d != null ? this.d : wu.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wu ah() {
      return this.d;
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dpe.a)) {
         $$0.a("patterns", (uu)dpe.b.encodeStart($$1.a(ul.a), this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", wu.a.a(this.d, $$1));
      }
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dpe.b
            .parse($$1.a(ul.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abu a() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.d($$0);
   }

   public dpe b() {
      return this.f;
   }

   public cua c() {
      cua $$0 = new cua(dek.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public cst f() {
      return this.e;
   }

   @Override
   protected void a(dpn.b $$0) {
      super.a($$0);
      this.f = $$0.a(kn.X, dpe.a);
      this.d = $$0.a(kn.g);
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.X, this.f);
      $$0.a(kn.g, this.d);
   }

   @Override
   public void a(tx $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
