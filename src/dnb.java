import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnb extends dnm implements bpr {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wu d;
   private crs e;
   private dnd f = dnd.a;

   public dnb(in $$0, dqh $$1) {
      super(dno.t, $$0, $$1);
      this.e = ((dbv)$$1.b()).b();
   }

   public dnb(in $$0, dqh $$1, crs $$2) {
      this($$0, $$1);
      this.e = $$2;
   }

   public void a(csz $$0, crs $$1) {
      this.e = $$1;
      this.a($$0.a());
   }

   @Override
   public wu ad() {
      return (wu)(this.d != null ? this.d : wu.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wu af() {
      return this.d;
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      if (!this.f.equals(dnd.a)) {
         $$0.a("patterns", ac.a(dnd.b.encodeStart($$1.a(uo.a), this.f), IllegalStateException::new));
      }

      if (this.d != null) {
         $$0.a("CustomName", wu.a.a(this.d, $$1));
      }
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("CustomName", 8)) {
         this.d = wu.a.a($$0.l("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dnd.b
            .parse($$1.a(uo.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abt a() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return this.d($$0);
   }

   public dnd b() {
      return this.f;
   }

   public csz c() {
      csz $$0 = new csz(dcj.a(this.e));
      $$0.a(this.s());
      return $$0;
   }

   public crs f() {
      return this.e;
   }

   @Override
   public void a(jw $$0) {
      this.f = $$0.a(ka.U, dnd.a);
      this.d = $$0.a(ka.f);
   }

   @Override
   public void a(jw.a $$0) {
      $$0.a(ka.U, this.f);
      $$0.a(ka.f, this.d);
   }

   @Override
   public void a(ua $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
