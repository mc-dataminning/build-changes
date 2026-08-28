import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpf extends dpq implements bqm {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wu d;
   private csw e;
   private dph f = dph.a;

   public dpf(ja $$0, dsl $$1) {
      super(dps.t, $$0, $$1);
      this.e = ((ddz)$$1.b()).b();
   }

   public dpf(ja $$0, dsl $$1, csw $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cud $$0, csw $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public wu ah() {
      return (wu)(this.d != null ? this.d : wu.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wu aj() {
      return this.d;
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dph.a)) {
         $$0.a("patterns", (uu)dph.b.encodeStart($$1.a(ul.a), this.f).getOrThrow());
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
         dph.b
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

   public dph b() {
      return this.f;
   }

   public cud c() {
      cud $$0 = new cud(den.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public csw f() {
      return this.e;
   }

   @Override
   protected void a(dpq.b $$0) {
      super.a($$0);
      this.f = $$0.a(kn.X, dph.a);
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
