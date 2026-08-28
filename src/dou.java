import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dou extends dku {
   public static final MapCodec<dou> a = b(dou::new);
   public static final dzd b = dqm.b;
   public static final dzd c = dqm.c;
   public static final dzd d = dqm.d;
   public static final dzd e = dqm.e;
   public static final dzd f = dqm.f;
   public static final dzd g = dqm.g;
   private static final Map<jo, dzd> h = dqm.h;

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   public dou(dyl.d $$0) {
      super($$0);
      this.l(
         this.B
            .b()
            .b(b, Boolean.valueOf(true))
            .b(c, Boolean.valueOf(true))
            .b(d, Boolean.valueOf(true))
            .b(e, Boolean.valueOf(true))
            .b(f, Boolean.valueOf(true))
            .b(g, Boolean.valueOf(true))
      );
   }

   @Override
   public dym a(dbn $$0) {
      dgv $$1 = $$0.q();
      jj $$2 = $$0.a();
      return this.m()
         .b(g, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .b(f, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .b(b, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .b(c, Boolean.valueOf(!$$1.a_($$2.i()).a(this)))
         .b(d, Boolean.valueOf(!$$1.a_($$2.g()).a(this)))
         .b(e, Boolean.valueOf(!$$1.a_($$2.h()).a(this)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$6.a(this) ? $$0.b(h.get($$4), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(h.get($$1.a(jo.c)), $$0.c(b))
         .b(h.get($$1.a(jo.d)), $$0.c(d))
         .b(h.get($$1.a(jo.f)), $$0.c(c))
         .b(h.get($$1.a(jo.e)), $$0.c(e))
         .b(h.get($$1.a(jo.b)), $$0.c(f))
         .b(h.get($$1.a(jo.a)), $$0.c(g));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.b(h.get($$1.b(jo.c)), $$0.c(b))
         .b(h.get($$1.b(jo.d)), $$0.c(d))
         .b(h.get($$1.b(jo.f)), $$0.c(c))
         .b(h.get($$1.b(jo.e)), $$0.c(e))
         .b(h.get($$1.b(jo.b)), $$0.c(f))
         .b(h.get($$1.b(jo.a)), $$0.c(g));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
