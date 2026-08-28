import com.mojang.serialization.MapCodec;

public class dqy extends dmr implements dpl, dqd {
   public static final MapCodec<dqy> a = b(dqy::new);
   public static final ebr<jd> b = ebj.W;

   @Override
   public MapCodec<dqy> a() {
      return a;
   }

   protected dqy(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jd.k));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.b(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public eat a(ddg $$0) {
      jb $$1 = $$0.k();
      jb $$2;
      if ($$1.o() == jb.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = jb.b;
      }

      return this.m().b(b, jd.a($$1, $$2));
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyv($$0, $$1);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      dxr $$5 = $$1.c_($$2);
      if ($$5 instanceof dyv && $$3.gF()) {
         $$3.a((dyv)$$5);
         return bug.a;
      } else {
         return bug.e;
      }
   }

   public static boolean a(evp.a $$0, evp.a $$1) {
      jb $$2 = o($$0.a().b());
      jb $$3 = o($$1.a().b());
      jb $$4 = p($$0.a().b());
      jb $$5 = p($$1.a().b());
      dyv.a $$6 = $$0.b();
      boolean $$7 = $$6 == dyv.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.e().equals($$1.c());
   }

   public static jb o(eat $$0) {
      return $$0.c(b).a();
   }

   public static jb p(eat $$0) {
      return $$0.c(b).b();
   }
}
