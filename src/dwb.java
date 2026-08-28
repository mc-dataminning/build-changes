import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dwb extends dwn implements bub {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 6;
   private static final String c = "patterns";
   @Nullable
   private ww d;
   private final cxq e;
   private dwd f = dwd.a;

   public dwb(iu $$0, dzo $$1) {
      this($$0, $$1, ((dkl)$$1.b()).b());
   }

   public dwb(iu $$0, dzo $$1, cxq $$2) {
      super(dwp.u, $$0, $$1);
      this.e = $$2;
   }

   @Override
   public ww al() {
      return (ww)(this.d != null ? this.d : ww.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public ww an() {
      return this.d;
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      alc<uu> $$2 = $$1.a(ul.a);
      if (!this.f.equals(dwd.a)) {
         $$0.a("patterns", (uu)dwd.b.encodeStart($$2, this.f).getOrThrow());
      }

      if (this.d != null) {
         $$0.a("CustomName", (uu)wy.a.encodeStart($$2, this.d).getOrThrow());
      }
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("CustomName")) {
         this.d = a($$0.c("CustomName"), $$1);
      }

      if ($$0.e("patterns")) {
         dwd.b
            .parse($$1.a(ul.a), $$0.c("patterns"))
            .resultOrPartial($$0x -> b.error("Failed to parse banner patterns: '{}'", $$0x))
            .ifPresent($$0x -> this.f = $$0x);
      }
   }

   public aby a() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      return this.d($$0);
   }

   public dwd b() {
      return this.f;
   }

   public cys c() {
      cys $$0 = new cys(dkz.a(this.e));
      $$0.b(this.q());
      return $$0;
   }

   public cxq f() {
      return this.e;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.f = $$0.a(kj.am, dwd.a);
      this.d = $$0.a(kj.g);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.am, this.f);
      $$0.a(kj.g, this.d);
   }

   @Override
   public void a(tx $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
