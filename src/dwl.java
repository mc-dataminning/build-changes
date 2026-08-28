import javax.annotation.Nullable;

public class dwl extends dwx implements bue {
   public static final int a = 6;
   private static final String b = "patterns";
   @Nullable
   private wy c;
   private final cxw d;
   private dwn e = dwn.a;

   public dwl(iu $$0, dzz $$1) {
      this($$0, $$1, ((dkr)$$1.b()).b());
   }

   public dwl(iu $$0, dzz $$1, cxw $$2) {
      super(dwz.u, $$0, $$1);
      this.d = $$2;
   }

   @Override
   public wy al() {
      return (wy)(this.c != null ? this.c : wy.c("block.minecraft.banner"));
   }

   @Nullable
   @Override
   public wy an() {
      return this.c;
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      super.b($$0, $$1);
      ale<uw> $$2 = $$1.a(un.a);
      if (!this.e.equals(dwn.a)) {
         $$0.a("patterns", dwn.b, $$2, this.e);
      }

      if (this.c != null) {
         $$0.a("CustomName", xa.a, $$2, this.c);
      }
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("CustomName")) {
         this.c = a($$0.c("CustomName"), $$1);
      }

      ale<uw> $$2 = $$1.a(un.a);
      this.e = $$0.<dwn>a("patterns", dwn.b, $$2).orElse(dwn.a);
   }

   public aca a() {
      return aca.a(this);
   }

   @Override
   public tz a(jg.a $$0) {
      return this.d($$0);
   }

   public dwn b() {
      return this.e;
   }

   public cyy c() {
      cyy $$0 = new cyy(dlf.a(this.d));
      $$0.b(this.q());
      return $$0;
   }

   public cxw f() {
      return this.d;
   }

   @Override
   protected void a(ke $$0) {
      super.a($$0);
      this.e = $$0.a(kj.am, dwn.a);
      this.c = $$0.a(kj.g);
   }

   @Override
   protected void a(kg.a $$0) {
      super.a($$0);
      $$0.a(kj.am, this.e);
      $$0.a(kj.g, this.c);
   }

   @Override
   public void a(tz $$0) {
      $$0.r("patterns");
      $$0.r("CustomName");
   }
}
