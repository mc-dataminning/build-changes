import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dhv extends ddy {
   public static final MapCodec<dhv> a = b(dhv::new);
   public static final drs b = djm.b;
   public static final drs c = djm.c;
   public static final drs d = djm.d;
   public static final drs e = djm.e;
   public static final drs f = djm.f;
   public static final drs g = djm.g;
   private static final Map<it, drs> h = djm.h;

   @Override
   public MapCodec<dhv> a() {
      return a;
   }

   public dhv(dra.d $$0) {
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
   public drb a(cwz $$0) {
      dad $$1 = $$0.q();
      io $$2 = $$0.a();
      return this.n()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(h.get($$1.a(it.c)), $$0.c(b))
         .a(h.get($$1.a(it.d)), $$0.c(d))
         .a(h.get($$1.a(it.f)), $$0.c(c))
         .a(h.get($$1.a(it.e)), $$0.c(e))
         .a(h.get($$1.a(it.b)), $$0.c(f))
         .a(h.get($$1.a(it.a)), $$0.c(g));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a(h.get($$1.b(it.c)), $$0.c(b))
         .a(h.get($$1.b(it.d)), $$0.c(d))
         .a(h.get($$1.b(it.f)), $$0.c(c))
         .a(h.get($$1.b(it.e)), $$0.c(e))
         .a(h.get($$1.b(it.b)), $$0.c(f))
         .a(h.get($$1.b(it.a)), $$0.c(g));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
