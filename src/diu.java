import com.mojang.serialization.MapCodec;
import java.util.Map;

public class diu extends dex {
   public static final MapCodec<diu> a = b(diu::new);
   public static final dsr b = dkl.b;
   public static final dsr c = dkl.c;
   public static final dsr d = dkl.d;
   public static final dsr e = dkl.e;
   public static final dsr f = dkl.f;
   public static final dsr g = dkl.g;
   private static final Map<je, dsr> h = dkl.h;

   @Override
   public MapCodec<diu> a() {
      return a;
   }

   public diu(drz.d $$0) {
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
   public dsa a(cxy $$0) {
      dbc $$1 = $$0.q();
      iz $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return $$0.a(h.get($$1.a(je.c)), $$0.c(b))
         .a(h.get($$1.a(je.d)), $$0.c(d))
         .a(h.get($$1.a(je.f)), $$0.c(c))
         .a(h.get($$1.a(je.e)), $$0.c(e))
         .a(h.get($$1.a(je.b)), $$0.c(f))
         .a(h.get($$1.a(je.a)), $$0.c(g));
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      return $$0.a(h.get($$1.b(je.c)), $$0.c(b))
         .a(h.get($$1.b(je.d)), $$0.c(d))
         .a(h.get($$1.b(je.f)), $$0.c(c))
         .a(h.get($$1.b(je.e)), $$0.c(e))
         .a(h.get($$1.b(je.b)), $$0.c(f))
         .a(h.get($$1.b(je.a)), $$0.c(g));
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
