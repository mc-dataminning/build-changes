import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpe extends dpp implements bql {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wu d;
   private csv e;
   private dpg f = dpg.a;

   public dpe(ja $$0, dsk $$1) {
      super(dpr.t, $$0, $$1);
      this.e = ((ddy)$$1.b()).b();
   }

   public dpe(ja $$0, dsk $$1, csv $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuc $$0, csv $$1) {
      this.e = $$1;
      this.a($$0);
   }

   @Override
   public wu ag() {
      return (wu)(this.d != null ? this.d : wu.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wu ai() {
      return this.d;
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dpg.a)) {
         $$0.a("patterns", (uu)dpg.b.encodeStart($$1.a(ul.a), this.f).getOrThrow());
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
         dpg.b
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

   public dpg b() {
      return this.f;
   }

   public cuc c() {
      cuc $$0 = new cuc(dem.a(this.e));
      $$0.b(this.s());
      return $$0;
   }

   public csv f() {
      return this.e;
   }

   @Override
   protected void a(dpp.b $$0) {
      super.a($$0);
      this.f = $$0.a(kn.X, dpg.a);
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
