import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dck extends cyo {
   public static final MapCodec<dck> a = b(dck::new);
   public static final dlw b = deb.b;
   public static final dlw c = deb.c;
   public static final dlw d = deb.d;
   public static final dlw e = deb.e;
   public static final dlw f = deb.f;
   public static final dlw g = deb.g;
   private static final Map<ie, dlw> h = deb.h;

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   public dck(dle.d $$0) {
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
   public dlf a(crg $$0) {
      cut $$1 = $$0.q();
      hz $$2 = $$0.a();
      return this.o()
         .a(g, Boolean.valueOf(!$$1.a_($$2.d()).a(this)))
         .a(f, Boolean.valueOf(!$$1.a_($$2.c()).a(this)))
         .a(b, Boolean.valueOf(!$$1.a_($$2.e()).a(this)))
         .a(c, Boolean.valueOf(!$$1.a_($$2.h()).a(this)))
         .a(d, Boolean.valueOf(!$$1.a_($$2.f()).a(this)))
         .a(e, Boolean.valueOf(!$$1.a_($$2.g()).a(this)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$2.a(this) ? $$0.a(h.get($$1), Boolean.valueOf(false)) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(h.get($$1.a(ie.c)), $$0.c(b))
         .a(h.get($$1.a(ie.d)), $$0.c(d))
         .a(h.get($$1.a(ie.f)), $$0.c(c))
         .a(h.get($$1.a(ie.e)), $$0.c(e))
         .a(h.get($$1.a(ie.b)), $$0.c(f))
         .a(h.get($$1.a(ie.a)), $$0.c(g));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(h.get($$1.b(ie.c)), $$0.c(b))
         .a(h.get($$1.b(ie.d)), $$0.c(d))
         .a(h.get($$1.b(ie.f)), $$0.c(c))
         .a(h.get($$1.b(ie.e)), $$0.c(e))
         .a(h.get($$1.b(ie.b)), $$0.c(f))
         .a(h.get($$1.b(ie.a)), $$0.c(g));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(f, g, b, c, d, e);
   }
}
