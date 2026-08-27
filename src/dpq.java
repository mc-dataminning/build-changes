import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpq extends dqc implements bqf {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private xe d;
   private csy e;
   private dps f = dps.a;

   public dpq(ir $$0, dtc $$1) {
      super(dqe.u, $$0, $$1);
      this.e = ((dds)$$1.b()).b();
   }

   public dpq(ir $$0, dtc $$1, csy $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(cuh $$0, csy $$1) {
      this.e = $$1;
      this.a($$0.a());
   }

   @Override
   public xe af() {
      return (xe)(this.d != null ? this.d : xe.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public xe ah() {
      return this.d;
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dps.a)) {
         $$0.a("patterns", ad.a(dps.b.encodeStart($$1.a(uy.a), this.f), IllegalStateException::new));
      }

      if (this.d != null) {
         $$0.a("CustomName", xe.a.a(this.d, $$1));
      }
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = xe.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dps.b
            .parse($$1.a(uy.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public ace a() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.d($$0);
   }

   public dps b() {
      return this.f;
   }

   public cuh c() {
      cuh $$0 = new cuh(deg.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public csy f() {
      return this.e;
   }

   @Override
   public void a(ka $$0) {
      this.f = $$0.a(ke.W, dps.a);
      this.d = $$0.a(ke.f);
   }

   @Override
   public void a(ka.a $$0) {
      $$0.a(ke.W, this.f);
      $$0.a(ke.f, this.d);
   }

   @Override
   public void a(uk $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
