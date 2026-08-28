import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class duz extends dvl implements btt {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private wv d;
   private final cwv e;
   private dvb f = dvb.a;

   public duz(jj $$0, dym $$1) {
      this($$0, $$1, ((djl)$$1.b()).b());
   }

   public duz(jj $$0, dym $$1, cwv $$2) {
      super(dvn.u, $$0, $$1);
      this.e = $$2;
   }

   @Override
   public wv al() {
      return (wv)(this.d != null ? this.d : wv.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wv an() {
      return this.d;
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      alb<ut> $$2 = $$1.a(uk.a);
      if (!this.f.equals(dvb.a)) {
         $$0.a("patterns", (ut)dvb.b.encodeStart($$2, this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", (ut)wx.a.encodeStart($$2, this.d).getOrThrow());
      }
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("CustomName")) {
         this.d = a($$0.c("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dvb.b
            .parse($$1.a(uk.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.d($$0);
   }

   public dvb b() {
      return this.f;
   }

   public cxy c() {
      cxy $$0 = new cxy(djz.a(this.e));
      $$0.b(this.q());
      return $$0;
   }

   public cwv f() {
      return this.e;
   }

   @Override
   protected void a(kr $$0) {
      super.a($$0);
      this.f = $$0.a(kx.ak, dvb.a);
      this.d = $$0.a(kx.g);
   }

   @Override
   protected void a(kt.a $$0) {
      super.a($$0);
      $$0.a(kx.ak, this.f);
      $$0.a(kx.g, this.d);
   }

   @Override
   public void a(tw $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
