import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dau extends cwy {
   public static final MapCodec<dau> a = b(dau::new);
   public static final dkg b = dcl.b;
   public static final dkg c = dcl.c;
   public static final dkg d = dcl.d;
   public static final dkg e = dcl.e;
   public static final dkg f = dcl.f;
   public static final dkg g = dcl.g;
   private static final Map<ic, dkg> h = dcl.h;

   @Override
   public MapCodec<dau> a() {
      return a;
   }

   public dau(djo.d $$0) {
      super($$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(true))
            .a(c, Boolean.valueOf(true))
            .a(d, Boolean.valueOf(true))
            .a(e, Boolean.valueOf(true))
            .a(f, Boolean.valueOf(true))
            .a(g, Boolean.valueOf(true))
      );
   }

   @Override
   public djp a(cpp $$0) {
      ctd $$1 = $$0.q();
      hx $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(h.get($$1.a(ic.c)), $$0.c(b))
         .a(h.get($$1.a(ic.d)), $$0.c(d))
         .a(h.get($$1.a(ic.f)), $$0.c(c))
         .a(h.get($$1.a(ic.e)), $$0.c(e))
         .a(h.get($$1.a(ic.b)), $$0.c(f))
         .a(h.get($$1.a(ic.a)), $$0.c(g));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a(h.get($$1.b(ic.c)), $$0.c(b))
         .a(h.get($$1.b(ic.d)), $$0.c(d))
         .a(h.get($$1.b(ic.f)), $$0.c(c))
         .a(h.get($$1.b(ic.e)), $$0.c(e))
         .a(h.get($$1.b(ic.b)), $$0.c(f))
         .a(h.get($$1.b(ic.a)), $$0.c(g));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
